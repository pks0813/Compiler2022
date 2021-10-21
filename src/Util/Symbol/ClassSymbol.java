package Util.Symbol;

import AST.ASTNode;
import Util.Scope.Scope;

public class ClassSymbol extends Symbol{
    public FuncSymbol ConstructFunc;
    public Scope ClassScope;
    public ClassSymbol(String Identify, ASTNode Node,Scope _ClassScope)
    {
        super(Identify,Node);
        ClassScope=_ClassScope;
        ConstructFunc=null;
    }
}
