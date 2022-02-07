package IR;

import IR.IRInst.BasicInst;
import IR.IRInst.load;
import IR.IRInst.store;
import IR.IRValue.IRTmpVar;

public class DeleteSSA {
    public void SSA(IRBuilder Builder){
        for (var func:Builder.FuncList)
            for (var Block:func.FuncBlock)
                for (var Inst:Block.InstList) {
                    if (Inst instanceof store) {
                        store _Inst = (store) Inst;
                        if (_Inst.StorePointer instanceof IRTmpVar && ((IRTmpVar) (_Inst.StorePointer)).Name.startsWith("alloca"))
                            _Inst.Change = true;
                    }
                    if (Inst instanceof load) {
                        load _Inst = (load) Inst;
                        if (_Inst.LoadPointer instanceof IRTmpVar && ((IRTmpVar) (_Inst.LoadPointer)).Name.startsWith("alloca"))
                            _Inst.Change = true;
                    }
                }
    }
}
