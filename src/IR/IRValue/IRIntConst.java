package IR.IRValue;

import IR.IRType.IRIntType;

public class IRIntConst extends IRConst{
    public int val;
    public IRIntConst(int width,int _val){
        super(new IRIntType(width,false));
        val=_val;
    }
    @Override
    public String toString(){
        return String.valueOf(val);
    }
}
