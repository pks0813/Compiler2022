package Util;

import AST.TypeArrayNode;
import AST.TypeNode;
import Util.error.ErrorPlus;
import Util.error.SemanticError;

import javax.lang.model.type.ArrayType;

public class Type {
    public String TypeName;
    public int Dim;
    public Type(String Name,int _Dim)
    {
        TypeName=Name;Dim=_Dim;
        if (Dim<0 ||(Dim>0 && (Name.equals("null") || Name.equals("void"))))
            throw new RuntimeException();
    }
    public Type(TypeNode Node){
        TypeName=Node.TypeIdentify;
        Dim=0;
        if (Node instanceof TypeArrayNode)
            Dim=((TypeArrayNode) Node).Dim;
        if (Dim<0 ||(Dim>0 && (TypeName.equals("null") || TypeName.equals("void"))))
            throw new RuntimeException();
    }
    public boolean Is_Int(){return TypeName.equals("int")&&Dim==0;}
    public boolean Is_Bool(){return TypeName.equals("bool")&&Dim==0;}
    public boolean Is_String(){return TypeName.equals("string")&&Dim==0;}
    public boolean Is_Void(){return TypeName.equals("void");}
    public boolean Is_Null(){return TypeName.equals("null");}
    public boolean Is_Array(){return Dim>0;}
    public boolean Is_Class(){return !(Is_Int()||Is_Bool()||Is_Void()||Is_Null()||Is_Array());}

    public boolean SameType(Type X)
    {
        return X.TypeName.equals(TypeName)&&X.Dim==Dim;
    }
    public boolean AssignPermit(Type X)//"="
    {
        if (X.Is_Void()) return false;
        if (SameType(X)) return true;
        if (Is_Null() || X.Is_Null())
        {
            if (Is_Null() && (X.Is_String()||X.Is_Array()||X.Is_Class())) return true;
            if (X.Is_Null() && (Is_String()||Is_Array()||Is_Class())) return true;
            return false;
        }
        return false;
    }
    public boolean SamePermit(Type X)//"==""!="
    {
        if (X.Is_Void()) return false;
        if (SameType(X)) return true;
        if (Is_Null() || X.Is_Null())
        {
            if (Is_Null() && (X.Is_String()||X.Is_Array()||X.Is_Class())) return true;
            if (X.Is_Null() && (Is_String()||Is_Array()||Is_Class())) return true;
            return false;
        }
        return false;
    }
    public boolean ComparePermit(Type X)//"<="">="
    {
        if (SameType(X) && (Is_Int() || Is_String())) return true;
        return false;
    }
    public boolean CanPlus(Type X){//+
        return ((Is_Int() && X.Is_Int())|| (Is_String()&&X.Is_String()));
    }
    public boolean CanMathCal(Type X){//-*/
        return Is_Int() && X.Is_Int();
    }
    public boolean CanSelfPlus2(){
        return Is_Int();
    }
    public boolean BoolOpPermit(Type X){
        return Is_Bool() && X.Is_Bool();
    }


}
