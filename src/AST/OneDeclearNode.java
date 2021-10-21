package AST;

import Util.position.position;

public class OneDeclearNode extends VardeclearNode{
    public TypeNode TypeIdentify;
    public String Identify;
    public OneDeclearNode(position _pos, TypeNode _TypeIdentify, String _Identify){
        super(_pos);
        Identify=_Identify;
        TypeIdentify=_TypeIdentify;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
