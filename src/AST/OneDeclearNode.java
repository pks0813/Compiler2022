package AST;

import Util.position.position;

public class OneDeclearNode extends VardeclearNode{
    public TypeNode TypeIdentify;
    public String Identify;
    public ExprNode Expr;//null说明仅仅定义
    public OneDeclearNode(position _pos, TypeNode _TypeIdentify, String _Identify,ExprNode _Expr){
        super(_pos);
        Identify=_Identify;
        TypeIdentify=_TypeIdentify;
        Expr=_Expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
