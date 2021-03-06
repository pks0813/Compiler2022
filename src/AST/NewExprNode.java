package AST;

import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class NewExprNode extends ExprNode{
    public String Identify;
    public int DefineDim,Dim;
    public ArrayList<ExprNode> SizeExprList;
    public NewExprNode(position _pos, String _Identify,int _DefineDim,ArrayList<ExprNode> _SizeExprList,int _Dim){
        super(_pos);
        Identify=_Identify;
        DefineDim=_DefineDim;
        SizeExprList=_SizeExprList;
        Dim=_Dim;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
