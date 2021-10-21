package AST;

import Util.position.position;

public class IfStateNode extends StatementNode{
    public ExprNode Expr;
    public StatementNode IfState,ElseState;
    public IfStateNode(position _pos, ExprNode _Expr, StatementNode _IfState, StatementNode _ElseState)
    {
        super(_pos);
        Expr=_Expr;
        IfState=_IfState;
        ElseState=_ElseState;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
