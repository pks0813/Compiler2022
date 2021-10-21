package AST;

import Util.position.position;
import java.util.List;

public class SuiteStateNode extends StatementNode{
    public List<StatementNode> StateList;
    public SuiteStateNode(position _pos, List<StatementNode> _StateList){
        super(_pos);
        StateList=_StateList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
