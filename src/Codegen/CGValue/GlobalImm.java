package Codegen.CGValue;

public class GlobalImm extends Imm{
    public enum type{
        lo,hi
    }
    public type position;
    public GlobalReg rs;
    public GlobalImm(type _position ,GlobalReg _rs){
        rs=_rs;position=_position;
    }
    @Override
    public String toString() {
        return "%"+position+"("+rs.Name+")";
    }
}
