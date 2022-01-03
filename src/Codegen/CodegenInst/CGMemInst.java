package Codegen.CodegenInst;

import Codegen.CGValue.PhysicalReg;

abstract public class CGMemInst extends CGInst{
    public static int FuncOffset;

    public int Offset;
//    static int MX=1000000;

    public void UpDate(){
        if (rs1 instanceof PhysicalReg && ((PhysicalReg)rs1).name=="Initialsp")
        {
            Offset+=FuncOffset;
            rs1=new PhysicalReg("sp");
        }
    }
}
