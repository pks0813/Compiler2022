package IR.IRInst;

import IR.IRValue.IRValue;

public class store extends BasicInst{
    public IRValue StorePointer;
    public IRValue StoreValue;
    public store(IRValue _StorePointer,IRValue _StoreValue){
        super();
        StorePointer=_StorePointer;
        StoreValue=_StoreValue;
    }
    @Override public String toString(){
        return "store " + StoreValue.type + " " + StoreValue + ", " + StorePointer.type + " " + StorePointer.toString();
    }

}
