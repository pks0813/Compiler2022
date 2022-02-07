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
	addi sp,sp,-8
	mv s2 , ra
	sw s2 , 4(sp)
	j entry1
entry1:
	call Init
	li s2 , 10
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv s3 , s2
	li s2 , 10
	add s2, s2, s3
	mv s2 , s2
	sw s2 , 0(sp)
	li a0 , 0
	lw s2 , 4(sp)
	mv ra , s2
	addi sp,sp,8
	ret


