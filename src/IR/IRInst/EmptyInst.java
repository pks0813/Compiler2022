package IR.IRInst;

public class EmptyInst extends BasicInst{
    String Towrite;
    public EmptyInst(){Towrite="";}
    public EmptyInst(String _Towrite){Towrite=_Towrite;}


    @Override
    public String toString() {
        return ";"+Towrite;
    }
}
