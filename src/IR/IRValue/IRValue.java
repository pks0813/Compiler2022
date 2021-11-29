package IR.IRValue;

import IR.IRType.AllType;

abstract public class IRValue {
    public AllType type;
    public IRValue(AllType _type){
        type=_type;
    }
    @Override abstract public String toString();
}
