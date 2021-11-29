package IR.IRInst;

import IR.IRValue.IRValue;

public class binary extends BasicInst{
    public enum binaryOp{
        add, sub, mul, sdiv, srem, shl, ashr, and, or, xor
//      +   -      *   /       %    <<   >>   &    |    ^
    }
    public IRValue LoadTo;
    public IRValue Left,Right;
    public binaryOp Op;
    public binary(IRValue _LoadTo,IRValue _Left,IRValue _Right,binaryOp _Op){
        super();
        LoadTo=_LoadTo;
        Left=_Left;
        Right=_Right;
        Op=_Op;
    }
    @Override public String toString(){
        return LoadTo.toString() + " = "+Op.toString() + " " + Left.type.toString() + " " + Left.toString() + ", " + Right.toString();
    }
}
