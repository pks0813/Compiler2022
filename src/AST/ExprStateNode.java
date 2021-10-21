package AST;

import Util.position.position;

public class ExprStateNode extends StatementNode{
    public ExprNode Expr;
    public ExprStateNode(position _pos, ExprNode _Expr)
    {
        super(_pos);
        Expr=_Expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
