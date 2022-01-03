package Codegen;

import Codegen.CGValue.*;
import Codegen.CodegenInst.*;
import IR.IRBuilder;
import IR.IRFunc;
import IR.IRInit;
import IR.IRInst.*;
import IR.IRType.IRPointerType;
import IR.IRValue.*;
import IR.InstBlock;
import Optimize.ColorGraph;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class CGBuilder {
//    static int MX=1000000;
    public ArrayList<CGFunc> FuncList;
    ArrayList<String> GlobalList;//都变成i32
    ArrayList<CGStringDec> StringDecList;
    CGFunc NowFunc;
    CGBlock NowBlock;
    //标准寄存器专区
    PhysicalReg sp,zero,a0,ra,s0,s1;

    public CGBuilder(IRBuilder IR) throws FileNotFoundException {
        sp=new PhysicalReg("sp");
        s0=new PhysicalReg("Initialsp");
        a0=new PhysicalReg("a0");
        s1=new PhysicalReg("s1");
        zero=new PhysicalReg("zero");
        ra=new PhysicalReg("ra");
        FuncList=new ArrayList<>();
        GlobalList=new ArrayList<>();
        StringDecList=new ArrayList<>();
        for (var DefineInst:IR.WolrdBlock.InstList) {
            if (DefineInst instanceof GlobalVar)
                GlobalList.add(((GlobalVar) (DefineInst)).Identify);
            if (DefineInst instanceof StringDec)
                StringDecList.add(new CGStringDec((StringDec) DefineInst));
        }
        for (var DefineFunc:IR.FuncList){
            AnalizeFunc(DefineFunc);
            FuncList.add(NowFunc);
        }


        String namecolor= "testUncolor.s";
        OutputStream colorOutput=new FileOutputStream(namecolor);
        CGPrint(colorOutput);

        int id=0;
        for (var Func:FuncList){
            System.out.println(Func.Name+id);
            while (true) {
                ColorGraph Color=new ColorGraph(Func,17);
                if (Color.FindPlan==true) {
                    if (Func.Name=="main")
                    for (var Name:Color.ColorMap.keySet())
                        System.out.println(Name+"     "+Color.ColorMap.get(Name));
                    AdvanceColor(Func,Color.ColorMap);
                    break;
                }
                else {

//                    for (var Name:Color.PutInMemList)
//                        System.out.println(Name);
                    PutInMem(Func, Color.PutInMemList);
                }
//                OutputStream CheckOutput=new FileOutputStream("check"+id);
//                CGPrint(CheckOutput);
            }
//            BasicColor(Func);
            OutRangeDelete(Func);
        }
//        for (var Func:FuncList){
//            PutInMem(Func,null);
//            BasicColor(Func);
//            OutRangeDelete(Func);
//        }
    }
    public void CGPrint(OutputStream CGos) {

        PrintWriter Writer = new PrintWriter(CGos);
        Writer.println("\t.text\n");
        for (var Func:FuncList)
            Writer.println(Func.toString());
        for (var Var:GlobalList) {
            Writer.println("\t.type\t" + Var + ",@object             # @" + Var + "\n" +
                    "\t.section\t.sbss,\"aw\",@nobits\n" +
                    "\t.globl\t" + Var + "\n" +
                    "\t.p2align\t2\n" +
                    Var + ":\n" +
                    "\t.word\t0\n" +
                    "\t.size\t" + Var + ", 4\n");
        }
        for (var Str:StringDecList){
            Writer.println(Str);
        }
        Writer.flush();
    }
    int FuncID;
    public void AnalizeFunc(IRFunc Func){
        NowFunc=new CGFunc(Func.Name,FuncID++);
        NowFunc.NowRegisterID=0;
        CGBlock InitBlock=new CGBlock(Func.Name);
//        InitBlock.AddBack(new CGmv(new VirtualReg("s0Addr"),s0));
        InitBlock.AddBack(new CGmv(new PhysicalReg("s0"),sp));
        for (var AllocaInst:Func.FuncAlloc)
        if (AllocaInst instanceof alloca)
        {
            alloca _inst=(alloca) AllocaInst;
            NowFunc.NowOffset+=4;
//            InitBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,new VirtualReg(((IRTmpVar)_inst.Beloaded).Name),new PhysicalReg("s0"),-NowFunc.NowOffset));
            NowFunc.ConstReg.put(((IRTmpVar)_inst.Beloaded).Name,-NowFunc.NowOffset);
        }
        for (Integer i=0;i<Math.min(Func.ParaList.size(),8);i++)
            InitBlock.AddBack(new CGstore(CGstore.OP.sw,new PhysicalReg("a"+i.toString()),-(4+i*4),sp));
        if (Func.ParaList.size()>8) {
            for (Integer i = 8; i < Func.ParaList.size(); i++) {
                InitBlock.AddBack(new CGload(CGload.OP.lw,a0,(i-8)*4,sp));
                InitBlock.AddBack(new CGstore(CGstore.OP.sw, a0, -(12+i*4), sp));
            }
        }
        InitBlock.AddBack(new CGspop(true));
        InitBlock.AddBack(new CGmv(new VirtualReg("raAddr"),ra));
        InitBlock.AddBack(new CGjump("entry"+NowFunc.FuncID));
        NowFunc.BlockList.add(InitBlock);
        for (var Block:Func.FuncBlock) {
            AnalizeBlock(Block);
            NowFunc.BlockList.add(NowBlock);
        }
    }
    public void AnalizeBlock(InstBlock Block) {
        NowBlock = new CGBlock(Block.Name+NowFunc.FuncID);
        for (var Inst : Block.InstList)
            AnalizeInst(Inst);
    }
    public void AnalizeInst(BasicInst Inst) {
        if (Inst instanceof binary) {
            binary.binaryOp NowOP = ((binary) (Inst)).Op;
            IRValue lhs = ((binary) (Inst)).Left, rhs = ((binary) (Inst)).Right, Loaded = ((binary) (Inst)).LoadTo;
            VirtualReg rs1, rs2, rd;
            if (lhs instanceof IRConst) {
                int val = ((IRConst)lhs).val;
                rs1 = NowFunc.NewRegister();
                if (Math.abs(val)<2048)
                    NowBlock.AddBack(new CGLi(rs1, new IntImm(val)));
                else {
                    int q=Math.abs(val);
                    NowBlock.AddBack(new CGLi(rs1,new IntImm(q>>22)));
                    q%=(1<<22);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs1,rs1,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs1,rs1,q>>11));
                    q%=(1<<11);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs1,rs1,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs1,rs1,q));
                    if (val<0)
                        NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,rs1,zero,rs1));
                }
            } else rs1 = new VirtualReg(((IRTmpVar) lhs).Name);

            if (rhs instanceof IRConst) {
                int val = ((IRConst)rhs).val;
                rs2 = NowFunc.NewRegister();
                if (Math.abs(val)<2048)
                    NowBlock.AddBack(new CGLi(rs2, new IntImm(val)));
                else {
                    int q=Math.abs(val);
                    NowBlock.AddBack(new CGLi(rs2,new IntImm(q>>22)));
                    q%=(1<<22);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs2,rs2,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs2,rs2,q>>11));
                    q%=(1<<11);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs2,rs2,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs2,rs2,q));
                    if (val<0)
                        NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,rs2,zero,rs2));
                }
            } else rs2 = new VirtualReg(((IRTmpVar) rhs).Name);
            rd = new VirtualReg(((IRTmpVar) Loaded).Name);

            CGbinaryOp.OP CGInstOP = null;
            switch (NowOP) {
                case add:
                    CGInstOP = CGbinaryOp.OP.add;
                    break;
                case sub:
                    CGInstOP = CGbinaryOp.OP.sub;
                    break;
                case mul:
                    CGInstOP = CGbinaryOp.OP.mul;
                    break;
                case sdiv:
                    CGInstOP = CGbinaryOp.OP.div;
                    break;
                case srem:
                    CGInstOP = CGbinaryOp.OP.rem;
                    break;
                case shl:
                    CGInstOP = CGbinaryOp.OP.sll;
                    break;
                case ashr:
                    CGInstOP = CGbinaryOp.OP.sra;
                    break;
                case and:
                    CGInstOP = CGbinaryOp.OP.and;
                    break;
                case or:
                    CGInstOP = CGbinaryOp.OP.or;
                    break;
                case xor:
                    CGInstOP = CGbinaryOp.OP.xor;
                    break;
            }
            NowBlock.AddBack(new CGbinaryOp(CGInstOP, rd, rs1, rs2));
        }
        if (Inst instanceof icmp) {

            icmp.icmpOp NowOP = ((icmp) (Inst)).Op;
            IRValue lhs = ((icmp) (Inst)).Left, rhs = ((icmp) (Inst)).Right, Loaded = ((icmp) (Inst)).LoadTo;
            VirtualReg rs1, rs2, rd;
            if (lhs instanceof IRConst) {
                int val = ((IRConst)lhs).val;
                rs1 = NowFunc.NewRegister();
                if (Math.abs(val)<2048)
                    NowBlock.AddBack(new CGLi(rs1, new IntImm(val)));
                else {
                    int q=Math.abs(val);
                    NowBlock.AddBack(new CGLi(rs1,new IntImm(q>>22)));
                    q%=(1<<22);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs1,rs1,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs1,rs1,q>>11));
                    q%=(1<<11);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs1,rs1,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs1,rs1,q));
                    if (val<0)
                        NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,rs1,zero,rs1));
                }
            } else rs1 = new VirtualReg(((IRTmpVar) lhs).Name);

            if (rhs instanceof IRConst) {
                int val = ((IRConst)rhs).val;
                rs2 = NowFunc.NewRegister();
                if (Math.abs(val)<2048)
                    NowBlock.AddBack(new CGLi(rs2, new IntImm(val)));
                else {
                    int q=Math.abs(val);
                    NowBlock.AddBack(new CGLi(rs2,new IntImm(q>>22)));
                    q%=(1<<22);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs2,rs2,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs2,rs2,q>>11));
                    q%=(1<<11);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,rs2,rs2,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,rs2,rs2,q));
                    if (val<0)
                        NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,rs2,zero,rs2));
                }
            } else rs2 = new VirtualReg(((IRTmpVar) rhs).Name);
            rd = new VirtualReg(((IRTmpVar) Loaded).Name);
            switch (NowOP) {
                case eq:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.xor, rd, rs1, rs2));
                    NowBlock.AddBack(new CGsz(CGsz.OP.seqz, rd, rd));
                    break;
                case ne:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.xor, rd, rs1, rs2));
                    NowBlock.AddBack(new CGsz(CGsz.OP.snez, rd, rd));
                    break;
                case slt:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.slt, rd, rs1, rs2));
                    break;
                case sgt:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.slt, rd, rs2, rs1));
                    break;
                case sge:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.slt, rd, rs1, rs2));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.xori, rd, rd, 1));
                    break;
                case sle:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.slt, rd, rs2, rs1));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.xori, rd, rd, 1));
                    break;
            }
        }
        if (Inst instanceof bitcast) {
            VirtualReg rd = new VirtualReg(((IRTmpVar) (((bitcast) Inst).Beloaded)).Name);
            if (((bitcast) Inst).Pointer instanceof IRTmpVar)
                NowBlock.AddBack(new CGmv(rd, new VirtualReg(((IRTmpVar) (((bitcast) Inst).Pointer)).Name)));
            else if (((bitcast) Inst).Pointer instanceof IRGlobalVar) {
                NowBlock.AddBack(new CGla(rd, new GlobalReg(((IRGlobalVar) (((bitcast) Inst).Pointer)).Name)));
            }
        }
        if (Inst instanceof getelementptr) {
            getelementptr _Inst = (getelementptr) Inst;
            VirtualReg rd = new VirtualReg(((IRTmpVar) _Inst.LoadTo).Name), rs1 = new VirtualReg(((IRTmpVar) _Inst.GetPointer).Name), rs2;
            if (_Inst.IDList.size() == 2)
                NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi, rd, rs1, 4 * ((IRIntConst) _Inst.IDList.get(1)).val));
            else {
                VirtualReg MultiReg = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(MultiReg, new IntImm(((IRPointerType) _Inst.GetPointer.type).PointedType.Size()/8)));
                if (_Inst.IDList.get(0) instanceof IRIntConst) {
                    rs2 =NowFunc.NewRegister();
                    NowBlock.AddBack(new CGLi(rs2, new IntImm(((IRIntConst) _Inst.IDList.get(0)).val)));
                } else rs2 = new VirtualReg(((IRTmpVar) _Inst.IDList.get(0)).Name);
                NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.mul, MultiReg, MultiReg, rs2));
                NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.add, rd, rs1, MultiReg));
            }
        }
        if (Inst instanceof load) {
            load _Inst = (load) Inst;
            VirtualReg rd = new VirtualReg(((IRTmpVar) _Inst.LoadTo).Name);
            if (_Inst.LoadPointer instanceof IRTmpVar) {
                if (NowFunc.ConstReg.containsKey(((IRTmpVar) _Inst.LoadPointer).Name))
                    NowBlock.AddBack(new CGload(CGload.OP.lw, rd, NowFunc.ConstReg.get(((IRTmpVar) _Inst.LoadPointer).Name), s0));
                else NowBlock.AddBack(new CGload(CGload.OP.lw, rd, 0, new VirtualReg(((IRTmpVar) _Inst.LoadPointer).Name)));
            }
            else {
//                NowBlock.AddBack(new CGlui(rd, new GlobalImm(GlobalImm.type.hi, new GlobalReg(((IRGlobalVar) _Inst.LoadPointer).Name))));
//                NowBlock.AddBack(new CGload(CGload.OP.lw, rd, new GlobalImm(GlobalImm.type.lo, new GlobalReg(((IRGlobalVar) _Inst.LoadPointer).Name)), rd));

                NowBlock.AddBack(new CGla(rd,  new GlobalReg(((IRGlobalVar) _Inst.LoadPointer).Name)));
                NowBlock.AddBack(new CGload(CGload.OP.lw, rd, 0, rd));
            }
        }
        if (Inst instanceof store) {
            store _Inst = (store) Inst;
            CGReg Value=null;
            if (_Inst.StoreValue instanceof IRConst)
            {
                int val=((IRConst) _Inst.StoreValue).val;
                Value = NowFunc.NewRegister();
                if (Math.abs(val)<2048)
                    NowBlock.AddBack(new CGLi(Value, new IntImm(val)));
                else {
                    int q=Math.abs(val);
                    NowBlock.AddBack(new CGLi(Value,new IntImm(q>>22)));
                    q%=(1<<22);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,Value,Value,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,Value,Value,q>>11));
                    q%=(1<<11);
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,Value,Value,11));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,Value,Value,q));
                    if (val<0)
                        NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,Value,zero,Value));
                }
            }
            else if (_Inst.StoreValue instanceof IRTmpVar)
                Value=new VirtualReg(((IRTmpVar)_Inst.StoreValue).Name);

            if (_Inst.StorePointer instanceof IRTmpVar) {
                if (NowFunc.ConstReg.containsKey(((IRTmpVar) _Inst.StorePointer).Name))
                    NowBlock.AddBack(new CGstore(CGstore.OP.sw, Value, NowFunc.ConstReg.get(((IRTmpVar) _Inst.StorePointer).Name), s0));
                else NowBlock.AddBack(new CGstore(CGstore.OP.sw, Value, 0,new VirtualReg(((IRTmpVar) _Inst.StorePointer).Name)));
            }else {
                VirtualReg NowAddr = NowFunc.NewRegister();
                NowBlock.AddBack(new CGla(NowAddr, new GlobalReg(((IRGlobalVar) _Inst.StorePointer).Name)));
                NowBlock.AddBack(new CGstore(CGstore.OP.sw, Value, 0, NowAddr));
            }
        }
        if (Inst instanceof call) {
            call _Inst = (call) Inst;
            for (int i = 0; i < Math.min(_Inst.ParaList.size(), 8); i++) {
                PhysicalReg rs = new PhysicalReg(PhysicalReg.callerReg[i]);
                if (_Inst.ParaList.get(i) instanceof IRIntConst)
                    NowBlock.AddBack(new CGLi(rs, new IntImm(((IRIntConst) _Inst.ParaList.get(i)).val)));
                if (_Inst.ParaList.get(i) instanceof IRTmpVar)
                    NowBlock.AddBack(new CGmv(rs, new VirtualReg(((IRTmpVar) _Inst.ParaList.get(i)).Name)));
                else if (_Inst.ParaList.get(i) instanceof IRGlobalVar) {
//                  NowBlock.AddBack(new CGlui(rs, new GlobalImm(GlobalImm.type.hi, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name))));
//                  NowBlock.AddBack(new CGload(CGload.OP.lw, rs, new GlobalImm(GlobalImm.type.lo, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name)), rs));
                    NowBlock.AddBack(new CGla(rs, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name)));
                    NowBlock.AddBack(new CGload(CGload.OP.lw, rs, 0, rs));

                } else if (_Inst.ParaList.get(i) instanceof IRBoolConst)
                    NowBlock.AddBack(new CGLi(rs, new IntImm(((IRBoolConst) _Inst.ParaList.get(i)).val)));
                else if (_Inst.ParaList.get(i) instanceof IRNullConst)
                    NowBlock.AddBack(new CGLi(rs, new IntImm(0)));
            }
            if (_Inst.ParaList.size() > 8)
                for (int i = 8; i < _Inst.ParaList.size(); i++) {
                    if (_Inst.ParaList.get(i) instanceof IRIntConst) {
                        VirtualReg rs =NowFunc.NewRegister();
                        NowBlock.AddBack(new CGLi(rs, new IntImm(((IRIntConst) _Inst.ParaList.get(i)).val)));
                        NowBlock.AddBack(new CGstore(CGstore.OP.sw, rs, 4 * (i - 8), sp));
                    } else if (_Inst.ParaList.get(i) instanceof IRTmpVar)
                        NowBlock.AddBack(new CGstore(CGstore.OP.sw, new VirtualReg(((IRTmpVar) _Inst.ParaList.get(i)).Name), 4 * (i - 8), sp));
                    else if (_Inst.ParaList.get(i) instanceof IRGlobalVar) {
                        VirtualReg rs = NowFunc.NewRegister();
//                        NowBlock.AddBack(new CGlui(rs, new GlobalImm(GlobalImm.type.hi, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name))));
////                        NowBlock.AddBack(new CGload(CGload.OP.lw, rs, new GlobalImm(GlobalImm.type.lo, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name)), rs));
                        NowBlock.AddBack(new CGla(rs, new GlobalReg(((IRGlobalVar) _Inst.ParaList.get(i)).Name)));
                        NowBlock.AddBack(new CGload(CGload.OP.lw, rs,0,rs));

                        NowBlock.AddBack(new CGstore(CGstore.OP.sw, rs, 4 * (i - 8), sp));
                    } else if (_Inst.ParaList.get(i) instanceof IRBoolConst) {
                        VirtualReg rs = NowFunc.NewRegister();
                        NowBlock.AddBack(new CGLi(rs, new IntImm(((IRBoolConst) _Inst.ParaList.get(i)).val)));
                        NowBlock.AddBack(new CGstore(CGstore.OP.sw, rs, 4 * (i - 8), sp));
                    } else if (_Inst.ParaList.get(i) instanceof IRNullConst)
                        NowBlock.AddBack(new CGstore(CGstore.OP.sw, zero, 4 * (i - 8), sp));
                }
            NowBlock.AddBack(new CGcall(_Inst.FuncName));
