package IR.IRType;

public class IRIntType extends SimpleType{
    public int width;
    public IRIntType(int _width){
        super();
//        Is_bool=_Is_bool;
        width=_width;
    }
    @Override
    public String toString(){return "i"+width;}

    @Override
    public int Size() {
        return width;
    }
}
