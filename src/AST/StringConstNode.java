package AST;

import Util.position.position;

public class StringConstNode extends ConstExprNode{
    public String Expr;
    public StringConstNode(position _pos, String _Expr){
        super(_pos);Expr=_Expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
