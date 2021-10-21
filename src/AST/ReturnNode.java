package AST;

import Util.position.position;

public class ReturnNode extends StatementNode{
    public ExprNode TmpBack;
    public ReturnNode(position _pos, ExprNode _TmpBack){
        super(_pos);
        TmpBack=_TmpBack;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
