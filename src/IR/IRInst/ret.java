package IR.IRInst;

import IR.IRValue.IRValue;

public class ret extends BasicInst{
    public IRValue value;//void =null
    public ret(IRValue _value){
        super();
        value=_value;
    }
    @Override
    public String toString(){
        if (value==null)
            return "ret void";
        return "ret "+value.type.toString()+" "+value.toString();
    }

}
