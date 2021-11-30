package IR.IRType;

public class IRIntType extends SimpleType{
    public int width;
    public boolean Is_bool;
    public IRIntType(int _width,boolean _Is_bool){
        super();
        Is_bool=_Is_bool;
        width=_width;
    }
    @Override
    public String toString(){return "i"+width;}
}
