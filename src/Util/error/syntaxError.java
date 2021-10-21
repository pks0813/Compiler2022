package Util.error;

import Util.position.position;

public class syntaxError extends error{
    position pos;
    public syntaxError(String _mes,position _pos){super("Syntax: "+_mes);pos=_pos;}

    @Override
    public String tostring() {
        return super.tostring()+pos.tostring();
    }
}
