package AST;

import Util.position.position;

abstract public class FunctionDeclearNode extends ClassFuncDeclearNode {
    public SuiteStateNode States;
    public FunctionDeclearNode(position _pos, SuiteStateNode _States){
        super(_pos);
        States=_States;
    }

}
