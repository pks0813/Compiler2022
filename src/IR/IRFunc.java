package IR;

import IR.IRInst.BasicInst;
import IR.IRType.AllType;
import IR.IRValue.IRValue;

import java.util.ArrayList;

public class IRFunc {
    public AllType ReturnType;
    public String Name;
    public ArrayList<BasicInst> FuncAlloc=new ArrayList<>();
    public ArrayList<BasicInst> FuncInitial=new ArrayList<>();
    public ArrayList<InstBlock> FuncBlock;
    public ArrayList<AllType> ParaList;
    public IRValue ReturnValue;
    public IRFunc(AllType _ReturnType,String _Name){
        ReturnType=_ReturnType;
        Name=_Name;
        FuncBlock=new ArrayList<>();
        ParaList=new ArrayList<>();
    }
}
