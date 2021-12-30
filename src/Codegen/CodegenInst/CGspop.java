package Codegen.CodegenInst;

public class CGspop extends CGInst{
    boolean Minus;
    public static int Value;
    public CGspop(boolean _Minus){
        super();
        Minus=_Minus;
    }
    @Override
    public String toString() {
        if (Minus) return "addi sp sp "+(-Value);
        return "addi sp sp "+Value;

    }
}
