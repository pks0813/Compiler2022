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
	li %NewRegist0 , 6
	sw %NewRegist0 , -8(Initialsp)
	li %NewRegist1 , 7
	sw %NewRegist1 , -12(Initialsp)
	lw %0 , -8(Initialsp)
	lw %1 , -12(Initialsp)
	add %2, %0, %1
	sw %2 , -8(Initialsp)
	lw %3 , -8(Initialsp)
	lw %4 , -12(Initialsp)
	sub %5, %3, %4
	mv a0 , %5
	call printlnInt
	li a0 , 0
	mv ra , %raAddr
	addi sp,sp,0
	ret


