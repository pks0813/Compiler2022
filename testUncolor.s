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
	li a0 , 18
	li a1 , 12
	li a2 , 6
	call tak
	mv %0 , a0
	mv %alloca0 , %0
	mv %1 , %alloca0
	mv a0 , %1
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  tak
    .p2align    2
tak:
	mv s0 , sp
	addi sp,sp,0
	mv %alloca0 , a0
	mv %alloca1 , a1
	mv %alloca2 , a2
	mv %raAddr , ra
	j entry2
entry2:
	mv %3 , %alloca1
	mv %4 , %alloca0
	slt %5, %3, %4
	bnez %5,IFTrue12
	j IFFalse12

IFTrue12:
	mv %6 , %alloca0
	li %NewRegist0 , 1
	sub %7, %6, %NewRegist0
	mv %8 , %alloca1
	mv %9 , %alloca2
	mv a0 , %7
	mv a1 , %8
	mv a2 , %9
	call tak
	mv %10 , a0
	mv %11 , %alloca1
	li %NewRegist1 , 1
	sub %12, %11, %NewRegist1
	mv %13 , %alloca2
	mv %14 , %alloca0
	mv a0 , %12
	mv a1 , %13
	mv a2 , %14
	call tak
	mv %15 , a0
	mv %16 , %alloca2
	li %NewRegist2 , 1
	sub %17, %16, %NewRegist2
	mv %18 , %alloca0
	mv %19 , %alloca1
	mv a0 , %17
	mv a1 , %18
	mv a2 , %19
	call tak
	mv %20 , a0
	mv a0 , %10
	mv a1 , %15
	mv a2 , %20
	call tak
	mv %21 , a0
	li %NewRegist3 , 1
	add %22, %NewRegist3, %21
	mv %alloca3 , %22
	mv %23 , %alloca3
	mv a0 , %23
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFalse12:
	mv %24 , %alloca2
	mv %alloca3 , %24
	mv %25 , %alloca3
	mv a0 , %25
	mv ra , %raAddr
	addi sp,sp,0
	ret

IFFinish12:
	mv %26 , %alloca3
	mv a0 , %26
	mv ra , %raAddr
	addi sp,sp,0
	ret


