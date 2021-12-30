package Codegen;

import Codegen.CGValue.IntImm;
import Codegen.CGValue.PhysicalReg;
import Codegen.CGValue.VirtualReg;
import Codegen.CodegenInst.CGImmOp;
import Codegen.CodegenInst.CGMemInst;
import Codegen.CodegenInst.CGbinaryOp;
import Codegen.CodegenInst.CGspop;
import IR.IRFunc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CGFunc {
    static public int MX;
    String Name;
    ArrayList<CGBlock> BlockList=new ArrayList<>();
    Map<String,Integer> OffsetMap=new LinkedHashMap<>();
    int FuncID;
    int NowOffset;
    int mxFuncNeed;
    public CGFunc(String _Name,int _FuncID){
        Name=_Name;
        FuncID=_FuncID;
    }
    public int RegID(String str){
        Integer ID=OffsetMap.get(str);
        if (ID==null){
            OffsetMap.put(str,NowOffset);
            NowOffset+=4;
            return NowOffset-4;
        }else return ID;
    }

    int NowRegisterID;
    public VirtualReg NewRegister(){
        return new VirtualReg("NewRegist"+String.valueOf(NowRegisterID++));
    }

    @Override
    public String toString() {
        StringBuilder ReturnString=new StringBuilder("    .globl  " + Name + "\n    .p2align    2\n" +"\t.type\t"+Name+",@function\n" );
        CGMemInst.FuncOffset=mxFuncNeed*4;
        CGspop.Value=NowOffset+mxFuncNeed*4;
        ReturnString.append(BlockList.get(0));
        for (int i=1;i<BlockList.size();i++)
            ReturnString.append(BlockList.get(i).toString()+"\n");
        ReturnString.append(
                ".Lfunc_end"+FuncID+":\n" +
                "\t.size\t"+Name+", .Lfunc_end"+FuncID+"-"+Name+"\n"
        );
        return ReturnString.toString();
    }
//    public void
}
