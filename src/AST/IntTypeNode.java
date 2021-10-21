package AST;

import Util.position.position;

public class IntTypeNode extends SimpleTypeNode{
    public IntTypeNode(position _pos){super(_pos,"int");}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
