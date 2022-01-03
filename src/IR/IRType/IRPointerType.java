package IR.IRType;

public class IRPointerType extends SimpleType{
    public AllType PointedType;
    public IRPointerType(AllType _PointedType){
        super();
        PointedType=_PointedType;
    }
    @Override
    public String toString() {
        return PointedType.toString() + "*";
    }

    @Override
    public int Size() {
        return 32;
    }

}
