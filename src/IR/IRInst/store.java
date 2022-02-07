package IR.IRInst;

import IR.IRType.IRPointerType;
import IR.IRValue.IRNullConst;
import IR.IRValue.IRValue;

public class store extends BasicInst{
    public boolean Change=false;
    public IRValue StorePointer;
    public IRValue StoreValue;
    public store(IRValue _StorePointer,IRValue _StoreValue){
        super();
        StorePointer=_StorePointer;
        StoreValue=_StoreValue;
    }
    @Override public String toString() {
        if (Change == true) {
            if (StoreValue instanceof IRNullConst)
                return "pksmv " + StorePointer + ",null";
            return "pksmv " + StorePointer + "," + StoreValue;
        } else {
            if (StoreValue instanceof IRNullConst)
                return "store " + ((IRPointerType) (StorePointer.type)).PointedType + " null , " + StorePointer.type + " " + StorePointer;
            return "store " + StoreValue.type + " " + StoreValue + ", " + StorePointer.type + " " + StorePointer;
        }
    }

}
