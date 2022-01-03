	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv %raAddr , ra
	j entry0
entry0:
	li %NewRegist0 , 0
	la %NewRegist1 , M
	sw %NewRegist0 , 0(%NewRegist1)
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
	call getInt
	mv %0 , a0
	la %NewRegist0 , N
	sw %0 , 0(%NewRegist0)
	la %1 , N
	lw %1 , 0(%1)
	li %NewRegist1 , 5
	add %2, %1, %NewRegist1
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li %NewRegist2 , 32
	mul %3, %2, %NewRegist2
	li %NewRegist3 , 32
	add %4, %3, %NewRegist3
	li %NewRegist4 , 8
	div %5, %4, %NewRegist4
	mv a0 , %5
	call malloc
	mv %6 , a0
	mv %7 , %6
	sw %2 , 0(%7)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %8, %7, %NewRegist5
	mv %9 , %8
	mv %10 , %9
	sw %10 , -8(Initialsp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw %11 , -8(Initialsp)
	la %NewRegist7 , check
	sw %11 , 0(%NewRegist7)
	li %NewRegist8 , 0
	sw %NewRegist8 , -12(Initialsp)
	beqz zero,ForCond11

ForCond11:
	lw %12 , -12(Initialsp)
	la %13 , N
	lw %13 , 0(%13)
	slt %14, %13, %12
	xori %14, %14, 1
	bnez %14,ForLoop11
	beqz %14,ForFinish11

ForLoop11:
	la %15 , check
	lw %15 , 0(%15)
	lw %16 , -12(Initialsp)
	li %NewRegist9 , 1
	add %17, %16, %NewRegist9
	sw %17 , -12(Initialsp)
	li %NewRegist10 , 4
	mul %NewRegist10, %NewRegist10, %16
	add %18, %15, %NewRegist10
	lw %19 , 0(%18)
	li %NewRegist11 , 1
	sw %NewRegist11 , 0(%18)
	beqz zero,ForEnd11

ForEnd11:
	beqz zero,ForCond11

ForFinish11:
	la %20 , N
	lw %20 , 0(%20)
	li %NewRegist12 , 5
	add %21, %20, %NewRegist12
	beqz zero,newExpr1.dep0.Initial1

newExpr1.dep0.Initial1:
	li %NewRegist13 , 32
	mul %22, %21, %NewRegist13
	li %NewRegist14 , 32
	add %23, %22, %NewRegist14
	li %NewRegist15 , 8
	div %24, %23, %NewRegist15
	mv a0 , %24
	call malloc
	mv %25 , a0
	mv %26 , %25
	sw %21 , 0(%26)
	li %NewRegist16 , 4
	li %NewRegist17 , 1
	mul %NewRegist16, %NewRegist16, %NewRegist17
	add %27, %26, %NewRegist16
	mv %28 , %27
	mv %29 , %28
	sw %29 , -16(Initialsp)
	beqz zero,newExpr1.Finish1

newExpr1.Finish1:
	lw %30 , -16(Initialsp)
	sw %30 , -20(Initialsp)
	la %31 , N
	lw %31 , 0(%31)
	li %NewRegist18 , 5
	add %32, %31, %NewRegist18
	beqz zero,newExpr2.dep0.Initial1

newExpr2.dep0.Initial1:
	li %NewRegist19 , 32
	mul %33, %32, %NewRegist19
	li %NewRegist20 , 32
	add %34, %33, %NewRegist20
	li %NewRegist21 , 8
	div %35, %34, %NewRegist21
	mv a0 , %35
	call malloc
	mv %36 , a0
	mv %37 , %36
	sw %32 , 0(%37)
	li %NewRegist22 , 4
	li %NewRegist23 , 1
	mul %NewRegist22, %NewRegist22, %NewRegist23
	add %38, %37, %NewRegist22
	mv %39 , %38
	mv %40 , %39
	sw %40 , -24(Initialsp)
	beqz zero,newExpr2.Finish1

newExpr2.Finish1:
	lw %41 , -24(Initialsp)
	sw %41 , -28(Initialsp)
	lw %42 , -20(Initialsp)
	li %NewRegist24 , 4
	li %NewRegist25 , 1
	mul %NewRegist24, %NewRegist24, %NewRegist25
	add %43, %42, %NewRegist24
	lw %44 , 0(%43)
	li %NewRegist26 , 1
	sw %NewRegist26 , 0(%43)
	li %NewRegist27 , 2
	sw %NewRegist27 , -12(Initialsp)
	beqz zero,ForCond21

ForCond21:
	beqz zero,ForLoop21

ForLoop21:
	lw %45 , -12(Initialsp)
	la %46 , N
	lw %46 , 0(%46)
	slt %47, %46, %45
	bnez %47,IFTrue11
	beqz %47,IFFalse11

IFTrue11:
	beqz zero,ForFinish21

IFFalse11:
	beqz zero,IFFinish11

IFFinish11:
	la %48 , check
	lw %48 , 0(%48)
	lw %49 , -12(Initialsp)
	li %NewRegist28 , 4
	mul %NewRegist28, %NewRegist28, %49
	add %50, %48, %NewRegist28
	lw %51 , 0(%50)
	bnez %51,IFTrue21
	beqz %51,IFFalse21

IFTrue21:
	lw %52 , -28(Initialsp)
	la %53 , M
	lw %53 , 0(%53)
	li %NewRegist29 , 1
	add %54, %53, %NewRegist29
	la %NewRegist30 , M
	sw %54 , 0(%NewRegist30)
	li %NewRegist31 , 4
	mul %NewRegist31, %NewRegist31, %54
	add %55, %52, %NewRegist31
	lw %56 , 0(%55)
	lw %57 , -12(Initialsp)
	sw %57 , 0(%55)
	lw %58 , -20(Initialsp)
	lw %59 , -12(Initialsp)
	li %NewRegist32 , 4
	mul %NewRegist32, %NewRegist32, %59
	add %60, %58, %NewRegist32
	lw %61 , 0(%60)
	lw %62 , -12(Initialsp)
	li %NewRegist33 , 1
	sub %63, %62, %NewRegist33
	sw %63 , 0(%60)
	beqz zero,IFFinish21

IFFalse21:
	beqz zero,IFFinish21

IFFinish21:
	lw %64 , -12(Initialsp)
	sw %64 , -32(Initialsp)
	li %NewRegist34 , 1
	sw %NewRegist34 , -36(Initialsp)
	beqz zero,ForCond31

ForCond31:
	lw %65 , -36(Initialsp)
	la %66 , M
	lw %66 , 0(%66)
	slt %67, %66, %65
	xori %67, %67, 1
	sw %67 , -40(Initialsp)
	bnez %67,Binary0.Right1
	beqz %67,Binary0.Finish1

Binary0.Right1:
	lw %68 , -32(Initialsp)
	lw %69 , -28(Initialsp)
	lw %70 , -36(Initialsp)
	li %NewRegist35 , 4
	mul %NewRegist35, %NewRegist35, %70
	add %71, %69, %NewRegist35
	lw %72 , 0(%71)
	mul %73, %68, %72
	la %74 , N
	lw %74 , 0(%74)
	slt %75, %74, %73
	xori %75, %75, 1
	sw %75 , -40(Initialsp)
	beqz zero,Binary0.Finish1

Binary0.Finish1:
	lw %76 , -40(Initialsp)
	bnez %76,ForLoop31
	beqz %76,ForFinish31

ForLoop31:
	lw %77 , -32(Initialsp)
	lw %78 , -28(Initialsp)
	lw %79 , -36(Initialsp)
	li %NewRegist36 , 4
	mul %NewRegist36, %NewRegist36, %79
	add %80, %78, %NewRegist36
	lw %81 , 0(%80)
	mul %82, %77, %81
	sw %82 , -44(Initialsp)
	lw %83 , -44(Initialsp)
	la %84 , N
	lw %84 , 0(%84)
	slt %85, %84, %83
	bnez %85,IFTrue31
	beqz %85,IFFalse31

IFTrue31:
	beqz zero,ForEnd31

IFFalse31:
	beqz zero,IFFinish31

IFFinish31:
	la %86 , check
	lw %86 , 0(%86)
	lw %87 , -44(Initialsp)
	li %NewRegist37 , 4
	mul %NewRegist37, %NewRegist37, %87
	add %88, %86, %NewRegist37
	lw %89 , 0(%88)
	li %NewRegist38 , 0
	sw %NewRegist38 , 0(%88)
	lw %90 , -32(Initialsp)
	lw %91 , -28(Initialsp)
	lw %92 , -36(Initialsp)
	li %NewRegist39 , 4
	mul %NewRegist39, %NewRegist39, %92
	add %93, %91, %NewRegist39
	lw %94 , 0(%93)
	rem %95, %90, %94
	li %NewRegist40 , 0
	xor %96, %95, %NewRegist40
	seqz %96 , %96
	bnez %96,IFTrue41
	beqz %96,IFFalse41

IFTrue41:
	lw %97 , -20(Initialsp)
	lw %98 , -44(Initialsp)
	li %NewRegist41 , 4
	mul %NewRegist41, %NewRegist41, %98
	add %99, %97, %NewRegist41
	lw %100 , 0(%99)
	lw %101 , -20(Initialsp)
	lw %102 , -32(Initialsp)
	li %NewRegist42 , 4
	mul %NewRegist42, %NewRegist42, %102
	add %103, %101, %NewRegist42
	lw %104 , 0(%103)
	lw %105 , -28(Initialsp)
	lw %106 , -36(Initialsp)
	li %NewRegist43 , 4
	mul %NewRegist43, %NewRegist43, %106
	add %107, %105, %NewRegist43
	lw %108 , 0(%107)
	mul %109, %104, %108
	sw %109 , 0(%99)
	beqz zero,ForFinish31

IFFalse41:
	lw %110 , -20(Initialsp)
	lw %111 , -32(Initialsp)
	lw %112 , -28(Initialsp)
	lw %113 , -36(Initialsp)
	li %NewRegist44 , 4
	mul %NewRegist44, %NewRegist44, %113
	add %114, %112, %NewRegist44
	lw %115 , 0(%114)
	mul %116, %111, %115
	li %NewRegist45 , 4
	mul %NewRegist45, %NewRegist45, %116
	add %117, %110, %NewRegist45
	lw %118 , 0(%117)
	lw %119 , -20(Initialsp)
	lw %120 , -32(Initialsp)
	li %NewRegist46 , 4
	mul %NewRegist46, %NewRegist46, %120
	add %121, %119, %NewRegist46
	lw %122 , 0(%121)
	lw %123 , -28(Initialsp)
	lw %124 , -36(Initialsp)
	li %NewRegist47 , 4
	mul %NewRegist47, %NewRegist47, %124
	add %125, %123, %NewRegist47
	lw %126 , 0(%125)
	li %NewRegist48 , 1
	sub %127, %126, %NewRegist48
	mul %128, %122, %127
	sw %128 , 0(%117)
	beqz zero,IFFinish41

IFFinish41:
	beqz zero,ForEnd31

ForEnd31:
	lw %129 , -36(Initialsp)
	li %NewRegist49 , 1
	add %130, %129, %NewRegist49
	sw %130 , -36(Initialsp)
	beqz zero,ForCond31

ForFinish31:
	lw %131 , -20(Initialsp)
	lw %132 , -32(Initialsp)
	li %NewRegist50 , 4
	mul %NewRegist50, %NewRegist50, %132
	add %133, %131, %NewRegist50
	lw %134 , 0(%133)
	mv a0 , %134
	call toString
	mv %135 , a0
	mv a0 , %135
	call println
	beqz zero,ForEnd21

ForEnd21:
	lw %136 , -12(Initialsp)
	li %NewRegist51 , 1
	add %137, %136, %NewRegist51
	sw %137 , -12(Initialsp)
	beqz zero,ForCond21

ForFinish21:
	li %NewRegist52 , 0
	sw %NewRegist52 , -4(Initialsp)
	lw %138 , -4(Initialsp)
	mv a0 , %138
	mv ra , %raAddr
	addi sp,sp,0
	ret


	.type	N,@object             # @N
	.section	.sbss,"aw",@nobits
	.globl	N
	.p2align	2
N:
	.word	0
	.size	N, 4

	.type	M,@object             # @M
	.section	.sbss,"aw",@nobits
	.globl	M
	.p2align	2
M:
	.word	0
	.size	M, 4

	.type	check,@object             # @check
	.section	.sbss,"aw",@nobits
	.globl	check
	.p2align	2
check:
	.word	0
	.size	check, 4

