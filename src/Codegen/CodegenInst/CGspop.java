package Codegen.CodegenInst;

public class CGspop extends CGInst{
    boolean Minus;
    public static int Value;
    public int RealValue;
    public CGspop(boolean _Minus){
        super();
        Minus=_Minus;
    }
    @Override
    public String toString() {
        return "addi sp sp "+RealValue;
    }
    public void UpDate(){
        if (Minus) RealValue=-Value;
        else RealValue=Value;
    }
}
