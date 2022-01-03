package Codegen.CGValue;

public class PhysicalReg extends CGReg{
//    static public String[] pRegNames = {
//            "zero", "ra", "sp", "gp", "tp",
//            "t0", "t1", "t2", "s0", "s1",
//            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7",
//            "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
//            "t3", "t4", "t5", "t6"};
//
//    static public String[] callerSavePRegNames = {
//            "ra", "t0", "t1", "t2",
//            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7",
//            "t3", "t4", "t5", "t6"
//    };
//
//    static public String[] calleeSavePRegNames = {
//            "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11"
//    };
//
//    static public String[] allocatablePRegNames = {
//            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7",
//            "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
//            "t0", "t1", "t2", "t3", "t4", "t5", "t6",
//            "ra"
//    };

    static public String[] callerReg = {//用于调用函数
            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7" };

    static public String[] colorReg={//17 color+zero
             "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
            "t0", "t1", "t2", "t3", "t4", "t5", "t6","zero"};
    
    public String name;
    public PhysicalReg(String _name){name=_name;}
    @Override
    public String toString() {
        return name;
    }
}
