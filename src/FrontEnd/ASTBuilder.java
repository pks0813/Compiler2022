package FrontEnd;

import AST.*;
import Parse.MXBaseVisitor;
import Parse.MXParser;
import Util.error.ErrorPlus;
import Util.error.syntaxError;
import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends MXBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitBoolConst(MXParser.BoolConstContext ctx) {
//        if (ctx.toString().equals("true"))
//            return new BoolConstNode(new position(ctx.getStart()),true);
//        return new BoolConstNode(new position(ctx.getStart()),false);

        return new BoolConstNode(new position(ctx.getStart()),Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public ASTNode visitBoolCst(MXParser.BoolCstContext ctx) {
        return new BoolConstNode(new position(ctx.getStart()),Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public ASTNode visitIntcst(MXParser.IntcstContext ctx) {
        return new IntConstNode(new position(ctx.getStart()),Integer.parseInt(ctx.getText()));
    }

    @Override
    public ASTNode visitStrcst(MXParser.StrcstContext ctx) {
        return new StringConstNode(new position(ctx.getStart()),ctx.getText().substring(1,ctx.getText().length()-1));
    }

    @Override
    public ASTNode visitNullcst(MXParser.NullcstContext ctx) {
        return new NullConstNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitInttype(MXParser.InttypeContext ctx) {
        return new IntTypeNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitStringType(MXParser.StringTypeContext ctx) {
        return new StringTypeNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitBoolType(MXParser.BoolTypeContext ctx) {
        return new BoolTypeNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitClassType(MXParser.ClassTypeContext ctx) {
        return new ClassTypeNode(new position(ctx.getStart()),ctx.getText());
    }

    @Override
    public ASTNode visitArraytype(MXParser.ArraytypeContext ctx) {
        return new TypeArrayNode(new position(ctx.getStart()),(TypeNode) visit(ctx.type()));
    }

    @Override
    public ASTNode visitOnlytype(MXParser.OnlytypeContext ctx) {
        return visit(ctx.easytype());
    }

    @Override
    public ASTNode visitVoidType(MXParser.VoidTypeContext ctx) {
        return new VoidTypeNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitBasictype(MXParser.BasictypeContext ctx) {
        return visit(ctx.type());
    }

    @Override
    public ASTNode visitConstExpr(MXParser.ConstExprContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public ASTNode visitClassExpr(MXParser.ClassExprContext ctx) {
        return new IdentifyExprNode(new position(ctx.getStart()),ctx.getText());
    }

    @Override
    public ASTNode visitThisExpr(MXParser.ThisExprContext ctx) {
        return new ThisExprNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitExpr(MXParser.ExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitWrongCreate(MXParser.WrongCreateContext ctx) {
        throw new ErrorPlus("Create error");
    }

    @Override
    public ASTNode visitArrayCreate(MXParser.ArrayCreateContext ctx) {
        int DefineDim=ctx.expression().size();
        int Dim=ctx.RightSquareBracket().size();
        ArrayList<ExprNode> SizeList=new ArrayList<ExprNode>();
        for (int i=0;i<DefineDim;i++)
            SizeList.add((ExprNode) visit(ctx.expression(i)));
            return new NewExprNode(new position(ctx.getStart()),ctx.easytype().getText(),DefineDim,SizeList,Dim);
    }

    @Override
    public ASTNode visitEasyCreate(MXParser.EasyCreateContext ctx) {
        return new NewExprNode(new position(ctx.getStart()),ctx.easytype().getText(),0,null,0);
    }

    @Override
    public ASTNode visitClassCreate(MXParser.ClassCreateContext ctx) {
        return new NewExprNode(new position(ctx.getStart()),ctx.easytype().getText(),0,null,0);
    }

    @Override
    public ASTNode visitNewExpr(MXParser.NewExprContext ctx) {
        return visit(ctx.newsentence());
    }

    @Override
    public ASTNode visitAssignExpr(MXParser.AssignExprContext ctx) {
        return new AssignNode(new position(ctx.getStart()),(ExprNode)visit(ctx.expression(0)),(ExprNode)visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitBinaryOpExpr(MXParser.BinaryOpExprContext ctx) {
        BinaryOpExpr.OP Op;
        switch (ctx.op.getText()){
            case "+":
                Op=BinaryOpExpr.OP.Plus;break;
            case "-":
                Op=BinaryOpExpr.OP.Minus;break;
            case "*":
                Op=BinaryOpExpr.OP.Multi;break;
            case "/":
                Op=BinaryOpExpr.OP.Div;break;
            case "%":
                Op=BinaryOpExpr.OP.Mod;break;
            case "^":
                Op=BinaryOpExpr.OP.Xor;break;
            case "&":
                Op=BinaryOpExpr.OP.And;break;
            case "|":
                Op=BinaryOpExpr.OP.Or;break;
            case "==":
                Op=BinaryOpExpr.OP.Equal;break;
            case "!=":
                Op=BinaryOpExpr.OP.NotEqual;break;
            case "<":
                Op=BinaryOpExpr.OP.Less;break;
            case "<=":
                Op=BinaryOpExpr.OP.Leq;break;
            case ">":
                Op=BinaryOpExpr.OP.Great;break;
            case ">=":
                Op=BinaryOpExpr.OP.GreQ;break;
            case "&&":
                Op=BinaryOpExpr.OP.And2;break;
            case "||":
                Op=BinaryOpExpr.OP.Or2;break;
            case "<<":
                Op=BinaryOpExpr.OP.less2;break;
            case ">>":
                Op=BinaryOpExpr.OP.great2;break;
            default:
                throw new syntaxError("BinaryOpExpr error in the undefined Op",new position(ctx.getStart()));
        }
        return new BinaryOpExpr(new position(ctx.getStart()),(ExprNode) visit(ctx.expression(0)),Op,(ExprNode) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitSubscriptExpr(MXParser.SubscriptExprContext ctx) {
        return new SubscriptNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression(0)),(ExprNode) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitFunctionExpr(MXParser.FunctionExprContext ctx) {
        int Num=ctx.functionInsList().expression().size();
        List<ExprNode> FuncList=new ArrayList<ExprNode>();
        for (int i=0;i<Num;i++)
                FuncList.add((ExprNode) visit(ctx.functionInsList().expression(i)));
        return new FunctionCallExpr(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()),FuncList);
    }

    @Override
    public ASTNode visitPointExpr(MXParser.PointExprContext ctx) {
        return new ClassMemberNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()),ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitBackfixExpr(MXParser.BackfixExprContext ctx) {
        if (ctx.op.getText().equals("++"))
            return new BackOpExpr(new position(ctx.getStart()),BackOpExpr.OP.Plus2,(ExprNode) visit(ctx.expression()));
        else
            return new BackOpExpr(new position(ctx.getStart()),BackOpExpr.OP.Minus2,(ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitPrefixExpr(MXParser.PrefixExprContext ctx) {
        PreOpExpr.OP Op;
        switch (ctx.op.getText()) {
            case "!":
                Op = PreOpExpr.OP.Not;
                break;
            case "~":
                Op = PreOpExpr.OP.Negate;
                break;
            case "-":
                Op = PreOpExpr.OP.Negtive;
                break;
            case "++":
                Op = PreOpExpr.OP.Plus2;
                break;
            case "--":
                Op = PreOpExpr.OP.Minus2;
                break;
            default:
                throw new syntaxError("PrefinxExpr error in the undefined Op", new position(ctx.getStart()));
        }
        return new PreOpExpr(new position(ctx.getStart()),Op,(ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitAtomExpr(MXParser.AtomExprContext ctx) {
        return (ExprNode)visit(ctx.primary());
    }

//    @Override
//    public ASTNode visitAssignDef(MXParser.AssignDefContext ctx) {
//        return new AssignDeclearNode(new position(ctx.getStart()),
//                new OneDeclearNode(new position(ctx.type().getStart()),(TypeNode) visit(ctx.type()),ctx.Identifier().toString()),
//                        (ExprNode)visit(ctx.expression()));
//    }

//    @Override
//    public ASTNode visitManyDef(MXParser.ManyDefContext ctx) {
//        List<OneDeclearNode> List=new ArrayList<OneDeclearNode>();
//        int Num=ctx.Identifier().size();
//        for (int i=0;i<Num;i++)
//        {
//            List.add(new OneDeclearNode(new position(ctx.getStart()),(TypeNode) visit(ctx.type()),ctx.Identifier(i).getText()));
//        }
//        return new ManyDeclearNode(new position(ctx.getStart()),List);
//    }


    @Override
    public ASTNode visitVarDef(MXParser.VarDefContext ctx) {
        List<OneDeclearNode> List=new ArrayList<>();
        int Num=ctx.basicvarDef().size();
        for (int i=0;i<Num;i++)
        {
            if (ctx.basicvarDef(i).expression()==null)
                List.add(new OneDeclearNode(new position(ctx.getStart()),(TypeNode) visit(ctx.type()),ctx.basicvarDef(i).Identifier().getText(),null));
            else
                List.add(new OneDeclearNode(new position(ctx.getStart()),(TypeNode) visit(ctx.type()),ctx.basicvarDef(i).Identifier().getText(),(ExprNode) visit(ctx.basicvarDef(i).expression())));
        }
        return new ManyDeclearNode(new position(ctx.getStart()),List);
    }

    @Override
    public ASTNode visitClassvarDef(MXParser.ClassvarDefContext ctx) {

        List<OneDeclearNode> List=new ArrayList<>();
        int Num=ctx.Identifier().size();
        for (int i=0;i<Num;i++)
           List.add(new OneDeclearNode(new position(ctx.getStart()),(TypeNode) visit(ctx.type()),ctx.Identifier(i).getText(),null));
        return new ManyDeclearNode(new position(ctx.getStart()),List);
    }

    @Override
    public ASTNode visitSuite(MXParser.SuiteContext ctx) {
        List<StatementNode> List=new ArrayList<>();
        int Num=ctx.statement().size();
        for (int i=0;i<Num;i++)
            List.add((StatementNode) visit(ctx.statement(i)));
        return new SuiteStateNode(new position(ctx.getStart()),List);
    }

    @Override
    public ASTNode visitConstructDef(MXParser.ConstructDefContext ctx) {
        return new BasicDeclearFunctionNode(new position(ctx.getStart()),(SuiteStateNode) visit(ctx.suite()),new VoidTypeNode(new position(0,0)),ctx.Identifier().getText(),new ManyDeclearNode(new position(0,0),new ArrayList<>()),true);
    }

//    @Override
//    public ASTNode visitLambda(MXParser.LambdaContext ctx) {
//        List<OneDeclearNode> List=new ArrayList<OneDeclearNode>();
//        List<ExprNode> ExprList=new ArrayList<ExprNode>();
//        int Num1=0,Num2=0;
//        if (ctx.functionParameterList()!=null)
//        {
//            Num1=ctx.functionParameterList().Identifier().size();
//            for (int i=0;i<Num1;i++)
//                List.add(new OneDeclearNode(new position(ctx.functionParameterList().type(i).getStart()),
//                        (TypeNode) visit(ctx.functionParameterList().type(i)),
//                        ctx.functionParameterList().Identifier(i).getText()));
//        }
//        if (ctx.functionInsList()!=null)
//        {
//            Num2=ctx.functionInsList().expression().size();
//            for (int i=0;i<Num2;i++)
//                ExprList.add((ExprNode) visit(ctx.functionInsList().expression(i)));
//        }
//        if (Num1!=Num2) throw new SemanticError("Different number of Lambda",new position(ctx.getStart()));
//        return new LambdaExpr(new position(ctx.getStart()),List,ExprList,(SuiteStateNode) visit(ctx.suite()));
//    }

    @Override
    public ASTNode visitFunctionDef(MXParser.FunctionDefContext ctx) {
//        if (ctx.functiontype().getText().equals("int") && ctx.Identifier().getText().equals("main"))
//            return new MainFunctionDeclearNode(new position(ctx.getStart()),(SuiteStateNode) visit(ctx.suite()));
        List<OneDeclearNode> List=new ArrayList<>();
        if (ctx.functionParameterList()!=null)
        {
            int Num=ctx.functionParameterList().Identifier().size();
            for (int i=0;i<Num;i++)
                List.add(new OneDeclearNode(new position(ctx.functionParameterList().type(i).getStart()),
                                            (TypeNode) visit(ctx.functionParameterList().type(i)),
                                            ctx.functionParameterList().Identifier(i).getText(),null));
        }
        return new BasicDeclearFunctionNode(new position(ctx.getStart()),(SuiteStateNode) visit(ctx.suite()),(TypeNode) visit(ctx.functiontype()),ctx.Identifier().getText(),
                new ManyDeclearNode(new position(ctx.getStart()),List),false);
    }
//
//    @Override
//    public ASTNode visitClassFuncDef(MXParser.ClassFuncDefContext ctx) {
//        return visit(ctx.functionDef());
//    }
//    @Override
//    public ASTNode visitClassConstructDef(MXParser.ClassConstructDefContext ctx) {
//        return visit(ctx.constructDef());
//    }


    @Override
    public ASTNode visitClassDef(MXParser.ClassDefContext ctx) {
        List<BasicDeclearFunctionNode> FuncList=new ArrayList<>();
        List<ManyDeclearNode> VarList=new ArrayList<>();
        if (ctx.functionDef()!=null)
        {
            int NumFunc=ctx.functionDef().size();
            for (int i=0;i<NumFunc;i++)
                FuncList.add((BasicDeclearFunctionNode) visit(ctx.functionDef(i)));
        }
        if (ctx.constructDef()!=null)
        {
            int NumConstruct=ctx.constructDef().size();
            for (int i=0;i<NumConstruct;i++)
                FuncList.add((BasicDeclearFunctionNode) visit(ctx.constructDef(i)));
        }
        if (ctx.classvarDef()!=null) {
            int NumVar = ctx.classvarDef().size();
            for (int i = 0; i < NumVar; i++)
                VarList.add((ManyDeclearNode) visit(ctx.classvarDef(i)));
        }
        return new ClassDeclearNode(new position(ctx.getStart()),ctx.Identifier().getText(),FuncList,VarList);
    }

    @Override
    public ASTNode visitEmptyStat(MXParser.EmptyStatContext ctx) {
        return new EmptyState(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitExprssionStat(MXParser.ExprssionStatContext ctx) {
        return new ExprStateNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitReturnStat(MXParser.ReturnStatContext ctx) {
        if (ctx.expression()==null)
            return new ReturnNode(new position(ctx.getStart()),null);
        return new ReturnNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitContinueStat(MXParser.ContinueStatContext ctx) {
        return new ContinueNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitBreakStat(MXParser.BreakStatContext ctx) {
        return new BreakNode(new position(ctx.getStart()));
    }

    @Override
    public ASTNode visitForStat(MXParser.ForStatContext ctx) {
        ExprNode FirstState=(ctx.init==null)?null:(ExprNode) visit(ctx.init);
        ExprNode Condition=(ctx.check==null)?null:(ExprNode) visit(ctx.check);
        ExprNode EndState=(ctx.step==null)?null:(ExprNode) visit(ctx.step);
        return new ForStateNode(new position(ctx.getStart()),FirstState,Condition,EndState,(StatementNode) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitWhilestate(MXParser.WhilestateContext ctx) {
        return new WhileStateNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()),(StatementNode) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitIfStat(MXParser.IfStatContext ctx) {
        StatementNode ElseNode=(ctx.falseStmt==null)?null:(StatementNode) visit(ctx.falseStmt);
        return new IfStateNode(new position(ctx.getStart()),(ExprNode) visit(ctx.expression()),(StatementNode) visit(ctx.trueStmt),ElseNode);
    }

    @Override
    public ASTNode visitVardefineStat(MXParser.VardefineStatContext ctx) {
        return visit(ctx.varDef());
    }

    @Override
    public ASTNode visitSuiteStat(MXParser.SuiteStatContext ctx) {
        List<StatementNode> List=new ArrayList<StatementNode>();
        int Num=ctx.suite().statement().size();
        for (int i=0;i<Num;i++)
            List.add((StatementNode) visit(ctx.suite().statement(i)));
        return new SuiteStateNode(new position(ctx.getStart()),List);
    }

    @Override
    public ASTNode visitProgramFuncDef(MXParser.ProgramFuncDefContext ctx) {
        if (ctx.functionDef().Identifier().getText().equals("main") && ctx.functionDef().functiontype().getText().equals("int"))
        {
            if (ctx.functionDef().functionParameterList()!=null) throw new syntaxError("Main function can't have Parameter",new position(ctx.getStart()));
            return new MainFunctionDeclearNode(new position(ctx.getStart()),(SuiteStateNode) visit(ctx.functionDef().suite()));
        }
        List<OneDeclearNode> List=new ArrayList<OneDeclearNode>();
        if (ctx.functionDef().functionParameterList()!=null) {
            int Num=ctx.functionDef().functionParameterList().Identifier().size();
            for (int i=0;i<Num;i++)
            {
                List.add(new OneDeclearNode(new position(ctx.functionDef().functionParameterList().type(i).getStart()),
                                            (TypeNode) visit(ctx.functionDef().functionParameterList().type(i)),
                                            ctx.functionDef().functionParameterList().Identifier(i).getText(),null));
            }
        }
        return new BasicDeclearFunctionNode(new position(ctx.getStart()),(SuiteStateNode) visit(ctx.functionDef().suite()),(TypeNode) visit(ctx.functionDef().functiontype()),
                                            ctx.functionDef().Identifier().getText(),
                                            new ManyDeclearNode(new position(ctx.getStart()),List),false);
    }

    @Override
    public ASTNode visitProgramClassDef(MXParser.ProgramClassDefContext ctx) {
        return visit(ctx.classDef());
    }
    @Override
    public ASTNode visitProgramVarDef(MXParser.ProgramVarDefContext ctx) {
        return visit(ctx.varDef());
    }

    @Override
    public ASTNode visitProgram(MXParser.ProgramContext ctx) {
        List<ASTNode> List=new ArrayList<ASTNode>();
        for (var i : ctx.programDef()) {
            List.add(visit(i));
        }
        return new ProgramNode(new position(ctx.getStart()),List);
    }
}
