package AST;

import Util.position.position;

public class BackOpExpr extends ExprNode{
    public enum OP{
        Plus2,Minus2;
    }
    OP op;
    public ExprNode Expr;
    public BackOpExpr(position _pos, OP _op, ExprNode _Expr){super(_pos);op=_op;Expr=_Expr;}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
