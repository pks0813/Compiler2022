package IR.IRInst;

import IR.IRType.AllType;

import java.util.ArrayList;

public class ClassDeclear extends BasicInst{
    public AllType ClassType;
    public ArrayList<AllType> ClassMem;
    public ClassDeclear(AllType _ClassType,ArrayList<AllType> _ClassMem)
    {
        ClassType=_ClassType;
        ClassMem=_ClassMem;
    }
    @Override
    public String toString() {
        if (ClassMem.size()==0)
            return ClassType.toString()+" = type {}";
        if (ClassMem.size()==1)
            return ClassType.toString()+" = type {"+ClassMem.get(0).toString()+"}";
        StringBuilder NowString=new StringBuilder(ClassType.toString()+" = type {"+ClassMem.get(0).toString());
        for (int i=1;i<ClassMem.size();i++)
            NowString.append(" , "+ClassMem.get(i).toString());
        NowString.append("}");
        return NowString.toString();
    }
}
