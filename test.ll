@N = global i32 zeroinitializer
@M = global i32 zeroinitializer
@check = global i1* zeroinitializer
define void @Init(){

AllocaBlock:
    br label %Initial

Initial:
    br label %entry

entry:
    store i32 0, i32* @M
    ret void
}
define i32 @main(){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i1*
    %alloca2 = alloca i32
    %alloca3 = alloca i32*
    %alloca4 = alloca i32*
    %alloca5 = alloca i32*
    %alloca6 = alloca i32*
    %alloca7 = alloca i32
    %alloca8 = alloca i32
    %alloca9 = alloca i1
    %alloca10 = alloca i32
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    %0 = call i32 @getInt( )
    store i32 %0, i32* @N
    ;I'm in NewArray0
    %1 = load i32, i32* @N
    %2 = add i32 %1, 5
    br label %newExpr0.dep0.Initial

newExpr0.dep0.Initial:
    %3 = mul i32 %2, 32
    %4 = add i32 %3, 32
    %5 = sdiv i32 %4, 8
    %6 = call i8* @malloc(i32 %5 )
    %7 = bitcast i8* %6 to i32*
    store i32 %2, i32* %7
    %8= getelementptr i32, i32* %7, i32 1
    %9 = bitcast i32* %8 to i1*
    %10 = bitcast i1* %9 to i1*
    store i1* %10, i1** %alloca1
    br label %newExpr0.Finish

newExpr0.Finish:
    %11 = load i1*, i1** %alloca1
    ;I'm Finish NewArray0
    store i1* %11, i1** @check
    store i32 0, i32* %alloca2
    br label %ForCond1

ForCond1:
    %12 = load i32, i32* %alloca2
    %13 = load i32, i32* @N
    %14 = icmp sle i32 %12, %13
    br i1 %14, label %ForLoop1, label %ForFinish1

ForLoop1:
    %15 = load i1*, i1** @check
    %16 = load i32, i32* %alloca2
    %17 = add i32 %16, 1
    store i32 %17, i32* %alloca2
    %18= getelementptr i1, i1* %15, i32 %16
    %19 = load i1, i1* %18
    store i1 1, i1* %18
    br label %ForEnd1

ForEnd1:
    br label %ForCond1

ForFinish1:
    ;I'm in NewArray1
    %20 = load i32, i32* @N
    %21 = add i32 %20, 5
    br label %newExpr1.dep0.Initial

newExpr1.dep0.Initial:
    %22 = mul i32 %21, 32
    %23 = add i32 %22, 32
    %24 = sdiv i32 %23, 8
    %25 = call i8* @malloc(i32 %24 )
    %26 = bitcast i8* %25 to i32*
    store i32 %21, i32* %26
    %27= getelementptr i32, i32* %26, i32 1
    %28 = bitcast i32* %27 to i32*
    %29 = bitcast i32* %28 to i32*
    store i32* %29, i32** %alloca3
    br label %newExpr1.Finish

newExpr1.Finish:
    %30 = load i32*, i32** %alloca3
    ;I'm Finish NewArray1
    store i32* %30, i32** %alloca4
    ;I'm in NewArray2
    %31 = load i32, i32* @N
    %32 = add i32 %31, 5
    br label %newExpr2.dep0.Initial

newExpr2.dep0.Initial:
    %33 = mul i32 %32, 32
    %34 = add i32 %33, 32
    %35 = sdiv i32 %34, 8
    %36 = call i8* @malloc(i32 %35 )
    %37 = bitcast i8* %36 to i32*
    store i32 %32, i32* %37
    %38= getelementptr i32, i32* %37, i32 1
    %39 = bitcast i32* %38 to i32*
    %40 = bitcast i32* %39 to i32*
    store i32* %40, i32** %alloca5
    br label %newExpr2.Finish

newExpr2.Finish:
    %41 = load i32*, i32** %alloca5
    ;I'm Finish NewArray2
    store i32* %41, i32** %alloca6
    %42 = load i32*, i32** %alloca4
    %43= getelementptr i32, i32* %42, i32 1
    %44 = load i32, i32* %43
    store i32 1, i32* %43
    store i32 2, i32* %alloca2
    br label %ForCond2

ForCond2:
    br label %ForLoop2

ForLoop2:
    %45 = load i32, i32* %alloca2
    %46 = load i32, i32* @N
    %47 = icmp sgt i32 %45, %46
    br i1 %47, label %IFTrue1, label %IFFalse1

IFTrue1:
    br label %ForFinish2

IFFalse1:
    br label %IFFinish1

IFFinish1:
    %48 = load i1*, i1** @check
    %49 = load i32, i32* %alloca2
    %50= getelementptr i1, i1* %48, i32 %49
    %51 = load i1, i1* %50
    br i1 %51, label %IFTrue2, label %IFFalse2

IFTrue2:
    %52 = load i32*, i32** %alloca6
    %53 = load i32, i32* @M
    %54 = add i32 %53, 1
    store i32 %54, i32* @M
    %55= getelementptr i32, i32* %52, i32 %54
    %56 = load i32, i32* %55
    %57 = load i32, i32* %alloca2
    store i32 %57, i32* %55
    %58 = load i32*, i32** %alloca4
    %59 = load i32, i32* %alloca2
    %60= getelementptr i32, i32* %58, i32 %59
    %61 = load i32, i32* %60
    %62 = load i32, i32* %alloca2
    %63 = sub i32 %62, 1
    store i32 %63, i32* %60
    br label %IFFinish2

IFFalse2:
    br label %IFFinish2

IFFinish2:
    %64 = load i32, i32* %alloca2
    store i32 %64, i32* %alloca7
    store i32 1, i32* %alloca8
    br label %ForCond3

ForCond3:
    %65 = load i32, i32* %alloca8
    %66 = load i32, i32* @M
    %67 = icmp sle i32 %65, %66
    store i1 %67, i1* %alloca9
    br i1 %67, label %Binary0.Right, label %Binary0.Finish

Binary0.Right:
    %68 = load i32, i32* %alloca7
    %69 = load i32*, i32** %alloca6
    %70 = load i32, i32* %alloca8
    %71= getelementptr i32, i32* %69, i32 %70
    %72 = load i32, i32* %71
    %73 = mul i32 %68, %72
    %74 = load i32, i32* @N
    %75 = icmp sle i32 %73, %74
    store i1 %75, i1* %alloca9
    br label %Binary0.Finish

Binary0.Finish:
    %76 = load i1, i1* %alloca9
    br i1 %76, label %ForLoop3, label %ForFinish3

ForLoop3:
    %77 = load i32, i32* %alloca7
    %78 = load i32*, i32** %alloca6
    %79 = load i32, i32* %alloca8
    %80= getelementptr i32, i32* %78, i32 %79
    %81 = load i32, i32* %80
    %82 = mul i32 %77, %81
    store i32 %82, i32* %alloca10
    %83 = load i32, i32* %alloca10
    %84 = load i32, i32* @N
    %85 = icmp sgt i32 %83, %84
    br i1 %85, label %IFTrue3, label %IFFalse3

IFTrue3:
    br label %ForEnd3

IFFalse3:
    br label %IFFinish3

IFFinish3:
    %86 = load i1*, i1** @check
    %87 = load i32, i32* %alloca10
    %88= getelementptr i1, i1* %86, i32 %87
    %89 = load i1, i1* %88
    store i1 0, i1* %88
    %90 = load i32, i32* %alloca7
    %91 = load i32*, i32** %alloca6
    %92 = load i32, i32* %alloca8
    %93= getelementptr i32, i32* %91, i32 %92
    %94 = load i32, i32* %93
    %95 = srem i32 %90, %94
    %96 = icmp eq i32 %95, 0
    br i1 %96, label %IFTrue4, label %IFFalse4

IFTrue4:
    %97 = load i32*, i32** %alloca4
    %98 = load i32, i32* %alloca10
    %99= getelementptr i32, i32* %97, i32 %98
    %100 = load i32, i32* %99
    %101 = load i32*, i32** %alloca4
    %102 = load i32, i32* %alloca7
    %103= getelementptr i32, i32* %101, i32 %102
    %104 = load i32, i32* %103
    %105 = load i32*, i32** %alloca6
    %106 = load i32, i32* %alloca8
    %107= getelementptr i32, i32* %105, i32 %106
    %108 = load i32, i32* %107
    %109 = mul i32 %104, %108
    store i32 %109, i32* %99
    br label %ForFinish3

IFFalse4:
    %110 = load i32*, i32** %alloca4
    %111 = load i32, i32* %alloca7
    %112 = load i32*, i32** %alloca6
    %113 = load i32, i32* %alloca8
    %114= getelementptr i32, i32* %112, i32 %113
    %115 = load i32, i32* %114
    %116 = mul i32 %111, %115
    %117= getelementptr i32, i32* %110, i32 %116
    %118 = load i32, i32* %117
    %119 = load i32*, i32** %alloca4
    %120 = load i32, i32* %alloca7
    %121= getelementptr i32, i32* %119, i32 %120
    %122 = load i32, i32* %121
    %123 = load i32*, i32** %alloca6
    %124 = load i32, i32* %alloca8
    %125= getelementptr i32, i32* %123, i32 %124
    %126 = load i32, i32* %125
    %127 = sub i32 %126, 1
    %128 = mul i32 %122, %127
    store i32 %128, i32* %117
    br label %IFFinish4

IFFinish4:
    br label %ForEnd3

ForEnd3:
    %129 = load i32, i32* %alloca8
    %130 = add i32 %129, 1
    store i32 %130, i32* %alloca8
    br label %ForCond3

ForFinish3:
    %131 = load i32*, i32** %alloca4
    %132 = load i32, i32* %alloca7
    %133= getelementptr i32, i32* %131, i32 %132
    %134 = load i32, i32* %133
    %135 = call i8* @toString(i32 %134 )
    call void @println(i8* %135 )
    br label %ForEnd2

ForEnd2:
    %136 = load i32, i32* %alloca2
    %137 = add i32 %136, 1
    store i32 %137, i32* %alloca2
    br label %ForCond2

ForFinish2:
    store i32 0, i32* %alloca0
    %138 = load i32, i32* %alloca0
    ret i32 %138
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
