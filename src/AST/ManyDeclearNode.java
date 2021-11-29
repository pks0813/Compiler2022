package AST;

import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class ManyDeclearNode extends VardeclearNode{
    public List<OneDeclearNode> List;
    public ManyDeclearNode(position _pos, List<OneDeclearNode> _List){
        super(_pos);
        List=_List;
    }
//    public ManyDeclearNode(OneDeclearNode OneDecl){
//        super(OneDecl.pos);
//        List=new ArrayList<>();
//        List.add(OneDecl);
//    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
