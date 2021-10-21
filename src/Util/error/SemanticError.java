package Util.error;

import Util.position.position;

public class SemanticError extends error{
    position pos;
    public SemanticError(String _mes,position _pos){super("SemanticError: "+_mes);pos=_pos;}

    @Override
    public String tostring() {
        return super.tostring()+pos.tostring();
    }
}
