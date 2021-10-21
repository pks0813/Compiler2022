package AST;

import Util.position.position;

abstract public class TypeNode extends ASTNode{
    public String TypeIdentify;
    public TypeNode(position _pos,String _Identify){super(_pos);TypeIdentify=_Identify;}
}
