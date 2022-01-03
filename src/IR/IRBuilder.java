package IR;
import AST.*;
import IR.IRInst.*;
import IR.IRType.*;
import IR.IRValue.*;
import Util.Scope.GlobalScope;
import Util.Symbol.ClassSymbol;
import Util.Type;
import Util.position.position;
import java.util.ArrayList;

public class IRBuilder implements ASTVisitor {
    public GlobalScope WolrdScope;
    public InstBlock WolrdBlock;
    public InstBlock NowBlock;
    public IRFunc NowFunc;
    public IRVarScope NowScope;

    public ArrayList<IRFunc> FuncList;
    public int LoopID;
    public int NowLoopID;
    public int IFID;
    public ClassSymbol NowClass;
    public int NewID;
    public int BinaryID;
    int nowID;
    int getID() {
        nowID++;
        return nowID-1;
    }
    int allocaID;
    int getAllocaID(){
        return allocaID++;
    }
    int StringID;
    int getStringID(){
        return StringID++;
    }

    boolean AssignLeft=false;

    public IRBuilder(GlobalScope _WolrdScope){
        WolrdScope=_WolrdScope;
        WolrdBlock=new InstBlock("");
        FuncList=new ArrayList<>();
        LoopID=0;
        NowLoopID=0;
        IFID=0;
    }


    @Override
    public void visit(AssignNode node) {
        if (node.ExprLeft instanceof IdentifyExprNode)
            AssignLeft=true;
        node.ExprLeft.accept(this);
        AssignLeft=false;
        node.ExprRight.accept(this);
        IRValue NowValue=node.ExprRight.Value;
//        AllType NowType=NowValue.type;
//        if (NowType instanceof IRIntType && ((IRIntType)(NowType)).Is_bool && ((IRIntType)(NowType)).width==1)
//        {
//            IRValue TurnValue=new IRTmpVar(new IRIntType(8,true),String.valueOf(getID()));
//            NowBlock.pushback(new zext(TurnValue,NowValue));
//            NowValue=TurnValue;
//        }
        NowBlock.pushback(new store(node.ExprLeft.Pointer,NowValue));
        node.Value=node.ExprRight.Value;
        node.Pointer=node.ExprLeft.Pointer;
    }

    @Override
    public void visit(BackOpExpr node) {
        node.Expr.accept(this);
        IRTmpVar BackVar=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
        binary NowInst1;
        if (node.op==BackOpExpr.OP.Plus2) NowInst1=new binary(BackVar,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.add);
        else NowInst1=new binary(BackVar,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.sub);

        store NowInst2=new store(node.Expr.Pointer,BackVar);
        NowBlock.pushback(NowInst1);
        NowBlock.pushback(NowInst2);
        node.Value=node.Expr.Value;
        node.Pointer=null;
    }

