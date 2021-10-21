package AST;

import Util.position.position;


public class MainFunctionDeclearNode extends FunctionDeclearNode{
    public MainFunctionDeclearNode(position _pos, SuiteStateNode _Suit)
    {
        super(_pos,_Suit);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
