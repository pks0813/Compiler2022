@a = global i32* zeroinitializer
@.Str0 = constant [1 x i8] c"\00"
define void @Init(){

AllocaBlock:
    %alloca0 = alloca i32*
    br label %Initial

Initial:
    br label %entry

entry:
    ;I'm in NewArray0
    br label %newExpr0.dep0.Initial

newExpr0.dep0.Initial:
    %0 = mul i32 4, 32
    %1 = add i32 %0, 32
    %2 = sdiv i32 %1, 8
    %3 = call i8* @malloc(i32 %2 )
    %4 = bitcast i8* %3 to i32*
    store i32 4, i32* %4
    %5= getelementptr i32, i32* %4, i32 1
    %6 = bitcast i32* %5 to i32*
    %7 = bitcast i32* %6 to i32*
    store i32* %7, i32** %alloca0
    br label %newExpr0.Finish

newExpr0.Finish:
    %8 = load i32*, i32** %alloca0
    ;I'm Finish NewArray0
    store i32* %8, i32** @a
    ret void
}
define i32 @main(){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32**
    %alloca2 = alloca i32**
    %alloca3 = alloca i32
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    ;I'm in NewArray1
    br label %newExpr1.dep0.Initial

newExpr1.dep0.Initial:
    %0 = mul i32 4, 32
    %1 = add i32 %0, 32
    %2 = sdiv i32 %1, 8
    %3 = call i8* @malloc(i32 %2 )
    %4 = bitcast i8* %3 to i32*
    store i32 4, i32* %4
    %5= getelementptr i32, i32* %4, i32 1
    %6 = bitcast i32* %5 to i32**
    %7 = bitcast i32** %6 to i32**
    store i32** %7, i32*** %alloca1
    br label %newExpr1.Finish

newExpr1.Finish:
    %8 = load i32**, i32*** %alloca1
    ;I'm Finish NewArray1
    store i32** %8, i32*** %alloca2
    %9 = load i32**, i32*** %alloca2
    %10= getelementptr i32*, i32** %9, i32 0
    %11 = load i32*, i32** %10
    %12 = load i32*, i32** @a
    store i32* %12, i32** %10
    %13 = load i32**, i32*** %alloca2
    %14= getelementptr i32*, i32** %13, i32 1
    %15 = load i32*, i32** %14
    %16 = load i32*, i32** @a
    store i32* %16, i32** %14
    %17 = load i32**, i32*** %alloca2
    %18= getelementptr i32*, i32** %17, i32 2
    %19 = load i32*, i32** %18
    %20 = load i32*, i32** @a
    store i32* %20, i32** %18
    %21 = load i32**, i32*** %alloca2
    %22= getelementptr i32*, i32** %21, i32 3
    %23 = load i32*, i32** %22
    %24 = load i32*, i32** @a
    store i32* %24, i32** %22
    %25 = load i32**, i32*** %alloca2
    %26 = bitcast i32** %25 to i32*
    %27= getelementptr i32, i32* %26, i32 -1
    %28 = load i32, i32* %27
    %29 = call i8* @toString(i32 %28 )
    call void @println(i8* %29 )
    store i32 0, i32* %alloca3
    br label %ForCond1

ForCond1:
    %30 = load i32, i32* %alloca3
    %31 = load i32**, i32*** %alloca2
    %32= getelementptr i32*, i32** %31, i32 0
    %33 = load i32*, i32** %32
    %34 = bitcast i32* %33 to i32*
    %35= getelementptr i32, i32* %34, i32 -1
    %36 = load i32, i32* %35
    %37 = icmp slt i32 %30, %36
    br i1 %37, label %ForLoop1, label %ForFinish1

ForLoop1:
    %38 = load i32**, i32*** %alloca2
    %39= getelementptr i32*, i32** %38, i32 0
    %40 = load i32*, i32** %39
    %41 = load i32, i32* %alloca3
    %42= getelementptr i32, i32* %40, i32 %41
    %43 = load i32, i32* %42
    %44 = call i32 @getInt( )
    store i32 %44, i32* %42
    br label %ForEnd1

ForEnd1:
    %45 = load i32, i32* %alloca3
    %46 = add i32 %45, 1
    store i32 %46, i32* %alloca3
    br label %ForCond1

ForFinish1:
    store i32 0, i32* %alloca3
    br label %ForCond2

ForCond2:
    %47 = load i32, i32* %alloca3
    %48 = load i32**, i32*** %alloca2
    %49= getelementptr i32*, i32** %48, i32 1
    %50 = load i32*, i32** %49
    %51 = bitcast i32* %50 to i32*
    %52= getelementptr i32, i32* %51, i32 -1
    %53 = load i32, i32* %52
    %54 = icmp slt i32 %47, %53
    br i1 %54, label %ForLoop2, label %ForFinish2

ForLoop2:
    %55 = load i32**, i32*** %alloca2
    %56= getelementptr i32*, i32** %55, i32 1
    %57 = load i32*, i32** %56
    %58 = load i32, i32* %alloca3
    %59= getelementptr i32, i32* %57, i32 %58
    %60 = load i32, i32* %59
    %61 = call i8* @toString(i32 %60 )
    call void @print(i8* %61 )
    br label %ForEnd2

ForEnd2:
    %62 = load i32, i32* %alloca3
    %63 = add i32 %62, 1
    store i32 %63, i32* %alloca3
    br label %ForCond2

ForFinish2:
    %64 = bitcast [ 1 x i8 ]* @.Str0 to i8*
    call void @println(i8* %64 )
    store i32 0, i32* %alloca3
    br label %ForCond3

ForCond3:
    %65 = load i32, i32* %alloca3
    %66 = load i32**, i32*** %alloca2
    %67= getelementptr i32*, i32** %66, i32 2
    %68 = load i32*, i32** %67
    %69 = bitcast i32* %68 to i32*
    %70= getelementptr i32, i32* %69, i32 -1
    %71 = load i32, i32* %70
    %72 = icmp slt i32 %65, %71
    br i1 %72, label %ForLoop3, label %ForFinish3

ForLoop3:
    %73 = load i32**, i32*** %alloca2
    %74= getelementptr i32*, i32** %73, i32 2
    %75 = load i32*, i32** %74
    %76 = load i32, i32* %alloca3
    %77= getelementptr i32, i32* %75, i32 %76
    %78 = load i32, i32* %77
    store i32 0, i32* %77
    br label %ForEnd3

ForEnd3:
    %79 = load i32, i32* %alloca3
    %80 = add i32 %79, 1
    store i32 %80, i32* %alloca3
    br label %ForCond3

ForFinish3:
    store i32 0, i32* %alloca3
    br label %ForCond4

ForCond4:
    %81 = load i32, i32* %alloca3
    %82 = load i32**, i32*** %alloca2
    %83= getelementptr i32*, i32** %82, i32 3
    %84 = load i32*, i32** %83
    %85 = bitcast i32* %84 to i32*
    %86= getelementptr i32, i32* %85, i32 -1
    %87 = load i32, i32* %86
    %88 = icmp slt i32 %81, %87
    br i1 %88, label %ForLoop4, label %ForFinish4

ForLoop4:
    %89 = load i32**, i32*** %alloca2
    %90= getelementptr i32*, i32** %89, i32 3
    %91 = load i32*, i32** %90
    %92 = load i32, i32* %alloca3
    %93= getelementptr i32, i32* %91, i32 %92
    %94 = load i32, i32* %93
    %95 = call i8* @toString(i32 %94 )
    call void @print(i8* %95 )
    br label %ForEnd4

ForEnd4:
    %96 = load i32, i32* %alloca3
    %97 = add i32 %96, 1
    store i32 %97, i32* %alloca3
    br label %ForCond4

ForFinish4:
    store i32 0, i32* %alloca0
    %98 = load i32, i32* %alloca0
    ret i32 %98
}
declare i32 @printf(i8*, ...)
declare i8* @malloc(i32)
declare void @print(i8*)
declare void @println(i8*)
declare void @printInt(i32)
declare void @printlnInt(i32)
declare i8* @getString()
declare i32 @getInt()
declare i8* @toString(i32)
declare i32 @_struct_string_length(i8*)
declare i1 @_struct_string_Great(i8*,i8*)
declare i1 @_struct_string_GreQ(i8*,i8*)
declare i1 @_struct_string_Leq(i8*,i8*)
declare i1 @_struct_string_Less(i8*,i8*) 
declare i8* @_struct_string_AddString(i8*,i8*)
declare i32 @_struct_string_parseInt(i8*)
declare i32 @_struct_string_ord(i8*,i32)
declare i8* @_struct_string_substring(i8*,i32,i32)