    @Override
    public void visit(BasicDeclearFunctionNode node) {
        if (NowClass == null) {
            NowFunc = new IRFunc(ChangeType(node.BackType), node.Identify);
            allocaID=0;
            NowFunc.FuncAlloc=new ArrayList<>();
            NowFunc.FuncInitial=new ArrayList<>();

            NowBlock = new InstBlock("entry");
            NowScope = new IRVarScope(null);
            nowID = node.ParaList.List.size();
            for (int i = 0; i < node.ParaList.List.size(); i++) {
                OneDeclearNode Decl = node.ParaList.List.get(i);
                NowScope.AddVar(Decl.Identify, "alloca"+allocaID);
                AllType NowType = ChangeType(Decl.TypeIdentify);
//            if (NowType instanceof IRIntType && ((IRIntType)(NowType)).Is_bool)
//            {
//                IRValue NowValue=new IRTmpVar(new IRPointerType(new IRIntType(8,true)),String.valueOf(getID()));
//                NowBlock.pushback(new alloca(NowValue,new IRIntType(8,true)));
//                IRValue NexValue=new IRTmpVar(new IRIntType(8,true),String.valueOf(getID()));
//                NowBlock.pushback(new zext(NexValue,new IRTmpVar(new IRIntType(1,true),String.valueOf(i))));
//                NowBlock.pushback(new store(NowValue,NexValue));
//                NowFunc.ParaList.add(new IRIntType(1,true));
//            }
//            else {
                IRValue NowValue = new IRTmpVar(new IRPointerType(NowType), "alloca"+getAllocaID());
                NowFunc.FuncAlloc.add(new alloca(NowValue, NowType));
                NowFunc.FuncInitial.add(new store(NowValue, new IRTmpVar(NowType, String.valueOf(i))));
                NowFunc.ParaList.add(NowType);
            }

            if (ChangeType(node.BackType)!=null) {
                NowFunc.ReturnValue = new IRTmpVar(new IRPointerType(ChangeType(node.BackType)), "alloca"+getAllocaID());
                NowFunc.FuncAlloc.add(new alloca(NowFunc.ReturnValue,ChangeType(node.BackType)));
            }
            node.States.accept(this);
            if (NowBlock.HaveReturn == false) {
                if (ChangeType(node.BackType) != null) {
                    IRValue TmpValue = new IRTmpVar(ChangeType(node.BackType), getID());
                    NowBlock.pushback(new load(TmpValue, NowFunc.ReturnValue));
                    NowBlock.pushback(new ret(TmpValue));
                } else NowBlock.pushback(new ret(null));
            }
                else NowBlock.pushback(new ret(null));
            NowFunc.FuncBlock.add(NowBlock);
            FuncList.add(NowFunc);
        }
        else
        {
            NowFunc = new IRFunc(ChangeType(node.BackType), "_struct_"+NowClass.Identify+"_"+node.Identify);
            allocaID=0;
            NowFunc.FuncAlloc=new ArrayList<>();
            NowBlock = new InstBlock("entry");
            NowScope = new IRVarScope(null);
            if (node.IsConstruct)
                nowID = 1;
            else
                nowID = node.ParaList.List.size() + 1;

            AllType NowType = new IRPointerType(new IRClassType(NowClass.Identify));
            IRValue NowValue = new IRTmpVar(new IRPointerType(NowType), "alloca"+getAllocaID());
            NowFunc.FuncAlloc.add(new alloca(NowValue, NowType));
            NowFunc.FuncInitial.add(new store(NowValue, new IRTmpVar(NowType, 0)));
            NowFunc.ParaList.add(NowType);
            for (int i = 0; i < node.ParaList.List.size(); i++) {
                OneDeclearNode Decl = node.ParaList.List.get(i);
                NowScope.AddVar(Decl.Identify, "alloca"+allocaID);
                NowType = ChangeType(Decl.TypeIdentify);
                NowValue = new IRTmpVar(new IRPointerType(NowType), "alloca"+getAllocaID());
                NowFunc.FuncAlloc.add(new alloca(NowValue, NowType));
                NowFunc.FuncInitial.add(new store(NowValue, new IRTmpVar(NowType, String.valueOf(i+1))));//I have changed
                NowFunc.ParaList.add(NowType);
            }
            if (ChangeType(node.BackType)!=null) {
                NowFunc.ReturnValue = new IRTmpVar(new IRPointerType(ChangeType(node.BackType)),"alloca"+getAllocaID());
                NowFunc.FuncAlloc.add(new alloca(NowFunc.ReturnValue,ChangeType(node.BackType)));
            }
            node.States.accept(this);
                if (NowBlock.HaveReturn == false) {
                    if (ChangeType(node.BackType) != null) {
                        IRValue TmpValue = new IRTmpVar(ChangeType(node.BackType), getID());
                        NowBlock.pushback(new load(TmpValue, NowFunc.ReturnValue));
                        NowBlock.pushback(new ret(TmpValue));
                    } else NowBlock.pushback(new ret(null));
                }
            NowFunc.FuncBlock.add(NowBlock);
            FuncList.add(NowFunc);
        }
    }
    public AllType ChangeType(Type OldType){
        if (OldType.Is_Int()) return new IRIntType(32);
        if (OldType.Is_Bool()) return new IRIntType(1);
        if (OldType.Is_String()) return new IRPointerType(new IRIntType(8));
        if (OldType.Is_Class()) return new IRPointerType(new IRClassType(OldType.TypeName));
        if (OldType.Is_Void()) return null;
        if (OldType.Is_Array())
        {
            AllType NowType=ChangeType(new Type(OldType.TypeName,0));
            for (int i=1;i<=OldType.Dim;i++)
                NowType=new IRPointerType(NowType);
            return NowType;
        }
        return null;
    }
    public AllType ChangeType(TypeNode Node){ return ChangeType(new Type(Node));}
    @Override
    public void visit(BinaryOpExpr node) {
        if (node.ExprLeft.ValueType.Is_String()) {
            node.ExprLeft.accept(this);
            node.ExprRight.accept(this);
            if (node.Op==BinaryOpExpr.OP.Plus) {
                ArrayList<IRValue> ParaList = new ArrayList<>();
                ParaList.add(node.ExprLeft.Value);
                ParaList.add(node.ExprRight.Value);
                IRValue TmpValue = new IRTmpVar(new IRPointerType(new IRIntType(8)), String.valueOf(getID()));
                NowBlock.pushback(new call(TmpValue, "_struct_string_AddString", ParaList));
                node.Value = TmpValue;
            }
            else if (node.Op==BinaryOpExpr.OP.Equal || node.Op==BinaryOpExpr.OP.NotEqual)
            {
                IRValue TmpValue=new IRTmpVar(new IRIntType(1),getID());
                if (node.Op==BinaryOpExpr.OP.Equal)
                NowBlock.pushback(new icmp(TmpValue,node.ExprLeft.Value,node.ExprRight.Value, icmp.icmpOp.eq));
                else NowBlock.pushback(new icmp(TmpValue,node.ExprLeft.Value,node.ExprRight.Value, icmp.icmpOp.ne));
                node.Value=TmpValue;
            }
            else
            {
                ArrayList<IRValue> ParaList = new ArrayList<>();
                ParaList.add(node.ExprLeft.Value);
                ParaList.add(node.ExprRight.Value);
                IRValue TmpValue=new IRTmpVar(new IRIntType(1),getID());
                NowBlock.pushback(new call(TmpValue,"_struct_string_"+node.Op.toString(),ParaList));
                node.Value=TmpValue;
            }
        }
        else
        {
            if (node.Op==BinaryOpExpr.OP.Minus || node.Op==BinaryOpExpr.OP.Plus ||
                   node.Op==BinaryOpExpr.OP.Multi || node.Op==BinaryOpExpr.OP.Div||
                   node.Op==BinaryOpExpr.OP.Mod || node.Op==BinaryOpExpr.OP.And||
                   node.Op==BinaryOpExpr.OP.Or || node.Op==BinaryOpExpr.OP.Xor||
                   node.Op==BinaryOpExpr.OP.less2 || node.Op==BinaryOpExpr.OP.great2)
            {
                node.ExprLeft.accept(this);
                node.ExprRight.accept(this);
                IRTmpVar Loaded;
                Loaded=new IRTmpVar(node.ExprLeft.Value.type,String.valueOf(getID()));
                binary.binaryOp NowOp=null;
               if (node.Op == BinaryOpExpr.OP.Minus) NowOp = binary.binaryOp.sub;
               if (node.Op == BinaryOpExpr.OP.Plus) NowOp = binary.binaryOp.add;
               if (node.Op == BinaryOpExpr.OP.Multi) NowOp = binary.binaryOp.mul;
               if (node.Op == BinaryOpExpr.OP.Div) NowOp = binary.binaryOp.sdiv;
               if (node.Op == BinaryOpExpr.OP.Mod) NowOp = binary.binaryOp.srem;
               if (node.Op == BinaryOpExpr.OP.And || node.Op == BinaryOpExpr.OP.And2) NowOp = binary.binaryOp.and;
               if (node.Op == BinaryOpExpr.OP.Or || node.Op == BinaryOpExpr.OP.Or2) NowOp = binary.binaryOp.or;
               if (node.Op == BinaryOpExpr.OP.Xor) NowOp = binary.binaryOp.xor;
               if (node.Op == BinaryOpExpr.OP.less2) NowOp = binary.binaryOp.shl;
               if (node.Op == BinaryOpExpr.OP.great2) NowOp = binary.binaryOp.ashr;
               binary NowInst=new binary(Loaded,node.ExprLeft.Value,node.ExprRight.Value,NowOp);
               NowBlock.pushback(NowInst);
                node.Value=Loaded;
           }
            else if (node.Op==BinaryOpExpr.OP.And2 || node.Op==BinaryOpExpr.OP.Or2)
            {
                int NowID=(BinaryID++);
                node.ExprLeft.accept(this);
                IRTmpVar ValuePointer=new IRTmpVar(new IRPointerType(new IRIntType(1)),"alloca"+getAllocaID());
                NowFunc.FuncAlloc.add(new alloca(ValuePointer,new IRIntType(1)));
                NowBlock.pushback(new store(ValuePointer,node.ExprLeft.Value));
                if (node.Op==BinaryOpExpr.OP.And2)
                    NowBlock.pushback(new br(node.ExprLeft.Value,"Binary"+NowID+".Right","Binary"+NowID+".Finish"));
                else  NowBlock.pushback(new br(node.ExprLeft.Value,"Binary"+NowID+".Finish","Binary"+NowID+".Right"));
                NowFunc.FuncBlock.add(NowBlock);

                NowBlock=new InstBlock("Binary"+NowID+".Right");
                node.ExprRight.accept(this);
                NowBlock.pushback(new store(ValuePointer,node.ExprRight.Value));
                NowBlock.pushback(new br("Binary"+NowID+".Finish"));
                NowFunc.FuncBlock.add(NowBlock);

                NowBlock=new InstBlock("Binary"+NowID+".Finish");
                IRTmpVar Value=new IRTmpVar(new IRIntType(1),String.valueOf(getID()));
                NowBlock.pushback(new load(Value,ValuePointer));

                node.Value=Value;
            }
            else
           {
               node.ExprLeft.accept(this);
               node.ExprRight.accept(this);
               IRTmpVar Loaded;
               Loaded=new IRTmpVar(new IRIntType(1),String.valueOf(getID()));
               icmp.icmpOp NowOp=null;
               if (node.Op == BinaryOpExpr.OP.Equal) NowOp = icmp.icmpOp.eq;
               if (node.Op == BinaryOpExpr.OP.NotEqual) NowOp = icmp.icmpOp.ne;
               if (node.Op == BinaryOpExpr.OP.Less) NowOp = icmp.icmpOp.slt;
               if (node.Op == BinaryOpExpr.OP.Leq) NowOp = icmp.icmpOp.sle;
               if (node.Op == BinaryOpExpr.OP.Great) NowOp = icmp.icmpOp.sgt;
               if (node.Op == BinaryOpExpr.OP.GreQ) NowOp = icmp.icmpOp.sge;
               icmp NowInst=new icmp(Loaded,node.ExprLeft.Value,node.ExprRight.Value,NowOp);
               NowBlock.pushback(NowInst);
               node.Value=Loaded;
           }
        }

    }

