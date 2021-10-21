package AST;

import Util.position.position;

public class BreakNode extends StatementNode{
    public BreakNode(position _pos){super(_pos);}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
