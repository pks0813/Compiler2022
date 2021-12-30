%struct.pks = type {i32 , i32}
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
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    %0 = call i32 @f(i32 1 , i32 2 , i32 3 , i32 4 , i32 5 , i32 6 , i32 7 , i32 8 , i32 9 , i32 10 , i32 11 , i32 12 , i32 13 )
    store i32 0, i32* %alloca0
    %1 = load i32, i32* %alloca0
    ret i32 %1
}
define i32 @f(i32 %0, i32 %1, i32 %2, i32 %3, i32 %4, i32 %5, i32 %6, i32 %7, i32 %8, i32 %9, i32 %10, i32 %11, i32 %12){

AllocaBlock:
    %alloca1 = alloca i32
    %alloca2 = alloca i32
    %alloca3 = alloca i32
    %alloca4 = alloca i32
    %alloca5 = alloca i32
    %alloca6 = alloca i32
    %alloca7 = alloca i32
    %alloca8 = alloca i32
    %alloca9 = alloca i32
    %alloca10 = alloca i32
    %alloca11 = alloca i32
    %alloca12 = alloca i32
    %alloca13 = alloca i32
    %alloca14 = alloca i32
    br label %Initial

Initial:
    store i32 %0, i32* %alloca1
    store i32 %1, i32* %alloca2
    store i32 %2, i32* %alloca3
    store i32 %3, i32* %alloca4
    store i32 %4, i32* %alloca5
    store i32 %5, i32* %alloca6
    store i32 %6, i32* %alloca7
    store i32 %7, i32* %alloca8
    store i32 %8, i32* %alloca9
    store i32 %9, i32* %alloca10
    store i32 %10, i32* %alloca11
    store i32 %11, i32* %alloca12
    store i32 %12, i32* %alloca13
    br label %entry

entry:
    store i32 0, i32* %alloca14
    %13 = load i32, i32* %alloca14
    ret i32 %13
}
define void  @_struct_pks_pks(%struct.pks* %0){

AllocaBlock:
    br label %Initial

Initial:
    br label %entry

entry:
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
