package Codegen.CGValue;

public class IntImm extends Imm{
    int Value;

    public IntImm(int _Value){
        Value=_Value;
    }
    @Override
    public String toString() {
        return String.valueOf(Value);
    }
}
