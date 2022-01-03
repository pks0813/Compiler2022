	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv %raAddr , ra
	j entry0
entry0:
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,0
	mv %raAddr , ra
	j entry1
entry1:
	call Init
	li a0 , 4
	call malloc
	mv %0 , a0
	mv %1 , %0
	mv a0 , %1
	call _struct_vector_vector
	sw %1 , -8(Initialsp)
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li %NewRegist0 , 10
	li %NewRegist1 , 32
	mul %2, %NewRegist0, %NewRegist1
	li %NewRegist2 , 32
	add %3, %2, %NewRegist2
	li %NewRegist3 , 8
	div %4, %3, %NewRegist3
	mv a0 , %4
	call malloc
	mv %5 , a0
	mv %6 , %5
	li %NewRegist4 , 10
	sw %NewRegist4 , 0(%6)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %7, %6, %NewRegist5
	mv %8 , %7
	mv %9 , %8
	sw %9 , -12(Initialsp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw %10 , -12(Initialsp)
	sw %10 , -16(Initialsp)
	li %NewRegist7 , 0
	sw %NewRegist7 , -20(Initialsp)
	beqz zero,ForCond11

ForCond11:
	lw %11 , -20(Initialsp)
	li %NewRegist8 , 10
	slt %12, %11, %NewRegist8
	bnez %12,ForLoop11
	beqz %12,ForFinish11

ForLoop11:
	lw %13 , -16(Initialsp)
	lw %14 , -20(Initialsp)
	li %NewRegist9 , 4
	mul %NewRegist9, %NewRegist9, %14
	add %15, %13, %NewRegist9
	lw %16 , 0(%15)
	lw %17 , -20(Initialsp)
	li %NewRegist10 , 9
	sub %18, %NewRegist10, %17
	sw %18 , 0(%15)
	beqz zero,ForEnd11

ForEnd11:
	lw %19 , -20(Initialsp)
	li %NewRegist11 , 1
	add %20, %19, %NewRegist11
	sw %20 , -20(Initialsp)
	beqz zero,ForCond11

ForFinish11:
	lw %21 , -8(Initialsp)
	lw %22 , -16(Initialsp)
	mv a0 , %21
	mv a1 , %22
	call _struct_vector_init
	la %23 , .Str0
	mv a0 , %23
	call print
	lw %24 , -8(Initialsp)
	mv a0 , %24
	call _struct_vector_tostring
	mv %25 , a0
	mv a0 , %25
	call println
	li a0 , 4
	call malloc
	mv %26 , a0
	mv %27 , %26
	mv a0 , %27
	call _struct_vector_vector
	sw %27 , -24(Initialsp)
	lw %28 , -24(Initialsp)
	lw %29 , -8(Initialsp)
	mv a0 , %28
	mv a1 , %29
	call _struct_vector_copy
	mv %30 , a0
	lw %31 , -24(Initialsp)
	mv a0 , %31
	li a1 , 3
	li a2 , 817
	call _struct_vector_set
	mv %32 , a0
	bnez %32,IFTrue11
	beqz %32,IFFalse11

IFTrue11:
	la %33 , .Str1
	mv a0 , %33
	call println
	beqz zero,IFFinish11

IFFalse11:
	beqz zero,IFFinish11

IFFinish11:
	la %34 , .Str2
	mv a0 , %34
	call print
	lw %35 , -24(Initialsp)
	mv a0 , %35
	call _struct_vector_tostring
	mv %36 , a0
	mv a0 , %36
	call println
	la %37 , .Str3
	mv a0 , %37
	call print
	lw %38 , -8(Initialsp)
	lw %39 , -24(Initialsp)
	mv a0 , %38
	mv a1 , %39
	call _struct_vector_add
	mv %40 , a0
	mv a0 , %40
	call _struct_vector_tostring
	mv %41 , a0
	mv a0 , %41
	call println
	la %42 , .Str4
	mv a0 , %42
	call print
	lw %43 , -8(Initialsp)
	lw %44 , -24(Initialsp)
	mv a0 , %43
	mv a1 , %44
	call _struct_vector_dot
	mv %45 , a0
	mv a0 , %45
	call toString
	mv %46 , a0
	mv a0 , %46
	call println
	la %47 , .Str5
	mv a0 , %47
	call print
	lw %48 , -24(Initialsp)
	li %NewRegist12 , 1
	li %NewRegist13 , 3
	sll %49, %NewRegist12, %NewRegist13
	mv a0 , %48
	mv a1 , %49
	call _struct_vector_scalarInPlaceMultiply
	mv %50 , a0
	mv a0 , %50
	call _struct_vector_tostring
	mv %51 , a0
	mv a0 , %51
	call println
	li %NewRegist14 , 0
	sw %NewRegist14 , -4(Initialsp)
	lw %52 , -4(Initialsp)
	mv a0 , %52
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_init
    .p2align    2
_struct_vector_init:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry2
entry2:
	lw %2 , -8(Initialsp)
	li %NewRegist0 , 0
	xor %3, %2, %NewRegist0
	seqz %3 , %3
	bnez %3,IFTrue22
	beqz %3,IFFalse22

IFTrue22:
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse22:
	beqz zero,IFFinish22

IFFinish22:
	lw %4 , -4(Initialsp)
	addi %5, %4, 0
	lw %6 , -8(Initialsp)
	mv %7 , %6
	li %NewRegist1 , 4
	li %NewRegist2 , -1
	mul %NewRegist1, %NewRegist1, %NewRegist2
	add %8, %7, %NewRegist1
	lw %9 , 0(%8)
	beqz zero,newExpr1.dep0.Initial2

newExpr1.dep0.Initial2:
	li %NewRegist3 , 32
	mul %10, %9, %NewRegist3
	li %NewRegist4 , 32
	add %11, %10, %NewRegist4
	li %NewRegist5 , 8
	div %12, %11, %NewRegist5
	mv a0 , %12
	call malloc
	mv %13 , a0
	mv %14 , %13
	sw %9 , 0(%14)
	li %NewRegist6 , 4
	li %NewRegist7 , 1
	mul %NewRegist6, %NewRegist6, %NewRegist7
	add %15, %14, %NewRegist6
	mv %16 , %15
	mv %17 , %16
	sw %17 , -12(Initialsp)
	beqz zero,newExpr1.Finish2

newExpr1.Finish2:
	lw %18 , -12(Initialsp)
	sw %18 , 0(%5)
	li %NewRegist8 , 0
	sw %NewRegist8 , -16(Initialsp)
	beqz zero,ForCond22

ForCond22:
	lw %19 , -16(Initialsp)
	lw %20 , -8(Initialsp)
	mv %21 , %20
	li %NewRegist9 , 4
	li %NewRegist10 , -1
	mul %NewRegist9, %NewRegist9, %NewRegist10
	add %22, %21, %NewRegist9
	lw %23 , 0(%22)
	slt %24, %19, %23
	bnez %24,ForLoop22
	beqz %24,ForFinish22

ForLoop22:
	lw %25 , -4(Initialsp)
	addi %26, %25, 0
	lw %27 , 0(%26)
	lw %28 , -16(Initialsp)
	li %NewRegist11 , 4
	mul %NewRegist11, %NewRegist11, %28
	add %29, %27, %NewRegist11
	lw %30 , 0(%29)
	lw %31 , -8(Initialsp)
	lw %32 , -16(Initialsp)
	li %NewRegist12 , 4
	mul %NewRegist12, %NewRegist12, %32
	add %33, %31, %NewRegist12
	lw %34 , 0(%33)
	sw %34 , 0(%29)
	beqz zero,ForEnd22

ForEnd22:
	lw %35 , -16(Initialsp)
	li %NewRegist13 , 1
	add %36, %35, %NewRegist13
	sw %36 , -16(Initialsp)
	beqz zero,ForCond22

ForFinish22:
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_getDim
    .p2align    2
_struct_vector_getDim:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry3
entry3:
	lw %1 , -4(Initialsp)
	addi %2, %1, 0
	lw %3 , 0(%2)
	li %NewRegist0 , 0
	xor %4, %3, %NewRegist0
	seqz %4 , %4
	bnez %4,IFTrue33
	beqz %4,IFFalse33

IFTrue33:
	li %NewRegist1 , 0
	sw %NewRegist1 , -8(Initialsp)
	lw %5 , -8(Initialsp)
	mv a0 , %5
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse33:
	beqz zero,IFFinish33

IFFinish33:
	lw %6 , -4(Initialsp)
	addi %7, %6, 0
	lw %8 , 0(%7)
	mv %9 , %8
	li %NewRegist2 , 4
	li %NewRegist3 , -1
	mul %NewRegist2, %NewRegist2, %NewRegist3
	add %10, %9, %NewRegist2
	lw %11 , 0(%10)
	sw %11 , -8(Initialsp)
	lw %12 , -8(Initialsp)
	mv a0 , %12
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_dot
    .p2align    2
_struct_vector_dot:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry4
entry4:
	li %NewRegist0 , 0
	sw %NewRegist0 , -16(Initialsp)
	li %NewRegist1 , 0
	sw %NewRegist1 , -20(Initialsp)
	beqz zero,ForCond34

ForCond34:
	lw %2 , -16(Initialsp)
	lw %3 , -4(Initialsp)
	mv a0 , %3
	call _struct_vector_getDim
	mv %4 , a0
	slt %5, %2, %4
	bnez %5,ForLoop34
	beqz %5,ForFinish34

ForLoop34:
	lw %6 , -4(Initialsp)
	addi %7, %6, 0
	lw %8 , 0(%7)
	lw %9 , -16(Initialsp)
	li %NewRegist2 , 4
	mul %NewRegist2, %NewRegist2, %9
	add %10, %8, %NewRegist2
	lw %11 , 0(%10)
	lw %12 , -8(Initialsp)
	addi %13, %12, 0
	lw %14 , 0(%13)
	lw %15 , -16(Initialsp)
	li %NewRegist3 , 4
	mul %NewRegist3, %NewRegist3, %15
	add %16, %14, %NewRegist3
	lw %17 , 0(%16)
	mul %18, %11, %17
	sw %18 , -20(Initialsp)
	lw %19 , -16(Initialsp)
	li %NewRegist4 , 1
	add %20, %19, %NewRegist4
	sw %20 , -16(Initialsp)
	beqz zero,ForEnd34

ForEnd34:
	beqz zero,ForCond34

ForFinish34:
	lw %21 , -20(Initialsp)
	sw %21 , -12(Initialsp)
	lw %22 , -12(Initialsp)
	mv a0 , %22
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_scalarInPlaceMultiply
    .p2align    2
_struct_vector_scalarInPlaceMultiply:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry5
entry5:
	lw %2 , -4(Initialsp)
	addi %3, %2, 0
	lw %4 , 0(%3)
	li %NewRegist0 , 0
	xor %5, %4, %NewRegist0
	seqz %5 , %5
	bnez %5,IFTrue45
	beqz %5,IFFalse45

IFTrue45:
	li %NewRegist1 , 0
	sw %NewRegist1 , -12(Initialsp)
	lw %6 , -12(Initialsp)
	mv a0 , %6
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse45:
	beqz zero,IFFinish45

IFFinish45:
	li %NewRegist2 , 0
	sw %NewRegist2 , -16(Initialsp)
	beqz zero,ForCond45

ForCond45:
	lw %7 , -16(Initialsp)
	lw %8 , -4(Initialsp)
	mv a0 , %8
	call _struct_vector_getDim
	mv %9 , a0
	slt %10, %7, %9
	bnez %10,ForLoop45
	beqz %10,ForFinish45

ForLoop45:
	lw %11 , -4(Initialsp)
	addi %12, %11, 0
	lw %13 , 0(%12)
	lw %14 , -16(Initialsp)
	li %NewRegist3 , 4
	mul %NewRegist3, %NewRegist3, %14
	add %15, %13, %NewRegist3
	lw %16 , 0(%15)
	lw %17 , -8(Initialsp)
	lw %18 , -4(Initialsp)
	addi %19, %18, 0
	lw %20 , 0(%19)
	lw %21 , -16(Initialsp)
	li %NewRegist4 , 4
	mul %NewRegist4, %NewRegist4, %21
	add %22, %20, %NewRegist4
	lw %23 , 0(%22)
	mul %24, %17, %23
	sw %24 , 0(%15)
	beqz zero,ForEnd45

ForEnd45:
	lw %25 , -16(Initialsp)
	li %NewRegist5 , 1
	add %26, %25, %NewRegist5
	sw %26 , -16(Initialsp)
	beqz zero,ForCond45

ForFinish45:
	lw %27 , -4(Initialsp)
	sw %27 , -12(Initialsp)
	lw %28 , -12(Initialsp)
	mv a0 , %28
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_add
    .p2align    2
_struct_vector_add:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry6
entry6:
	lw %2 , -4(Initialsp)
	mv a0 , %2
	call _struct_vector_getDim
	mv %3 , a0
	lw %4 , -8(Initialsp)
	mv a0 , %4
	call _struct_vector_getDim
	mv %5 , a0
	xor %6, %3, %5
	snez %6 , %6
	sw %6 , -16(Initialsp)
	bnez %6,Binary0.Finish6
	beqz %6,Binary0.Right6

Binary0.Right6:
	lw %7 , -4(Initialsp)
	mv a0 , %7
	call _struct_vector_getDim
	mv %8 , a0
	li %NewRegist0 , 0
	xor %9, %8, %NewRegist0
	seqz %9 , %9
	sw %9 , -16(Initialsp)
	beqz zero,Binary0.Finish6

Binary0.Finish6:
	lw %10 , -16(Initialsp)
	bnez %10,IFTrue56
	beqz %10,IFFalse56

IFTrue56:
	li %NewRegist1 , 0
	sw %NewRegist1 , -12(Initialsp)
	lw %11 , -12(Initialsp)
	mv a0 , %11
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse56:
	beqz zero,IFFinish56

IFFinish56:
	li a0 , 4
	call malloc
	mv %12 , a0
	mv %13 , %12
	mv a0 , %13
	call _struct_vector_vector
	sw %13 , -20(Initialsp)
	lw %14 , -20(Initialsp)
	addi %15, %14, 0
	lw %16 , 0(%15)
	lw %17 , -4(Initialsp)
	mv a0 , %17
	call _struct_vector_getDim
	mv %18 , a0
	beqz zero,newExpr2.dep0.Initial6

newExpr2.dep0.Initial6:
	li %NewRegist2 , 32
	mul %19, %18, %NewRegist2
	li %NewRegist3 , 32
	add %20, %19, %NewRegist3
	li %NewRegist4 , 8
	div %21, %20, %NewRegist4
	mv a0 , %21
	call malloc
	mv %22 , a0
	mv %23 , %22
	sw %18 , 0(%23)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %24, %23, %NewRegist5
	mv %25 , %24
	mv %26 , %25
	sw %26 , -28(Initialsp)
	beqz zero,newExpr2.Finish6

newExpr2.Finish6:
	lw %27 , -28(Initialsp)
	sw %27 , 0(%15)
	li %NewRegist7 , 0
	sw %NewRegist7 , -24(Initialsp)
	beqz zero,ForCond56

ForCond56:
	lw %28 , -24(Initialsp)
	lw %29 , -4(Initialsp)
	mv a0 , %29
	call _struct_vector_getDim
	mv %30 , a0
	slt %31, %28, %30
	bnez %31,ForLoop56
	beqz %31,ForFinish56

ForLoop56:
	lw %32 , -20(Initialsp)
	addi %33, %32, 0
	lw %34 , 0(%33)
	lw %35 , -24(Initialsp)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %35
	add %36, %34, %NewRegist8
	lw %37 , 0(%36)
	lw %38 , -4(Initialsp)
	addi %39, %38, 0
	lw %40 , 0(%39)
	lw %41 , -24(Initialsp)
	li %NewRegist9 , 4
	mul %NewRegist9, %NewRegist9, %41
	add %42, %40, %NewRegist9
	lw %43 , 0(%42)
	lw %44 , -8(Initialsp)
	addi %45, %44, 0
	lw %46 , 0(%45)
	lw %47 , -24(Initialsp)
	li %NewRegist10 , 4
	mul %NewRegist10, %NewRegist10, %47
	add %48, %46, %NewRegist10
	lw %49 , 0(%48)
	add %50, %43, %49
	sw %50 , 0(%36)
	beqz zero,ForEnd56

ForEnd56:
	lw %51 , -24(Initialsp)
	li %NewRegist11 , 1
	add %52, %51, %NewRegist11
	sw %52 , -24(Initialsp)
	beqz zero,ForCond56

ForFinish56:
	lw %53 , -20(Initialsp)
	sw %53 , -12(Initialsp)
	lw %54 , -12(Initialsp)
	mv a0 , %54
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_set
    .p2align    2
_struct_vector_set:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry7
entry7:
	lw %3 , -4(Initialsp)
	mv a0 , %3
	call _struct_vector_getDim
	mv %4 , a0
	lw %5 , -8(Initialsp)
	slt %6, %4, %5
	bnez %6,IFTrue67
	beqz %6,IFFalse67

IFTrue67:
	li %NewRegist0 , 0
	sw %NewRegist0 , -16(Initialsp)
	lw %7 , -16(Initialsp)
	mv a0 , %7
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse67:
	beqz zero,IFFinish67

IFFinish67:
	lw %8 , -4(Initialsp)
	addi %9, %8, 0
	lw %10 , 0(%9)
	lw %11 , -8(Initialsp)
	li %NewRegist1 , 4
	mul %NewRegist1, %NewRegist1, %11
	add %12, %10, %NewRegist1
	lw %13 , 0(%12)
	lw %14 , -12(Initialsp)
	sw %14 , 0(%12)
	li %NewRegist2 , 1
	sw %NewRegist2 , -16(Initialsp)
	lw %15 , -16(Initialsp)
	mv a0 , %15
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_tostring
    .p2align    2
_struct_vector_tostring:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry8
entry8:
	la %1 , .Str6
	sw %1 , -12(Initialsp)
	lw %2 , -4(Initialsp)
	mv a0 , %2
	call _struct_vector_getDim
	mv %3 , a0
	li %NewRegist0 , 0
	slt %4, %NewRegist0, %3
	bnez %4,IFTrue78
	beqz %4,IFFalse78

IFTrue78:
	lw %5 , -12(Initialsp)
	lw %6 , -4(Initialsp)
	addi %7, %6, 0
	lw %8 , 0(%7)
	li %NewRegist1 , 4
	li %NewRegist2 , 0
	mul %NewRegist1, %NewRegist1, %NewRegist2
	add %9, %8, %NewRegist1
	lw %10 , 0(%9)
	mv a0 , %10
	call toString
	mv %11 , a0
	mv a0 , %5
	mv a1 , %11
	call _struct_string_AddString
	mv %12 , a0
	sw %12 , -12(Initialsp)
	beqz zero,IFFinish78

IFFalse78:
	beqz zero,IFFinish78

IFFinish78:
	li %NewRegist3 , 1
	sw %NewRegist3 , -16(Initialsp)
	beqz zero,ForCond68

ForCond68:
	lw %13 , -16(Initialsp)
	lw %14 , -4(Initialsp)
	mv a0 , %14
	call _struct_vector_getDim
	mv %15 , a0
	slt %16, %13, %15
	bnez %16,ForLoop68
	beqz %16,ForFinish68

ForLoop68:
	lw %17 , -12(Initialsp)
	la %18 , .Str7
	mv a0 , %17
	mv a1 , %18
	call _struct_string_AddString
	mv %19 , a0
	lw %20 , -4(Initialsp)
	addi %21, %20, 0
	lw %22 , 0(%21)
	lw %23 , -16(Initialsp)
	li %NewRegist4 , 4
	mul %NewRegist4, %NewRegist4, %23
	add %24, %22, %NewRegist4
	lw %25 , 0(%24)
	mv a0 , %25
	call toString
	mv %26 , a0
	mv a0 , %19
	mv a1 , %26
	call _struct_string_AddString
	mv %27 , a0
	sw %27 , -12(Initialsp)
	beqz zero,ForEnd68

ForEnd68:
	lw %28 , -16(Initialsp)
	li %NewRegist5 , 1
	add %29, %28, %NewRegist5
	sw %29 , -16(Initialsp)
	beqz zero,ForCond68

ForFinish68:
	lw %30 , -12(Initialsp)
	la %31 , .Str8
	mv a0 , %30
	mv a1 , %31
	call _struct_string_AddString
	mv %32 , a0
	sw %32 , -12(Initialsp)
	lw %33 , -12(Initialsp)
	sw %33 , -8(Initialsp)
	lw %34 , -8(Initialsp)
	mv a0 , %34
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_copy
    .p2align    2
_struct_vector_copy:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry9
entry9:
	lw %2 , -8(Initialsp)
	li %NewRegist0 , 0
	xor %3, %2, %NewRegist0
	seqz %3 , %3
	bnez %3,IFTrue89
	beqz %3,IFFalse89

IFTrue89:
	li %NewRegist1 , 0
	sw %NewRegist1 , -12(Initialsp)
	lw %4 , -12(Initialsp)
	mv a0 , %4
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse89:
	beqz zero,IFFinish89

IFFinish89:
	lw %5 , -8(Initialsp)
	mv a0 , %5
	call _struct_vector_getDim
	mv %6 , a0
	li %NewRegist2 , 0
	xor %7, %6, %NewRegist2
	seqz %7 , %7
	bnez %7,IFTrue99
	beqz %7,IFFalse99

IFTrue99:
	lw %8 , -4(Initialsp)
	addi %9, %8, 0
	li %NewRegist3 , 0
	sw %NewRegist3 , 0(%9)
	beqz zero,IFFinish99

IFFalse99:
	lw %10 , -4(Initialsp)
	addi %11, %10, 0
	lw %12 , -8(Initialsp)
	mv a0 , %12
	call _struct_vector_getDim
	mv %13 , a0
	beqz zero,newExpr3.dep0.Initial9

newExpr3.dep0.Initial9:
	li %NewRegist4 , 32
	mul %14, %13, %NewRegist4
	li %NewRegist5 , 32
	add %15, %14, %NewRegist5
	li %NewRegist6 , 8
	div %16, %15, %NewRegist6
	mv a0 , %16
	call malloc
	mv %17 , a0
	mv %18 , %17
	sw %13 , 0(%18)
	li %NewRegist7 , 4
	li %NewRegist8 , 1
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %19, %18, %NewRegist7
	mv %20 , %19
	mv %21 , %20
	sw %21 , -16(Initialsp)
	beqz zero,newExpr3.Finish9

newExpr3.Finish9:
	lw %22 , -16(Initialsp)
	sw %22 , 0(%11)
	li %NewRegist9 , 0
	sw %NewRegist9 , -20(Initialsp)
	beqz zero,ForCond79

ForCond79:
	lw %23 , -20(Initialsp)
	lw %24 , -4(Initialsp)
	mv a0 , %24
	call _struct_vector_getDim
	mv %25 , a0
	slt %26, %23, %25
	bnez %26,ForLoop79
	beqz %26,ForFinish79

ForLoop79:
	lw %27 , -4(Initialsp)
	addi %28, %27, 0
	lw %29 , 0(%28)
	lw %30 , -20(Initialsp)
	li %NewRegist10 , 4
	mul %NewRegist10, %NewRegist10, %30
	add %31, %29, %NewRegist10
	lw %32 , 0(%31)
	lw %33 , -8(Initialsp)
	addi %34, %33, 0
	lw %35 , 0(%34)
	lw %36 , -20(Initialsp)
	li %NewRegist11 , 4
	mul %NewRegist11, %NewRegist11, %36
	add %37, %35, %NewRegist11
	lw %38 , 0(%37)
	sw %38 , 0(%31)
	beqz zero,ForEnd79

ForEnd79:
	lw %39 , -20(Initialsp)
	li %NewRegist12 , 1
	add %40, %39, %NewRegist12
	sw %40 , -20(Initialsp)
	beqz zero,ForCond79

ForFinish79:
	beqz zero,IFFinish99

IFFinish99:
	li %NewRegist13 , 1
	sw %NewRegist13 , -12(Initialsp)
	lw %41 , -12(Initialsp)
	mv a0 , %41
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  _struct_vector_vector
    .p2align    2
_struct_vector_vector:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry10
entry10:
	mv ra , %raAddr
	addi sp,sp,0
	ret


	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	"vector x: "
	.size	.Str0, 11

	.type	.Str1,@object           # @.Str1
	.section	.rodata,"a",@progbits
	.globl	.Str1
.Str1:
	.asciz	"excited!"
	.size	.Str1, 9

	.type	.Str2,@object           # @.Str2
	.section	.rodata,"a",@progbits
	.globl	.Str2
.Str2:
	.asciz	"vector y: "
	.size	.Str2, 11

	.type	.Str3,@object           # @.Str3
	.section	.rodata,"a",@progbits
	.globl	.Str3
.Str3:
	.asciz	"x + y: "
	.size	.Str3, 8

	.type	.Str4,@object           # @.Str4
	.section	.rodata,"a",@progbits
	.globl	.Str4
.Str4:
	.asciz	"x * y: "
	.size	.Str4, 8

	.type	.Str5,@object           # @.Str5
	.section	.rodata,"a",@progbits
	.globl	.Str5
.Str5:
	.asciz	"(1 << 3) * y: "
	.size	.Str5, 15

	.type	.Str6,@object           # @.Str6
	.section	.rodata,"a",@progbits
	.globl	.Str6
.Str6:
	.asciz	"( "
	.size	.Str6, 3

	.type	.Str7,@object           # @.Str7
	.section	.rodata,"a",@progbits
	.globl	.Str7
.Str7:
	.asciz	", "
	.size	.Str7, 3

	.type	.Str8,@object           # @.Str8
	.section	.rodata,"a",@progbits
	.globl	.Str8
.Str8:
	.asciz	" )"
	.size	.Str8, 3

