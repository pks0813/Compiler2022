	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv %raAddr , ra
	j entry0
entry0:
	beqz zero,newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li %NewRegist0 , 4
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
	li %NewRegist4 , 4
	sw %NewRegist4 , 0(%4)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %5, %4, %NewRegist5
	mv %6 , %5
	mv %7 , %6
	sw %7 , -4(Initialsp)
	beqz zero,newExpr0.Finish0

newExpr0.Finish0:
	lw %8 , -4(Initialsp)
	la %NewRegist7 , a
	sw %8 , 0(%NewRegist7)
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
	beqz zero,newExpr1.dep0.Initial1

newExpr1.dep0.Initial1:
	li %NewRegist0 , 4
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
	li %NewRegist4 , 4
	sw %NewRegist4 , 0(%4)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %5, %4, %NewRegist5
	mv %6 , %5
	mv %7 , %6
	sw %7 , -8(Initialsp)
	beqz zero,newExpr1.Finish1

newExpr1.Finish1:
	lw %8 , -8(Initialsp)
	sw %8 , -12(Initialsp)
	lw %9 , -12(Initialsp)
	li %NewRegist7 , 4
	li %NewRegist8 , 0
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %10, %9, %NewRegist7
	lw %11 , 0(%10)
	la %12 , a
	lw %12 , 0(%12)
	sw %12 , 0(%10)
	lw %13 , -12(Initialsp)
	li %NewRegist9 , 4
	li %NewRegist10 , 1
	mul %NewRegist9, %NewRegist9, %NewRegist10
	add %14, %13, %NewRegist9
	lw %15 , 0(%14)
	la %16 , a
	lw %16 , 0(%16)
	sw %16 , 0(%14)
	lw %17 , -12(Initialsp)
	li %NewRegist11 , 4
	li %NewRegist12 , 2
	mul %NewRegist11, %NewRegist11, %NewRegist12
	add %18, %17, %NewRegist11
	lw %19 , 0(%18)
	la %20 , a
	lw %20 , 0(%20)
	sw %20 , 0(%18)
	lw %21 , -12(Initialsp)
	li %NewRegist13 , 4
	li %NewRegist14 , 3
	mul %NewRegist13, %NewRegist13, %NewRegist14
	add %22, %21, %NewRegist13
	lw %23 , 0(%22)
	la %24 , a
	lw %24 , 0(%24)
	sw %24 , 0(%22)
	lw %25 , -12(Initialsp)
	mv %26 , %25
	li %NewRegist15 , 4
	li %NewRegist16 , -1
	mul %NewRegist15, %NewRegist15, %NewRegist16
	add %27, %26, %NewRegist15
	lw %28 , 0(%27)
	mv a0 , %28
	call toString
	mv %29 , a0
	mv a0 , %29
	call println
	li %NewRegist17 , 0
	sw %NewRegist17 , -16(Initialsp)
	beqz zero,ForCond11

ForCond11:
	lw %30 , -16(Initialsp)
	lw %31 , -12(Initialsp)
	li %NewRegist18 , 4
	li %NewRegist19 , 0
	mul %NewRegist18, %NewRegist18, %NewRegist19
	add %32, %31, %NewRegist18
	lw %33 , 0(%32)
	mv %34 , %33
	li %NewRegist20 , 4
	li %NewRegist21 , -1
	mul %NewRegist20, %NewRegist20, %NewRegist21
	add %35, %34, %NewRegist20
	lw %36 , 0(%35)
	slt %37, %30, %36
	bnez %37,ForLoop11
	beqz %37,ForFinish11

ForLoop11:
	lw %38 , -12(Initialsp)
	li %NewRegist22 , 4
	li %NewRegist23 , 0
	mul %NewRegist22, %NewRegist22, %NewRegist23
	add %39, %38, %NewRegist22
	lw %40 , 0(%39)
	lw %41 , -16(Initialsp)
	li %NewRegist24 , 4
	mul %NewRegist24, %NewRegist24, %41
	add %42, %40, %NewRegist24
	lw %43 , 0(%42)
	call getInt
	mv %44 , a0
	sw %44 , 0(%42)
	beqz zero,ForEnd11

ForEnd11:
	lw %45 , -16(Initialsp)
	li %NewRegist25 , 1
	add %46, %45, %NewRegist25
	sw %46 , -16(Initialsp)
	beqz zero,ForCond11

ForFinish11:
	li %NewRegist26 , 0
	sw %NewRegist26 , -16(Initialsp)
	beqz zero,ForCond21

ForCond21:
	lw %47 , -16(Initialsp)
	lw %48 , -12(Initialsp)
	li %NewRegist27 , 4
	li %NewRegist28 , 1
	mul %NewRegist27, %NewRegist27, %NewRegist28
	add %49, %48, %NewRegist27
	lw %50 , 0(%49)
	mv %51 , %50
	li %NewRegist29 , 4
	li %NewRegist30 , -1
	mul %NewRegist29, %NewRegist29, %NewRegist30
	add %52, %51, %NewRegist29
	lw %53 , 0(%52)
	slt %54, %47, %53
	bnez %54,ForLoop21
	beqz %54,ForFinish21

