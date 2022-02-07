package IR.IRInst;

import IR.IRType.AllType;
import IR.IRValue.IRValue;

public class pksmv extends BasicInst{
    public IRValue Pointer;
    public IRValue Beloaded;
    public pksmv(IRValue _Pointer,IRValue _Beloaded){
        Beloaded=_Beloaded;
        Pointer=_Pointer;
    }
    @Override
    public String toString() {
        return Beloaded.toString()+" = pksmv "+Pointer.toString();
    }
}