    @Override
    public void visit(BoolConstNode node) {
        if (node.Expr)
        node.Value=new IRIntConst(1,1);
        else node.Value=new IRIntConst(1,0);
    }

    @Override
    public void visit(BoolTypeNode node) {

    }

    @Override
    public void visit(BreakNode node) {
        NowBlock.pushback(new br("ForFinish"+NowLoopID));
    }

    @Override
    public void visit(ClassDeclearNode node) {
        NowClass=WolrdScope.FindClass(node.Identify,new position(0,0));
        ArrayList<AllType> VarList=new ArrayList<>();
        for (var DeclList:node.VarList)
        {
            for (var Decl:DeclList.List){
                VarList.add(ChangeType(Decl.TypeIdentify));
            }
        }
        WolrdBlock.pushback(new ClassDeclear(new IRClassType(node.Identify),VarList));
        boolean flat=false;
        for (var Func:node.FuncList)
        {
            if (Func.IsConstruct) flat=true;
            Func.accept(this);
        }
        if (flat==false)
        {
            NowFunc = new IRFunc(null, "_struct_"+node.Identify+"_"+node.Identify);
            NowFunc.FuncAlloc=new ArrayList<>();
            NowFunc.FuncAlloc.add(new alloca(new IRTmpVar(new IRIntType(32),"Idon't"),new IRIntType(32)));
            NowBlock = new InstBlock("entry");
            NowScope = new IRVarScope(null);
            ArrayList<AllType> ParaList=new ArrayList<>();
            ParaList.add(new IRPointerType(new IRClassType(node.Identify)));
            nowID=1;
            NowBlock.pushback(new ret(null));
            NowFunc.FuncBlock.add(NowBlock);
            NowFunc.ParaList=ParaList;
            FuncList.add(NowFunc);
        }


        NowClass=null;
    }

