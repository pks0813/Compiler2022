package IR;

import IR.IRInst.BasicInst;

import java.util.ArrayList;

public class InstBlock {
    public ArrayList<BasicInst> InstList;
    public String Name;
    public InstBlock(String _Name) {
        InstList=new ArrayList<>();
        Name=_Name;
    }

    public void pushback(BasicInst NowInst){
        InstList.add(NowInst);
    }

    @Override
    public String toString(){
        return "%"+Name;
    }
}
