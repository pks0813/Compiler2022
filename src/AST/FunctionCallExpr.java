package AST;

import Util.position.position;

import java.util.List;

public class FunctionCallExpr extends ExprNode{
    public ExprNode Func;
    public List<ExprNode> FunctionList;
    public FunctionCallExpr(position _pos,ExprNode _Func,List<ExprNode> _FunctionList){
        super(_pos);
        Func=_Func;
        FunctionList=_FunctionList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
