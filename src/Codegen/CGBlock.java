package Codegen;

import Codegen.CodegenInst.CGInst;

import java.util.ArrayList;

public class CGBlock {
    CGInst Head=null,Tail=null;
    String Name;
    public CGBlock(String _Name){
        Name=_Name;
    }
    @Override
    public String toString() {
        StringBuilder ReturnString=new StringBuilder();
        ReturnString.append(Name+":\n");
        for (CGInst Now=Head;Now!=null;Now=Now.NexInst)
            ReturnString.append("\t"+Now+"\n");
        return ReturnString.toString();
    }

    public void AddBack(CGInst Inst){
        if (Head==null){
            Head=Inst;Tail=Inst;return;
        }
        else{
            Tail.NexInst=Inst;
            Inst.PreInst=Tail;
            Tail=Inst;
        }
    }
    public void AddPre(CGInst Inst,CGInst PreInst){
        if (Head==Inst)
            Head=PreInst;
        PreInst.PreInst=Inst.PreInst;
        if (Inst.PreInst!=null) Inst.PreInst.NexInst=PreInst;
        PreInst.NexInst=Inst;
        Inst.PreInst=PreInst;
    }
    public void AddNex(CGInst Inst,CGInst NexInst){
        if (Tail==Inst)
            Tail=NexInst;
        NexInst.NexInst=Inst.NexInst;
        if (Inst.NexInst!=null) Inst.NexInst.PreInst=NexInst;
        NexInst.PreInst=Inst;
        Inst.NexInst=NexInst;
    }
    

}
