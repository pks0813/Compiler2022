package IR;

import java.io.OutputStream;
import java.io.PrintWriter;

public class IRPrint {
    PrintWriter Writer;
    public IRPrint(IRBuilder Builder, OutputStream llos){
        Writer=new PrintWriter(llos);
        for (var Iter:Builder.WolrdBlock.InstList)
            Writer.println(Iter.toString());
        Writer.println("@llvm.global_ctors = appending global [1 x { i32, void ()*, i8* }] [{ i32, void ()*, i8* } { i32 65535, void ()* @Init, i8* null }]");

        for (var Iter:Builder.FuncList)
        {
            Writer.println("define "+Iter.ReturnType.toString()+" @"+Iter.Name+"(){");
            for (var NowBlock:Iter.FuncBlock) {
                Writer.println("");
                Writer.println(NowBlock.Name + ":");
                for (var NowInst : NowBlock.InstList)
                    Writer.println("    "+NowInst.toString());
            }
            Writer.println("}");
        }

        Writer.println("declare i32 @printf(i8*, ...)");
        Writer.flush();

    }
}
