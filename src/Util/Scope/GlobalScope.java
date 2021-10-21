package Util.Scope;

import Util.Symbol.ClassSymbol;
import Util.Symbol.FuncSymbol;
import Util.Symbol.VarSymbol;
import Util.error.SemanticError;
import Util.position.position;

public class GlobalScope extends BasicScope{
    public GlobalScope(){super(null);}

    @Override
    public Scope Get_Pre() {
        return super.Pre;
    }

    @Override
    public void AddVar(VarSymbol Symbol) {
        if (super.ClassMap.containsKey(Symbol.Identify) || super.VarMap.containsKey(Symbol.Identify)) throw new SemanticError("Error in Addvar SameName",Symbol.DefineNode.pos);
        super.VarMap.put(Symbol.Identify,Symbol);
    }

    @Override
    public void AddFunc(FuncSymbol Symbol) {
        if (super.FuncMap.containsKey(Symbol.Identify) || super.ClassMap.containsKey(Symbol.Identify)) {
            //throw new SemanticError("Error in AddFunc SameName in Global Scope"+Symbol.Identify,Symbol.DefineNode.pos);
            GlobalScope A=null;
            A.Get_Pre();
        }
            super.FuncMap.put(Symbol.Identify,Symbol);
    }

    @Override
    public void AddConstruct(FuncSymbol Symbol) {
        if (super.FuncMap.containsKey(Symbol.Identify))throw new SemanticError("Error in AddConstruct SameName",Symbol.DefineNode.pos);
        super.FuncMap.put(Symbol.Identify,Symbol);
    }

    @Override
    public void AddClass(ClassSymbol Symbol) {
        if (super.ClassMap.containsKey(Symbol.Identify) || super.FuncMap.containsKey(Symbol.Identify)) throw new SemanticError("Error in AddClass SameName",Symbol.DefineNode.pos);
        super.ClassMap.put(Symbol.Identify,Symbol);
    }

    @Override
    public VarSymbol FindVar(String Identify, position pos) {
        VarSymbol symbol=super.VarMap.get(Identify);
        if (symbol==null) throw new SemanticError("Error in FindVar Can't find "+Identify,pos);
        return symbol;
    }

    @Override
    public FuncSymbol FindFunc(String Identify,position pos) {
        FuncSymbol symbol=super.FuncMap.get(Identify);
        if (symbol==null) throw new SemanticError("Error in FindFunc Can't find "+Identify,pos);
        return symbol;
    }

    @Override
    public ClassSymbol FindClass(String Identify,position pos) {
        ClassSymbol symbol=super.ClassMap.get(Identify);
        if (symbol==null) throw new SemanticError("Error in FindClass Can't find "+Identify,pos);
        return symbol;
    }

}
