package Util.position;

import org.antlr.v4.runtime.Token;

public class position {
    int row,column;
    public position(int row,int column) {
        this.row=row;
        this.column=column;
    }
    public position(Token X){
        this.row=X.getLine();
        this.column=X.getStartIndex();
    }
    public int getRow(){return row;}
    public int getColumn(){return column;}

    public String tostring(){
        return row+","+column;
    }
}
