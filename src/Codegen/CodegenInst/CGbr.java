package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;

public class CGbr extends CGInst{
    public enum type{
        bnez,beqz
    }
    public String BrLabel;
    public type op;
    public CGbr(type _op,CGReg _Cond,String _Brlabel){
        op=_op;BrLabel=_Brlabel;
//        UseList.add(rs1=_Cond);
        rs1=_Cond;
    }

    @Override
    public String toString() {
        return op+" "+rs1+","+BrLabel;
    }
}
