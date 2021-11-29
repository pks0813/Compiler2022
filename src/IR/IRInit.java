package IR;

import IR.IRType.IRClassType;
import IR.IRValue.IRGlobalVar;

import java.util.ArrayList;

public class IRInit {
    public ArrayList<IRClassType> ClassList;
    public ArrayList<IRGlobalVar> VarList;
    public ArrayList<IRFunc> FuncList;
    public IRInit(){
        FuncList=new ArrayList<>();;
        ClassList=new ArrayList<>();;
        VarList=new ArrayList<>();;

    }

}
