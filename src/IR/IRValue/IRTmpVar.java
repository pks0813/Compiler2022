package IR.IRValue;

import IR.IRType.AllType;

public class IRTmpVar extends IRValue{
    public String Name;
    public IRTmpVar(AllType _type,String _Name){
        super(_type);
        Name=_Name;
    }
    @Override
    public String toString(){return "%"+Name;}
}
