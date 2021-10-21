package AST;

import Util.position.position;

public class BoolConstNode extends ConstExprNode{
    public Boolean Expr;
    public BoolConstNode(position _pos, Boolean _Expr){
        super(_pos);Expr=_Expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
