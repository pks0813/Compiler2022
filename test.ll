@a = global i32 zeroinitializer
@llvm.global_ctors = appending global [1 x { i32, void ()*, i8* }] [{ i32, void ()*, i8* } { i32 65535, void ()* @Init, i8* null }]

define void @Init(){

entry:
    store i32 5, i32* @a
    ret void
}
define i32 @main(){

entry:
    %0 = alloca i32
    %1 = alloca i32
    %2 = load i32, i32* @a
    %3 = icmp eq i32 %2, 6
    br i1 %3, label %IFTrue1, label %IFFalse1

IFTrue1:
    %4 = load i32, i32* %0
    store i32 1, i32* %0
    %5 = load i32, i32* %0
    %6 = icmp eq i32 %5, 1
    br i1 %6, label %IFTrue2, label %IFFalse2

IFTrue2:
    %7 = load i32, i32* %1
    store i32 1, i32* %1
    br label %IFFinish2

IFFalse2:
    %8 = load i32, i32* %1
    store i32 2, i32* %1
    br label %IFFinish2

IFFinish2:
    br label %IFFinish1

IFFalse1:
    %9 = load i32, i32* %0
    store i32 2, i32* %0
    br label %IFFinish1

IFFinish1:
    ret i32 0
}
declare i32 @printf(i8*, ...)
