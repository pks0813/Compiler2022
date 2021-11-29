package IR;
import AST.*;
import IR.IRInst.*;
import IR.IRType.AllType;
import IR.IRType.IRIntType;
import IR.IRType.IRPointerType;
import IR.IRType.voidType;
import IR.IRValue.*;
import Util.Scope.GlobalScope;
import Util.Type;

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
//    public String NowClass
//    Name;
//    public IRFunc NowFunc;
    int nowID;
    int getID() {
        System.out.println(nowID);
        nowID++;
        return nowID-1;
    }
    public IRBuilder(GlobalScope _WolrdScope){
        WolrdScope=_WolrdScope;
        WolrdBlock=new InstBlock("");
        FuncList=new ArrayList<>();
        LoopID=0;
        NowLoopID=0;
        IFID=0;
    }

    @Override
    public void visit(AssignDeclearNode node) {

        AllType NowType=null;
        Type OldType=new Type(node.Decl.TypeIdentify.TypeIdentify,0);
        if (OldType.Is_Bool()) NowType=new IRIntType(8);
        if (OldType.Is_Int()) NowType=new IRIntType(32);

        if (NowFunc.Name=="Init") {
            WolrdBlock.pushback(new GlobalVar(node.Decl.Identify,NowType));
            node.Expr.accept(this);
            NowBlock.pushback(new store(new IRGlobalVar(new IRPointerType(NowType),node.Decl.Identify),node.Expr.Value));
        }
        else {
            int NewID=getID();
            NowScope.AddVar(node.Decl.Identify, NewID);
            IRValue NowValue=new IRTmpVar(NowType,String.valueOf(NewID));
//            NowFunc.FuncAlloc.add(new alloca(NowValue,NowType));
            NowBlock.pushback(new alloca(NowValue,NowType));
            node.Expr.accept(this);
            NowBlock.pushback(new store(new IRTmpVar(new IRPointerType(NowType),String.valueOf(NewID)),node.Expr.Value));
        }
    }

    @Override
    public void visit(AssignNode node) {
        node.ExprLeft.accept(this);
        node.ExprRight.accept(this);

        NowBlock.pushback(new store(node.ExprLeft.Pointer,node.ExprRight.Value));
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

    }

    @Override
    public void visit(BinaryOpExpr node) {
        node.ExprLeft.accept(this);
        node.ExprRight.accept(this);
        if (node.ExprLeft.ValueType.Is_String()) {
            System.out.println("err");
        }
        else
        {
            if (node.Op==BinaryOpExpr.OP.Minus || node.Op==BinaryOpExpr.OP.Plus ||
                   node.Op==BinaryOpExpr.OP.Multi || node.Op==BinaryOpExpr.OP.Div||
                   node.Op==BinaryOpExpr.OP.Mod || node.Op==BinaryOpExpr.OP.And||
                   node.Op==BinaryOpExpr.OP.Or || node.Op==BinaryOpExpr.OP.Xor||
                   node.Op==BinaryOpExpr.OP.less2 || node.Op==BinaryOpExpr.OP.great2)
            {
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
           else
           {
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
        NowBlock.pushback(new br("For Finish"+NowLoopID));
    }

    @Override
    public void visit(ClassDeclearNode node) {

    }

    @Override
    public void visit(ClassMemberNode node) {

    }

    @Override
    public void visit(ClassTypeNode node) {

    }

    @Override
    public void visit(ContinueNode node) {
        NowBlock.pushback(new br("For End"+NowLoopID));
    }

    @Override
    public void visit(EmptyState node) {}

    @Override
    public void visit(ExprStateNode node) {
        node.Expr.accept(this);
    }

    @Override
    public void visit(ForStateNode node) {
        node.FirstState.accept(this);
        LoopID=LoopID+1;
        int TmpLoopID=NowLoopID;
        NowLoopID=LoopID;
        NowFunc.FuncBlock.add(NowBlock);
        NowBlock=new InstBlock("ForCond"+NowLoopID);
        node.Condition.accept(this);
        NowBlock.pushback(new br(node.Condition.Value,"ForLoop"+NowLoopID,"ForFinish"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForLoop"+NowLoopID);
        IRVarScope TmpScope=NowScope;
        NowScope=new IRVarScope(TmpScope);
        node.ForState.accept(this);
        NowScope=TmpScope;
        NowBlock.pushback(new br("ForEnd"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForEnd"+NowLoopID);
        node.EndState.accept(this);
        NowBlock.pushback(new br("ForCond"+NowLoopID));
        NowFunc.FuncBlock.add(NowBlock);

        NowBlock=new InstBlock("ForFinish"+NowLoopID);
        NowLoopID=TmpLoopID;
    }

    @Override
    public void visit(FunctionCallExpr node) {

    }

    @Override
    public void visit(IdentifyExprNode node) {
        AllType VarType = null;
        if (node.ValueType.Is_Int()) VarType = new IRIntType(32);
        if (node.ValueType.Is_Bool()) VarType = new IRIntType(8);
        int ID = NowScope.Query(node.Identify);
        if (ID == -1)
        {
            IRValue TmpValue=new IRTmpVar(VarType,String.valueOf(getID()));
            node.Pointer=new IRGlobalVar(new IRPointerType(VarType),node.Identify);
            NowBlock.pushback(new load(TmpValue,node.Pointer));
            node.Value=TmpValue;
        }
        else
        {
            IRValue TmpValue=new IRTmpVar(VarType,String.valueOf(getID()));
            node.Pointer=new IRTmpVar(new IRPointerType(VarType),String.valueOf(ID));
            NowBlock.pushback(new load(TmpValue,node.Pointer));
            node.Value=TmpValue;
        }
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
        NowBlock=new InstBlock("entry");
        NowScope=new IRVarScope(null);
        node.States.accept(this);
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

    }

    @Override
    public void visit(NullConstNode node) {
        node.Value=new IRNullConst();
    }

    @Override
    public void visit(OneDeclearNode node) {
        AllType NowType=null;
        Type OldType=new Type(node.TypeIdentify.TypeIdentify,0);
        if (OldType.Is_Bool()) NowType=new IRIntType(8);
        if (OldType.Is_Int()) NowType=new IRIntType(32);

        if (NowFunc.Name=="Init")
            WolrdBlock.pushback(new GlobalVar(node.Identify,NowType));
        else {
            int NewID=getID();
            NowScope.AddVar(node.Identify, NewID);
            IRValue NowValue=new IRTmpVar(NowType,String.valueOf(NewID));
//            NowFunc.FuncAlloc.add(new alloca(NowValue,NowType));
            NowBlock.pushback(new alloca(NowValue,NowType));
        }
    }

    @Override
    public void visit(PreOpExpr node) {
        node.Expr.accept(this);
        if (node.op==PreOpExpr.OP.Plus2 || node.op==PreOpExpr.OP.Minus2)
        {
            node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
            binary NowInst1;
            if (node.op==PreOpExpr.OP.Plus2) NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.add);
            else NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(32,1),binary.binaryOp.sub);
            node.Expr.Pointer=null;
            store NowInst2=new store(node.Expr.Pointer,node.Value);
            NowBlock.pushback(NowInst1);
            NowBlock.pushback(NowInst2);
        }
        else//not and
        {
            node.Value=new IRTmpVar(node.Expr.Value.type,String.valueOf(getID()));
            binary NowInst1=new binary(node.Value,node.Expr.Value,new IRIntConst(8,1),binary.binaryOp.xor);
            node.Expr.Pointer=null;
            store NowInst2=new store(node.Expr.Pointer,node.Value);
            NowBlock.pushback(NowInst1);
            NowBlock.pushback(NowInst2);
        }
        node.Pointer=node.Expr.Pointer;
    }

    @Override
    public void visit(ProgramNode node) {
        NowFunc=new IRFunc(new voidType(),"Init");
        NowBlock=new InstBlock("entry");
        nowID=0;
        for (var Iter:node.List)
            if (Iter instanceof VardeclearNode) Iter.accept(this);
        NowBlock.pushback(new ret(null));
        NowFunc.FuncBlock.add(NowBlock);
        FuncList.add(NowFunc);//VarInit

        for (var Iter:node.List)
            if (Iter instanceof MainFunctionDeclearNode) Iter.accept(this);


    }

    @Override
    public void visit(ReturnNode node) {
        if (node.TmpBack==null)
            NowBlock.pushback(new ret(null));
        else
        {
            node.TmpBack.accept(this);
            NowBlock.pushback(new ret(node.TmpBack.Value));
        }
    }

    @Override
    public void visit(StringConstNode node) {

    }

    @Override
    public void visit(StringTypeNode node) {

    }

    @Override
    public void visit(SubscriptNode node) {

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
