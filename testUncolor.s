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
	la %NewRegist1 , ans
	sw %NewRegist0 , 0(%NewRegist1)
	beqz zero,newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li %NewRegist2 , 110
	li %NewRegist3 , 32
	mul %0, %NewRegist2, %NewRegist3
	li %NewRegist4 , 32
	add %1, %0, %NewRegist4
	li %NewRegist5 , 8
	div %2, %1, %NewRegist5
	mv a0 , %2
	call malloc
	mv %3 , a0
	mv %4 , %3
	li %NewRegist6 , 110
	sw %NewRegist6 , 0(%4)
	li %NewRegist7 , 4
	li %NewRegist8 , 1
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %5, %4, %NewRegist7
	mv %6 , %5
	mv %7 , %6
	sw %7 , -4(Initialsp)
	beqz zero,newExpr0.Finish0

newExpr0.Finish0:
	lw %8 , -4(Initialsp)
	la %NewRegist9 , visit
	sw %8 , 0(%NewRegist9)
	beqz zero,newExpr1.dep0.Initial0

newExpr1.dep0.Initial0:
	li %NewRegist10 , 110
	li %NewRegist11 , 32
	mul %9, %NewRegist10, %NewRegist11
	li %NewRegist12 , 32
	add %10, %9, %NewRegist12
	li %NewRegist13 , 8
	div %11, %10, %NewRegist13
	mv a0 , %11
	call malloc
	mv %12 , a0
	mv %13 , %12
	li %NewRegist14 , 110
	sw %NewRegist14 , 0(%13)
	li %NewRegist15 , 4
	li %NewRegist16 , 1
	mul %NewRegist15, %NewRegist15, %NewRegist16
	add %14, %13, %NewRegist15
	mv %15 , %14
	mv %16 , %15
	sw %16 , -8(Initialsp)
	beqz zero,newExpr1.Finish0

newExpr1.Finish0:
	lw %17 , -8(Initialsp)
	la %NewRegist17 , pre
	sw %17 , 0(%NewRegist17)
	beqz zero,newExpr2.dep0.Initial0

newExpr2.dep0.Initial0:
	li %NewRegist18 , 110
	li %NewRegist19 , 32
	mul %18, %NewRegist18, %NewRegist19
	li %NewRegist20 , 32
	add %19, %18, %NewRegist20
	li %NewRegist21 , 8
	div %20, %19, %NewRegist21
	mv a0 , %20
	call malloc
	mv %21 , a0
	mv %22 , %21
	li %NewRegist22 , 110
	sw %NewRegist22 , 0(%22)
	li %NewRegist23 , 4
	li %NewRegist24 , 1
	mul %NewRegist23, %NewRegist23, %NewRegist24
	add %23, %22, %NewRegist23
	mv %24 , %23
	mv %25 , %24
	sw %25 , -12(Initialsp)
	beqz zero,newExpr2.Finish0

newExpr2.Finish0:
	lw %26 , -12(Initialsp)
	la %NewRegist25 , f
	sw %26 , 0(%NewRegist25)
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
	li a0 , 110
	call origin
	li %NewRegist0 , 0
	sw %NewRegist0 , -8(Initialsp)
	li %NewRegist1 , 99
	sw %NewRegist1 , -12(Initialsp)
	li %NewRegist2 , 100
	sw %NewRegist2 , -16(Initialsp)
	li %NewRegist3 , 0
	sw %NewRegist3 , -20(Initialsp)
	lw %0 , -12(Initialsp)
	lw %1 , -16(Initialsp)
	mv a0 , %0
	mv a1 , %1
	call build
	mv %2 , a0
	beqz zero,ForCond11

ForCond11:
	lw %3 , -16(Initialsp)
	lw %4 , -12(Initialsp)
	lw %5 , -20(Initialsp)
	mv a0 , %3
	mv a1 , %4
	mv a2 , %5
	call find
	mv %6 , a0
	li %NewRegist4 , 0
	slt %7, %NewRegist4, %6
	bnez %7,ForLoop11
	beqz %7,ForFinish11

ForLoop11:
	lw %8 , -16(Initialsp)
	mv a0 , %8
	call improve
	mv %9 , a0
	beqz zero,ForEnd11

ForEnd11:
	beqz zero,ForCond11