    @Override
    public void visit(ClassMemberNode node) {

        node.Expr.accept(this);
        if (node.Expr.ValueType.Is_Class())
        {
            ClassSymbol ExprClass=WolrdScope.FindClass(node.Expr.ValueType.TypeName,new position(0,0));
            int ClassID=ExprClass.ClassScope.FindID(node.Mem);
            ArrayList<IRValue> ParaList=new ArrayList<>();
            ParaList.add(new IRIntConst(32,0));ParaList.add(new IRIntConst(32,ClassID));
            IRValue TmpValuePointer=new IRTmpVar(new IRPointerType(ChangeType(node.ValueType)),String.valueOf(getID()));
            NowBlock.pushback(new getelementptr(TmpValuePointer,ParaList,node.Expr.Value));
            IRValue TmpValue=new IRTmpVar(ChangeType(node.ValueType),String.valueOf(getID()));
            NowBlock.pushback(new load(TmpValue,TmpValuePointer));
            node.Value=TmpValue;
            node.Pointer=TmpValuePointer;
        }

    }

    @Override
    public void visit(ClassTypeNode node) { }

    @Override
    public void visit(ContinueNode node) {
        NowBlock.pushback(new br("ForEnd"+NowLoopID));
    }

    @Override
    public void visit(EmptyState node) {}

    @Override
    public void visit(ExprStateNode node) {
        node.Expr.accept(this);
    }

