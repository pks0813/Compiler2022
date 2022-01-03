package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.IntImm;
import Codegen.CGValue.VirtualReg;

public class CGbinaryOp extends CGInst{
    public enum OP {
        add, sub, mul, div, rem, sll, sra, slt, sltu, and, or, xor
    }
    OP BinaryOP;
    public CGbinaryOp(OP _BianryOP, CGReg _rd, CGReg _rs1, CGReg _rs2){
        super();
        BinaryOP=_BianryOP;
//        DefList.add(rd=_rd);
//        UseList.add(rs1=_rs1);
//        UseList.add(rs2=_rs2);
        rs1=_rs1;
        rs2=_rs2;
        rd=_rd;
    }



    @Override public String toString() {return BinaryOP + " " + rd + ", " + rs1 + ", " + rs2;}
}
