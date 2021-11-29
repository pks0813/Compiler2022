package IR.IRInst;

import IR.IRType.AllType;

public class GlobalVar extends BasicInst{
    public String Identify;
    public AllType Type;
    public GlobalVar(String _Identify,AllType _Type){
        Identify=_Identify;
        Type=_Type;
    }
    @Override
    public String toString() {
        return "@"+Identify+" = global "+Type.toString()+" zeroinitializer";
    }
}