    @Override
    public void visit(ForStateNode node) {
        if(node.FirstState!=null)
            node.FirstState.accept(this);
        LoopID=LoopID+1;
        int TmpLoopID=NowLoopID;
        NowLoopID=LoopID;
        NowBlock.pushback(new br("ForCond"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);
        NowBlock=new InstBlock("ForCond"+NowLoopID);
        if (node.Condition!=null) {
            node.Condition.accept(this);
            NowBlock.pushback(new br(node.Condition.Value, "ForLoop" + NowLoopID, "ForFinish" + NowLoopID));
        } else NowBlock.pushback(new br("ForLoop"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForLoop"+NowLoopID);
        IRVarScope TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        node.ForState.accept(this);
        NowScope=TmpScope;
        NowBlock.pushback(new br("ForEnd"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForEnd"+NowLoopID);
        if (node.EndState!=null)
        node.EndState.accept(this);
        NowBlock.pushback(new br("ForCond"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForFinish"+NowLoopID);
        NowLoopID=TmpLoopID;
    }

    @Override
    public void visit(FunctionCallExpr node) {
        if (node.Func instanceof ClassMemberNode){
            //Array String Class
            ((ClassMemberNode)(node.Func)).Expr.accept(this);
            if (((ClassMemberNode)(node.Func)).Expr.ValueType.Is_Class() || (((ClassMemberNode)(node.Func)).Expr.ValueType.Is_String()))
            {
                ArrayList<IRValue> ParaList=new ArrayList<>();
                ParaList.add(((ClassMemberNode)(node.Func)).Expr.Value);
                for (var iter:node.FunctionList)
                {
                    iter.accept(this);
                    ParaList.add(iter.Value);
                }
                AllType NowType=ChangeType(node.ValueType);
                IRValue TmpValue=null;
                if (NowType!=null)
                    TmpValue=new IRTmpVar(NowType,String.valueOf(getID()));
                if (((ClassMemberNode)(node.Func)).Expr.ValueType.Is_Class())
                NowBlock.pushback(new call(TmpValue,"_struct_"+((ClassMemberNode)(node.Func)).Expr.ValueType.TypeName+"_"+((ClassMemberNode)(node.Func)).Mem,ParaList));
                else
                    NowBlock.pushback(new call(TmpValue,"_struct_string_"+((ClassMemberNode)(node.Func)).Mem,ParaList));
                node.Value=TmpValue;
            }

            if (((ClassMemberNode)(node.Func)).Expr.ValueType.Is_Array())
            {
                IRValue TmpPointer=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
                NowBlock.pushback(new bitcast(((ClassMemberNode)(node.Func)).Expr.Value,TmpPointer));
                IRValue TmpPointer_1=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
                ArrayList<IRValue> ParaList=new ArrayList<>();ParaList.add(new IRIntConst(32,-1));
                NowBlock.pushback(new getelementptr(TmpPointer_1,ParaList,TmpPointer));

                IRValue TmpValue=new IRTmpVar(new IRIntType(32),getID());
                NowBlock.pushback(new load(TmpValue,TmpPointer_1));
                node.Value=TmpValue;
            }

            return ;
        }
        if (node.Func instanceof IdentifyExprNode) {
            if (NowClass == null || (NowClass.ClassScope.FindFunc(((IdentifyExprNode) (node.Func)).Identify) == null)) {
                ArrayList<IRValue> ParaList = new ArrayList<>();
                for (var iter : node.FunctionList) {
                    iter.accept(this);
                    ParaList.add(iter.Value);
                }
                AllType NowType = ChangeType(node.ValueType);
                IRValue TmpValue = null;
                if (NowType != null)
                    TmpValue = new IRTmpVar(NowType, String.valueOf(getID()));
                NowBlock.pushback(new call(TmpValue, ((IdentifyExprNode) (node.Func)).Identify, ParaList));
                node.Value = TmpValue;

            } else {
                IRValue ThisValue = new IRTmpVar(new IRPointerType(new IRClassType(NowClass.Identify)), String.valueOf(getID()));
                NowBlock.pushback(new load(ThisValue,new IRTmpVar(new IRPointerType(new IRPointerType(new IRClassType(NowClass.Identify))),"alloca0")));
                ArrayList<IRValue> ParaList = new ArrayList<>();
                ParaList.add(ThisValue);
                for (var iter : node.FunctionList) {
                    iter.accept(this);
                    ParaList.add(iter.Value);
                }
                AllType NowType = ChangeType(node.ValueType);
                IRValue TmpValue = null;
                if (NowType != null)
                    TmpValue = new IRTmpVar(NowType, String.valueOf(getID()));
                NowBlock.pushback(new call(TmpValue,"_struct_"+NowClass.Identify+"_"+ ((IdentifyExprNode) (node.Func)).Identify, ParaList));
                node.Value = TmpValue;
            }
        }
    }

    @Override
    public void visit(IdentifyExprNode node) {
        AllType VarType =ChangeType(node.ValueType);
        String ID = NowScope.Query(node.Identify);
        if (ID == null)
        {
            int ClassID=-1;
            if (NowClass!=null)
                    ClassID=NowClass.ClassScope.FindID(node.Identify);
            if (ClassID==-1) {
                node.Pointer = new IRGlobalVar(new IRPointerType(VarType), node.Identify);
                if (AssignLeft==false) {
                    IRValue TmpValue = new IRTmpVar(VarType, String.valueOf(getID()));
                    NowBlock.pushback(new load(TmpValue, node.Pointer));
                    node.Value = TmpValue;
                }
            }else {
                IRValue ThisValue = new IRTmpVar(new IRPointerType(new IRClassType(NowClass.Identify)), String.valueOf(getID()));
                ArrayList<IRValue> List=new ArrayList<>();
                List.add(new IRIntConst(32,0));
                List.add(new IRIntConst(32,ClassID));
                NowBlock.pushback(new load(ThisValue,new IRTmpVar(new IRPointerType(new IRPointerType(new IRClassType(NowClass.Identify))),"alloca0")));
                IRValue TmpPointer=new IRTmpVar(new IRPointerType(VarType),String.valueOf(getID()));
                NowBlock.pushback(new getelementptr(TmpPointer,List,ThisValue));
                node.Pointer=TmpPointer;
                if (AssignLeft==false) {
                    IRValue TmpValue = new IRTmpVar(VarType, String.valueOf(getID()));
                    NowBlock.pushback(new load(TmpValue, TmpPointer));
                    node.Value = TmpValue;
                }
            }
        }
        else
        {
            node.Pointer=new IRTmpVar(new IRPointerType(VarType),ID);
            if (AssignLeft==false) {
                IRValue TmpValue = new IRTmpVar(VarType, String.valueOf(getID()));
                NowBlock.pushback(new load(TmpValue, node.Pointer));
                node.Value = TmpValue;
            }
        }
//        if (node.Value.type instanceof IRIntType && ((IRIntType)(node.Value.type)).Is_bool && ((IRIntType)(node.Value.type)).width==8)
//        {
//            IRValue TurnValue=new IRTmpVar(new IRIntType(1,true),String.valueOf(getID()));
//            NowBlock.pushback(new trunc(TurnValue,node.Value));
//            node.Value=TurnValue;
//        }
    }

    @Override
    public void visit(IfStateNode node) {
        int NowIFID=(++IFID);
        node.Expr.accept(this);
        NowBlock.pushback(new br(node.Expr.Value,"IFTrue"+NowIFID,"IFFalse"+NowIFID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("IFTrue"+NowIFID);
        IRVarScope TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        node.IfState.accept(this);
        NowScope=TmpScope;
        NowBlock.pushback(new br("IFFinish"+NowIFID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("IFFalse"+NowIFID);
                    TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        if (node.ElseState!=null)
        node.ElseState.accept(this);
        NowScope=TmpScope;
        NowBlock.pushback(new br("IFFinish"+NowIFID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("IFFinish"+NowIFID);
    }

    @Override
    public void visit(IntConstNode node) {
        node.Value=new IRIntConst(32,node.Expr);
    }

    @Override
    public void visit(IntTypeNode node) { }

    @Override
    public void visit(MainFunctionDeclearNode node) {
        nowID=0;
        NowFunc=new IRFunc(new IRIntType(32),"main");
        allocaID=0;
        NowFunc.FuncAlloc=new ArrayList<>();
        NowBlock=new InstBlock("entry");
        NowBlock.pushback(new call(null,"Init",new ArrayList<>()));
        NowScope=new IRVarScope(null);
        NowFunc.ReturnValue = new IRTmpVar(new IRPointerType(new IRIntType(32)), "alloca"+getAllocaID());
        NowFunc.FuncAlloc.add(new alloca(NowFunc.ReturnValue,new IRIntType(32)));
        node.States.accept(this);
        if (NowBlock.HaveReturn==false)
            NowBlock.pushback(new ret(new IRIntConst(32,0)));
        NowFunc.FuncBlock.add(NowBlock);
        FuncList.add(NowFunc);
    }

    @Override
    public void visit(ManyDeclearNode node) {
        for (var Iter:node.List)
            Iter.accept(this);
    }

    @Override
    public void visit(NewExprNode node) {
        if (new Type(node.Identify, node.Dim).Is_Class())
        {
            IRValue TmpValuei8=new IRTmpVar(new IRPointerType(new IRIntType(8)),String.valueOf(getID()));
            ArrayList<IRValue> Paralist=new ArrayList<>();Paralist.add(new IRIntConst(32,(WolrdScope.ClassMap.get(node.Identify).ClassScope.GetClassNumber()*4)));
            NowBlock.pushback(new call(TmpValuei8,"malloc",Paralist));
            IRValue TmpValueBitcast=new IRTmpVar(new IRPointerType(new IRClassType(node.Identify)),getID());
            NowBlock.pushback(new bitcast(TmpValuei8,TmpValueBitcast));
            ArrayList<IRValue> ParaList=new ArrayList<>();
            ParaList.add(TmpValueBitcast);
//            IRValue TmpValueBack=new IRTmpVar(new IRPointerType(new IRClassType(node.Identify)),getID());
            NowBlock.pushback(new call(null,"_struct_"+node.Identify+"_"+node.Identify,ParaList));
            node.Value=TmpValueBitcast;
//            node.Pointer=new IRTmpVar(new IRPointerType(new IRPointerType(new IRClassType(node.Identify))),);
        }
        if (new Type(node.Identify, node.Dim).Is_Array())
        {
            NowBlock.pushback(new EmptyInst("I'm in NewArray"+NewID));
            ArrayList<IRValue> NowList=new ArrayList<>();
            for (int i=0;i<node.DefineDim;i++) {
                node.SizeExprList.get(i).accept(this);
                NowList.add(node.SizeExprList.get(i).Value);
            }
            AllType NowType=ChangeType(new Type(node.Identify,node.Dim));
            IRValue TmpPointer=new IRTmpVar(new IRPointerType(NowType),"alloca"+getAllocaID());
            NowFunc.FuncAlloc.add(new alloca(TmpPointer,NowType));
            NowBlock.pushback(new br("newExpr"+NewID+".dep0.Initial"));
            NowFunc.FuncBlock.add(NowBlock);
            MakeArray(0,node.DefineDim-1,NowList,NowType,TmpPointer);
            node.Pointer=TmpPointer;
            IRValue TmpValue=new IRTmpVar(NowType,getID());
            node.Value=TmpValue;
            NowBlock=new InstBlock("newExpr"+NewID+".Finish");
            NowBlock.pushback(new load(TmpValue,TmpPointer));
            NowBlock.pushback(new EmptyInst("I'm Finish NewArray"+NewID));
            NewID++;
        }
    }
    public void MakeArray(int dep,int Dim,ArrayList<IRValue> List,AllType NowType,IRValue LastPoint){
            NowBlock=new InstBlock("newExpr"+NewID+".dep"+dep+".Initial");

            IRValue TmpValue0=new IRTmpVar(new IRIntType(32),getID());
            NowBlock.pushback(new binary(TmpValue0,List.get(dep),new IRIntConst(32, NowType.Size()), binary.binaryOp.mul));

            IRValue TmpValue1=new IRTmpVar(new IRIntType(32),getID());
            NowBlock.pushback(new binary(TmpValue1,TmpValue0,new IRIntConst(32, 32), binary.binaryOp.add));

            IRValue TmpValue2=new IRTmpVar(new IRIntType(32),getID());
            NowBlock.pushback(new binary(TmpValue2,TmpValue1,new IRIntConst(32, 8), binary.binaryOp.sdiv));

            IRValue TmpValue3=new IRTmpVar(new IRPointerType(new IRIntType(8)),getID());
            ArrayList<IRValue> ParaList3=new ArrayList<>(); ParaList3.add(TmpValue2);
            NowBlock.pushback(new call(TmpValue3,"malloc",ParaList3));

            IRValue TmpValue4=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
            NowBlock.pushback(new bitcast(TmpValue3,TmpValue4));
            NowBlock.pushback(new store(TmpValue4,List.get(dep)));


            IRValue TmpValue5=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
            ArrayList<IRValue> ParaList5=new ArrayList<>(); ParaList5.add(new IRIntConst(32,1));
            NowBlock.pushback(new getelementptr(TmpValue5,ParaList5,TmpValue4));

            IRValue TmpValue6=new IRTmpVar(NowType,getID());
            NowBlock.pushback(new bitcast(TmpValue5,TmpValue6));

            if (dep==Dim) {
                IRValue TmpValue13=new IRTmpVar(NowType,getID());
                NowBlock.pushback(new bitcast(TmpValue6,TmpValue13));
                NowBlock.pushback(new store(LastPoint,TmpValue13));
                if (dep!=0)
                    NowBlock.pushback(new br("newExpr"+NewID+".dep"+(dep-1)+".Loop"));
                else NowBlock.pushback(new br ("newExpr"+NewID+".Finish"));


                NowFunc.FuncBlock.add(NowBlock);
                return;
            }
            IRValue TmpValue7=new IRTmpVar(new IRPointerType(NowType),"alloca"+getAllocaID());
            NowFunc.FuncAlloc.add(new alloca(TmpValue7,NowType));
            NowBlock.pushback(new store(TmpValue7,TmpValue6));

            IRValue TmpValue8=new IRTmpVar(new IRPointerType(new IRIntType(32)),"alloca"+getAllocaID());
            NowFunc.FuncAlloc.add(new alloca(TmpValue8,new IRIntType(32)));
            NowBlock.pushback(new store(TmpValue8,new IRIntConst(32,0)));
            NowBlock.pushback(new br("newExpr"+NewID+".dep"+dep+".Loop"));
            NowFunc.FuncBlock.add(NowBlock);

            NowBlock=new InstBlock("newExpr"+NewID+".dep"+dep+".Loop");

            IRValue TmpValue9=new IRTmpVar(NowType,getID());
            NowBlock.pushback(new load(TmpValue9,TmpValue7));


            IRValue TmpValue10=new IRTmpVar(new IRIntType(32),getID());
            NowBlock.pushback(new load(TmpValue10,TmpValue8));

            IRValue TmpValue11=new IRTmpVar(new IRIntType(32),getID());
            NowBlock.pushback(new binary(TmpValue11,TmpValue10,new IRIntConst(32,1), binary.binaryOp.add));
            NowBlock.pushback(new store(TmpValue8,TmpValue11));

            IRValue TmpValue12=new IRTmpVar(new IRIntType(1),getID());
            NowBlock.pushback(new icmp(TmpValue12,TmpValue10,List.get(dep), icmp.icmpOp.ne));

            IRValue TmpValue13=new IRTmpVar(NowType,getID());
            ArrayList<IRValue> ParaList13=new ArrayList<>();ParaList13.add(new IRIntConst(32,1));
            NowBlock.pushback(new getelementptr(TmpValue13,ParaList13,TmpValue9));
            NowBlock.pushback(new store(TmpValue7,TmpValue13));

            NowBlock.pushback(new br(TmpValue12,"newExpr"+NewID+".dep"+(dep+1)+".Initial","newExpr"+NewID+".dep"+dep+".Finish"));
            NowFunc.FuncBlock.add(NowBlock);

            MakeArray(dep+1,Dim,List,((IRPointerType)(NowType)).PointedType,TmpValue9);

            NowBlock=new InstBlock("newExpr"+NewID+".dep"+dep+".Finish");
            IRValue TmpValue14=new IRTmpVar(NowType,getID());
            NowBlock.pushback(new bitcast(TmpValue6,TmpValue14));
            NowBlock.pushback(new store(LastPoint,TmpValue14));
            if (dep!=0) NowBlock.pushback(new br("newExpr"+NewID+".dep"+(dep-1)+".Loop"));
            else NowBlock.pushback(new br ("newExpr"+NewID+".Finish"));
            NowFunc.FuncBlock.add(NowBlock);
        }
    @Override
    public void visit(NullConstNode node) {
        node.Value=new IRNullConst();
    }

    @Override
    public void visit(OneDeclearNode node) {
        AllType NowType=ChangeType(node.TypeIdentify);
        if (node.Expr!=null)
            node.Expr.accept(this);
        if (NowFunc.Name=="Init") {
            WolrdBlock.pushback(new GlobalVar(node.Identify, NowType));
            if (node.Expr!=null)
                NowBlock.pushback(new store(new IRGlobalVar(new IRPointerType(NowType),node.Identify),node.Expr.Value));
            else if (new Type(node.TypeIdentify).Is_Class())
                NowBlock.pushback(new store(new IRGlobalVar(new IRPointerType(NowType),node.Identify),new IRNullConst()));
        }
        else {
            int NewID=getAllocaID();
            NowScope.AddVar(node.Identify, "alloca"+NewID);
            IRValue NowValue=new IRTmpVar(new IRPointerType(NowType),"alloca"+NewID);
            NowFunc.FuncAlloc.add(new alloca(NowValue,NowType));
            if (node.Expr!=null)
                NowBlock.pushback(new store(NowValue,node.Expr.Value));
            else if (new Type(node.TypeIdentify).Is_Class())
                NowBlock.pushback(new store(NowValue,new IRNullConst()));
        }
    }

    //
//    @Override
//    public void visit(AssignDeclearNode node) {
//
//        AllType NowType=ChangeType(node.Decl.TypeIdentify);
//        node.Expr.accept(this);
//        IRValue TmpValue=node.Expr.Value;
////        if (NowType instanceof IRIntType && ((IRIntType)(NowType)).Is_bool)
////        {
////            IRValue TurnValue=new IRTmpVar(NowType,String.valueOf(getID()));
////            NowBlock.pushback(new zext(TurnValue,TmpValue));
////            TmpValue=TurnValue;
////        }
//
//
//        if (NowFunc.Name=="Init") {
//            WolrdBlock.pushback(new GlobalVar(node.Decl.Identify,NowType));
//            NowBlock.pushback(new store(new IRGlobalVar(new IRPointerType(NowType),node.Decl.Identify),TmpValue));
//        }
//        else {
//            int NewID=getID();
//            NowScope.AddVar(node.Decl.Identify, NewID);
//            IRValue NowValue=new IRTmpVar(NowType,String.valueOf(NewID));
////            NowFunc.FuncAlloc.add(new alloca(NowValue,NowType));
//            NowBlock.pushback(new alloca(NowValue,NowType));
//            NowBlock.pushback(new store(new IRTmpVar(new IRPointerType(NowType),String.valueOf(NewID)),TmpValue));
//        }
//    }
    @Override
    public void visit(PreOpExpr node) {
        node.Expr.accept(this);
        if (node.op==PreOpExpr.OP.Plus2 || node.op==PreOpExpr.OP.Minus2)
        {
            node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
            binary NowInst1;
            if (node.op==PreOpExpr.OP.Plus2) NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.add);
            else NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.sub);
            store NowInst2=new store(node.Expr.Pointer,node.Value);
            NowBlock.pushback(NowInst1);
            NowBlock.pushback(NowInst2);
            node.Pointer=node.Expr.Pointer;
        }
        else
        if (node.op==PreOpExpr.OP.Not)
        {
            node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
            binary NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(1,1),binary.binaryOp.xor);
            NowBlock.pushback(NowInst1);
        }
        else
            if (node.op==PreOpExpr.OP.Negtive)
            {
                node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
                binary NowInst1=new binary(node.Value,new IRIntConst(32,0),node.Expr.Value,binary.binaryOp.sub);
                NowBlock.pushback(NowInst1);
            }
            else
            {
                node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
                binary NowInst1=new binary(node.Value,new IRIntConst(32,-1),node.Expr.Value,binary.binaryOp.xor);
                NowBlock.pushback(NowInst1);
            }
    }

    @Override
    public void visit(ProgramNode node) {
        NowFunc=new IRFunc(new voidType(),"Init");
        NowFunc.FuncAlloc=new ArrayList<>();
        NowBlock=new InstBlock("entry");
        nowID=0;
        NowScope=new IRVarScope(null);
        for (var Iter:node.List)
            if (Iter instanceof VardeclearNode) Iter.accept(this);
        NowBlock.pushback(new ret(null));
        NowFunc.FuncBlock.add(NowBlock);
        FuncList.add(NowFunc);//VarInit
        for (var Iter:node.List)
            if (Iter instanceof MainFunctionDeclearNode) Iter.accept(this);
        for (var Iter:node.List)
            if (Iter instanceof BasicDeclearFunctionNode) Iter.accept(this);
        for (var Iter:node.List)
            if (Iter instanceof ClassDeclearNode) Iter.accept(this);
    }

    @Override
    public void visit(ReturnNode node) {
        if (node.TmpBack==null)
            NowBlock.pushback(new ret(null));
        else
        {
            node.TmpBack.accept(this);
            NowBlock.pushback(new store(NowFunc.ReturnValue,node.TmpBack.Value));
            IRValue TmpValue = new IRTmpVar(((IRPointerType)(NowFunc.ReturnValue.type)).PointedType, getID());
            NowBlock.pushback(new load(TmpValue, NowFunc.ReturnValue));
            NowBlock.pushback(new ret(TmpValue));
        }
    }

    @Override
    public void visit(StringConstNode node) {
        int ID=getStringID();
        WolrdBlock.pushback(new StringDec(".Str"+ID,change_string(node.Expr)));

        IRValue TmpValue=new IRTmpVar(new IRPointerType(new IRIntType(8)),String.valueOf(getID()));
        NowBlock.pushback(new bitcast(new IRGlobalVar(new IRPointerType(new IRArrayType(change_string(node.Expr).length(),new IRIntType(8))),".Str"+ID)
                                                    ,TmpValue));
        node.Value=TmpValue;
    }
    public String change_string(String str) {
        String rs = new String(str);
        rs = rs.replace("\\\\", "\\");
        rs = rs.replace("\\n", "\n");
        rs = rs.replace("\\\"", "\"");
        rs=rs+"\0";
//        System.out.println("rs"+rs+rs.length());
//        System.out.println("str"+str);
        return rs;
    }
    @Override
    public void visit(StringTypeNode node) {

    }

    @Override
    public void visit(SubscriptNode node) {
        node.Expr.accept(this);
        node.ID.accept(this);
        /*
        IRValue TmpValue0=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
        NowBlock.pushback(new bitcast(node.Expr.Value,TmpValue0));

        IRValue TmpValue1=new IRTmpVar(new IRPointerType(new IRIntType(32)),getID());
        ArrayList<IRValue> ParaList1=new ArrayList<>(); ParaList1.add(new IRIntConst(32,1));
        NowBlock.pushback(new getelementptr(TmpValue1,ParaList1,TmpValue0));

        IRValue TmpValue2=new IRTmpVar(ChangeType(node.Expr.ValueType),getID());
        NowBlock.pushback(new bitcast(TmpValue1,TmpValue2));

        IRValue TmpValue3=new IRTmpVar(ChangeType(node.Expr.ValueType),getID());
        ArrayList<IRValue> ParaList3=new ArrayList<>(); ParaList3.add(node.ID.Value);
        NowBlock.pushback(new getelementptr(TmpValue3,ParaList3,TmpValue2));
        node.Pointer=TmpValue3;

        IRValue TmpValue4=new IRTmpVar(((IRPointerType)(ChangeType(node.Expr.ValueType))).PointedType,getID());
        NowBlock.pushback(new load(TmpValue4,TmpValue3));
        node.Value=TmpValue4;
         */

        IRValue TmpValue3=new IRTmpVar(ChangeType(node.Expr.ValueType),getID());
        ArrayList<IRValue> ParaList3=new ArrayList<>(); ParaList3.add(node.ID.Value);
        NowBlock.pushback(new getelementptr(TmpValue3,ParaList3,node.Expr.Value));
        node.Pointer=TmpValue3;
        IRValue TmpValue4=new IRTmpVar(((IRPointerType)(ChangeType(node.Expr.ValueType))).PointedType,getID());
        NowBlock.pushback(new load(TmpValue4,TmpValue3));
        node.Value=TmpValue4;
    }

    @Override
    public void visit(SuiteStateNode node) {
        IRVarScope TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        for (var Iter:node.StateList) Iter.accept(this);
        NowScope=TmpScope;
    }

    @Override
    public void visit(ThisExprNode node) {

        IRValue ThisValue = new IRTmpVar(new IRPointerType(new IRClassType(NowClass.Identify)), String.valueOf(getID()));
        NowBlock.pushback(new load(ThisValue,new IRTmpVar(new IRPointerType(new IRPointerType(new IRClassType(NowClass.Identify))),String.valueOf(getID()))));
        node.Value=ThisValue;
    }

    @Override
    public void visit(TypeArrayNode node) {

    }

    @Override
    public void visit(VoidTypeNode node) {

    }

    @Override
    public void visit(WhileStateNode node) {

        LoopID=LoopID+1;
        int TmpLoopID=NowLoopID;
        NowLoopID=LoopID;

        NowBlock.pushback(new br("ForCond"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);
        NowBlock=new InstBlock("ForCond"+NowLoopID);
        node.Expr.accept(this);
        NowBlock.pushback(new br(node.Expr.Value,"ForLoop"+NowLoopID,"ForFinish"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForLoop"+NowLoopID);
        IRVarScope TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        node.WhileState.accept(this);
        NowScope=TmpScope;
        NowBlock.pushback(new br("ForEnd"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForEnd"+NowLoopID);
        NowBlock.pushback(new br("ForCond"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForFinish"+NowLoopID);
        NowLoopID=TmpLoopID;
    }

    @Override public void visit(LambdaExpr node) {}
}
