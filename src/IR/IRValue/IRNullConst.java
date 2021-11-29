package IR.IRValue;

import IR.IRType.IRPointerType;

public class IRNullConst extends IRConst{
    public IRNullConst(){
        super(new IRPointerType(null));
    }
    @Override
    public String toString(){
        return "null";
    }
}
