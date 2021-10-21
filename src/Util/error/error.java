package Util.error;
abstract public class error extends RuntimeException{
    String message;
    public error(String _mes){message=_mes;}
    public String tostring(){return "message:"+message;}

}
