package IR;

import java.util.LinkedHashMap;
import java.util.Map;

public class IRVarScope {
    public IRVarScope Pre;
    public Map<String, Integer> VarMap;
    public IRVarScope Get_Pre(){return Pre;};
    public IRVarScope(IRVarScope _Pre){
        Pre=_Pre;
        VarMap=new LinkedHashMap<>();
    }
    public void AddVar(String Key,Integer Val){
        VarMap.put(Key,Val);
    }
    public Integer Query(String Key){
        Integer Now=VarMap.get(Key);
        if (Now==null){
            if (Pre==null) return -1;
            else return Pre.Query(Key);
        }
        return Now;
    }

}
