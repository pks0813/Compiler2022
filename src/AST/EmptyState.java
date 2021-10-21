package AST;

import Util.position.position;

public class EmptyState extends StatementNode{
    public EmptyState(position _pos){
        super(_pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
