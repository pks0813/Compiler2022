package IR.IRValue;

import IR.IRType.AllType;
import IR.IRType.IRIntType;
import IR.IRType.IRPointerType;

public class IRNullConst extends IRConst{
    public IRNullConst(){
        super(new IRPointerType(new IRIntType(32)));val=0;
    }
     public IRNullConst(AllType _Type){super(_Type);}
    @Override
    public String toString(){
        return "null";
    }
}
