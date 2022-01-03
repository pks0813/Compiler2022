package Codegen.CodegenInst;

import Codegen.CGValue.CGReg;
import Codegen.CGValue.VirtualReg;

import java.util.LinkedHashSet;
import java.util.Set;

abstract public class CGInst{
    public CGReg rs1=null,rs2=null,rd=null;
    public CGInst PreInst=null,NexInst=null;
//    public Set<CGReg> DefList=new LinkedHashSet<>(),UseList=new LinkedHashSet<>();
    public Set<CGInst> AllPre=new LinkedHashSet<>(),AllNex=new LinkedHashSet<>();;
    public Set<String> PreAliveList=new LinkedHashSet<>();
    //    public CGInst(){    }
    @Override abstract public String toString();
    public void Clear(){
//        DefList=new LinkedHashSet<>();UseList=new LinkedHashSet<>();
        AllNex=new LinkedHashSet<>();AllPre=new LinkedHashSet<>();
        PreAliveList=new LinkedHashSet<>();
        if (rs1 instanceof VirtualReg)
            PreAliveList.add(((VirtualReg)rs1).Name);
        if (rs2 instanceof VirtualReg)
            PreAliveList.add(((VirtualReg)rs2).Name);
    }
}
