package IR;

import java.io.OutputStream;
import java.io.PrintWriter;

public class IRPrint {
    PrintWriter Writer;
    public IRPrint(IRBuilder Builder, OutputStream llos){



        Writer=new PrintWriter(llos);
//        Writer.println("target datalayout = \"e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"\n" +
//                "target triple = \"x86_64-pc-linux-gnu\"");
//        Writer.println("@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n" +
//                "\n" +
//                "; Function Attrs: noinline nounwind optnone uwtable\n" +
//                "define dso_local void @printlnInt(i32 %0) #0 {\n" +
//                "  %2 = alloca i32, align 4\n" +
//                "  store i32 %0, i32* %2, align 4\n" +
//                "  %3 = load i32, i32* %2, align 4\n" +
//                "  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)\n" +
//                "  ret void\n" +
//                "}");
        for (var Iter:Builder.WolrdBlock.InstList)
            Writer.println(Iter.toString());
//        Writer.println("@llvm.global_ctors = appending global [1 x { i32, void ()*, i8* }] [{ i32, void ()*, i8* } { i32 65535, void ()* @Init, i8* null }]");

        for (var Iter:Builder.FuncList)
        {
            Writer.print("define ");
            if (Iter.ReturnType==null)
                Writer.print("void ");
            else Writer.print(Iter.ReturnType.toString());
            Writer.print(" @"+Iter.Name+"(");

            if (Iter.ParaList.size()>=1)
                Writer.print(Iter.ParaList.get(0).toString()+" %0");
            for (int i=1;i<Iter.ParaList.size();i++)
                Writer.print(", "+Iter.ParaList.get(i).toString()+" %"+String.valueOf(i));
            Writer.println("){");
            Writer.println("\nAllocaBlock:");
            Writer.flush();
            for (var NowAlloca:Iter.FuncAlloc){
                Writer.println("    " + NowAlloca.toString());
                Writer.flush();
            }
            Writer.println("    br label %Initial");
            Writer.println("\nInitial:");
            for (var NowStore:Iter.FuncInitial){
                Writer.println("    " + NowStore.toString());
                Writer.flush();
            }
            Writer.println("    br label %entry");

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

        Writer.println("declare i32 @printf(i8*, ...)\n" +
                "declare i8* @malloc(i32)\n" +
                "declare void @print(i8*)\n" +
                "declare void @println(i8*)\n" +
                "declare void @printInt(i32)\n" +
                "declare void @printlnInt(i32)\n" +
                "declare i8* @getString()\n" +
                "declare i32 @getInt()\n" +
                "declare i8* @toString(i32)\n" +
                "declare i32 @_struct_string_length(i8*)\n" +
                "declare i1 @_struct_string_Great(i8*,i8*)\n" +
                "declare i1 @_struct_string_GreQ(i8*,i8*)\n" +
                "declare i1 @_struct_string_Leq(i8*,i8*)\n" +
                "declare i1 @_struct_string_Less(i8*,i8*) \n" +
                "declare i8* @_struct_string_AddString(i8*,i8*)\n" +
                "declare i32 @_struct_string_parseInt(i8*)\n" +
                "declare i32 @_struct_string_ord(i8*,i32)\n" +
                "declare i8* @_struct_string_substring(i8*,i32,i32)");
//        Writer.println("define void @printlnInt(i32 %0) {\n" +
//                "  %2 = alloca i32, align 4\n" +
//                "  store i32 %0, i32* %2, align 4\n" +
//                "  %3 = load i32, i32* %2, align 4\n" +
//                "  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.3, i64 0, i64 0), i32 %3)\n" +
//                "  ret void\n" +
//                "}\n"
//                +"declare i32 @printf(i8*, ...)\n");

        Writer.flush();

    }
}
