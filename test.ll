define void @Init(){

AllocaBlock:
    br label %Initial

Initial:
    br label %entry

entry:
    ret void
}
define i32 @main(){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32**
    %alloca2 = alloca i32**
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    ;I'm in NewArray0
    br label %newExpr0.dep0.Initial

newExpr0.dep0.Initial:
    %0 = mul i32 10, 32
    %1 = add i32 %0, 32
    %2 = sdiv i32 %1, 8
    %3 = call i8* @malloc(i32 %2 )
    %4 = bitcast i8* %3 to i32*
    store i32 10, i32* %4
    %5= getelementptr i32, i32* %4, i32 1
    %6 = bitcast i32* %5 to i32**
    %7 = bitcast i32** %6 to i32**
    store i32** %7, i32*** %alloca2
    br label %newExpr0.Finish

newExpr0.Finish:
    %8 = load i32**, i32*** %alloca2
    ;I'm Finish NewArray0
    store i32** %8, i32*** %alloca1
    %9 = load i32**, i32*** %alloca1
    %10= getelementptr i32*, i32** %9, i32 0
    %11 = load i32*, i32** %10
    call void @test(i32* %11 )
    %12 = load i32**, i32*** %alloca1
    %13= getelementptr i32*, i32** %12, i32 0
    %14 = load i32*, i32** %13
    %15= getelementptr i32, i32* %14, i32 1
    %16 = load i32, i32* %15
    call void @printlnInt(i32 %16 )
    ret i32 0
}
define void  @test(i32* %0){

AllocaBlock:
    %alloca0 = alloca i32*
    %alloca1 = alloca i32*
    br label %Initial

Initial:
    store i32* %0, i32** %alloca0
    br label %entry

entry:
    ;I'm in NewArray1
    br label %newExpr1.dep0.Initial

newExpr1.dep0.Initial:
    %1 = mul i32 5, 32
    %2 = add i32 %1, 32
    %3 = sdiv i32 %2, 8
    %4 = call i8* @malloc(i32 %3 )
    %5 = bitcast i8* %4 to i32*
    store i32 5, i32* %5
    %6= getelementptr i32, i32* %5, i32 1
    %7 = bitcast i32* %6 to i32*
    %8 = bitcast i32* %7 to i32*
    store i32* %8, i32** %alloca1
    br label %newExpr1.Finish

newExpr1.Finish:
    %9 = load i32*, i32** %alloca1
    ;I'm Finish NewArray1
    store i32* %9, i32** %alloca0
    %10 = load i32*, i32** %alloca0
    %11= getelementptr i32, i32* %10, i32 1
    %12 = load i32, i32* %11
    store i32 1, i32* %11
    ret void
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