ForFinish11:
	la %10 , ans
	lw %10 , 0(%10)
	mv a0 , %10
	call toString
	mv %11 , a0
	mv a0 , %11
	call println
	li %NewRegist5 , 0
	sw %NewRegist5 , -4(Initialsp)
	lw %12 , -4(Initialsp)
	mv a0 , %12
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  origin
    .p2align    2
origin:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry2
entry2:
	lw %1 , -4(Initialsp)
	beqz zero,newExpr3.dep0.Initial2

newExpr3.dep0.Initial2:
	li %NewRegist0 , 32
	mul %2, %1, %NewRegist0
	li %NewRegist1 , 32
	add %3, %2, %NewRegist1
	li %NewRegist2 , 8
	div %4, %3, %NewRegist2
	mv a0 , %4
	call malloc
	mv %5 , a0
	mv %6 , %5
	sw %1 , 0(%6)
	li %NewRegist3 , 4
	li %NewRegist4 , 1
	mul %NewRegist3, %NewRegist3, %NewRegist4
	add %7, %6, %NewRegist3
	mv %8 , %7
	mv %9 , %8
	sw %9 , -8(Initialsp)
	beqz zero,newExpr3.Finish2

newExpr3.Finish2:
	lw %10 , -8(Initialsp)
	la %NewRegist5 , c
	sw %10 , 0(%NewRegist5)
	li %NewRegist6 , 0
	la %NewRegist7 , i
	sw %NewRegist6 , 0(%NewRegist7)
	beqz zero,ForCond22

ForCond22:
	la %11 , i
	lw %11 , 0(%11)
	lw %12 , -4(Initialsp)
	slt %13, %11, %12
	bnez %13,ForLoop22
	beqz %13,ForFinish22

ForLoop22:
	la %14 , c
	lw %14 , 0(%14)
	la %15 , i
	lw %15 , 0(%15)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %15
	add %16, %14, %NewRegist8
	lw %17 , 0(%16)
	lw %18 , -4(Initialsp)
	beqz zero,newExpr4.dep0.Initial2

newExpr4.dep0.Initial2:
	li %NewRegist9 , 32
	mul %19, %18, %NewRegist9
	li %NewRegist10 , 32
	add %20, %19, %NewRegist10
	li %NewRegist11 , 8
	div %21, %20, %NewRegist11
	mv a0 , %21
	call malloc
	mv %22 , a0
	mv %23 , %22
	sw %18 , 0(%23)
	li %NewRegist12 , 4
	li %NewRegist13 , 1
	mul %NewRegist12, %NewRegist12, %NewRegist13
	add %24, %23, %NewRegist12
	mv %25 , %24
	mv %26 , %25
	sw %26 , -12(Initialsp)
	beqz zero,newExpr4.Finish2

newExpr4.Finish2:
	lw %27 , -12(Initialsp)
	sw %27 , 0(%16)
	li %NewRegist14 , 0
	la %NewRegist15 , j
	sw %NewRegist14 , 0(%NewRegist15)
	beqz zero,ForCond32

ForCond32:
	la %28 , j
	lw %28 , 0(%28)
	lw %29 , -4(Initialsp)
	slt %30, %28, %29
	bnez %30,ForLoop32
	beqz %30,ForFinish32

ForLoop32:
	la %31 , c
	lw %31 , 0(%31)
	la %32 , i
	lw %32 , 0(%32)
	li %NewRegist16 , 4
	mul %NewRegist16, %NewRegist16, %32
	add %33, %31, %NewRegist16
	lw %34 , 0(%33)
	la %35 , j
	lw %35 , 0(%35)
	li %NewRegist17 , 4
	mul %NewRegist17, %NewRegist17, %35
	add %36, %34, %NewRegist17
	lw %37 , 0(%36)
	li %NewRegist18 , 0
	sw %NewRegist18 , 0(%36)
	beqz zero,ForEnd32

ForEnd32:
	la %38 , j
	lw %38 , 0(%38)
	li %NewRegist19 , 1
	add %39, %38, %NewRegist19
	la %NewRegist20 , j
	sw %39 , 0(%NewRegist20)
	beqz zero,ForCond32

ForFinish32:
	beqz zero,ForEnd22

ForEnd22:
	la %40 , i
	lw %40 , 0(%40)
	li %NewRegist21 , 1
	add %41, %40, %NewRegist21
	la %NewRegist22 , i
	sw %41 , 0(%NewRegist22)
	beqz zero,ForCond22

