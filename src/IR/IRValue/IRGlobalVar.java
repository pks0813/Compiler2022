package IR.IRValue;

import IR.IRType.AllType;

public class IRGlobalVar extends IRValue{
    public String Name;
    public IRGlobalVar(AllType _type,String _Name){
        super(_type);
        Name=_Name;
    }
    @Override
    public String toString(){return "@"+Name;}
}
