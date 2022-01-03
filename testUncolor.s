	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp sp 0
	mv %raAddr , ra
	j entry0
entry0:
	li %NewRegist0 , 100
	la %NewRegist1 , hashsize
	sw %NewRegist0 , 0(%NewRegist1)
	mv ra , %raAddr
	addi sp sp 0
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp sp 0
	mv %raAddr , ra
	j entry1
entry1:
	call Init
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li %NewRegist0 , 100
	li %NewRegist1 , 32
	mul %0, %NewRegist0, %NewRegist1
	li %NewRegist2 , 32
	add %1, %0, %NewRegist2
	li %NewRegist3 , 8
	div %2, %1, %NewRegist3
	mv a0 , %2
	call malloc
	mv %3 , a0
	mv %4 , %3
	li %NewRegist4 , 100
	sw %NewRegist4 , 0(%4)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %5, %4, %NewRegist5
	mv %6 , %5
	mv %7 , %6
	sw %7 , -12(Initialsp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw %8 , -12(Initialsp)
	la %NewRegist7 , table
	sw %8 , 0(%NewRegist7)
	li %NewRegist8 , 0
	sw %NewRegist8 , -8(Initialsp)
	beqz zero,ForCond11

ForCond11:
	lw %9 , -8(Initialsp)
	la %10 , hashsize
	lw %10 , 0(%10)
	slt %11, %9, %10
	bnez %11,ForLoop11
	beqz %11,ForFinish11

ForLoop11:
	la %12 , table
	lw %12 , 0(%12)
	lw %13 , -8(Initialsp)
	li %NewRegist9 , 4
	mul %NewRegist9, %NewRegist9, %13
	add %14, %12, %NewRegist9
	lw %15 , 0(%14)
	li %NewRegist10 , 0
	sw %NewRegist10 , 0(%14)
	beqz zero,ForEnd11

ForEnd11:
	lw %16 , -8(Initialsp)
	li %NewRegist11 , 1
	add %17, %16, %NewRegist11
	sw %17 , -8(Initialsp)
	beqz zero,ForCond11

ForFinish11:
	li %NewRegist12 , 0
	sw %NewRegist12 , -8(Initialsp)
	beqz zero,ForCond21

ForCond21:
	lw %18 , -8(Initialsp)
	li %NewRegist13 , 1000
	slt %19, %18, %NewRegist13
	bnez %19,ForLoop21
	beqz %19,ForFinish21

ForLoop21:
	lw %20 , -8(Initialsp)
	lw %21 , -8(Initialsp)
	mv a0 , %20
	mv a1 , %21
	call put
	beqz zero,ForEnd21

ForEnd21:
	lw %22 , -8(Initialsp)
	li %NewRegist14 , 1
	add %23, %22, %NewRegist14
	sw %23 , -8(Initialsp)
	beqz zero,ForCond21

ForFinish21:
	li %NewRegist15 , 0
	sw %NewRegist15 , -8(Initialsp)
	beqz zero,ForCond31

ForCond31:
	lw %24 , -8(Initialsp)
	li %NewRegist16 , 1000
	slt %25, %24, %NewRegist16
	bnez %25,ForLoop31
	beqz %25,ForFinish31

ForLoop31:
	lw %26 , -8(Initialsp)
	mv a0 , %26
	call toString
	mv %27 , a0
	la %28 , .Str0
	mv a0 , %27
	mv a1 , %28
	call _struct_string_AddString
	mv %29 , a0
	lw %30 , -8(Initialsp)
	mv a0 , %30
	call get
	mv %31 , a0
	mv a0 , %31
	call toString
	mv %32 , a0
	mv a0 , %29
	mv a1 , %32
	call _struct_string_AddString
	mv %33 , a0
	mv a0 , %33
	call println
	beqz zero,ForEnd31

ForEnd31:
	lw %34 , -8(Initialsp)
	li %NewRegist17 , 1
	add %35, %34, %NewRegist17
	sw %35 , -8(Initialsp)
	beqz zero,ForCond31

ForFinish31:
	li %NewRegist18 , 0
	sw %NewRegist18 , -4(Initialsp)
	lw %36 , -4(Initialsp)
	mv a0 , %36
	mv ra , %raAddr
	addi sp sp 0
	ret


    .globl  getHash
    .p2align    2
getHash:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp 0
	mv %raAddr , ra
	j entry2
entry2:
	lw %1 , -4(Initialsp)
	li %NewRegist0 , 237
	mul %2, %1, %NewRegist0
	la %3 , hashsize
	lw %3 , 0(%3)
	rem %4, %2, %3
	sw %4 , -8(Initialsp)
	lw %5 , -8(Initialsp)
	mv a0 , %5
	mv ra , %raAddr
	addi sp sp 0
	ret


    .globl  put
    .p2align    2
put:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp sp 0
	mv %raAddr , ra
	j entry3
entry3:
	li %NewRegist0 , 0
	sw %NewRegist0 , -16(Initialsp)
	lw %2 , -4(Initialsp)
	mv a0 , %2
	call getHash
	mv %3 , a0
	sw %3 , -12(Initialsp)
	la %4 , table
	lw %4 , 0(%4)
	lw %5 , -12(Initialsp)
	li %NewRegist1 , 4
	mul %NewRegist1, %NewRegist1, %5
	add %6, %4, %NewRegist1
	lw %7 , 0(%6)
	li %NewRegist2 , 0
	xor %8, %7, %NewRegist2
	seqz %8 , %8
	bnez %8,IFTrue13
	beqz %8,IFFalse13

IFTrue13:
	la %9 , table
	lw %9 , 0(%9)
	lw %10 , -12(Initialsp)
	li %NewRegist3 , 4
	mul %NewRegist3, %NewRegist3, %10
	add %11, %9, %NewRegist3
	lw %12 , 0(%11)
	li a0 , 12
	call malloc
	mv %13 , a0
	mv %14 , %13
	mv a0 , %14
	call _struct_node_node
	sw %14 , 0(%11)
	la %15 , table
	lw %15 , 0(%15)
	lw %16 , -12(Initialsp)
	li %NewRegist4 , 4
	mul %NewRegist4, %NewRegist4, %16
	add %17, %15, %NewRegist4
	lw %18 , 0(%17)
	addi %19, %18, 0
	lw %20 , 0(%19)
	lw %21 , -4(Initialsp)
	sw %21 , 0(%19)
	la %22 , table
	lw %22 , 0(%22)
	lw %23 , -12(Initialsp)
	li %NewRegist5 , 4
	mul %NewRegist5, %NewRegist5, %23
	add %24, %22, %NewRegist5
	lw %25 , 0(%24)
	addi %26, %25, 4
	lw %27 , 0(%26)
	lw %28 , -8(Initialsp)
	sw %28 , 0(%26)
	la %29 , table
	lw %29 , 0(%29)
	lw %30 , -12(Initialsp)
	li %NewRegist6 , 4
	mul %NewRegist6, %NewRegist6, %30
	add %31, %29, %NewRegist6
	lw %32 , 0(%31)
	addi %33, %32, 8
	lw %34 , 0(%33)
	li %NewRegist7 , 0
	sw %NewRegist7 , 0(%33)
	mv ra , %raAddr
	addi sp sp 0
	ret

IFFalse13:
	beqz zero,IFFinish13

IFFinish13:
	la %35 , table
	lw %35 , 0(%35)
	lw %36 , -12(Initialsp)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %36
	add %37, %35, %NewRegist8
	lw %38 , 0(%37)
	sw %38 , -16(Initialsp)
	beqz zero,ForCond43

ForCond43:
	lw %39 , -16(Initialsp)
	addi %40, %39, 0
	lw %41 , 0(%40)
	lw %42 , -4(Initialsp)
	xor %43, %41, %42
	snez %43 , %43
	bnez %43,ForLoop43
	beqz %43,ForFinish43

ForLoop43:
	lw %44 , -16(Initialsp)
	addi %45, %44, 8
	lw %46 , 0(%45)
	li %NewRegist9 , 0
	xor %47, %46, %NewRegist9
	seqz %47 , %47
	bnez %47,IFTrue23
	beqz %47,IFFalse23

IFTrue23:
	lw %48 , -16(Initialsp)
	addi %49, %48, 8
	lw %50 , 0(%49)
	li a0 , 12
	call malloc
	mv %51 , a0
	mv %52 , %51
	mv a0 , %52
	call _struct_node_node
	sw %52 , 0(%49)
	lw %53 , -16(Initialsp)
	addi %54, %53, 8
	lw %55 , 0(%54)
	addi %56, %55, 0
	lw %57 , 0(%56)
	lw %58 , -4(Initialsp)
	sw %58 , 0(%56)
	lw %59 , -16(Initialsp)
	addi %60, %59, 8
	lw %61 , 0(%60)
	addi %62, %61, 8
	lw %63 , 0(%62)
	li %NewRegist10 , 0
	sw %NewRegist10 , 0(%62)
	beqz zero,IFFinish23

IFFalse23:
	beqz zero,IFFinish23

IFFinish23:
	lw %64 , -16(Initialsp)
	addi %65, %64, 8
	lw %66 , 0(%65)
	sw %66 , -16(Initialsp)
	beqz zero,ForEnd43

ForEnd43:
	beqz zero,ForCond43

ForFinish43:
	lw %67 , -16(Initialsp)
	addi %68, %67, 4
	lw %69 , 0(%68)
	lw %70 , -8(Initialsp)
	sw %70 , 0(%68)
	mv ra , %raAddr
	addi sp sp 0
	ret


    .globl  get
    .p2align    2
get:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp 0
	mv %raAddr , ra
	j entry4
entry4:
	li %NewRegist0 , 0
	sw %NewRegist0 , -12(Initialsp)
	la %1 , table
	lw %1 , 0(%1)
	lw %2 , -4(Initialsp)
	mv a0 , %2
	call getHash
	mv %3 , a0
	li %NewRegist1 , 4
	mul %NewRegist1, %NewRegist1, %3
	add %4, %1, %NewRegist1
	lw %5 , 0(%4)
	sw %5 , -12(Initialsp)
	beqz zero,ForCond54

ForCond54:
	lw %6 , -12(Initialsp)
	addi %7, %6, 0
	lw %8 , 0(%7)
	lw %9 , -4(Initialsp)
	xor %10, %8, %9
	snez %10 , %10
	bnez %10,ForLoop54
	beqz %10,ForFinish54

ForLoop54:
	lw %11 , -12(Initialsp)
	addi %12, %11, 8
	lw %13 , 0(%12)
	sw %13 , -12(Initialsp)
	beqz zero,ForEnd54

ForEnd54:
	beqz zero,ForCond54

ForFinish54:
	lw %14 , -12(Initialsp)
	addi %15, %14, 4
	lw %16 , 0(%15)
	sw %16 , -8(Initialsp)
	lw %17 , -8(Initialsp)
	mv a0 , %17
	mv ra , %raAddr
	addi sp sp 0
	ret


    .globl  _struct_node_node
    .p2align    2
_struct_node_node:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp 0
	mv %raAddr , ra
	j entry5
entry5:
	mv ra , %raAddr
	addi sp sp 0
	ret


	.type	hashsize,@object             # @hashsize
	.section	.sbss,"aw",@nobits
	.globl	hashsize
	.p2align	2
hashsize:
	.word	0
	.size	hashsize, 4

	.type	table,@object             # @table
	.section	.sbss,"aw",@nobits
	.globl	table
	.p2align	2
table:
	.word	0
	.size	table, 4

	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	" "
	.size	.Str0, 2

