package Util.Scope;

import IR.IRType.AllType;
import IR.IRType.IRClassType;
import IR.IRType.IRIntType;
import IR.IRType.IRPointerType;
import Util.Symbol.ClassSymbol;
import Util.Symbol.FuncSymbol;
import Util.Symbol.VarSymbol;
import Util.Type;
import Util.error.SemanticError;
import Util.position.position;

import java.util.LinkedHashMap;
import java.util.Map;

public class GlobalScope extends BasicScope{
    Map<String, Integer> ClassID;
    public int ClassSize;
    public int NowID;
    public int ClassNumber;
    int getID(){
        return NowID++;
    }
    public int getClasssize(){return ClassSize;}
    public int GetClassNumber(){
        return ClassNumber;
    }
    public GlobalScope(){super(null);ClassID=new LinkedHashMap<>();ClassSize=0;NowID=0;ClassNumber=0;}

    @Override
    public Scope Get_Pre() {
        return super.Pre;
    }

    @Override
    public void AddVar(VarSymbol Symbol) {
        if (super.ClassMap.containsKey(Symbol.Identify) || super.VarMap.containsKey(Symbol.Identify)) throw new SemanticError("Error in Addvar SameName",Symbol.DefineNode.pos);
        ClassID.put(Symbol.Identify,getID());
        ClassSize+=FuckType(Symbol.Vartype).Size();
        ClassNumber++;
        super.VarMap.put(Symbol.Identify,Symbol);

    }

    AllType FuckType(Type OldType) {
        if (OldType.Is_Int()) return new IRIntType(32);
        if (OldType.Is_Bool()) return new IRIntType(1);
        if (OldType.Is_String()) return new IRPointerType(new IRIntType(8));
        if (OldType.Is_Class()) return new IRPointerType(new IRClassType(OldType.TypeName));
        if (OldType.Is_Void()) return null;
        if (OldType.Is_Array())
        {
            AllType NowType=FuckType(new Type(OldType.TypeName,0));
            for (int i=1;i<=OldType.Dim;i++)
                NowType=new IRPointerType(NowType);
            return NowType;
        }
        return null;
    }


    public int FindID(String Identify){
        if (ClassID.get(Identify)==null) return -1;
        return ClassID.get(Identify);
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

    public FuncSymbol FindFunc(String Identify) {
        FuncSymbol symbol=super.FuncMap.get(Identify);
        return symbol;
    }
    @Override
    public ClassSymbol FindClass(String Identify,position pos) {
        ClassSymbol symbol=super.ClassMap.get(Identify);
        if (symbol==null) throw new SemanticError("Error in FindClass Can't find "+Identify,pos);
        return symbol;
    }

}
