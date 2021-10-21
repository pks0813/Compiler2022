package AST;

import Util.position.position;

public class BasicDeclearFunctionNode extends FunctionDeclearNode{
    public TypeNode  BackType;
    public String Identify;
    public ManyDeclearNode ParaList;
    public Boolean IsConstruct;
    public BasicDeclearFunctionNode(position _pos, SuiteStateNode _Suite, TypeNode _BackType, String _Identify, ManyDeclearNode _ParaList,boolean _IsConstruct){
        super(_pos,_Suite);
        BackType=_BackType;
        Identify=_Identify;
        ParaList=_ParaList;
        IsConstruct=_IsConstruct;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
