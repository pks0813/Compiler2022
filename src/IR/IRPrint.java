package IR;

import java.io.OutputStream;
import java.io.PrintWriter;

public class IRPrint {
    PrintWriter Writer;
    public IRPrint(IRBuilder Builder, OutputStream llos){



        Writer=new PrintWriter(llos);
        Writer.println("@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n" +
                "\n" +
                "; Function Attrs: noinline nounwind optnone uwtable\n" +
                "define dso_local void @printlnInt(i32 %0) #0 {\n" +
                "  %2 = alloca i32, align 4\n" +
                "  store i32 %0, i32* %2, align 4\n" +
                "  %3 = load i32, i32* %2, align 4\n" +
                "  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)\n" +
                "  ret void\n" +
                "}");
        for (var Iter:Builder.WolrdBlock.InstList)
            Writer.println(Iter.toString());
        Writer.println("@llvm.global_ctors = appending global [1 x { i32, void ()*, i8* }] [{ i32, void ()*, i8* } { i32 65535, void ()* @Init, i8* null }]");

        for (var Iter:Builder.FuncList)
        {
            Writer.print("define "+Iter.ReturnType.toString()+" @"+Iter.Name+"(");
            if (Iter.ParaList.size()>=1)
                Writer.print(Iter.ParaList.get(0).toString()+" %0");
            for (int i=1;i<Iter.ParaList.size();i++)
                Writer.print(", "+Iter.ParaList.get(i).toString()+" %"+String.valueOf(i));
            Writer.println("){");
            for (var NowBlock:Iter.FuncBlock) {
                Writer.println("");
                Writer.println(NowBlock.Name + ":");
                for (var NowInst : NowBlock.InstList) {
                    Writer.println("    " + NowInst.toString());

                    Writer.flush();
                }
            }
            Writer.println("}");
        }

        Writer.println("declare i32 @printf(i8*, ...)");
        Writer.flush();

    }
}
