package AST;

import Util.position.position;

public class SubscriptNode extends ExprNode{
    public ExprNode Expr;
    public ExprNode ID;

    public SubscriptNode(position pos, ExprNode _Expr, ExprNode _ID) {
        super(pos);
        this.Expr=_Expr;
        this.ID=_ID;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
