package AST;

import Util.position.position;

public class ContinueNode extends StatementNode{
    public ContinueNode(position _pos){super(_pos);}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
