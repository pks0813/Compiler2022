package AST;

import Util.Type;
import Util.error.SemanticError;
import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpr extends ExprNode{
    public List<TypeNode> ParaList=new ArrayList<TypeNode>();
    public List<ExprNode> InsList=new ArrayList<ExprNode>();
    public SuiteStateNode Suite;
    public LambdaExpr(position _pos,List<TypeNode> _ParaList,List<ExprNode> _InsList,SuiteStateNode _Suite){
        super(_pos);
        ParaList=_ParaList;
        InsList=_InsList;
        Suite=_Suite;
        if (InsList.size()!=ParaList.size())
            throw new SemanticError("Lambda Expr have different number of para",_pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
