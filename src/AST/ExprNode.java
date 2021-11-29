package AST;

import IR.IRValue.IRValue;
import Util.Type;
import Util.position.position;

abstract public class ExprNode extends ASTNode{
    public enum ExprType{
        LeftValue,RightValue,THIS,VOID;
    }
    public ExprType exprtype;
    public Type ValueType;
    //forIR
    public IRValue Value;
    public IRValue Pointer;
    public ExprNode(position _pos){super(_pos);}
}
