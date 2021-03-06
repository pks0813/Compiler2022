package IR;

import java.util.LinkedHashMap;
import java.util.Map;

public class IRVarScope {
    public IRVarScope Pre;
    public Map<String, String> VarMap;
    public IRVarScope Get_Pre(){return Pre;};
    public IRVarScope(IRVarScope _Pre){
        Pre=_Pre;
        VarMap=new LinkedHashMap<>();
    }
    public void AddVar(String Key,String Val){
        VarMap.put(Key,Val);
    }
    public String Query(String Key){
        String Now=VarMap.get(Key);
        if (Now==null){
            if (Pre==null) return null;
            else return Pre.Query(Key);
        }
        return Now;
    }

}
