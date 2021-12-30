package AST;

import Util.position.position;

import java.util.List;

public class ClassDeclearNode extends ClassFuncDeclearNode {
    public String Identify;
    public List<BasicDeclearFunctionNode> FuncList;
    public List<ManyDeclearNode> VarList;
    public ClassDeclearNode(position _pos,  String _Identify, List<BasicDeclearFunctionNode> _FuncList, List<ManyDeclearNode> _VarList){
        super(_pos);
        Identify=_Identify;
        FuncList=_FuncList;
        VarList=_VarList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
