package IR.IRType;

public class IRArrayType extends IRHardType{
    public int dim;
    public AllType type;
    public IRArrayType(int _dim,AllType _type){
        super();
        dim=_dim;
        type=_type;
    }
    @Override
    public String toString(){
        return "[ "+dim+" x "+type+" ]";
    }
}
