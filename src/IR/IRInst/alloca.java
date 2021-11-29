package IR.IRInst;

import IR.IRType.AllType;
import IR.IRValue.IRValue;

public class alloca extends BasicInst{
    public IRValue Beloaded;
    public AllType Type;
    public alloca(IRValue _Beloaded,AllType _Type){
        Beloaded=_Beloaded;
        Type=_Type;
    }
    @Override
    public String toString() {
        return Beloaded.toString()+" = alloca "+Type.toString();
    }
}
