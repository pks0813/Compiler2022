package AST;

import Util.Type;
import Util.error.SemanticError;
import Util.position.position;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpr extends ExprNode{
    public List<OneDeclearNode> ParaList;
    public List<ExprNode> InsList;
    public SuiteStateNode Suite;
    public LambdaExpr(position _pos,List<OneDeclearNode> _ParaList,List<ExprNode> _InsList,SuiteStateNode _Suite){
        super(_pos);
        ParaList=_ParaList;
        InsList=_InsList;
        Suite=_Suite;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
