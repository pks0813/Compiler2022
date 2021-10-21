package AST;

import Util.position.position;

public class IdentifyExprNode extends ExprNode{
    public String Identify;
    public IdentifyExprNode(position _pos, String _Identify){
        super(_pos);
        Identify=_Identify;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
