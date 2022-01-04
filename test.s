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
	li s2 , 6
	sw s2 , 8(sp)
	li s2 , 7
	sw s2 , 4(sp)
	lw s3 , 8(sp)
	lw s2 , 4(sp)
	add s2, s3, s2
	sw s2 , 8(sp)
	lw s3 , 8(sp)
	lw s2 , 4(sp)
	sub s2, s3, s2
	mv a0 , s2
	call printlnInt
	li a0 , 0
	lw s2 , 0(sp)
	mv ra , s2
	addi sp,sp,16
	ret


