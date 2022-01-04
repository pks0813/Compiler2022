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
	addi sp,sp,-48
	mv s2 , ra
	sw s2 , 32(sp)
	j entry1
entry1:
	call Init
	li s2 , 6
	sw s2 , 28(sp)
	lw s2 , 28(sp)
	sw s2 , 40(sp)
	li s2 , 7
	sw s2 , 24(sp)
	lw s2 , 24(sp)
	sw s2 , 36(sp)
	lw s2 , 40(sp)
	sw s2 , 20(sp)
	lw s2 , 36(sp)
	sw s2 , 16(sp)
	lw s3 , 20(sp)
	lw s2 , 16(sp)
	add s2, s3, s2
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	sw s2 , 40(sp)
	lw s2 , 40(sp)
	sw s2 , 8(sp)
	lw s2 , 36(sp)
	sw s2 , 4(sp)
	lw s3 , 8(sp)
	lw s2 , 4(sp)
	sub s2, s3, s2
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	call printlnInt
	li a0 , 0
	lw s2 , 32(sp)
	mv ra , s2
	addi sp,sp,48
	ret