//            NowBlock.AddBack(new CGmv(s0,new VirtualReg("s0Addr")));
            if (_Inst.Loaded != null)
                NowBlock.AddBack(new CGmv(new VirtualReg(((IRTmpVar) _Inst.Loaded).Name), new PhysicalReg("a0")));

            NowFunc.mxFuncNeed=Math.max(NowFunc.mxFuncNeed,_Inst.ParaList.size()-8);
        }
        if (Inst instanceof br) {
            br _Inst = (br) Inst;
            if (_Inst.Cond == null)
                NowBlock.AddBack(new CGjump(_Inst.IfTrue+NowFunc.FuncID));
            else {
                VirtualReg Cond;
                if (_Inst.Cond instanceof IRBoolConst) {
                    Cond = NowFunc.NewRegister();
                    NowBlock.AddBack(new CGLi(Cond, new IntImm(((IRBoolConst) _Inst.Cond).val)));
                } else Cond = new VirtualReg(((IRTmpVar) _Inst.Cond).Name);
                NowBlock.AddBack(new CGbr(CGbr.type.bnez, Cond, _Inst.IfTrue+NowFunc.FuncID));
                NowBlock.AddBack(new CGjump(_Inst.IfElse+NowFunc.FuncID));
            }
        }
        if (Inst instanceof ret) {
            ret _Inst = (ret) Inst;
            if (_Inst.value != null) {
                if (_Inst.value instanceof IRConst) {

                    int val=((IRConst) _Inst.value).val;
                    if (Math.abs(val)<2048)
                        NowBlock.AddBack(new CGLi(a0, new IntImm(val)));
                    else {
                        int q=Math.abs(val);
                        NowBlock.AddBack(new CGLi(a0,new IntImm(q>>22)));
                        q%=(1<<22);
                        NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,a0,a0,11));
                        NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,a0,a0,q>>11));
                        q%=(1<<11);
                        NowBlock.AddBack(new CGImmOp(CGImmOp.OP.slli,a0,a0,11));
                        NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi,a0,a0,q));
                        if (val<0)
                            NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.sub,a0,zero,a0));
                    }
                }
                else NowBlock.AddBack(new CGmv(a0, new VirtualReg(((IRTmpVar) _Inst.value).Name)));
            }
            NowBlock.AddBack(new CGmv(ra,new VirtualReg("raAddr")));
            NowBlock.AddBack(new CGspop(false));
            NowBlock.AddBack(new CGret());
        }
    }

    public void PutInMem(CGFunc Func, Set<String> InMemList){
        for (var Block:Func.BlockList)
        {
            ArrayList<CGInst> NedToReplaceList=new ArrayList<>();

            for (CGInst Inst=Block.Head;Inst!=null;Inst=Inst.NexInst)
                NedToReplaceList.add(Inst);
            for (CGInst Inst:NedToReplaceList)
            {
                if (Inst.rs1 instanceof VirtualReg) {
                    boolean Replace = true;
                    if (InMemList!=null) InMemList.contains(((VirtualReg) Inst.rs1).Name);
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddPre(Inst, new CGload(CGload.OP.lw, ReplaceReg, -Func.RegID(((VirtualReg) Inst.rs1).Name), s0));
                        Inst.rs1=ReplaceReg;
                    }
                }
                if (Inst.rs2 instanceof VirtualReg) {
                    boolean Replace= true;
                    if (InMemList!=null) InMemList.contains(((VirtualReg) Inst.rs2).Name);
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddPre(Inst, new CGload(CGload.OP.lw, ReplaceReg, - Func.RegID(((VirtualReg) Inst.rs2).Name), s0));
                        Inst.rs2=ReplaceReg;
                    }
                }
                if (Inst.rd instanceof VirtualReg) {
                    boolean Replace = true;
                    if (InMemList!=null) InMemList.contains(((VirtualReg) Inst.rd).Name);
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddNex(Inst, new CGstore(CGstore.OP.sw, ReplaceReg, -Func.RegID(((VirtualReg) Inst.rd).Name), s0));
                        Inst.rd=ReplaceReg;
                    }
                }
            }
        }
    }

    public void OutRangeDelete(CGFunc Func){
        CGMemInst.FuncOffset=Func.NowOffset+4*Func.mxFuncNeed;
        CGspop.Value=Func.NowOffset+4*Func.mxFuncNeed;
        for (var Block:Func.BlockList)
        {
            ArrayList<CGInst> NedToReplaceList=new ArrayList<>();

            for (CGInst Inst=Block.Head;Inst!=null;Inst=Inst.NexInst)
                NedToReplaceList.add(Inst);
            for (CGInst Inst:NedToReplaceList) {
                if (Inst instanceof CGMemInst)
                {
                    CGMemInst _Inst=(CGMemInst) Inst;
                    _Inst.UpDate();
                    if (Math.abs(_Inst.Offset)>=2048)
                    {
                        int q=Math.abs(_Inst.Offset),sig=(_Inst.Offset>0) ? 1 : -1;
                        Block.AddPre(_Inst,new CGImmOp(CGImmOp.OP.addi,s1,_Inst.rs1,q%1024*sig));
                        for (int i=1;i<=q/1024;i++)
                            Block.AddPre(_Inst,new CGImmOp(CGImmOp.OP.addi,s1,s1,1024*sig));
                        _Inst.Offset=0;_Inst.rs1=s1;
                    }
                }
                if (Inst instanceof CGImmOp)
                {
                    CGImmOp _Inst=(CGImmOp) Inst;
                    if (Math.abs(_Inst.imm)>=2048)
                    {
                        int q=Math.abs(_Inst.imm),sig=(_Inst.imm>0) ? 1 : -1;
                        _Inst.imm=q%1024*sig;
                        for (int i=1;i<=q/1024;i++)
                            Block.AddNex(_Inst,new CGImmOp(CGImmOp.OP.addi,_Inst.rd,_Inst.rd,1024*sig));
                    }
                }
                if (Inst instanceof CGspop)
                {
                    CGspop _Inst=(CGspop) Inst;
                    _Inst.UpDate();
                    if (Math.abs(_Inst.RealValue)>=2048)
                    {
                        int q=Math.abs(_Inst.RealValue),sig=(_Inst.RealValue>0) ? 1 : -1;
                        _Inst.RealValue=q%1024*sig;
                        for (int i=1;i<=q/1024;i++)
                            Block.AddNex(_Inst,new CGImmOp(CGImmOp.OP.addi,sp,sp,1024*sig));
                    }
                }

            }
        }
    }
    public void BasicColor(CGFunc Func){
        int NowColor=-1;
        Map<String,String> ColorMap=new LinkedHashMap<>();
        for (var Block:Func.BlockList){
            for (CGInst Inst=Block.Head;Inst!=null;Inst=Inst.NexInst){
                if (Inst.rs1 instanceof VirtualReg)
                {
                    if (ColorMap.containsKey(((VirtualReg) Inst.rs1).Name))
                        Inst.rs1=new PhysicalReg(ColorMap.get(((VirtualReg) Inst.rs1).Name));
                    else
                    {
                        String DefString=PhysicalReg.colorReg[NowColor=((++NowColor)%PhysicalReg.colorReg.length)];
                        ColorMap.put(((VirtualReg) Inst.rs1).Name,DefString);
                        Inst.rs1=new PhysicalReg(DefString);
                    }
                }
                if (Inst.rs2 instanceof VirtualReg)
                {
                    if (ColorMap.containsKey(((VirtualReg) Inst.rs2).Name))
                        Inst.rs2=new PhysicalReg(ColorMap.get(((VirtualReg) Inst.rs2).Name));
                    else
                    {
                        String DefString=PhysicalReg.colorReg[NowColor=((++NowColor)%PhysicalReg.colorReg.length)];
                        ColorMap.put(((VirtualReg) Inst.rs2).Name,DefString);
                        Inst.rs2=new PhysicalReg(DefString);
                    }
                }
                if (Inst.rd instanceof VirtualReg)
                {
                    if (ColorMap.containsKey(((VirtualReg) Inst.rd).Name))
                        Inst.rd=new PhysicalReg(ColorMap.get(((VirtualReg) Inst.rd).Name));
                    else
                    {
                        String DefString=PhysicalReg.colorReg[NowColor=((++NowColor)%PhysicalReg.colorReg.length)];
                        ColorMap.put(((VirtualReg) Inst.rd).Name,DefString);
                        Inst.rd=new PhysicalReg(DefString);
                    }
                }
            }
        }
    }
    public void AdvanceColor(CGFunc Func,Map<String,Integer> ColorMap){
        for (var Block:Func.BlockList)
            for (CGInst Inst=Block.Head;Inst!=null;Inst=Inst.NexInst){
                if (Inst.rs1 instanceof VirtualReg)
                {
//                    System.out.println(((VirtualReg) Inst.rs1).Name);
                    Inst.rs1=new PhysicalReg(PhysicalReg.colorReg[ColorMap.get(((VirtualReg) Inst.rs1).Name)]);
                }
//                System.out.println(Inst.rs2);
                if (Inst.rs2 instanceof VirtualReg) {

//                    System.out.println(((VirtualReg) Inst.rs2).Name);
                    Inst.rs2 = new PhysicalReg(PhysicalReg.colorReg[ColorMap.get(((VirtualReg) Inst.rs2).Name)]);
                }
//                System.out.println(Inst.rd);
                if (Inst.rd instanceof VirtualReg){
//                    System.out.println(((VirtualReg) Inst.rd).Name);
                    int id=ColorMap.get(((VirtualReg) Inst.rd).Name);
                    if (id==-1) Inst.rd=zero;
                    else Inst.rd=new PhysicalReg(PhysicalReg.colorReg[ColorMap.get(((VirtualReg) Inst.rd).Name)]);
                }
            }
    }

}
