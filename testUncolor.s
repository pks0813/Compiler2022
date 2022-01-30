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
	j newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li %NewRegist0 , 10
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
	li %NewRegist4 , 10
	sw %NewRegist4 , 0(%4)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %5, %4, %NewRegist5
	mv %6 , %5
	mv %7 , %6
	sw %7 , -12(Initialsp)
	j newExpr0.Finish1

newExpr0.Finish1:
	lw %8 , -12(Initialsp)
	sw %8 , -8(Initialsp)
	lw %9 , -8(Initialsp)
	li %NewRegist7 , 4
	li %NewRegist8 , 0
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %10, %9, %NewRegist7
	lw %11 , 0(%10)
	mv a0 , %11
	call test
	lw %12 , -8(Initialsp)
	li %NewRegist9 , 4
	li %NewRegist10 , 0
	mul %NewRegist9, %NewRegist9, %NewRegist10
	add %13, %12, %NewRegist9
	lw %14 , 0(%13)
	li %NewRegist11 , 4
	li %NewRegist12 , 1
	mul %NewRegist11, %NewRegist11, %NewRegist12
	add %15, %14, %NewRegist11
	lw %16 , 0(%15)
	mv a0 , %16
	call printlnInt
	li a0 , 0
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  test
    .p2align    2
test:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry2
entry2:
	j newExpr1.dep0.Initial2

newExpr1.dep0.Initial2:
	li %NewRegist0 , 5
	li %NewRegist1 , 32
	mul %1, %NewRegist0, %NewRegist1
	li %NewRegist2 , 32
	add %2, %1, %NewRegist2
	li %NewRegist3 , 8
	div %3, %2, %NewRegist3
	mv a0 , %3
	call malloc
	mv %4 , a0
	mv %5 , %4
	li %NewRegist4 , 5
	sw %NewRegist4 , 0(%5)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %6, %5, %NewRegist5
	mv %7 , %6
	mv %8 , %7
	sw %8 , -8(Initialsp)
	j newExpr1.Finish2

newExpr1.Finish2:
	lw %9 , -8(Initialsp)
	sw %9 , -4(Initialsp)
	lw %10 , -4(Initialsp)
	li %NewRegist7 , 4
	li %NewRegist8 , 1
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %11, %10, %NewRegist7
	lw %12 , 0(%11)
	li %NewRegist9 , 1
	sw %NewRegist9 , 0(%11)
	mv ra , %raAddr
	addi sp,sp,0
	ret


