package FrontEnd;

import AST.*;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;
import Util.Scope.TmpScope;
import Util.Symbol.ClassSymbol;
import Util.Symbol.FuncSymbol;
import Util.Symbol.VarSymbol;
import Util.Type;
import Util.error.SemanticError;
import Util.position.position;
import org.antlr.v4.codegen.model.Loop;
import org.w3c.dom.Node;

import javax.lang.model.type.ArrayType;
import javax.lang.model.type.NullType;
import java.util.List;

public class SemanticCheck implements ASTVisitor {
    GlobalScope WolrdScope;
    TmpScope NowScope;
    int Loopcnt;
    Type NowFuncType;
    ClassSymbol NowClass;
    boolean NeedReturn;
    public SemanticCheck(){
        WolrdScope=new GlobalScope();
        GlobalScope EmptyScope=new GlobalScope();
        WolrdScope.AddClass(new ClassSymbol("int",null,EmptyScope));
        WolrdScope.AddClass(new ClassSymbol("bool",null,EmptyScope));
        WolrdScope.AddClass(new ClassSymbol("void",null,EmptyScope));
        BasicDeclearFunctionNode TmpNode=new BasicDeclearFunctionNode(new position(0,0),null,null,"",null,false);

        {//String Define
            GlobalScope StringScope = new GlobalScope();
            StringScope.AddFunc(new FuncSymbol("length", TmpNode, new Type("int", 0)));

            FuncSymbol SubstringSymbol = new FuncSymbol("substring", TmpNode, new Type("string", 0));
            SubstringSymbol.ParaType.add(new Type("int", 0));
            SubstringSymbol.ParaType.add(new Type("int", 0));
            StringScope.AddFunc(SubstringSymbol);

            StringScope.AddFunc(new FuncSymbol("parseInt", TmpNode, new Type("int", 0)));

            FuncSymbol OrdSymbol = new FuncSymbol("ord", TmpNode, new Type("int", 0));
            OrdSymbol.ParaType.add(new Type("int", 0));
            StringScope.AddFunc(OrdSymbol);
            WolrdScope.AddClass(new ClassSymbol("string",null,StringScope));
        }

        FuncSymbol printSymbol=new FuncSymbol("print",TmpNode,new Type("void",0));
        printSymbol.ParaType.add(new Type("string",0));
        WolrdScope.AddFunc(printSymbol);

        FuncSymbol printlnSymbol=new FuncSymbol("println",TmpNode,new Type("void",0));
        printlnSymbol.ParaType.add(new Type("string",0));
        WolrdScope.AddFunc(printlnSymbol);

        FuncSymbol printIntSymbol=new FuncSymbol("printInt",TmpNode,new Type("void",0));
        printIntSymbol.ParaType.add(new Type("int",0));
        WolrdScope.AddFunc(printIntSymbol);

        FuncSymbol printlnIntSymbol=new FuncSymbol("printlnInt",TmpNode,new Type("void",0));
        printlnIntSymbol.ParaType.add(new Type("int",0));
        WolrdScope.AddFunc(printlnIntSymbol);

        FuncSymbol getStringSymbol=new FuncSymbol("getString",TmpNode,new Type("string",0));
        WolrdScope.AddFunc(getStringSymbol);

        FuncSymbol getIntSymbol=new FuncSymbol("getInt",TmpNode,new Type("int",0));
        WolrdScope.AddFunc(getIntSymbol);

        FuncSymbol toStringSymbol=new FuncSymbol("toString",TmpNode,new Type("string",0));
        toStringSymbol.ParaType.add(new Type("int",0));
        WolrdScope.AddFunc(toStringSymbol);

    }

    @Override public void visit(IntTypeNode node) { }
    @Override public void visit(VoidTypeNode node) { }
    @Override public void visit(BoolTypeNode node) { }
    @Override public void visit(StringTypeNode node) { }
    @Override public void visit(ClassTypeNode node) { }
    @Override public void visit(TypeArrayNode node) { }

    @Override
    public void visit(BoolConstNode node) {
        node.exprtype= ExprNode.ExprType.RightValue;
        node.ValueType=new Type("bool",0);
    }

    @Override
    public void visit(IntConstNode node) {
        node.exprtype= ExprNode.ExprType.RightValue;
        node.ValueType=new Type("int",0);
    }

    @Override
    public void visit(StringConstNode node) {
        node.exprtype= ExprNode.ExprType.RightValue;
        node.ValueType=new Type("string",0);
    }

    @Override
    public void visit(NullConstNode node) {
        node.exprtype= ExprNode.ExprType.RightValue;
        node.ValueType=new Type("null",0);
    }