ForFinish22:
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  build
    .p2align    2
build:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry3
entry3:
	li %NewRegist0 , 1
	la %NewRegist1 , i
	sw %NewRegist0 , 0(%NewRegist1)
	beqz zero,ForCond43

ForCond43:
	la %2 , i
	lw %2 , 0(%2)
	li %NewRegist2 , 49
	slt %3, %NewRegist2, %2
	xori %3, %3, 1
	bnez %3,ForLoop43
	beqz %3,ForFinish43

ForLoop43:
	li %NewRegist3 , 50
	la %NewRegist4 , j
	sw %NewRegist3 , 0(%NewRegist4)
	beqz zero,ForCond53

ForCond53:
	la %4 , j
	lw %4 , 0(%4)
	la %5 , i
	lw %5 , 0(%5)
	li %NewRegist5 , 98
	sub %6, %NewRegist5, %5
	li %NewRegist6 , 1
	add %7, %6, %NewRegist6
	slt %8, %7, %4
	xori %8, %8, 1
	bnez %8,ForLoop53
	beqz %8,ForFinish53

ForLoop53:
	la %9 , c
	lw %9 , 0(%9)
	la %10 , i
	lw %10 , 0(%10)
	li %NewRegist7 , 4
	mul %NewRegist7, %NewRegist7, %10
	add %11, %9, %NewRegist7
	lw %12 , 0(%11)
	la %13 , j
	lw %13 , 0(%13)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %13
	add %14, %12, %NewRegist8
	lw %15 , 0(%14)
	li %NewRegist9 , 1
	sw %NewRegist9 , 0(%14)
	beqz zero,ForEnd53

ForEnd53:
	la %16 , j
	lw %16 , 0(%16)
	li %NewRegist10 , 1
	add %17, %16, %NewRegist10
	la %NewRegist11 , j
	sw %17 , 0(%NewRegist11)
	beqz zero,ForCond53

ForFinish53:
	beqz zero,ForEnd43

ForEnd43:
	la %18 , i
	lw %18 , 0(%18)
	li %NewRegist12 , 1
	add %19, %18, %NewRegist12
	la %NewRegist13 , i
	sw %19 , 0(%NewRegist13)
	beqz zero,ForCond43

ForFinish43:
	li %NewRegist14 , 1
	la %NewRegist15 , i
	sw %NewRegist14 , 0(%NewRegist15)
	beqz zero,ForCond63

ForCond63:
	la %20 , i
	lw %20 , 0(%20)
	li %NewRegist16 , 49
	slt %21, %NewRegist16, %20
	xori %21, %21, 1
	bnez %21,ForLoop63
	beqz %21,ForFinish63

ForLoop63:
	la %22 , c
	lw %22 , 0(%22)
	lw %23 , -4(Initialsp)
	li %NewRegist17 , 4
	mul %NewRegist17, %NewRegist17, %23
	add %24, %22, %NewRegist17
	lw %25 , 0(%24)
	la %26 , i
	lw %26 , 0(%26)
	li %NewRegist18 , 4
	mul %NewRegist18, %NewRegist18, %26
	add %27, %25, %NewRegist18
	lw %28 , 0(%27)
	li %NewRegist19 , 1
	sw %NewRegist19 , 0(%27)
	beqz zero,ForEnd63

ForEnd63:
	la %29 , i
	lw %29 , 0(%29)
	li %NewRegist20 , 1
	add %30, %29, %NewRegist20
	la %NewRegist21 , i
	sw %30 , 0(%NewRegist21)
	beqz zero,ForCond63

ForFinish63:
	li %NewRegist22 , 50
	la %NewRegist23 , i
	sw %NewRegist22 , 0(%NewRegist23)
	beqz zero,ForCond73

ForCond73:
	la %31 , i
	lw %31 , 0(%31)
	li %NewRegist24 , 98
	slt %32, %NewRegist24, %31
	xori %32, %32, 1
	bnez %32,ForLoop73
	beqz %32,ForFinish73

ForLoop73:
	la %33 , c
	lw %33 , 0(%33)
	la %34 , i
	lw %34 , 0(%34)
	li %NewRegist25 , 4
	mul %NewRegist25, %NewRegist25, %34
	add %35, %33, %NewRegist25
	lw %36 , 0(%35)
	lw %37 , -8(Initialsp)
	li %NewRegist26 , 4
	mul %NewRegist26, %NewRegist26, %37
	add %38, %36, %NewRegist26
	lw %39 , 0(%38)
	li %NewRegist27 , 1
	sw %NewRegist27 , 0(%38)
	beqz zero,ForEnd73

