package Codegen.CodegenInst;

import IR.IRInst.StringDec;

public class CGStringDec {
    public String Name;
    public String Val;
    public CGStringDec(StringDec x){
        Name=x.Name;
        Val=x.Val;
    }
    @Override
    public String toString() {
        return "\t.type\t"+Name+",@object           # @"+Name+"\n" +
                "\t.section\t.rodata,\"a\",@progbits\n" +
                "\t.globl\t"+Name+"\n" +
                Name+":\n" +
                "\t.asciz\t\""+Change(Val)+"\"\n" +
                "\t.size\t"+Name+", "+Val.length()+"\n";
    }
    String Change(String x){
        String rs=new String(x);
        rs = rs.replace("\\", "\\\\");
        rs = rs.replace("\n", "\\n");
        rs = rs.replace("\"", "\\\"");
        rs = rs.replace("\0", "");
        return rs;
    }
}
