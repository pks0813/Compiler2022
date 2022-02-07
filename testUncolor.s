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
	li a0 , 2
	li a1 , 10
	li a2 , 10000
	call qpow
	mv %0 , a0
	mv a0 , %0
	call toString
	mv %1 , a0
	mv a0 , %1
	call println
	li %alloca0 , 0
	mv %2 , %alloca0
	mv a0 , %2
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  qpow
    .p2align    2
qpow:
	mv s0 , sp
	mv %alloca0 , a0
	mv %alloca1 , a1
	mv %alloca2 , a2
	addi sp,sp,0
	mv %raAddr , ra
	j entry2
entry2:
	li %alloca4 , 1
	mv %3 , %alloca0
	mv %alloca5 , %3
	j ForCond12

ForCond12:
	mv %4 , %alloca1
	li %NewRegist0 , 0
	slt %5, %NewRegist0, %4
	bnez %5,ForLoop12
	j ForFinish12

ForLoop12:
	mv %6 , %alloca1
	li %NewRegist1 , 1
	and %7, %6, %NewRegist1
	li %NewRegist2 , 1
	xor %8, %7, %NewRegist2
	seqz %8 , %8
	bnez %8,IFTrue12
	j IFFalse12

IFTrue12:
	mv %9 , %alloca4
	mv %10 , %alloca5
	mul %11, %9, %10
	mv %12 , %alloca2
	rem %13, %11, %12
	mv %alloca4 , %13
	j IFFinish12

IFFalse12:
	j IFFinish12

IFFinish12:
	mv %14 , %alloca5
	mv %15 , %alloca5
	mul %16, %14, %15
	mv %17 , %alloca2
	rem %18, %16, %17
	mv %alloca5 , %18
	mv %19 , %alloca1
	li %NewRegist3 , 2
	div %20, %19, %NewRegist3
	mv %alloca1 , %20
	j ForEnd12

ForEnd12:
	j ForCond12

ForFinish12:
	mv %21 , %alloca4
	mv %alloca3 , %21
	mv %22 , %alloca3
	mv a0 , %22
	mv ra , %raAddr
	addi sp,sp,0
	ret


