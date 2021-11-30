package IR.IRType;

public class IRArrayType extends IRHardType{
    public int cnt;
    public AllType type;
    public IRArrayType(int _cnt,AllType _type){
        super();
        cnt=_cnt;
        type=_type;
    }
    @Override
    public String toString(){
        return "[ "+cnt+" x "+type+" ]";
    }
}
