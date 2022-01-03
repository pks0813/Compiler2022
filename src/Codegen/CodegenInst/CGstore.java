package Codegen.CodegenInst;

import Codegen.CGValue.*;
import IR.IRType.IRIntType;

public class CGstore extends CGMemInst{

    public enum OP{
        sb,sw
    }
    OP StoreOP;
//    public CGstore(OP _StoreOP, CGReg _rs2, Imm _Offset, CGReg _rs1){
//        super();
//        Offset=_Offset;
//        StoreOP=_StoreOP;
////        UseList.add(rs1=_rs1);
////        UseList.add(rs2=_rs2);
//        rs1=_rs1;
//        rs2=_rs2;
//    }
    public CGstore(OP _StoreOP, CGReg _rs2, int _Offset, CGReg _rs1){
        super();
//        Offset=new IntImm(_Offset);
        Offset=_Offset;
        StoreOP=_StoreOP;
//        UseList.add(rs1=_rs1);
//        UseList.add(rs2=_rs2);
        rs1=_rs1;
        rs2=_rs2;
    }

    @Override
    public String toString() {
        return StoreOP+ " " +rs2+" , "+Offset+"("+rs1+")";
    }

}
