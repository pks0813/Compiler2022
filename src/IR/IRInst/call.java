package IR.IRInst;

import IR.IRType.AllType;
import IR.IRValue.IRValue;

import java.util.ArrayList;

public class call extends BasicInst{
    public AllType LoadedType;
    public IRValue Loaded;
    public String FuncName;
    public ArrayList<IRValue> ParaList;
    public call(AllType _LoadedType,IRValue _Loaded,String _FuncName,ArrayList<IRValue> _ParaList){
        LoadedType=_LoadedType;
        Loaded=_Loaded;
        FuncName=_FuncName;
        ParaList=_ParaList;
    }
    @Override
    public String toString() {
        StringBuilder Str=new StringBuilder();
        if (LoadedType==null)
            Str.append("call void @"+FuncName+"(");
        else Str.append(Loaded+" = call "+LoadedType+" @"+FuncName+"(");
        if (ParaList.size()>=1)
            Str.append(ParaList.get(0).type.toString()+" "+ParaList.get(0).toString());
        for (int i=1;i<ParaList.size();i++)
            Str.append(" , "+ParaList.get(i).type.toString()+" "+ParaList.get(i).toString());
        Str.append(" )");
        return Str.toString();

    }
}
