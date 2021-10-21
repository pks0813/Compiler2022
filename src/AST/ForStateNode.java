package AST;

import Util.position.position;

public class ForStateNode extends StatementNode{
    public ExprNode Condition,FirstState,EndState;
    public StatementNode ForState;
    public ForStateNode(position _pos, ExprNode _FirstState, ExprNode _Condition, ExprNode _EndState, StatementNode _ForState) {
        super(_pos);
        FirstState=_FirstState;
        Condition=_Condition;
        EndState=_EndState;
        ForState=_ForState;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
