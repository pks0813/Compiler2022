package AST;

import Util.position.position;

public class WhileStateNode extends StatementNode{
    public ExprNode Expr;
    public StatementNode WhileState;
    public WhileStateNode(position _pos, ExprNode _Expr, StatementNode _WhileState)
    {
        super(_pos);
        Expr=_Expr;
        WhileState=_WhileState;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
