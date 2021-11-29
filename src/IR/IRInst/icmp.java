package IR.IRInst;

import IR.IRValue.IRValue;

public class icmp extends BasicInst{
    public enum icmpOp{
        eq,  ne  ,ugt,uge,ult,ule,sgt,sge,slt,sle
//      ==   !=   >   >=   <  <=   >   >=   <  <=
        //          unsigned          signed
    }
    public IRValue LoadTo;
    public IRValue Left,Right;
    public icmpOp Op;
    public icmp(IRValue _LoadTo,IRValue _Left,IRValue _Right,icmpOp _Op){
        super();
        LoadTo=_LoadTo;
        Left=_Left;
        Right=_Right;
        Op=_Op;
    }
    @Override public String toString(){
        return LoadTo.toString() + " = icmp " + Op.toString() + " " + Left.type.toString() + " " + Left.toString() + ", " + Right.toString();
    }
}
