package AST;

import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode{
    public List<ASTNode> List=new ArrayList<ASTNode>();
//    public List<VardeclearNode>   VarList=new ArrayList<VardeclearNode>();
//    public List<ClassFuncDeclearNode> ClassFuncList=new ArrayList<ClassFuncDeclearNode>();
    public ProgramNode(position _pos, List<ASTNode> _List){
        super(_pos);
        List=_List;
//        VarList=_VarList;
//        ClassFuncList=_ClassFuncList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
