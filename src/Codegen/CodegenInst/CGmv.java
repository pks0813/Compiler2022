package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.VirtualReg;

public class CGmv extends CGInst{
    public CGmv(CGReg _rd, CGReg _rs1){
        super();
//        DefList.add(rd=_rd);
//        UseList.add(rs1=_rs1);
        rs1=_rs1;
        rd=_rd;

    }

    @Override
    public String toString() {
        return "mv "+rd+" , "+rs1;
    }
}
