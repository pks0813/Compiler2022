package IR.IRType;

import Util.error.syntaxError;
import Util.position.position;

public class IRArrayType extends IRHardType{
    public int cnt;
    public AllType type;
    public IRArrayType(int _cnt,AllType _type){
        super();
        cnt=_cnt;
        type=_type;
    }
    @Override
    public String toString(){
        return "[ "+cnt+" x "+type+" ]";
    }

    @Override
    public int Size() {
        System.out.println("ArrayType size error");
        return 0;
    }

}