ForEnd73:
	la %40 , i
	lw %40 , 0(%40)
	li %NewRegist28 , 1
	add %41, %40, %NewRegist28
	la %NewRegist29 , i
	sw %41 , 0(%NewRegist29)
	beqz zero,ForCond73

ForFinish73:
	li %NewRegist30 , 0
	sw %NewRegist30 , -12(Initialsp)
	lw %42 , -12(Initialsp)
	mv a0 , %42
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  find
    .p2align    2
find:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry4
entry4:
	li %NewRegist0 , 0
	la %NewRegist1 , open
	sw %NewRegist0 , 0(%NewRegist1)
	li %NewRegist2 , 1
	la %NewRegist3 , closed
	sw %NewRegist2 , 0(%NewRegist3)
	li %NewRegist4 , 1
	la %NewRegist5 , i
	sw %NewRegist4 , 0(%NewRegist5)
	beqz zero,ForCond84

ForCond84:
	la %3 , i
	lw %3 , 0(%3)
	lw %4 , -4(Initialsp)
	slt %5, %4, %3
	xori %5, %5, 1
	bnez %5,ForLoop84
	beqz %5,ForFinish84

ForLoop84:
	la %6 , visit
	lw %6 , 0(%6)
	la %7 , i
	lw %7 , 0(%7)
	li %NewRegist6 , 4
	mul %NewRegist6, %NewRegist6, %7
	add %8, %6, %NewRegist6
	lw %9 , 0(%8)
	li %NewRegist7 , 0
	sw %NewRegist7 , 0(%8)
	beqz zero,ForEnd84

ForEnd84:
	la %10 , i
	lw %10 , 0(%10)
	li %NewRegist8 , 1
	add %11, %10, %NewRegist8
	la %NewRegist9 , i
	sw %11 , 0(%NewRegist9)
	beqz zero,ForCond84

ForFinish84:
	la %12 , f
	lw %12 , 0(%12)
	li %NewRegist10 , 4
	li %NewRegist11 , 1
	mul %NewRegist10, %NewRegist10, %NewRegist11
	add %13, %12, %NewRegist10
	lw %14 , 0(%13)
	lw %15 , -8(Initialsp)
	sw %15 , 0(%13)
	la %16 , visit
	lw %16 , 0(%16)
	lw %17 , -8(Initialsp)
	li %NewRegist12 , 4
	mul %NewRegist12, %NewRegist12, %17
	add %18, %16, %NewRegist12
	lw %19 , 0(%18)
	li %NewRegist13 , 1
	sw %NewRegist13 , 0(%18)
	la %20 , pre
	lw %20 , 0(%20)
	lw %21 , -8(Initialsp)
	li %NewRegist14 , 4
	mul %NewRegist14, %NewRegist14, %21
	add %22, %20, %NewRegist14
	lw %23 , 0(%22)
	li %NewRegist15 , 0
	sw %NewRegist15 , 0(%22)
	li %NewRegist16 , 0
	sw %NewRegist16 , -12(Initialsp)
	beqz zero,ForCond94

ForCond94:
	la %24 , open
	lw %24 , 0(%24)
	la %25 , closed
	lw %25 , 0(%25)
	slt %26, %24, %25
	sw %26 , -20(Initialsp)
	bnez %26,Binary0.Right4
	beqz %26,Binary0.Finish4

Binary0.Right4:
	lw %27 , -12(Initialsp)
	li %NewRegist17 , 0
	xor %28, %27, %NewRegist17
	seqz %28 , %28
	sw %28 , -20(Initialsp)
	beqz zero,Binary0.Finish4

Binary0.Finish4:
	lw %29 , -20(Initialsp)
	bnez %29,ForLoop94
	beqz %29,ForFinish94

ForLoop94:
	la %30 , open
	lw %30 , 0(%30)
	li %NewRegist18 , 1
	add %31, %30, %NewRegist18
	la %NewRegist19 , open
	sw %31 , 0(%NewRegist19)
	la %32 , f
	lw %32 , 0(%32)
	la %33 , open
	lw %33 , 0(%33)
	li %NewRegist20 , 4
	mul %NewRegist20, %NewRegist20, %33
	add %34, %32, %NewRegist20
	lw %35 , 0(%34)
	la %NewRegist21 , i
	sw %35 , 0(%NewRegist21)
	li %NewRegist22 , 1
	la %NewRegist23 , j
	sw %NewRegist22 , 0(%NewRegist23)
	beqz zero,ForCond104

