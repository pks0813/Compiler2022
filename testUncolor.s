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
	li %alloca1 , 10
	mv %0 , %alloca1
	li %NewRegist0 , 10
	add %1, %NewRegist0, %0
	mv %alloca1 , %1
	li a0 , 0
	mv ra , %raAddr
	addi sp,sp,0
	ret


