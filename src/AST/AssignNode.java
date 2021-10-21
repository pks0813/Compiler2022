package AST;

import Util.position.position;

public class AssignNode extends ExprNode{
    public ExprNode ExprLeft,ExprRight;
    public AssignNode(position _pos, ExprNode _ExprLeft, ExprNode _ExprRight) {
        super(_pos);
        this.ExprLeft=_ExprLeft;
        this.ExprRight=_ExprRight;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
