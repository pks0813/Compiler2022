package IR.IRType;

public class voidType extends AllType{
    public voidType(){}
    @Override
    public String toString() {
        return "void";
    }

    @Override
    public int Size() {
        System.out.println("VoidType Size error");
        return 0;
    }
}
