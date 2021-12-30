package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.IntImm;
import Codegen.CGValue.VirtualReg;

public class CGImmOp extends CGInst{
    public enum OP {
        addi, slti, sltiu, andi, ori, xori, slli
    }
    OP ImmOP;
    IntImm imm;
    public CGImmOp(OP _ImmOP, CGReg _rd, CGReg _rs1, IntImm _imm){
        super();
        ImmOP=_ImmOP;
//        DefList.add(rd=_rd);
//        UseList.add(rs1=_rs1);
        rd=_rd;
        rs1=_rs1;
        imm=_imm;
    }



    @Override public String toString() {return ImmOP + " " + rd + ", " + rs1 + ", " + imm;}
}
