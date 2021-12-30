package IR.IRInst;

public class StringDec extends BasicInst{
    public String Name;
//    public int Length;
    public String Val;
    public StringDec(String _Name,String _Val){
        Name=_Name;
//        Length=_Length;
        Val=_Val;
    }
    @Override
    public String toString() {
        return "@"+Name+" = constant ["+(Val.length())+" x i8] c\""+Change(Val)+"\"";
    }
    String Change(String x){
        String rs=new String(x);
        rs = rs.replace("\\", "\\5C");
        rs = rs.replace("\n", "\\0A");
        rs = rs.replace("\"", "\\22");
        rs = rs.replace("\0", "\\00");
        return rs;
    }
}