ForLoop21:
	lw %55 , -12(Initialsp)
	li %NewRegist31 , 4
	li %NewRegist32 , 1
	mul %NewRegist31, %NewRegist31, %NewRegist32
	add %56, %55, %NewRegist31
	lw %57 , 0(%56)
	lw %58 , -16(Initialsp)
	li %NewRegist33 , 4
	mul %NewRegist33, %NewRegist33, %58
	add %59, %57, %NewRegist33
	lw %60 , 0(%59)
	mv a0 , %60
	call toString
	mv %61 , a0
	mv a0 , %61
	call print
	beqz zero,ForEnd21

ForEnd21:
	lw %62 , -16(Initialsp)
	li %NewRegist34 , 1
	add %63, %62, %NewRegist34
	sw %63 , -16(Initialsp)
	beqz zero,ForCond21

ForFinish21:
	la %64 , .Str0
	mv a0 , %64
	call println
	li %NewRegist35 , 0
	sw %NewRegist35 , -16(Initialsp)
	beqz zero,ForCond31

ForCond31:
	lw %65 , -16(Initialsp)
	lw %66 , -12(Initialsp)
	li %NewRegist36 , 4
	li %NewRegist37 , 2
	mul %NewRegist36, %NewRegist36, %NewRegist37
	add %67, %66, %NewRegist36
	lw %68 , 0(%67)
	mv %69 , %68
	li %NewRegist38 , 4
	li %NewRegist39 , -1
	mul %NewRegist38, %NewRegist38, %NewRegist39
	add %70, %69, %NewRegist38
	lw %71 , 0(%70)
	slt %72, %65, %71
	bnez %72,ForLoop31
	beqz %72,ForFinish31

ForLoop31:
	lw %73 , -12(Initialsp)
	li %NewRegist40 , 4
	li %NewRegist41 , 2
	mul %NewRegist40, %NewRegist40, %NewRegist41
	add %74, %73, %NewRegist40
	lw %75 , 0(%74)
	lw %76 , -16(Initialsp)
	li %NewRegist42 , 4
	mul %NewRegist42, %NewRegist42, %76
	add %77, %75, %NewRegist42
	lw %78 , 0(%77)
	li %NewRegist43 , 0
	sw %NewRegist43 , 0(%77)
	beqz zero,ForEnd31

ForEnd31:
	lw %79 , -16(Initialsp)
	li %NewRegist44 , 1
	add %80, %79, %NewRegist44
	sw %80 , -16(Initialsp)
	beqz zero,ForCond31

ForFinish31:
	li %NewRegist45 , 0
	sw %NewRegist45 , -16(Initialsp)
	beqz zero,ForCond41

ForCond41:
	lw %81 , -16(Initialsp)
	lw %82 , -12(Initialsp)
	li %NewRegist46 , 4
	li %NewRegist47 , 3
	mul %NewRegist46, %NewRegist46, %NewRegist47
	add %83, %82, %NewRegist46
	lw %84 , 0(%83)
	mv %85 , %84
	li %NewRegist48 , 4
	li %NewRegist49 , -1
	mul %NewRegist48, %NewRegist48, %NewRegist49
	add %86, %85, %NewRegist48
	lw %87 , 0(%86)
	slt %88, %81, %87
	bnez %88,ForLoop41
	beqz %88,ForFinish41

ForLoop41:
	lw %89 , -12(Initialsp)
	li %NewRegist50 , 4
	li %NewRegist51 , 3
	mul %NewRegist50, %NewRegist50, %NewRegist51
	add %90, %89, %NewRegist50
	lw %91 , 0(%90)
	lw %92 , -16(Initialsp)
	li %NewRegist52 , 4
	mul %NewRegist52, %NewRegist52, %92
	add %93, %91, %NewRegist52
	lw %94 , 0(%93)
	mv a0 , %94
	call toString
	mv %95 , a0
	mv a0 , %95
	call print
	beqz zero,ForEnd41

ForEnd41:
	lw %96 , -16(Initialsp)
	li %NewRegist53 , 1
	add %97, %96, %NewRegist53
	sw %97 , -16(Initialsp)
	beqz zero,ForCond41

ForFinish41:
	li %NewRegist54 , 0
	sw %NewRegist54 , -4(Initialsp)
	lw %98 , -4(Initialsp)
	mv a0 , %98
	mv ra , %raAddr
	addi sp,sp,0
	ret


	.type	a,@object             # @a
	.section	.sbss,"aw",@nobits
	.globl	a
	.p2align	2
a:
	.word	0
	.size	a, 4

	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	""
	.size	.Str0, 1

