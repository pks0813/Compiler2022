package AST;

import Util.position.position;

public class BinaryOpExpr extends ExprNode{
    public enum OP{
        Plus,Minus,Multi,Div,Mod,Xor,Or,And,Equal,NotEqual,Less,Leq,Great,GreQ,And2,Or2,less2,great2
    }//  +     -    *     /   %   ^   |   &  ==     !=      <    <=    >    >=   &&  ||   <<     >>
    public OP Op;
    public ExprNode ExprLeft,ExprRight;
    public BinaryOpExpr(position _pos, ExprNode _ExprLeft, OP _op, ExprNode _ExprRight)
    {
        super(_pos);
        ExprLeft=_ExprLeft;
        Op=_op;
        ExprRight=_ExprRight;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
