package IR.IRInst;

import IR.IRValue.IRValue;

public class zext extends BasicInst{
    public IRValue Loaded;
    public IRValue val;
    public zext(IRValue _Loaded,IRValue _val)
    {
        Loaded=_Loaded;
        val=_val;
    }

    @Override
    public String toString() {
        return Loaded+" = zext "+val.type+" "+val+" to "+Loaded.type;
    }
}
