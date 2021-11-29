package IR.IRType;

import java.util.ArrayList;

public class IRClassType extends IRHardType{
    public ArrayList<AllType> typeList;
    public String TypeName;
//    public int BitNum;
    public IRClassType(String _TypeName,ArrayList<AllType> _typeList){
        super();
        TypeName=_TypeName;
        typeList=_typeList;
    }
    @Override
    public String toString(){return "%struct."+TypeName;}
}
