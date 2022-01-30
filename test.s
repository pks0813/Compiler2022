	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv s2 , ra
	j entry0
entry0:
	mv ra , s2
	addi sp,sp,0
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-16
	mv s2 , ra
	sw s2 , 0(sp)
	j entry1
entry1:
	call Init
	j newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li s2 , 10
	li s3 , 32
	mul s2, s2, s3
	li s3 , 32
	add s2, s2, s3
	li s3 , 8
	div s2, s2, s3
	mv a0 , s2
	call malloc
	mv s2 , a0
	mv s2 , s2
	li s3 , 10
	sw s3 , 0(s2)
	li s4 , 4
	li s3 , 1
	mul s4, s4, s3
	add s2, s2, s4
	mv s2 , s2
	mv s2 , s2
	sw s2 , 4(sp)
	j newExpr0.Finish1

newExpr0.Finish1:
	lw s2 , 4(sp)
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	li s4 , 4
	li s3 , 0
	mul s4, s4, s3
	add s2, s2, s4
	lw s2 , 0(s2)
	mv a0 , s2
	call test
	lw s3 , 8(sp)
	li s2 , 4
	li s4 , 0
	mul s2, s2, s4
	add s2, s3, s2
	lw s2 , 0(s2)
	li s4 , 4
	li s3 , 1
	mul s4, s4, s3
	add s2, s2, s4
	lw s2 , 0(s2)
	mv a0 , s2
	call printlnInt
	li a0 , 0
	lw s2 , 0(sp)
	mv ra , s2
	addi sp,sp,16
	ret


    .globl  test
    .p2align    2
test:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-12
	mv s2 , ra
	sw s2 , 0(sp)
	j entry2
entry2:
	j newExpr1.dep0.Initial2

newExpr1.dep0.Initial2:
	li s2 , 5
	li s3 , 32
	mul s3, s2, s3
	li s2 , 32
	add s3, s3, s2
	li s2 , 8
	div s2, s3, s2
	mv a0 , s2
	call malloc
	mv s2 , a0
	mv s3 , s2
	li s2 , 5
	sw s2 , 0(s3)
	li s2 , 4
	li s4 , 1
	mul s2, s2, s4
	add s2, s3, s2
	mv s2 , s2
	mv s2 , s2
	sw s2 , 4(sp)
	j newExpr1.Finish2

newExpr1.Finish2:
	lw s2 , 4(sp)
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	li s4 , 4
	li s3 , 1
	mul s4, s4, s3
	add s3, s2, s4
	lw zero , 0(s3)
	li s2 , 1
	sw s2 , 0(s3)
	lw s2 , 0(sp)
	mv ra , s2
	addi sp,sp,12
	ret


