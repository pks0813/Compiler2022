package IR.IRType;

public class IRIntType extends SimpleType{
    public int width;
    public IRIntType(int _width){
        super();
        width=_width;
    }
    @Override
    public String toString(){return "i"+width;}
}
