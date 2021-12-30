package Util.Symbol;

import AST.ASTNode;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;

public class ClassSymbol extends Symbol{
    public FuncSymbol ConstructFunc;
    public GlobalScope ClassScope;
    public ClassSymbol(String Identify, ASTNode Node,GlobalScope _ClassScope)
    {
        super(Identify,Node);
        ClassScope=_ClassScope;
        ConstructFunc=null;
    }
}
