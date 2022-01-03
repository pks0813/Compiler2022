package Codegen.CodegenInst;

public class CGjump extends CGInst{
    public String JumpBlock;
    public CGjump(String _JumpBlock){
        super();
        JumpBlock=_JumpBlock;
    }
    @Override
    public String toString() {
        return "j "+JumpBlock;
    }
}
