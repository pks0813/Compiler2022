package AST;

import Util.position.position;

public class ClassMemberNode extends ExprNode{
    public ExprNode Expr;
    public String Mem;
    public ClassMemberNode(position pos, ExprNode _Expr, String _Mem){
        super(pos);
        Expr=_Expr;
        Mem=_Mem;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
