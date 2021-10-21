package Util.Symbol;

import AST.ASTNode;
import Util.Type;

public class VarSymbol extends Symbol{
    public Type Vartype;
    public VarSymbol(String _Identify, ASTNode _DefineNode,Type _type)
    {
        super(_Identify,_DefineNode);
        Vartype=_type;
    }
}
