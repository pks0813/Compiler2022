@hashsize = global i32 zeroinitializer
@table = global %struct.node** zeroinitializer
@.Str0 = constant [2 x i8] c" \00"
%struct.node = type {i32 , i32 , %struct.node*}
define void @Init(){

AllocaBlock:
    br label %Initial

Initial:
    br label %entry

entry:
    store i32 100, i32* @hashsize
    ret void
}
define i32 @main(){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32
    %alloca2 = alloca %struct.node**
    br label %Initial

Initial:
    br label %entry

entry:
    call void @Init( )
    ;I'm in NewArray0
    br label %newExpr0.dep0.Initial

newExpr0.dep0.Initial:
    %0 = mul i32 100, 32
    %1 = add i32 %0, 32
    %2 = sdiv i32 %1, 8
    %3 = call i8* @malloc(i32 %2 )
    %4 = bitcast i8* %3 to i32*
    store i32 100, i32* %4
    %5= getelementptr i32, i32* %4, i32 1
    %6 = bitcast i32* %5 to %struct.node**
    %7 = bitcast %struct.node** %6 to %struct.node**
    store %struct.node** %7, %struct.node*** %alloca2
    br label %newExpr0.Finish

newExpr0.Finish:
    %8 = load %struct.node**, %struct.node*** %alloca2
    ;I'm Finish NewArray0
    store %struct.node** %8, %struct.node*** @table
    store i32 0, i32* %alloca1
    br label %ForCond1

ForCond1:
    %9 = load i32, i32* %alloca1
    %10 = load i32, i32* @hashsize
    %11 = icmp slt i32 %9, %10
    br i1 %11, label %ForLoop1, label %ForFinish1

ForLoop1:
    %12 = load %struct.node**, %struct.node*** @table
    %13 = load i32, i32* %alloca1
    %14= getelementptr %struct.node*, %struct.node** %12, i32 %13
    %15 = load %struct.node*, %struct.node** %14
    store %struct.node* null , %struct.node** %14
    br label %ForEnd1

ForEnd1:
    %16 = load i32, i32* %alloca1
    %17 = add i32 %16, 1
    store i32 %17, i32* %alloca1
    br label %ForCond1

ForFinish1:
    store i32 0, i32* %alloca1
    br label %ForCond2

ForCond2:
    %18 = load i32, i32* %alloca1
    %19 = icmp slt i32 %18, 1000
    br i1 %19, label %ForLoop2, label %ForFinish2

ForLoop2:
    %20 = load i32, i32* %alloca1
    %21 = load i32, i32* %alloca1
    call void @put(i32 %20 , i32 %21 )
    br label %ForEnd2

ForEnd2:
    %22 = load i32, i32* %alloca1
    %23 = add i32 %22, 1
    store i32 %23, i32* %alloca1
    br label %ForCond2

ForFinish2:
    store i32 0, i32* %alloca1
    br label %ForCond3

ForCond3:
    %24 = load i32, i32* %alloca1
    %25 = icmp slt i32 %24, 1000
    br i1 %25, label %ForLoop3, label %ForFinish3

ForLoop3:
    %26 = load i32, i32* %alloca1
    %27 = call i8* @toString(i32 %26 )
    %28 = bitcast [ 2 x i8 ]* @.Str0 to i8*
    %29 = call i8* @_struct_string_AddString(i8* %27 , i8* %28 )
    %30 = load i32, i32* %alloca1
    %31 = call i32 @get(i32 %30 )
    %32 = call i8* @toString(i32 %31 )
    %33 = call i8* @_struct_string_AddString(i8* %29 , i8* %32 )
    call void @println(i8* %33 )
    br label %ForEnd3

ForEnd3:
    %34 = load i32, i32* %alloca1
    %35 = add i32 %34, 1
    store i32 %35, i32* %alloca1
    br label %ForCond3

ForFinish3:
    store i32 0, i32* %alloca0
    %36 = load i32, i32* %alloca0
    ret i32 %36
}
define i32 @getHash(i32 %0){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32
    br label %Initial

Initial:
    store i32 %0, i32* %alloca0
    br label %entry

entry:
    %1 = load i32, i32* %alloca0
    %2 = mul i32 %1, 237
    %3 = load i32, i32* @hashsize
    %4 = srem i32 %2, %3
    store i32 %4, i32* %alloca1
    %5 = load i32, i32* %alloca1
    ret i32 %5
}
define void  @put(i32 %0, i32 %1){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32
    %alloca2 = alloca i32
    %alloca3 = alloca %struct.node*
    br label %Initial

Initial:
    store i32 %0, i32* %alloca0
    store i32 %1, i32* %alloca1
    br label %entry

entry:
    store %struct.node* null , %struct.node** %alloca3
    %2 = load i32, i32* %alloca0
    %3 = call i32 @getHash(i32 %2 )
    store i32 %3, i32* %alloca2
    %4 = load %struct.node**, %struct.node*** @table
    %5 = load i32, i32* %alloca2
    %6= getelementptr %struct.node*, %struct.node** %4, i32 %5
    %7 = load %struct.node*, %struct.node** %6
    %8 = icmp eq %struct.node* %7, null
    br i1 %8, label %IFTrue1, label %IFFalse1

IFTrue1:
    %9 = load %struct.node**, %struct.node*** @table
    %10 = load i32, i32* %alloca2
    %11= getelementptr %struct.node*, %struct.node** %9, i32 %10
    %12 = load %struct.node*, %struct.node** %11
    %13 = call i8* @malloc(i32 12 )
    %14 = bitcast i8* %13 to %struct.node*
    call void @_struct_node_node(%struct.node* %14 )
    store %struct.node* %14, %struct.node** %11
    %15 = load %struct.node**, %struct.node*** @table
    %16 = load i32, i32* %alloca2
    %17= getelementptr %struct.node*, %struct.node** %15, i32 %16
    %18 = load %struct.node*, %struct.node** %17
    %19= getelementptr %struct.node, %struct.node* %18, i32 0, i32 0
    %20 = load i32, i32* %19
    %21 = load i32, i32* %alloca0
    store i32 %21, i32* %19
    %22 = load %struct.node**, %struct.node*** @table
    %23 = load i32, i32* %alloca2
    %24= getelementptr %struct.node*, %struct.node** %22, i32 %23
    %25 = load %struct.node*, %struct.node** %24
    %26= getelementptr %struct.node, %struct.node* %25, i32 0, i32 1
    %27 = load i32, i32* %26
    %28 = load i32, i32* %alloca1
    store i32 %28, i32* %26
    %29 = load %struct.node**, %struct.node*** @table
    %30 = load i32, i32* %alloca2
    %31= getelementptr %struct.node*, %struct.node** %29, i32 %30
    %32 = load %struct.node*, %struct.node** %31
    %33= getelementptr %struct.node, %struct.node* %32, i32 0, i32 2
    %34 = load %struct.node*, %struct.node** %33
    store %struct.node* null , %struct.node** %33
    ret void

IFFalse1:
    br label %IFFinish1

IFFinish1:
    %35 = load %struct.node**, %struct.node*** @table
    %36 = load i32, i32* %alloca2
    %37= getelementptr %struct.node*, %struct.node** %35, i32 %36
    %38 = load %struct.node*, %struct.node** %37
    store %struct.node* %38, %struct.node** %alloca3
    br label %ForCond4

ForCond4:
    %39 = load %struct.node*, %struct.node** %alloca3
    %40= getelementptr %struct.node, %struct.node* %39, i32 0, i32 0
    %41 = load i32, i32* %40
    %42 = load i32, i32* %alloca0
    %43 = icmp ne i32 %41, %42
    br i1 %43, label %ForLoop4, label %ForFinish4

ForLoop4:
    %44 = load %struct.node*, %struct.node** %alloca3
    %45= getelementptr %struct.node, %struct.node* %44, i32 0, i32 2
    %46 = load %struct.node*, %struct.node** %45
    %47 = icmp eq %struct.node* %46, null
    br i1 %47, label %IFTrue2, label %IFFalse2

IFTrue2:
    %48 = load %struct.node*, %struct.node** %alloca3
    %49= getelementptr %struct.node, %struct.node* %48, i32 0, i32 2
    %50 = load %struct.node*, %struct.node** %49
    %51 = call i8* @malloc(i32 12 )
    %52 = bitcast i8* %51 to %struct.node*
    call void @_struct_node_node(%struct.node* %52 )
    store %struct.node* %52, %struct.node** %49
    %53 = load %struct.node*, %struct.node** %alloca3
    %54= getelementptr %struct.node, %struct.node* %53, i32 0, i32 2
    %55 = load %struct.node*, %struct.node** %54
    %56= getelementptr %struct.node, %struct.node* %55, i32 0, i32 0
    %57 = load i32, i32* %56
    %58 = load i32, i32* %alloca0
    store i32 %58, i32* %56
    %59 = load %struct.node*, %struct.node** %alloca3
    %60= getelementptr %struct.node, %struct.node* %59, i32 0, i32 2
    %61 = load %struct.node*, %struct.node** %60
    %62= getelementptr %struct.node, %struct.node* %61, i32 0, i32 2
    %63 = load %struct.node*, %struct.node** %62
    store %struct.node* null , %struct.node** %62
    br label %IFFinish2

IFFalse2:
    br label %IFFinish2

IFFinish2:
    %64 = load %struct.node*, %struct.node** %alloca3
    %65= getelementptr %struct.node, %struct.node* %64, i32 0, i32 2
    %66 = load %struct.node*, %struct.node** %65
    store %struct.node* %66, %struct.node** %alloca3
    br label %ForEnd4

ForEnd4:
    br label %ForCond4

ForFinish4:
    %67 = load %struct.node*, %struct.node** %alloca3
    %68= getelementptr %struct.node, %struct.node* %67, i32 0, i32 1
    %69 = load i32, i32* %68
    %70 = load i32, i32* %alloca1
    store i32 %70, i32* %68
    ret void
}
define i32 @get(i32 %0){

AllocaBlock:
    %alloca0 = alloca i32
    %alloca1 = alloca i32
    %alloca2 = alloca %struct.node*
    br label %Initial

Initial:
    store i32 %0, i32* %alloca0
    br label %entry

entry:
    store %struct.node* null , %struct.node** %alloca2
    %1 = load %struct.node**, %struct.node*** @table
    %2 = load i32, i32* %alloca0
    %3 = call i32 @getHash(i32 %2 )
    %4= getelementptr %struct.node*, %struct.node** %1, i32 %3
    %5 = load %struct.node*, %struct.node** %4
    store %struct.node* %5, %struct.node** %alloca2
    br label %ForCond5

ForCond5:
    %6 = load %struct.node*, %struct.node** %alloca2
    %7= getelementptr %struct.node, %struct.node* %6, i32 0, i32 0
    %8 = load i32, i32* %7
    %9 = load i32, i32* %alloca0
    %10 = icmp ne i32 %8, %9
    br i1 %10, label %ForLoop5, label %ForFinish5

ForLoop5:
    %11 = load %struct.node*, %struct.node** %alloca2
    %12= getelementptr %struct.node, %struct.node* %11, i32 0, i32 2
    %13 = load %struct.node*, %struct.node** %12
    store %struct.node* %13, %struct.node** %alloca2
    br label %ForEnd5

ForEnd5:
    br label %ForCond5

ForFinish5:
    %14 = load %struct.node*, %struct.node** %alloca2
    %15= getelementptr %struct.node, %struct.node* %14, i32 0, i32 1
    %16 = load i32, i32* %15
    store i32 %16, i32* %alloca1
    %17 = load i32, i32* %alloca1
    ret i32 %17
}
define void  @_struct_node_node(%struct.node* %0){

AllocaBlock:
    %Idon't = alloca i32
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
