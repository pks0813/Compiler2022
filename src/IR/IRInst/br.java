package IR.IRInst;

import IR.IRValue.IRValue;
import IR.InstBlock;

public class br extends JumpInst{
    public IRValue Cond;
    public String IfTrue,IfElse;
    public br(String _IfTrue){//jump
        super();
        Cond=null;
        IfTrue=_IfTrue;
        IfElse=null;
    }
    public br(IRValue _Cond,String _IfTrue,String _IfElse){//IF Else
        super();
        Cond=_Cond;
        IfTrue=_IfTrue;
        IfElse=_IfElse;
    }
    @Override public String toString(){
        if (Cond==null) return "br label %"+IfTrue;
        return "br "+Cond.type.toString()+" "+Cond.toString()+", label %"+IfTrue+", label %"+IfElse;
    }
}
