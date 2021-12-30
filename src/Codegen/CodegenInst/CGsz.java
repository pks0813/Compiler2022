package Codegen.CodegenInst;

import Codegen.CGValue.VirtualReg;

public class CGsz extends CGInst{

    public enum OP{
        seqz,snez
    }
    OP szOP;
    public CGsz(OP _szOP, VirtualReg _rd,VirtualReg _rs1){
        super();
        szOP=_szOP;
//        DefList.add(rd=_rd);
//        UseList.add(rs1=_rs1);
        rd=_rd;
        rs1=_rs1;
    }

    @Override
    public String toString() {
        return szOP+" "+rd+" , "+rs1;
    }
}