    @Override
    public void visit(AssignNode node) {
        node.ExprLeft.accept(this);
        node.ExprRight.accept(this);
        if (node.ExprLeft.exprtype!= ExprNode.ExprType.LeftValue
            || !node.ExprLeft.ValueType.AssignPermit(node.ExprRight.ValueType))
            throw new SemanticError("Can't assign", node.pos);
        node.ValueType=node.ExprLeft.ValueType;
        node.exprtype= ExprNode.ExprType.LeftValue;
    }


    @Override
    public void visit(BackOpExpr node) {
        node.Expr.accept(this);
        if (!node.Expr.ValueType.CanSelfPlus2() || node.Expr.exprtype!= ExprNode.ExprType.LeftValue)
            throw new SemanticError("Can't BackOP", node.pos);
        node.ValueType=node.Expr.ValueType;
        node.exprtype=ExprNode.ExprType.RightValue;
    }

    @Override
    public void visit(BinaryOpExpr node) {
        node.ExprLeft.accept(this);
        node.ExprRight.accept(this);
        if (node.Op== BinaryOpExpr.OP.Plus)
        {
            if (!node.ExprLeft.ValueType.CanPlus(node.ExprRight.ValueType))
                throw new SemanticError("The Binary Op is error ",node.pos);
            node.exprtype= ExprNode.ExprType.RightValue;
            node.ValueType=node.ExprLeft.ValueType;
            return;
        }
        if (node.Op== BinaryOpExpr.OP.Minus||
            node.Op== BinaryOpExpr.OP.Multi || node.Op== BinaryOpExpr.OP.Div ||
        node.Op== BinaryOpExpr.OP.Mod || node.Op== BinaryOpExpr.OP.Xor ||
        node.Op== BinaryOpExpr.OP.Or || node.Op== BinaryOpExpr.OP.And||
        node.Op== BinaryOpExpr.OP.less2 || node.Op== BinaryOpExpr.OP.great2){
            if (!node.ExprLeft.ValueType.CanMathCal(node.ExprRight.ValueType))
                throw new SemanticError("The Binary Op is error ",node.pos);
            node.exprtype= ExprNode.ExprType.RightValue;
            node.ValueType=new Type("int",0);
            return;
        }
        if (node.Op== BinaryOpExpr.OP.Equal || node.Op== BinaryOpExpr.OP.NotEqual)
        {
            if (!node.ExprLeft.ValueType.SamePermit(node.ExprRight.ValueType))
                throw new SemanticError("The Bianry Op is error",node.pos);
            node.exprtype= ExprNode.ExprType.RightValue;
            node.ValueType=new Type("bool",0);
            return;
        }
        if (node.Op== BinaryOpExpr.OP.Less || node.Op== BinaryOpExpr.OP.Leq||
            node.Op== BinaryOpExpr.OP.Great || node.Op== BinaryOpExpr.OP.GreQ)
        {
            if (!node.ExprLeft.ValueType.ComparePermit(node.ExprRight.ValueType))
                throw new SemanticError("The Bianry Op is error",node.pos);
            node.exprtype= ExprNode.ExprType.RightValue;
            node.ValueType=new Type("bool",0);
            return;
        }
        if (node.Op== BinaryOpExpr.OP.And2 || node.Op== BinaryOpExpr.OP.Or2)
        {
            if (!node.ExprLeft.ValueType.BoolOpPermit(node.ExprRight.ValueType))
                throw new SemanticError("The Bianry Op is error",node.pos);
            node.exprtype= ExprNode.ExprType.RightValue;
            node.ValueType=new Type("bool",0);
            return;
        }
    }

    @Override
    public void visit(ClassMemberNode node) {//for var
        node.Expr.accept(this);
        if (!node.Expr.ValueType.Is_Class())
            throw new SemanticError("The expr is not a class",node.pos);
        ClassSymbol Class=NowScope.FindClass(node.Expr.ValueType.TypeName,node.pos);
        VarSymbol ClassVar=Class.ClassScope.FindVar(node.Mem, node.pos);
        node.ValueType=ClassVar.Vartype;
        node.exprtype= ExprNode.ExprType.LeftValue;
        return;
    }

    @Override
    public void visit(IdentifyExprNode node) {
        VarSymbol IdentifyVar=NowScope.FindVar(node.Identify,node.pos);
        node.ValueType=IdentifyVar.Vartype;
        node.exprtype= ExprNode.ExprType.LeftValue;
    }