ForCond104:
	la %36 , j
	lw %36 , 0(%36)
	lw %37 , -4(Initialsp)
	slt %38, %37, %36
	xori %38, %38, 1
	bnez %38,ForLoop104
	beqz %38,ForFinish104

ForLoop104:
	la %39 , c
	lw %39 , 0(%39)
	la %40 , i
	lw %40 , 0(%40)
	li %NewRegist24 , 4
	mul %NewRegist24, %NewRegist24, %40
	add %41, %39, %NewRegist24
	lw %42 , 0(%41)
	la %43 , j
	lw %43 , 0(%43)
	li %NewRegist25 , 4
	mul %NewRegist25, %NewRegist25, %43
	add %44, %42, %NewRegist25
	lw %45 , 0(%44)
	li %NewRegist26 , 0
	slt %46, %NewRegist26, %45
	sw %46 , -24(Initialsp)
	bnez %46,Binary1.Right4
	beqz %46,Binary1.Finish4

Binary1.Right4:
	la %47 , visit
	lw %47 , 0(%47)
	la %48 , j
	lw %48 , 0(%48)
	li %NewRegist27 , 4
	mul %NewRegist27, %NewRegist27, %48
	add %49, %47, %NewRegist27
	lw %50 , 0(%49)
	li %NewRegist28 , 0
	xor %51, %50, %NewRegist28
	seqz %51 , %51
	sw %51 , -24(Initialsp)
	beqz zero,Binary1.Finish4

Binary1.Finish4:
	lw %52 , -24(Initialsp)
	bnez %52,IFTrue14
	beqz %52,IFFalse14

IFTrue14:
	la %53 , visit
	lw %53 , 0(%53)
	la %54 , j
	lw %54 , 0(%54)
	li %NewRegist29 , 4
	mul %NewRegist29, %NewRegist29, %54
	add %55, %53, %NewRegist29
	lw %56 , 0(%55)
	li %NewRegist30 , 1
	sw %NewRegist30 , 0(%55)
	la %57 , closed
	lw %57 , 0(%57)
	li %NewRegist31 , 1
	add %58, %57, %NewRegist31
	la %NewRegist32 , closed
	sw %58 , 0(%NewRegist32)
	la %59 , f
	lw %59 , 0(%59)
	la %60 , closed
	lw %60 , 0(%60)
	li %NewRegist33 , 4
	mul %NewRegist33, %NewRegist33, %60
	add %61, %59, %NewRegist33
	lw %62 , 0(%61)
	la %63 , j
	lw %63 , 0(%63)
	sw %63 , 0(%61)
	la %64 , pre
	lw %64 , 0(%64)
	la %65 , j
	lw %65 , 0(%65)
	li %NewRegist34 , 4
	mul %NewRegist34, %NewRegist34, %65
	add %66, %64, %NewRegist34
	lw %67 , 0(%66)
	la %68 , i
	lw %68 , 0(%68)
	sw %68 , 0(%66)
	la %69 , closed
	lw %69 , 0(%69)
	lw %70 , -4(Initialsp)
	xor %71, %69, %70
	seqz %71 , %71
	bnez %71,IFTrue24
	beqz %71,IFFalse24

IFTrue24:
	li %NewRegist35 , 1
	sw %NewRegist35 , -12(Initialsp)
	beqz zero,IFFinish24

IFFalse24:
	beqz zero,IFFinish24

IFFinish24:
	beqz zero,IFFinish14

IFFalse14:
	beqz zero,IFFinish14

IFFinish14:
	beqz zero,ForEnd104

ForEnd104:
	la %72 , j
	lw %72 , 0(%72)
	li %NewRegist36 , 1
	add %73, %72, %NewRegist36
	la %NewRegist37 , j
	sw %73 , 0(%NewRegist37)
	beqz zero,ForCond104

ForFinish104:
	beqz zero,ForEnd94

ForEnd94:
	beqz zero,ForCond94

ForFinish94:
	lw %74 , -12(Initialsp)
	sw %74 , -16(Initialsp)
	lw %75 , -16(Initialsp)
	mv a0 , %75
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  improve
    .p2align    2
