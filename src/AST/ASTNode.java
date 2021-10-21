package AST;

import Util.position.position;

abstract public class ASTNode {
    public position pos;
    public ASTNode(position _pos){pos=_pos;}
    public abstract void accept(ASTVisitor visitor);


}
