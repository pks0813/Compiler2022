package IR.IRValue;

import IR.IRType.AllType;

abstract public class IRConst extends IRValue{
    public IRConst(AllType type){
        super(type);
    }
    @Override abstract public String toString();
}
