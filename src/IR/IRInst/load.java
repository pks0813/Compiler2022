package IR.IRInst;

import IR.IRValue.IRValue;

public class load extends BasicInst{
    public IRValue LoadTo;
    public IRValue LoadPointer;
    public load(IRValue _LoadTo,IRValue _LoadPointer){
        super();
        LoadTo=_LoadTo;
        LoadPointer=_LoadPointer;
    }
    @Override public String toString(){
        return LoadTo.toString()+" = load "+LoadTo.type.toString()+", "+LoadPointer.type.toString()+" "+LoadPointer.toString();
    }
}
