package Util.Symbol;

import AST.ASTNode;
import Util.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncSymbol extends Symbol{
    public Type ReturnType;
    public List<Type> ParaType;
    public FuncSymbol(String Identify, ASTNode Node,Type _ReturnType)
    {
        super(Identify,Node);
        ReturnType=_ReturnType;
        ParaType=new ArrayList<Type>();
    }
}
