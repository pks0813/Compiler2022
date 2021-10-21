package Util.Scope;

import Util.Symbol.ClassSymbol;
import Util.Symbol.FuncSymbol;
import Util.Symbol.VarSymbol;

import java.util.LinkedHashMap;
import java.util.Map;

abstract public class BasicScope implements Scope{
    BasicScope Pre;
    public Map<String, VarSymbol> VarMap;
    public Map<String, FuncSymbol> FuncMap;
    public Map<String, ClassSymbol> ClassMap;
    public BasicScope(BasicScope _Pre)
    {
        Pre=_Pre;
        VarMap=new LinkedHashMap<>();
        FuncMap=new LinkedHashMap<>();
        ClassMap=new LinkedHashMap<>();
        if (_Pre!=null) ClassMap=_Pre.ClassMap;
    }
    
}
