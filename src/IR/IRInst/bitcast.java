package IR.IRInst;

import IR.IRType.AllType;
import IR.IRValue.IRValue;

public class bitcast extends BasicInst{
    public IRValue Pointer;
    public IRValue Beloaded;
    public bitcast(IRValue _Pointer,IRValue _Beloaded){
        Beloaded=_Beloaded;
        Pointer=_Pointer;
    }
    @Override
    public String toString() {
        return Beloaded.toString()+" = bitcast "+Pointer.type.toString()+" "+Pointer.toString()+" to "+Beloaded.type.toString();
    }
}
