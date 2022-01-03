	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp sp 0
	mv s2 , ra
	j entry0
entry0:
	li s3 , 100
	la s4 , hashsize
	sw s3 , 0(s4)
	mv ra , s2
	addi sp sp 0
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp sp -20
	mv s2 , ra
	sw s2 , 4(sp)
	j entry1
entry1:
	call Init
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li s2 , 100
	li s3 , 32
	mul s3, s2, s3
	li s2 , 32
	add s3, s3, s2
	li s2 , 8
	div s2, s3, s2
	mv a0 , s2
	call malloc
	mv s2 , a0
	mv s4 , s2
	li s2 , 100
	sw s2 , 0(s4)
	li s3 , 4
	li s2 , 1
	mul s3, s3, s2
	add s2, s4, s3
	mv s2 , s2
	mv s2 , s2
	sw s2 , 8(sp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw s3 , 8(sp)
	la s2 , table
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 12(sp)
	beqz zero,ForCond11

ForCond11:
	lw s2 , 12(sp)
	la s3 , hashsize
	lw s3 , 0(s3)
	slt s2, s2, s3
	bnez s2,ForLoop11
	beqz s2,ForFinish11

ForLoop11:
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 12(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s2 , 0(s2)
	li s3 , 0
	sw s3 , 0(s2)
	beqz zero,ForEnd11

ForEnd11:
	lw s2 , 12(sp)
	li s3 , 1
	add s2, s2, s3
	sw s2 , 12(sp)
	beqz zero,ForCond11

ForFinish11:
	li s2 , 0
	sw s2 , 12(sp)
	beqz zero,ForCond21

ForCond21:
	lw s2 , 12(sp)
	li s3 , 1000
	slt s2, s2, s3
	bnez s2,ForLoop21
	beqz s2,ForFinish21

ForLoop21:
	lw s3 , 12(sp)
	lw s2 , 12(sp)
	mv a0 , s3
	mv a1 , s2
	call put
	beqz zero,ForEnd21

ForEnd21:
	lw s2 , 12(sp)
	li s3 , 1
	add s2, s2, s3
	sw s2 , 12(sp)
	beqz zero,ForCond21

ForFinish21:
	li s2 , 0
	sw s2 , 12(sp)
	beqz zero,ForCond31

ForCond31:
	lw s2 , 12(sp)
	li s3 , 1000
	slt s2, s2, s3
	bnez s2,ForLoop31
	beqz s2,ForFinish31

ForLoop31:
	lw s2 , 12(sp)
	mv a0 , s2
	call toString
	mv s3 , a0
	la s2 , .Str0
	mv a0 , s3
	mv a1 , s2
	call _struct_string_AddString
	mv s2 , a0
	sw s2 , 0(sp)
	lw s2 , 12(sp)
	mv a0 , s2
	call get
	mv s2 , a0
	mv a0 , s2
	call toString
	mv s3 , a0
	lw s2 , 0(sp)
	mv a0 , s2
	mv a1 , s3
	call _struct_string_AddString
	mv s2 , a0
	mv a0 , s2
	call println
	beqz zero,ForEnd31

ForEnd31:
	lw s2 , 12(sp)
	li s3 , 1
	add s2, s2, s3
	sw s2 , 12(sp)
	beqz zero,ForCond31

ForFinish31:
	li s2 , 0
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	mv a0 , s2
	lw s2 , 4(sp)
	mv ra , s2
	addi sp sp 20
	ret


    .globl  getHash
    .p2align    2
getHash:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp -8
	mv s2 , ra
	j entry2
entry2:
	lw s4 , 4(sp)
	li s3 , 237
	mul s4, s4, s3
	la s3 , hashsize
	lw s3 , 0(s3)
	rem s3, s4, s3
	sw s3 , 0(sp)
	lw s3 , 0(sp)
	mv a0 , s3
	mv ra , s2
	addi sp sp 8
	ret


    .globl  put
    .p2align    2
put:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp sp -36
	mv s2 , ra
	sw s2 , 16(sp)
	j entry3
entry3:
	li s2 , 0
	sw s2 , 20(sp)
	lw s2 , 32(sp)
	mv a0 , s2
	call getHash
	mv s2 , a0
	sw s2 , 24(sp)
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 24(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s3 , 0(s2)
	li s2 , 0
	xor s2, s3, s2
	seqz s2 , s2
	bnez s2,IFTrue13
	beqz s2,IFFalse13

IFTrue13:
	la s3 , table
	lw s3 , 0(s3)
	lw s4 , 24(sp)
	li s2 , 4
	mul s2, s2, s4
	add s2, s3, s2
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	lw s2 , 0(s2)
	li a0 , 12
	call malloc
	mv s2 , a0
	mv s2 , s2
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	mv a0 , s2
	call _struct_node_node
	lw s2 , 12(sp)
	lw s3 , 8(sp)
	sw s3 , 0(s2)
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 24(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s2 , 0(s2)
	addi s3, s2, 0
	lw s2 , 0(s3)
	lw s2 , 32(sp)
	sw s2 , 0(s3)
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 24(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s2 , 0(s2)
	addi s3, s2, 4
	lw s2 , 0(s3)
	lw s2 , 28(sp)
	sw s2 , 0(s3)
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 24(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s2 , 0(s2)
	addi s3, s2, 8
	lw s2 , 0(s3)
	li s2 , 0
	sw s2 , 0(s3)
	lw s2 , 16(sp)
	mv ra , s2
	addi sp sp 36
	ret

IFFalse13:
	beqz zero,IFFinish13

IFFinish13:
	la s4 , table
	lw s4 , 0(s4)
	lw s3 , 24(sp)
	li s2 , 4
	mul s2, s2, s3
	add s2, s4, s2
	lw s2 , 0(s2)
	sw s2 , 20(sp)
	beqz zero,ForCond43

ForCond43:
	lw s2 , 20(sp)
	addi s2, s2, 0
	lw s3 , 0(s2)
	lw s2 , 32(sp)
	xor s2, s3, s2
	snez s2 , s2
	bnez s2,ForLoop43
	beqz s2,ForFinish43

ForLoop43:
	lw s2 , 20(sp)
	addi s2, s2, 8
	lw s3 , 0(s2)
	li s2 , 0
	xor s2, s3, s2
	seqz s2 , s2
	bnez s2,IFTrue23
	beqz s2,IFFalse23

IFTrue23:
	lw s2 , 20(sp)
	addi s2, s2, 8
	sw s2 , 4(sp)
	lw s2 , 4(sp)
	lw s2 , 0(s2)
	li a0 , 12
	call malloc
	mv s2 , a0
	mv s2 , s2
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	call _struct_node_node
	lw s2 , 4(sp)
	lw s3 , 0(sp)
	sw s3 , 0(s2)
	lw s2 , 20(sp)
	addi s2, s2, 8
	lw s2 , 0(s2)
	addi s3, s2, 0
	lw s2 , 0(s3)
	lw s2 , 32(sp)
	sw s2 , 0(s3)
	lw s2 , 20(sp)
	addi s2, s2, 8
	lw s2 , 0(s2)
	addi s2, s2, 8
	lw s2 , 0(s2)
	li s3 , 0
	sw s3 , 0(s2)
	beqz zero,IFFinish23

IFFalse23:
	beqz zero,IFFinish23

IFFinish23:
	lw s2 , 20(sp)
	addi s2, s2, 8
	lw s2 , 0(s2)
	sw s2 , 20(sp)
	beqz zero,ForEnd43

ForEnd43:
	beqz zero,ForCond43

ForFinish43:
	lw s2 , 20(sp)
	addi s3, s2, 4
	lw s2 , 0(s3)
	lw s2 , 28(sp)
	sw s2 , 0(s3)
	lw s2 , 16(sp)
	mv ra , s2
	addi sp sp 36
	ret


    .globl  get
    .p2align    2
get:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp -20
	mv s2 , ra
	sw s2 , 4(sp)
	j entry4
entry4:
	li s2 , 0
	sw s2 , 8(sp)
	la s2 , table
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	lw s2 , 0(s2)
	sw s2 , 0(sp)
	lw s2 , 16(sp)
	mv a0 , s2
	call getHash
	mv s3 , a0
	li s2 , 4
	mul s2, s2, s3
	lw s3 , 0(sp)
	add s2, s3, s2
	lw s2 , 0(s2)
	sw s2 , 8(sp)
	beqz zero,ForCond54

ForCond54:
	lw s2 , 8(sp)
	addi s2, s2, 0
	lw s3 , 0(s2)
	lw s2 , 16(sp)
	xor s2, s3, s2
	snez s2 , s2
	bnez s2,ForLoop54
	beqz s2,ForFinish54

ForLoop54:
	lw s2 , 8(sp)
	addi s2, s2, 8
	lw s2 , 0(s2)
	sw s2 , 8(sp)
	beqz zero,ForEnd54

ForEnd54:
	beqz zero,ForCond54

ForFinish54:
	lw s2 , 8(sp)
	addi s2, s2, 4
	lw s2 , 0(s2)
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	mv a0 , s2
	lw s2 , 4(sp)
	mv ra , s2
	addi sp sp 20
	ret


    .globl  _struct_node_node
    .p2align    2
_struct_node_node:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp sp -4
	mv s2 , ra
	j entry5
entry5:
	mv ra , s2
	addi sp sp 4
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

