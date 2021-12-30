package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.IntImm;
import Codegen.CGValue.VirtualReg;

public class CGLi extends CGInst{
    IntImm imm;
    public CGLi(CGReg _rd, IntImm _imm){
        super();
        imm=_imm;
//        DefList.add(rd=_rd);
        rd=_rd;
    }

    @Override  public String toString(){
        return "li "+rd+" , "+imm;
    }
}
