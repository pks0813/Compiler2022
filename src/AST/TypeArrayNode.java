package AST;

import Util.position.position;

public class TypeArrayNode extends TypeNode{
    public int Dim;
    TypeNode BaseType;
    public TypeArrayNode(position _pos, TypeNode _Nextype){
        super(_pos,_Nextype.TypeIdentify);
        if (_Nextype instanceof TypeArrayNode){
            this.Dim=((TypeArrayNode) _Nextype).Dim+1;
            this.BaseType=((TypeArrayNode) _Nextype).BaseType;
        }else
        {
            this.Dim=1;
            this.BaseType=_Nextype;
        }
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
