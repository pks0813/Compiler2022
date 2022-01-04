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
    %alloca1 = alloca i32
    %alloca2 = alloca i32
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    store i32 6, i32* %alloca1
    store i32 7, i32* %alloca2
    %0 = load i32, i32* %alloca1
    %1 = load i32, i32* %alloca2
    %2 = add i32 %0, %1
    store i32 %2, i32* %alloca1
    %3 = load i32, i32* %alloca1
    %4 = load i32, i32* %alloca2
    %5 = sub i32 %3, %4
    call void @printlnInt(i32 %5 )
    ret i32 0
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
