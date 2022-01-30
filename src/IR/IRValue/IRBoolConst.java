package IR.IRValue;

import IR.IRType.AllType;
import IR.IRType.IRIntType;

public class IRBoolConst extends IRConst{
    public IRBoolConst(int _val){
        super(new IRIntType(1));
        if (_val!=0 && _val!=1) ;//Add error
        val=_val;
    }
    @Override
    public String toString(){
        return String.valueOf(val);
    }
}
