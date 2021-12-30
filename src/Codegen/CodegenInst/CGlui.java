package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.Imm;

public class CGlui extends CGInst{

    Imm imm;
    public CGlui(CGReg _rd, Imm _imm){
        super();
        imm=_imm;
//        DefList.add(rd=_rd);
        rd=_rd;
    }

    @Override  public String toString(){
        return "lui "+rd+" , "+imm;
    }
}