    @Override
    public void visit(NewExprNode node) {
        ClassSymbol IdentifyClass=NowScope.FindClass(node.Identify,node.pos);
        for (int i=0;i<node.DefineDim;i++)
        {
            node.SizeExprList.get(i).accept(this);
            if (!node.SizeExprList.get(i).ValueType.Is_Int())
                throw new SemanticError("The size is not a Int",node.pos);
        }
        node.exprtype=ExprNode.ExprType.LeftValue;
        node.ValueType=new Type(node.Identify,node.Dim);
    }

    @Override
    public void visit(PreOpExpr node) {
        node.Expr.accept(this);
        if (node.op== PreOpExpr.OP.Plus2 || node.op== PreOpExpr.OP.Minus2)
        {
            if (node.Expr.exprtype!= ExprNode.ExprType.LeftValue || !node.Expr.ValueType.CanSelfPlus2())
                throw new SemanticError("the Expr is error", node.pos);
            node.ValueType=node.Expr.ValueType;
            node.exprtype=node.Expr.exprtype;
            return ;
        }
        if (node.op== PreOpExpr.OP.Not)//!
        {
            if (!node.Expr.ValueType.Is_Bool())
                throw new SemanticError("the Expr is error", node.pos);
            node.ValueType=node.Expr.ValueType;
            node.exprtype= ExprNode.ExprType.RightValue;
            return;
        }
        if (!node.Expr.ValueType.Is_Int())//~-
            throw new SemanticError("the Expr is error", node.pos);
        node.ValueType=node.Expr.ValueType;
        node.exprtype= ExprNode.ExprType.RightValue;
        return;
    }

    @Override
    public void visit(SubscriptNode node) {
        node.Expr.accept(this);node.ID.accept(this);
        if (!node.Expr.ValueType.Is_Array() || !node.ID.ValueType.Is_Int())
            throw new SemanticError("The Expr is error",node.pos);
        node.ValueType=new Type(node.Expr.ValueType.TypeName,node.Expr.ValueType.Dim-1);
        node.exprtype= ExprNode.ExprType.LeftValue;
    }

    @Override
    public void visit(ThisExprNode node) {
        if (NowClass==null) throw new SemanticError("you are not in a class",node.pos);
        node.ValueType=new Type(NowClass.Identify,0);
        node.exprtype= ExprNode.ExprType.LeftValue;
    }



    //Statement

    @Override
    public void visit(OneDeclearNode node) {
        node.TypeIdentify.accept(this);
        if (node.TypeIdentify instanceof TypeArrayNode)
        {
            NowScope.FindClass(node.TypeIdentify.TypeIdentify,node.pos);
            VarSymbol NowVar=new VarSymbol(node.Identify,node,new Type(node.TypeIdentify.TypeIdentify,((TypeArrayNode)node.TypeIdentify).Dim));
            NowScope.AddVar(NowVar);
            return;
        }
        NowScope.FindClass(node.TypeIdentify.TypeIdentify,node.pos);
        VarSymbol NowVar=new VarSymbol(node.Identify,node,new Type(node.TypeIdentify.TypeIdentify,0));
        NowScope.AddVar(NowVar);
        return;
    }

    @Override
    public void visit(AssignDeclearNode node) {
        node.Decl.accept(this);
        VarSymbol NowVar=NowScope.FindVar(node.Decl.Identify,node.Decl.pos);
        node.Expr.accept(this);
        if (!NowVar.Vartype.AssignPermit(node.Expr.ValueType))
            throw new SemanticError("Different Type",node.pos);
    }

    @Override
    public void visit(BreakNode node) {
        if (Loopcnt==0) throw new SemanticError("No loop to Break",node.pos);
    }

    @Override
    public void visit(BasicDeclearFunctionNode node) {
        if (node.IsConstruct) {
            if (NowClass == null || !NowClass.Identify.equals(node.Identify))
                throw new SemanticError("You are not in a class or the wrong class", node.pos);
            NowFuncType=new Type("void",0);
            boolean TmpNeedReturn=NeedReturn;
            NeedReturn=false;
            node.States.accept(this);
            NeedReturn=TmpNeedReturn;
            return;
        }
        if (NowClass!=null && NowClass.Identify.equals(node.Identify))
            throw new SemanticError("Function Name is same as Class Name",node.pos);
        node.BackType.accept(this);
        Type tmpFuncType=NowFuncType;
        NowFuncType=new Type(node.BackType);
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        boolean TmpNeedReturn=NeedReturn;
        NeedReturn=!node.BackType.TypeIdentify.equals("void");
        node.ParaList.accept(this);
        node.States.accept(this);
        if (NeedReturn)
            throw new SemanticError("you did't return ",node.pos);
        NowScope=tmp;
        NowFuncType=tmpFuncType;
        NeedReturn=TmpNeedReturn;
    }

