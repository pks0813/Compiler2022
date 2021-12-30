package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.CGValue;
import Codegen.CGValue.VirtualReg;

import java.util.LinkedHashSet;
import java.util.Set;

abstract public class CGInst{
    public CGReg rs1=null,rs2=null,rd=null;
    public CGInst PreInst=null,NexInst=null;
//    public Set<CGReg> DefList=new LinkedHashSet<>(),UseList=new LinkedHashSet<>();
//    public CGInst(){    }
    @Override abstract public String toString();
}
