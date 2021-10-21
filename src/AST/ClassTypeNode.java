package AST;

import Util.position.position;

public class ClassTypeNode extends TypeNode{
    public ClassTypeNode(position _pos,String _TypeIdentify){super(_pos,_TypeIdentify);}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