improve:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry5
entry5:
	lw %1 , -4(Initialsp)
	la %NewRegist0 , i
	sw %1 , 0(%NewRegist0)
	la %2 , ans
	lw %2 , 0(%2)
	li %NewRegist1 , 1
	add %3, %2, %NewRegist1
	la %NewRegist2 , ans
	sw %3 , 0(%NewRegist2)
	beqz zero,ForCond115

ForCond115:
	la %4 , pre
	lw %4 , 0(%4)
	la %5 , i
	lw %5 , 0(%5)
	li %NewRegist3 , 4
	mul %NewRegist3, %NewRegist3, %5
	add %6, %4, %NewRegist3
	lw %7 , 0(%6)
	li %NewRegist4 , 0
	slt %8, %NewRegist4, %7
	bnez %8,ForLoop115
	beqz %8,ForFinish115

ForLoop115:
	la %9 , pre
	lw %9 , 0(%9)
	la %10 , i
	lw %10 , 0(%10)
	li %NewRegist5 , 4
	mul %NewRegist5, %NewRegist5, %10
	add %11, %9, %NewRegist5
	lw %12 , 0(%11)
	la %NewRegist6 , j
	sw %12 , 0(%NewRegist6)
	la %13 , c
	lw %13 , 0(%13)
	la %14 , j
	lw %14 , 0(%14)
	li %NewRegist7 , 4
	mul %NewRegist7, %NewRegist7, %14
	add %15, %13, %NewRegist7
	lw %16 , 0(%15)
	la %17 , i
	lw %17 , 0(%17)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %17
	add %18, %16, %NewRegist8
	lw %19 , 0(%18)
	li %NewRegist9 , 1
	sub %20, %19, %NewRegist9
	sw %20 , 0(%18)
	la %21 , c
	lw %21 , 0(%21)
	la %22 , i
	lw %22 , 0(%22)
	li %NewRegist10 , 4
	mul %NewRegist10, %NewRegist10, %22
	add %23, %21, %NewRegist10
	lw %24 , 0(%23)
	la %25 , j
	lw %25 , 0(%25)
	li %NewRegist11 , 4
	mul %NewRegist11, %NewRegist11, %25
	add %26, %24, %NewRegist11
	lw %27 , 0(%26)
	li %NewRegist12 , 1
	add %28, %27, %NewRegist12
	sw %28 , 0(%26)
	la %29 , j
	lw %29 , 0(%29)
	la %NewRegist13 , i
	sw %29 , 0(%NewRegist13)
	beqz zero,ForEnd115

ForEnd115:
	beqz zero,ForCond115

ForFinish115:
	li %NewRegist14 , 0
	sw %NewRegist14 , -8(Initialsp)
	lw %30 , -8(Initialsp)
	mv a0 , %30
	mv ra , %raAddr
	addi sp,sp,0
	ret


	.type	c,@object             # @c
	.section	.sbss,"aw",@nobits
	.globl	c
	.p2align	2
c:
	.word	0
	.size	c, 4

	.type	ans,@object             # @ans
	.section	.sbss,"aw",@nobits
	.globl	ans
	.p2align	2
ans:
	.word	0
	.size	ans, 4

	.type	visit,@object             # @visit
	.section	.sbss,"aw",@nobits
	.globl	visit
	.p2align	2
visit:
	.word	0
	.size	visit, 4

	.type	pre,@object             # @pre
	.section	.sbss,"aw",@nobits
	.globl	pre
	.p2align	2
pre:
	.word	0
	.size	pre, 4

	.type	f,@object             # @f
	.section	.sbss,"aw",@nobits
	.globl	f
	.p2align	2
f:
	.word	0
	.size	f, 4

	.type	i,@object             # @i
	.section	.sbss,"aw",@nobits
	.globl	i
	.p2align	2
i:
	.word	0
	.size	i, 4

	.type	j,@object             # @j
	.section	.sbss,"aw",@nobits
	.globl	j
	.p2align	2
j:
	.word	0
	.size	j, 4

	.type	open,@object             # @open
	.section	.sbss,"aw",@nobits
	.globl	open
	.p2align	2
open:
	.word	0
	.size	open, 4

	.type	closed,@object             # @closed
	.section	.sbss,"aw",@nobits
	.globl	closed
	.p2align	2
closed:
	.word	0
	.size	closed, 4