    @Override
    public void visit(ClassDeclearNode node) {
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        UpdateClassScope(node,NowScope);
        NowClass=WolrdScope.FindClass(node.Identify,node.pos);
        for (var Iter:node.FuncList)
            Iter.accept(this);
        NowScope=tmp;
        NowClass=null;
    }
    void UpdateClassScope(ClassDeclearNode node, Scope BaseScope)
    {
        for (var Iter:node.VarList){
            if (Iter instanceof AssignDeclearNode)
                throw new SemanticError("Class Can't Use assign Declear",Iter.pos);
            if (Iter instanceof OneDeclearNode)
                BaseScope.AddVar(new VarSymbol(((OneDeclearNode) Iter).Identify,Iter,new Type(((OneDeclearNode) Iter).TypeIdentify)));
            if (Iter instanceof ManyDeclearNode)
                for (var OneDcl:((ManyDeclearNode) Iter).List)
                    BaseScope.AddVar(new VarSymbol(OneDcl.Identify,OneDcl,new Type(OneDcl.TypeIdentify)));
        }
        for (var Iter:node.FuncList){
            if (Iter.IsConstruct)
            {
                if (!Iter.Identify.equals(node.Identify))
                    throw new SemanticError("Construct Define Error",Iter.pos);
                BaseScope.AddConstruct(new FuncSymbol(Iter.Identify,Iter,new Type("void",0)));
                return;
            }
            FuncSymbol NowSymbol= new FuncSymbol(Iter.Identify,Iter,new Type(Iter.BackType));
            for (var Dcl:Iter.ParaList.List)
               NowSymbol.ParaType.add(new Type( Dcl.TypeIdentify));
            BaseScope.AddFunc(NowSymbol);
        }
    }
    @Override
    public void visit(ContinueNode node) {
        if (Loopcnt==0) throw new SemanticError("There isn't any loop",node.pos);
    }

    @Override
    public void visit(EmptyState node) {}

    @Override
    public void visit(ExprStateNode node) {node.Expr.accept(this);}

    @Override
    public void visit(ForStateNode node) {
        if (node.FirstState!=null)
        node.FirstState.accept(this);
        if (node.Condition!=null) {
            node.Condition.accept(this);
            if (!node.Condition.ValueType.Is_Bool())
                throw new SemanticError("For Condition is not bool", node.pos);
        }
            if (node.EndState!=null)
        node.EndState.accept(this);
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        Loopcnt++;
        node.ForState.accept(this);
        NowScope=tmp;
        Loopcnt--;
    }

    @Override
    public void visit(FunctionCallExpr node) {
        if (node.Func instanceof ClassMemberNode)
        {
            ((ClassMemberNode) node.Func).Expr.accept(this);
            if (((ClassMemberNode) node.Func).Expr.ValueType.Is_Array())
            {
                if (!((ClassMemberNode) node.Func).Mem.equals("size") || node.FunctionList.size()!=0)
                    throw new SemanticError("Array don't have such func",node.pos);
                node.exprtype= ExprNode.ExprType.RightValue;
                node.ValueType=new Type("int",0);
                return;
            }
            if (!((ClassMemberNode) node.Func).Expr.ValueType.Is_Class())
                throw new SemanticError("It isn't a Class",node.pos);
            ClassSymbol ExprClass=NowScope.FindClass(((ClassMemberNode) node.Func).Expr.ValueType.TypeName,node.pos);
            FuncSymbol MemFunc=ExprClass.ClassScope.FindFunc(((ClassMemberNode) node.Func).Mem, node.pos);
            if (((BasicDeclearFunctionNode)MemFunc.DefineNode).IsConstruct)
                throw new SemanticError("you can't transfer Construct Func",node.pos);
            if (MemFunc.ParaType.size()!=node.FunctionList.size()) throw new SemanticError("Para number is error",node.pos);
            int Num=node.FunctionList.size();
            for (int i=0;i<Num;i++)
            {
                node.FunctionList.get(i).accept(this);
                if (!node.FunctionList.get(i).ValueType.SameType(MemFunc.ParaType.get(i)))
                    throw new SemanticError("ParaList Type is different",node.pos);
            }
            node.ValueType=MemFunc.ReturnType;
            node.exprtype= ExprNode.ExprType.RightValue;
            return;
        }
        if (node.Func instanceof IdentifyExprNode)
        {
            FuncSymbol MemFunc=NowScope.FindFunc(((IdentifyExprNode) node.Func).Identify, node.pos);
            if (((BasicDeclearFunctionNode)MemFunc.DefineNode).IsConstruct)
                throw new SemanticError("you can't transfer Construct Func",node.pos);
            if (MemFunc.ParaType.size()!=node.FunctionList.size()) throw new SemanticError("Para number is error",node.pos);
            int Num=node.FunctionList.size();
            for (int i=0;i<Num;i++)
            {
                node.FunctionList.get(i).accept(this);
                if (!node.FunctionList.get(i).ValueType.SameType(MemFunc.ParaType.get(i)))
                    throw new SemanticError("ParaList Type is different",node.pos);
            }
            node.ValueType=MemFunc.ReturnType;
            node.exprtype=ExprNode.ExprType.RightValue;
            return;
        }
        throw new SemanticError("Can't Be a function",node.pos);
    }

