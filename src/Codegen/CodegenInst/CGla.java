package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.GlobalReg;
import Codegen.CGValue.VirtualReg;

public class CGla extends CGInst{
    public GlobalReg Addr;
    public CGla(CGReg _rd, GlobalReg _Addr){
        super();
        Addr=_Addr;
        rd=_rd;
    }

    @Override  public String toString(){
        return "la "+rd+" , "+Addr;
    }
}
