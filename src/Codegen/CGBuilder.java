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

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class CGBuilder {
    static int MX=1000000;
    ArrayList<CGFunc> FuncList;
    ArrayList<String> GlobalList;//都变成i32
    ArrayList<CGStringDec> StringDecList;
    CGFunc NowFunc;
    CGBlock NowBlock;
    //标准寄存器专区
    PhysicalReg sp,zero,a0,ra;

    public CGBuilder(IRBuilder IR) throws FileNotFoundException {
        sp=new PhysicalReg("sp");
        a0=new PhysicalReg("a0");
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

        String namecolor= "test.s";
        OutputStream colorOutput=new FileOutputStream(namecolor);
        CGPrint(colorOutput);

        for (var Func:FuncList){
            PutInMem(Func,null);
            BasicColor(Func);
        }
    }
    public void CGPrint(OutputStream CGos) {

        PrintWriter Writer = new PrintWriter(CGos);
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
        InitBlock.AddBack(new CGspop(true));
        InitBlock.AddBack(new CGstore(CGstore.OP.sw,ra,NowFunc.RegID("ra")+MX,sp));
        for (Integer i=0;i<Math.min(Func.ParaList.size(),8);i++)
            InitBlock.AddBack(new CGstore(CGstore.OP.sw,new PhysicalReg("a"+i.toString()),MX+NowFunc.RegID(i.toString()),sp));
        if (Func.ParaList.size()>8) {
            for (Integer i = 8; i < Func.ParaList.size(); i++) {
                InitBlock.AddBack(new CGload(CGload.OP.lw,a0,(i-8)*4,sp));
                InitBlock.AddBack(new CGstore(CGstore.OP.sw, a0, MX + NowFunc.RegID(i.toString()), sp));
            }
        }
        InitBlock.AddBack(new CGjump("entry"));
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
                int val = lhs instanceof IRIntConst ? ((IRIntConst) lhs).val : ((IRBoolConst) lhs).val;
                rs1 = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(rs1, new IntImm(val)));
            } else rs1 = new VirtualReg(((IRTmpVar) lhs).Name);

            if (rhs instanceof IRConst) {
                int val = rhs instanceof IRIntConst ? ((IRIntConst) rhs).val : ((IRBoolConst) rhs).val;
                rs2 = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(rs2, new IntImm(val)));
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
                int val = lhs instanceof IRIntConst ? ((IRIntConst) lhs).val : ((IRBoolConst) lhs).val;
                rs1 = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(rs1, new IntImm(val)));
            } else rs1 = new VirtualReg(((IRTmpVar) lhs).Name);

            if (rhs instanceof IRConst) {
                int val = rhs instanceof IRIntConst ? ((IRIntConst) rhs).val : ((IRBoolConst) rhs).val;
                rs2 = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(rs2, new IntImm(val)));
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
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.xori, rd, rd, new IntImm(1)));
                    break;
                case sle:
                    NowBlock.AddBack(new CGbinaryOp(CGbinaryOp.OP.slt, rd, rs2, rs1));
                    NowBlock.AddBack(new CGImmOp(CGImmOp.OP.xori, rd, rd, new IntImm(1)));
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
                NowBlock.AddBack(new CGImmOp(CGImmOp.OP.addi, rd, rs1, new IntImm(4 * ((IRIntConst) _Inst.IDList.get(1)).val)));
            else {
                VirtualReg MultiReg = NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(MultiReg, new IntImm(((IRPointerType) _Inst.GetPointer.type).PointedType.Size())));
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
            if (_Inst.LoadPointer instanceof IRTmpVar)
                NowBlock.AddBack(new CGload(CGload.OP.lw, rd, MX+NowFunc.RegID(((IRTmpVar) _Inst.LoadPointer).Name),sp));
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
                Value=NowFunc.NewRegister();
                NowBlock.AddBack(new CGLi(Value, new IntImm(((IRConst) _Inst.StoreValue).val)));
            }
            else if (_Inst.StoreValue instanceof IRTmpVar)
                Value=new VirtualReg(((IRTmpVar)_Inst.StoreValue).Name);

            if (_Inst.StorePointer instanceof IRTmpVar) {
                NowBlock.AddBack(new CGstore(CGstore.OP.sw, Value, MX+NowFunc.RegID(((IRTmpVar) _Inst.StorePointer).Name), sp));
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
            if (_Inst.Loaded != null)
                NowBlock.AddBack(new CGmv(new VirtualReg(((IRTmpVar) _Inst.Loaded).Name), new PhysicalReg("a0")));
            NowFunc.mxFuncNeed=Math.max(NowFunc.mxFuncNeed,_Inst.ParaList.size()-8);
        }
        if (Inst instanceof br) {
            br _Inst = (br) Inst;
            if (_Inst.Cond == null)
                NowBlock.AddBack(new CGbr(CGbr.type.beqz, new PhysicalReg("zero"), _Inst.IfTrue+NowFunc.FuncID));
            else {
                VirtualReg Cond;
                if (_Inst.Cond instanceof IRBoolConst) {
                    Cond = NowFunc.NewRegister();
                    NowBlock.AddBack(new CGLi(Cond, new IntImm(((IRBoolConst) _Inst.Cond).val)));
                } else Cond = new VirtualReg(((IRTmpVar) _Inst.Cond).Name);
                NowBlock.AddBack(new CGbr(CGbr.type.bnez, Cond, _Inst.IfTrue+NowFunc.FuncID));
                NowBlock.AddBack(new CGbr(CGbr.type.beqz, Cond, _Inst.IfElse+NowFunc.FuncID));
            }
        }
        if (Inst instanceof ret) {
            ret _Inst = (ret) Inst;
            if (_Inst.value != null) {
                if (_Inst.value instanceof IRConst)
                    NowBlock.AddBack(new CGLi(a0, new IntImm(((IRConst) _Inst.value).val)));
                else NowBlock.AddBack(new CGmv(a0, new VirtualReg(((IRTmpVar) _Inst.value).Name)));
            }
            NowBlock.AddBack(new CGspop(false));
            NowBlock.AddBack(new CGload(CGload.OP.lw,ra,NowFunc.RegID("ra")+MX,sp));
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
//                    boolean Replace = InMemList.contains(((VirtualReg) Inst.rs1).Name);
                    boolean Replace=true;
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddPre(Inst, new CGload(CGload.OP.lw, ReplaceReg, MX + Func.RegID(((VirtualReg) Inst.rs1).Name), sp));
                        Inst.rs1=ReplaceReg;
                    }
                }
                if (Inst.rs2 instanceof VirtualReg) {
//                    boolean Replace = InMemList.contains(((VirtualReg) Inst.rs2).Name);
                    boolean Replace=true;
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddPre(Inst, new CGload(CGload.OP.lw, ReplaceReg, MX + Func.RegID(((VirtualReg) Inst.rs2).Name), sp));
                        Inst.rs2=ReplaceReg;
                    }
                }
                if (Inst.rd instanceof VirtualReg) {
//                    boolean Replace = InMemList.contains(((VirtualReg) Inst.rd).Name);
                    boolean Replace=true;
                    if (Replace) {
                        VirtualReg ReplaceReg = Func.NewRegister();
                        Block.AddNex(Inst, new CGstore(CGstore.OP.sw, ReplaceReg, MX + Func.RegID(((VirtualReg) Inst.rd).Name), sp));
                        Inst.rd=ReplaceReg;
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
}
