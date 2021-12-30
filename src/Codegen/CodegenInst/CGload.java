package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.Imm;
import Codegen.CGValue.IntImm;
import Codegen.CGValue.VirtualReg;

public class CGload extends CGMemInst{
    public enum OP{
        lbu,lw
    }
    int Offset;
    OP LoadOP;
//    public CGload(OP _loadOP, CGReg _rd, Imm _Offset, CGReg _rs1){
//        super();
//        Offset=_Offset;
//        LoadOP=_loadOP;
////        UseList.add(rs1=_rs1);
////        DefList.add(rd=_rd);
//        rs1=_rs1;
//        rd=_rd;
//    }
    public CGload(OP _loadOP, CGReg _rd, int _Offset, CGReg _rs1){
        super();
//        Offset=new IntImm(_Offset);
        Offset=_Offset;
        LoadOP=_loadOP;
//        UseList.add(rs1=_rs1);
//        DefList.add(rd=_rd);
        rs1=_rs1;
        rd=_rd;
    }

    @Override
    public String toString() {
        if (Offset>=MX)
            return LoadOP+ " " +rd+" , "+(Offset-MX+FuncOffset)+"("+rs1+")";
        else return LoadOP+ " " +rd+" , "+Offset+"("+rs1+")";
    }
}
