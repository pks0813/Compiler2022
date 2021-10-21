package AST;

import Util.position.position;

public class IntConstNode extends ConstExprNode{
    public int Expr;
    public IntConstNode(position _pos, int  _Expr){
        super(_pos);Expr=_Expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
