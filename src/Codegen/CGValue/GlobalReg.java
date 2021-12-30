package Codegen.CGValue;

import IR.IRInst.GlobalVar;

public class GlobalReg extends CGValue{
    String Name;
    public GlobalReg(String _Name){
        Name=_Name;
    }
    @Override
    public String toString() {
        return Name;
    }
}
