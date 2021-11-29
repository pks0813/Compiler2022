package IR.IRInst;

import IR.IRType.IRPointerType;
import IR.IRValue.IRValue;

import java.util.ArrayList;

public class getelementptr extends BasicInst{
    public IRValue LoadTo;
    public ArrayList<IRValue> IDList;
    public IRValue GetPointer;
    public getelementptr(IRValue _LoadTo,ArrayList<IRValue> _IDList,IRValue _GetPointer){
        super();
        LoadTo=_LoadTo;
        IDList=_IDList;
        GetPointer=_GetPointer;
    }
    @Override public String toString(){
        StringBuilder NowString=new StringBuilder(LoadTo.toString()+"= getelementptr "+((IRPointerType)GetPointer.type).PointedType.toString()
                +", "+GetPointer.type.toString()+" "+GetPointer.toString());
        for (IRValue ID:IDList)
            NowString.append(", "+ID.type.toString()+" "+ID.toString());
        return NowString.toString();
    }
}
