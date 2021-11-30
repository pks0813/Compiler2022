package IR.IRInst;

import IR.IRValue.IRValue;

public class trunc extends BasicInst{
    public IRValue Loaded;
    public IRValue val;
    public trunc(IRValue _Loaded,IRValue _val)
    {
        Loaded=_Loaded;
        val=_val;
    }

    @Override
    public String toString() {
        return Loaded+" = trunc "+val.type+" "+val+" to "+Loaded.type;
    }
}
