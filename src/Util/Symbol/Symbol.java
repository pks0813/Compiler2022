package Util.Symbol;

import AST.ASTNode;

public class Symbol {
    public String Identify;
    public ASTNode DefineNode;
    public Symbol(String _Identify,ASTNode _Define){
        Identify=_Identify;
        DefineNode=_Define;
    }
}