    @Override
    public void visit(IfStateNode node) {
        node.Expr.accept(this);
        if (!node.Expr.ValueType.Is_Bool())
            throw new SemanticError("It is not a bool type",node.Expr.pos);
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        node.IfState.accept(this);
        NowScope=tmp;
        if (node.ElseState!=null){
            tmp=NowScope;
            NowScope=new TmpScope(tmp);
            node.ElseState.accept(this);
            NowScope=tmp;
        }
    }

    @Override
    public void visit(MainFunctionDeclearNode node) {
        NowFuncType=new Type("int",0);
        NeedReturn=false;
        node.States.accept(this);
        NowFuncType=new Type("void",0);
        if (NeedReturn)
            throw new SemanticError("You didn't return ",node.pos);
    }
    @Override
    public void visit(ManyDeclearNode  node) {
        for (var Iter:node.List)
            Iter.accept(this);
    }

    @Override
    public void visit(ReturnNode node) {
        NeedReturn=false;
        if (node.TmpBack!=null)
        {
            node.TmpBack.accept(this);
            if (NowFuncType.Is_Void() || !node.TmpBack.ValueType.AssignPermit(NowFuncType))
                throw new SemanticError("Return Type is error",node.pos);
            return;
        }
        if (!NowFuncType.Is_Void())
            throw new SemanticError("Return Type is error",node.pos);
    }

    @Override
    public void visit(SuiteStateNode node) {
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        for (var Iter:node.StateList)
            Iter.accept(this);
        NowScope=tmp;
    }

    @Override
    public void visit(WhileStateNode node) {
        node.Expr.accept(this);
        if (!node.Expr.ValueType.Is_Bool()) throw new SemanticError("the Condition Type is error",node.pos);
        TmpScope tmp=NowScope;
        NowScope=new TmpScope(tmp);
        Loopcnt++;
        node.WhileState.accept(this);
        NowScope=tmp;
        Loopcnt--;
    }

    @Override
    public void visit(ProgramNode node) {
        int MainFunc=0;
        for (var Iter:node.List)
        {
            if (Iter instanceof ClassDeclearNode)
            {
                GlobalScope ClassScope=new GlobalScope();
                UpdateClassScope((ClassDeclearNode) Iter,ClassScope);
                WolrdScope.AddClass(new ClassSymbol(((ClassDeclearNode) Iter).Identify,Iter,ClassScope));
                continue;
            }
            if (Iter instanceof FunctionDeclearNode)
            {
                if (Iter instanceof MainFunctionDeclearNode)
                {
                    if (MainFunc>0) throw new SemanticError("Two Main Function",Iter.pos);
                    MainFunc++;
                    WolrdScope.AddFunc(new FuncSymbol("main",Iter,new Type("int",0)));
                    continue;
                }
                FuncSymbol NowSymbol= new FuncSymbol(((BasicDeclearFunctionNode)Iter).Identify,Iter,new Type(((BasicDeclearFunctionNode)Iter).BackType));
                for (var Dcl:((BasicDeclearFunctionNode)Iter).ParaList.List)
                    NowSymbol.ParaType.add(new Type( Dcl.TypeIdentify));
                WolrdScope.AddFunc(NowSymbol);
                continue;
            }
        }
        if (MainFunc==0)    throw new SemanticError("Has no MainFunc",new position(0,0));
        NowScope=new TmpScope(WolrdScope);
        for (var Iter:node.List)
        {
            if (Iter instanceof VardeclearNode) Iter.accept(this);
            if (Iter instanceof MainFunctionDeclearNode){
                Iter.accept(this);
            }
            if (Iter instanceof BasicDeclearFunctionNode)
                Iter.accept(this);
            if (Iter instanceof ClassDeclearNode)
                Iter.accept(this);
        }
    }
}
