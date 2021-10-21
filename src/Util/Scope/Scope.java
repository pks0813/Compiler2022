package Util.Scope;

import Util.Symbol.ClassSymbol;
import Util.Symbol.FuncSymbol;
import Util.Symbol.VarSymbol;
import Util.position.position;

public interface Scope {
    public Scope Get_Pre();
    public void AddVar(VarSymbol Symbol);
    public void AddFunc(FuncSymbol Symbol);
    public void AddConstruct(FuncSymbol Symbol);
    public void AddClass(ClassSymbol Symbol);
    public VarSymbol FindVar(String Identify,position _pos);
    public FuncSymbol FindFunc(String Identify, position _pos);
    public ClassSymbol FindClass(String Identify,position _pos);

}
