package Codegen.CGValue;

public class VirtualReg extends CGReg{
    public String Name;
    public PhysicalReg Color;

    public VirtualReg(String _Name){Color=null;Name=_Name;}

    @Override
    public String toString() {
        if (Color==null) return "%"+Name;
        else return Color.toString();
    }
}
