package IR;

import IR.IRInst.BasicInst;
import IR.IRInst.JumpInst;

import java.util.ArrayList;

public class InstBlock {
    public ArrayList<BasicInst> InstList;
    public String Name;
    public boolean HaveReturn;
    public InstBlock(String _Name) {
        InstList=new ArrayList<>();
        Name=_Name;
        HaveReturn=false;
    }

    public void pushback(BasicInst NowInst){
        if (NowInst instanceof JumpInst)
        {
            if (HaveReturn==false)
                InstList.add(NowInst);
            HaveReturn=true;
        }
        else
        InstList.add(NowInst);
    }

    @Override
    public String toString(){
        return "%"+Name;
    }
}
