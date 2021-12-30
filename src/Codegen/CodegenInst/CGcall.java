package Codegen.CodegenInst;

public class CGcall extends CGInst{
    String FuncName;
    public CGcall(String _FuncName){
        super();
        FuncName=_FuncName;
    }
    @Override
    public String toString() {
        return "call "+FuncName;
    }
}
