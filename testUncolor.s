	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv %raAddr , ra
	j entry0
entry0:
	j newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li %NewRegist0 , 1001
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
	li %NewRegist4 , 1001
	sw %NewRegist4 , 0(%4)
	li %NewRegist5 , 4
	li %NewRegist6 , 1
	mul %NewRegist5, %NewRegist5, %NewRegist6
	add %5, %4, %NewRegist5
	mv %6 , %5
	mv %7 , %6
	sw %7 , -4(Initialsp)
	j newExpr0.Finish0

newExpr0.Finish0:
	lw %8 , -4(Initialsp)
	la %NewRegist7 , b
	sw %8 , 0(%NewRegist7)
	j newExpr1.dep0.Initial0

newExpr1.dep0.Initial0:
	li %NewRegist8 , 170
	li %NewRegist9 , 32
	mul %9, %NewRegist8, %NewRegist9
	li %NewRegist10 , 32
	add %10, %9, %NewRegist10
	li %NewRegist11 , 8
	div %11, %10, %NewRegist11
	mv a0 , %11
	call malloc
	mv %12 , a0
	mv %13 , %12
	li %NewRegist12 , 170
	sw %NewRegist12 , 0(%13)
	li %NewRegist13 , 4
	li %NewRegist14 , 1
	mul %NewRegist13, %NewRegist13, %NewRegist14
	add %14, %13, %NewRegist13
	mv %15 , %14
	mv %16 , %15
	sw %16 , -8(Initialsp)
	j newExpr1.Finish0

newExpr1.Finish0:
	lw %17 , -8(Initialsp)
	la %NewRegist15 , prime
	sw %17 , 0(%NewRegist15)
	j newExpr2.dep0.Initial0

newExpr2.dep0.Initial0:
	li %NewRegist16 , 1001
	li %NewRegist17 , 32
	mul %18, %NewRegist16, %NewRegist17
	li %NewRegist18 , 32
	add %19, %18, %NewRegist18
	li %NewRegist19 , 8
	div %20, %19, %NewRegist19
	mv a0 , %20
	call malloc
	mv %21 , a0
	mv %22 , %21
	li %NewRegist20 , 1001
	sw %NewRegist20 , 0(%22)
	li %NewRegist21 , 4
	li %NewRegist22 , 1
	mul %NewRegist21, %NewRegist21, %NewRegist22
	add %23, %22, %NewRegist21
	mv %24 , %23
	mv %25 , %24
	sw %25 , -12(Initialsp)
	j newExpr2.Finish0

newExpr2.Finish0:
	lw %26 , -12(Initialsp)
	la %NewRegist23 , gps
	sw %26 , 0(%NewRegist23)
	j newExpr3.dep0.Initial0

newExpr3.dep0.Initial0:
	li %NewRegist24 , 1
	li %NewRegist25 , 32
	mul %27, %NewRegist24, %NewRegist25
	li %NewRegist26 , 32
	add %28, %27, %NewRegist26
	li %NewRegist27 , 8
	div %29, %28, %NewRegist27
	mv a0 , %29
	call malloc
	mv %30 , a0
	mv %31 , %30
	li %NewRegist28 , 1
	sw %NewRegist28 , 0(%31)
	li %NewRegist29 , 4
	li %NewRegist30 , 1
	mul %NewRegist29, %NewRegist29, %NewRegist30
	add %32, %31, %NewRegist29
	mv %33 , %32
	mv %34 , %33
	sw %34 , -16(Initialsp)
	j newExpr3.Finish0

newExpr3.Finish0:
	lw %35 , -16(Initialsp)
	la %NewRegist31 , tmp
	sw %35 , 0(%NewRegist31)
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
	li a0 , 170
	call origin
	li %NewRegist0 , 1000
	la %NewRegist1 , N
	sw %NewRegist0 , 0(%NewRegist1)
	call getInt
	mv %0 , a0
	la %NewRegist2 , M
	sw %0 , 0(%NewRegist2)
	li %NewRegist3 , 0
	la %NewRegist4 , primeCount
	sw %NewRegist3 , 0(%NewRegist4)
	li %NewRegist5 , 0
	la %NewRegist6 , resultCount
	sw %NewRegist5 , 0(%NewRegist6)
	la %1 , tmp
	lw %1 , 0(%1)
	li %NewRegist7 , 4
	li %NewRegist8 , 0
	mul %NewRegist7, %NewRegist7, %NewRegist8
	add %2, %1, %NewRegist7
	lw %3 , 0(%2)
	li %NewRegist9 , 0
	sw %NewRegist9 , 0(%2)
	li %NewRegist10 , 0
	la %NewRegist11 , i
	sw %NewRegist10 , 0(%NewRegist11)
	j ForCond11

ForCond11:
	la %4 , i
	lw %4 , 0(%4)
	la %5 , N
	lw %5 , 0(%5)
	li %NewRegist12 , 1
	add %6, %5, %NewRegist12
	slt %7, %4, %6
	bnez %7,ForLoop11
	j ForFinish11

ForLoop11:
	la %8 , b
	lw %8 , 0(%8)
	la %9 , i
	lw %9 , 0(%9)
	li %NewRegist13 , 4
	mul %NewRegist13, %NewRegist13, %9
	add %10, %8, %NewRegist13
	lw %11 , 0(%10)
	li %NewRegist14 , 1
	sw %NewRegist14 , 0(%10)
	la %12 , gps
	lw %12 , 0(%12)
	la %13 , i
	lw %13 , 0(%13)
	li %NewRegist15 , 4
	mul %NewRegist15, %NewRegist15, %13
	add %14, %12, %NewRegist15
	lw %15 , 0(%14)
	li %NewRegist16 , 0
	sw %NewRegist16 , 0(%14)
	j ForEnd11

ForEnd11:
	la %16 , i
	lw %16 , 0(%16)
	li %NewRegist17 , 1
	add %17, %16, %NewRegist17
	la %NewRegist18 , i
	sw %17 , 0(%NewRegist18)
	j ForCond11

ForFinish11:
	li %NewRegist19 , 0
	la %NewRegist20 , i
	sw %NewRegist19 , 0(%NewRegist20)
	j ForCond21

ForCond21:
	la %18 , i
	lw %18 , 0(%18)
	la %19 , M
	lw %19 , 0(%19)
	li %NewRegist21 , 1
	add %20, %19, %NewRegist21
	slt %21, %18, %20
	bnez %21,ForLoop21
	j ForFinish21

ForLoop21:
	la %22 , prime
	lw %22 , 0(%22)
	la %23 , i
	lw %23 , 0(%23)
	li %NewRegist22 , 4
	mul %NewRegist22, %NewRegist22, %23
	add %24, %22, %NewRegist22
	lw %25 , 0(%24)
	li %NewRegist23 , 0
	sw %NewRegist23 , 0(%24)
	j ForEnd21

ForEnd21:
	la %26 , i
	lw %26 , 0(%26)
	li %NewRegist24 , 1
	add %27, %26, %NewRegist24
	la %NewRegist25 , i
	sw %27 , 0(%NewRegist25)
	j ForCond21

ForFinish21:
	li %NewRegist26 , 0
	la %NewRegist27 , i
	sw %NewRegist26 , 0(%NewRegist27)
	j ForCond31

ForCond31:
	la %28 , i
	lw %28 , 0(%28)
	la %29 , M
	lw %29 , 0(%29)
	slt %30, %29, %28
	xori %30, %30, 1
	bnez %30,ForLoop31
	j ForFinish31

ForLoop31:
	li %NewRegist28 , 0
	la %NewRegist29 , j
	sw %NewRegist28 , 0(%NewRegist29)
	j ForCond41

ForCond41:
	la %31 , j
	lw %31 , 0(%31)
	la %32 , M
	lw %32 , 0(%32)
	slt %33, %32, %31
	xori %33, %33, 1
	bnez %33,ForLoop41
	j ForFinish41

ForLoop41:
	la %34 , result
	lw %34 , 0(%34)
	la %35 , i
	lw %35 , 0(%35)
	li %NewRegist30 , 4
	mul %NewRegist30, %NewRegist30, %35
	add %36, %34, %NewRegist30
	lw %37 , 0(%36)
	la %38 , j
	lw %38 , 0(%38)
	li %NewRegist31 , 4
	mul %NewRegist31, %NewRegist31, %38
	add %39, %37, %NewRegist31
	lw %40 , 0(%39)
	li %NewRegist32 , 0
	li %NewRegist33 , 1
	sub %41, %NewRegist32, %NewRegist33
	sw %41 , 0(%39)
	j ForEnd41

ForEnd41:
	la %42 , j
	lw %42 , 0(%42)
	li %NewRegist34 , 1
	add %43, %42, %NewRegist34
	la %NewRegist35 , j
	sw %43 , 0(%NewRegist35)
	j ForCond41

ForFinish41:
	j ForEnd31

ForEnd31:
	la %44 , i
	lw %44 , 0(%44)
	li %NewRegist36 , 1
	add %45, %44, %NewRegist36
	la %NewRegist37 , i
	sw %45 , 0(%NewRegist37)
	j ForCond31

ForFinish31:
	la %46 , N
	lw %46 , 0(%46)
	mv a0 , %46
	call getPrime
	la %47 , tmp
	lw %47 , 0(%47)
	li %NewRegist38 , 4
	li %NewRegist39 , 0
	mul %NewRegist38, %NewRegist38, %NewRegist39
	add %48, %47, %NewRegist38
	lw %49 , 0(%48)
	la %NewRegist40 , primeCount
	sw %49 , 0(%NewRegist40)
	li %NewRegist41 , 1
	la %NewRegist42 , i
	sw %NewRegist41 , 0(%NewRegist42)
	j ForCond51

ForCond51:
	la %50 , i
	lw %50 , 0(%50)
	la %51 , primeCount
	lw %51 , 0(%51)
	slt %52, %50, %51
	bnez %52,ForLoop51
	j ForFinish51

ForLoop51:
	la %53 , i
	lw %53 , 0(%53)
	li %NewRegist43 , 1
	add %54, %53, %NewRegist43
	la %NewRegist44 , j
	sw %54 , 0(%NewRegist44)
	j ForCond61

ForCond61:
	la %55 , j
	lw %55 , 0(%55)
	la %56 , primeCount
	lw %56 , 0(%56)
	slt %57, %56, %55
	xori %57, %57, 1
	bnez %57,ForLoop61
	j ForFinish61

ForLoop61:
	la %58 , result
	lw %58 , 0(%58)
	la %59 , i
	lw %59 , 0(%59)
	li %NewRegist45 , 4
	mul %NewRegist45, %NewRegist45, %59
	add %60, %58, %NewRegist45
	lw %61 , 0(%60)
	la %62 , j
	lw %62 , 0(%62)
	li %NewRegist46 , 4
	mul %NewRegist46, %NewRegist46, %62
	add %63, %61, %NewRegist46
	lw %64 , 0(%63)
	li %NewRegist47 , 0
	li %NewRegist48 , 1
	sub %65, %NewRegist47, %NewRegist48
	xor %66, %64, %65
	seqz %66 , %66
	bnez %66,IFTrue11
	j IFFalse11

IFTrue11:
	la %67 , result
	lw %67 , 0(%67)
	la %68 , i
	lw %68 , 0(%68)
	li %NewRegist49 , 4
	mul %NewRegist49, %NewRegist49, %68
	add %69, %67, %NewRegist49
	lw %70 , 0(%69)
	la %71 , j
	lw %71 , 0(%71)
	li %NewRegist50 , 4
	mul %NewRegist50, %NewRegist50, %71
	add %72, %70, %NewRegist50
	lw %73 , 0(%72)
	la %74 , N
	lw %74 , 0(%74)
	la %75 , i
	lw %75 , 0(%75)
	la %76 , j
	lw %76 , 0(%76)
	mv a0 , %74
	mv a1 , %75
	mv a2 , %76
	call getResult
	mv %77 , a0
	sw %77 , 0(%72)
	la %78 , result
	lw %78 , 0(%78)
	la %79 , i
	lw %79 , 0(%79)
	li %NewRegist51 , 4
	mul %NewRegist51, %NewRegist51, %79
	add %80, %78, %NewRegist51
	lw %81 , 0(%80)
	la %82 , j
	lw %82 , 0(%82)
	li %NewRegist52 , 4
	mul %NewRegist52, %NewRegist52, %82
	add %83, %81, %NewRegist52
	lw %84 , 0(%83)
	li %NewRegist53 , 1
	slt %85, %NewRegist53, %84
	bnez %85,IFTrue21
	j IFFalse21

IFTrue21:
	la %86 , prime
	lw %86 , 0(%86)
	la %87 , i
	lw %87 , 0(%87)
	li %NewRegist54 , 4
	mul %NewRegist54, %NewRegist54, %87
	add %88, %86, %NewRegist54
	lw %89 , 0(%88)
	la %90 , prime
	lw %90 , 0(%90)
	la %91 , j
	lw %91 , 0(%91)
	li %NewRegist55 , 4
	mul %NewRegist55, %NewRegist55, %91
	add %92, %90, %NewRegist55
	lw %93 , 0(%92)
	la %94 , result
	lw %94 , 0(%94)
	la %95 , i
	lw %95 , 0(%95)
	li %NewRegist56 , 4
	mul %NewRegist56, %NewRegist56, %95
	add %96, %94, %NewRegist56
	lw %97 , 0(%96)
	la %98 , j
	lw %98 , 0(%98)
	li %NewRegist57 , 4
	mul %NewRegist57, %NewRegist57, %98
	add %99, %97, %NewRegist57
	lw %100 , 0(%99)
	mv a0 , %89
	mv a1 , %93
	mv a2 , %100
	call printF
	la %101 , resultCount
	lw %101 , 0(%101)
	li %NewRegist58 , 1
	add %102, %101, %NewRegist58
	la %NewRegist59 , resultCount
	sw %102 , 0(%NewRegist59)
	j IFFinish21

IFFalse21:
	j IFFinish21

IFFinish21:
	j IFFinish11

IFFalse11:
	j IFFinish11

IFFinish11:
	j ForEnd61

ForEnd61:
	la %103 , j
	lw %103 , 0(%103)
	li %NewRegist60 , 1
	add %104, %103, %NewRegist60
	la %NewRegist61 , j
	sw %104 , 0(%NewRegist61)
	j ForCond61

ForFinish61:
	j ForEnd51

ForEnd51:
	la %105 , i
	lw %105 , 0(%105)
	li %NewRegist62 , 1
	add %106, %105, %NewRegist62
	la %NewRegist63 , i
	sw %106 , 0(%NewRegist63)
	j ForCond51

ForFinish51:
	la %107 , .Str0
	mv a0 , %107
	call print
	la %108 , resultCount
	lw %108 , 0(%108)
	mv a0 , %108
	call toString
	mv %109 , a0
	mv a0 , %109
	call println
	li %NewRegist64 , 0
	sw %NewRegist64 , -4(Initialsp)
	lw %110 , -4(Initialsp)
	mv a0 , %110
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
	j newExpr4.dep0.Initial2

newExpr4.dep0.Initial2:
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
	j newExpr4.Finish2

newExpr4.Finish2:
	lw %10 , -8(Initialsp)
	la %NewRegist5 , result
	sw %10 , 0(%NewRegist5)
	li %NewRegist6 , 0
	la %NewRegist7 , i
	sw %NewRegist6 , 0(%NewRegist7)
	j ForCond72

ForCond72:
	la %11 , i
	lw %11 , 0(%11)
	lw %12 , -4(Initialsp)
	slt %13, %11, %12
	bnez %13,ForLoop72
	j ForFinish72

ForLoop72:
	la %14 , result
	lw %14 , 0(%14)
	la %15 , i
	lw %15 , 0(%15)
	li %NewRegist8 , 4
	mul %NewRegist8, %NewRegist8, %15
	add %16, %14, %NewRegist8
	lw %17 , 0(%16)
	lw %18 , -4(Initialsp)
	j newExpr5.dep0.Initial2

newExpr5.dep0.Initial2:
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
	j newExpr5.Finish2

newExpr5.Finish2:
	lw %27 , -12(Initialsp)
	sw %27 , 0(%16)
	li %NewRegist14 , 0
	la %NewRegist15 , j
	sw %NewRegist14 , 0(%NewRegist15)
	j ForCond82

ForCond82:
	la %28 , j
	lw %28 , 0(%28)
	lw %29 , -4(Initialsp)
	slt %30, %28, %29
	bnez %30,ForLoop82
	j ForFinish82

ForLoop82:
	la %31 , result
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
	j ForEnd82

ForEnd82:
	la %38 , j
	lw %38 , 0(%38)
	li %NewRegist19 , 1
	add %39, %38, %NewRegist19
	la %NewRegist20 , j
	sw %39 , 0(%NewRegist20)
	j ForCond82

ForFinish82:
	j ForEnd72

ForEnd72:
	la %40 , i
	lw %40 , 0(%40)
	li %NewRegist21 , 1
	add %41, %40, %NewRegist21
	la %NewRegist22 , i
	sw %41 , 0(%NewRegist22)
	j ForCond72

ForFinish72:
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  getPrime
    .p2align    2
getPrime:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry3
entry3:
	li %NewRegist0 , 2
	sw %NewRegist0 , -8(Initialsp)
	li %NewRegist1 , 2
	sw %NewRegist1 , -12(Initialsp)
	j ForCond93

ForCond93:
	lw %1 , -12(Initialsp)
	lw %2 , -4(Initialsp)
	slt %3, %2, %1
	xori %3, %3, 1
	bnez %3,ForLoop93
	j ForFinish93

ForLoop93:
	la %4 , b
	lw %4 , 0(%4)
	lw %5 , -12(Initialsp)
	li %NewRegist2 , 4
	mul %NewRegist2, %NewRegist2, %5
	add %6, %4, %NewRegist2
	lw %7 , 0(%6)
	li %NewRegist3 , 1
	xor %8, %7, %NewRegist3
	seqz %8 , %8
	bnez %8,IFTrue33
	j IFFalse33

IFTrue33:
	la %9 , tmp
	lw %9 , 0(%9)
	li %NewRegist4 , 4
	li %NewRegist5 , 0
	mul %NewRegist4, %NewRegist4, %NewRegist5
	add %10, %9, %NewRegist4
	lw %11 , 0(%10)
	la %12 , tmp
	lw %12 , 0(%12)
	li %NewRegist6 , 4
	li %NewRegist7 , 0
	mul %NewRegist6, %NewRegist6, %NewRegist7
	add %13, %12, %NewRegist6
	lw %14 , 0(%13)
	li %NewRegist8 , 1
	add %15, %14, %NewRegist8
	sw %15 , 0(%10)
	la %16 , prime
	lw %16 , 0(%16)
	la %17 , tmp
	lw %17 , 0(%17)
	li %NewRegist9 , 4
	li %NewRegist10 , 0
	mul %NewRegist9, %NewRegist9, %NewRegist10
	add %18, %17, %NewRegist9
	lw %19 , 0(%18)
	li %NewRegist11 , 4
	mul %NewRegist11, %NewRegist11, %19
	add %20, %16, %NewRegist11
	lw %21 , 0(%20)
	lw %22 , -12(Initialsp)
	sw %22 , 0(%20)
	la %23 , gps
	lw %23 , 0(%23)
	lw %24 , -12(Initialsp)
	li %NewRegist12 , 4
	mul %NewRegist12, %NewRegist12, %24
	add %25, %23, %NewRegist12
	lw %26 , 0(%25)
	la %27 , tmp
	lw %27 , 0(%27)
	li %NewRegist13 , 4
	li %NewRegist14 , 0
	mul %NewRegist13, %NewRegist13, %NewRegist14
	add %28, %27, %NewRegist13
	lw %29 , 0(%28)
	sw %29 , 0(%25)
	j IFFinish33

IFFalse33:
	j IFFinish33

IFFinish33:
	j ForCond103

ForCond103:
	lw %30 , -12(Initialsp)
	lw %31 , -8(Initialsp)
	mul %32, %30, %31
	lw %33 , -4(Initialsp)
	slt %34, %33, %32
	xori %34, %34, 1
	bnez %34,ForLoop103
	j ForFinish103

ForLoop103:
	la %35 , b
	lw %35 , 0(%35)
	lw %36 , -12(Initialsp)
	lw %37 , -8(Initialsp)
	mul %38, %36, %37
	li %NewRegist15 , 4
	mul %NewRegist15, %NewRegist15, %38
	add %39, %35, %NewRegist15
	lw %40 , 0(%39)
	li %NewRegist16 , 0
	sw %NewRegist16 , 0(%39)
	lw %41 , -8(Initialsp)
	li %NewRegist17 , 1
	add %42, %41, %NewRegist17
	sw %42 , -8(Initialsp)
	j ForEnd103

ForEnd103:
	j ForCond103

ForFinish103:
	li %NewRegist18 , 2
	sw %NewRegist18 , -8(Initialsp)
	j ForEnd93

ForEnd93:
	lw %43 , -12(Initialsp)
	li %NewRegist19 , 1
	add %44, %43, %NewRegist19
	sw %44 , -12(Initialsp)
	j ForCond93

ForFinish93:
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  getResult
    .p2align    2
getResult:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry4
entry4:
	la %3 , result
	lw %3 , 0(%3)
	lw %4 , -8(Initialsp)
	li %NewRegist0 , 4
	mul %NewRegist0, %NewRegist0, %4
	add %5, %3, %NewRegist0
	lw %6 , 0(%5)
	lw %7 , -12(Initialsp)
	li %NewRegist1 , 4
	mul %NewRegist1, %NewRegist1, %7
	add %8, %6, %NewRegist1
	lw %9 , 0(%8)
	li %NewRegist2 , 0
	li %NewRegist3 , 1
	sub %10, %NewRegist2, %NewRegist3
	xor %11, %9, %10
	seqz %11 , %11
	bnez %11,IFTrue44
	j IFFalse44

IFTrue44:
	la %12 , prime
	lw %12 , 0(%12)
	lw %13 , -12(Initialsp)
	li %NewRegist4 , 4
	mul %NewRegist4, %NewRegist4, %13
	add %14, %12, %NewRegist4
	lw %15 , 0(%14)
	li %NewRegist5 , 2
	mul %16, %15, %NewRegist5
	la %17 , prime
	lw %17 , 0(%17)
	lw %18 , -8(Initialsp)
	li %NewRegist6 , 4
	mul %NewRegist6, %NewRegist6, %18
	add %19, %17, %NewRegist6
	lw %20 , 0(%19)
	sub %21, %16, %20
	lw %22 , -4(Initialsp)
	slt %23, %22, %21
	xori %23, %23, 1
	bnez %23,IFTrue54
	j IFFalse54

IFTrue54:
	la %24 , b
	lw %24 , 0(%24)
	la %25 , prime
	lw %25 , 0(%25)
	lw %26 , -12(Initialsp)
	li %NewRegist7 , 4
	mul %NewRegist7, %NewRegist7, %26
	add %27, %25, %NewRegist7
	lw %28 , 0(%27)
	li %NewRegist8 , 2
	mul %29, %28, %NewRegist8
	la %30 , prime
	lw %30 , 0(%30)
	lw %31 , -8(Initialsp)
	li %NewRegist9 , 4
	mul %NewRegist9, %NewRegist9, %31
	add %32, %30, %NewRegist9
	lw %33 , 0(%32)
	sub %34, %29, %33
	li %NewRegist10 , 4
	mul %NewRegist10, %NewRegist10, %34
	add %35, %24, %NewRegist10
	lw %36 , 0(%35)
	li %NewRegist11 , 0
	xor %37, %36, %NewRegist11
	snez %37 , %37
	bnez %37,IFTrue64
	j IFFalse64

IFTrue64:
	la %38 , result
	lw %38 , 0(%38)
	lw %39 , -8(Initialsp)
	li %NewRegist12 , 4
	mul %NewRegist12, %NewRegist12, %39
	add %40, %38, %NewRegist12
	lw %41 , 0(%40)
	lw %42 , -12(Initialsp)
	li %NewRegist13 , 4
	mul %NewRegist13, %NewRegist13, %42
	add %43, %41, %NewRegist13
	lw %44 , 0(%43)
	lw %45 , -4(Initialsp)
	lw %46 , -12(Initialsp)
	la %47 , gps
	lw %47 , 0(%47)
	la %48 , prime
	lw %48 , 0(%48)
	lw %49 , -12(Initialsp)
	li %NewRegist14 , 4
	mul %NewRegist14, %NewRegist14, %49
	add %50, %48, %NewRegist14
	lw %51 , 0(%50)
	li %NewRegist15 , 2
	mul %52, %51, %NewRegist15
	la %53 , prime
	lw %53 , 0(%53)
	lw %54 , -8(Initialsp)
	li %NewRegist16 , 4
	mul %NewRegist16, %NewRegist16, %54
	add %55, %53, %NewRegist16
	lw %56 , 0(%55)
	sub %57, %52, %56
	li %NewRegist17 , 4
	mul %NewRegist17, %NewRegist17, %57
	add %58, %47, %NewRegist17
	lw %59 , 0(%58)
	mv a0 , %45
	mv a1 , %46
	mv a2 , %59
	call getResult
	mv %60 , a0
	li %NewRegist18 , 1
	add %61, %60, %NewRegist18
	sw %61 , 0(%43)
	j IFFinish64

IFFalse64:
	j IFFinish64

IFFinish64:
	j IFFinish54

IFFalse54:
	j IFFinish54

IFFinish54:
	j IFFinish44

IFFalse44:
	j IFFinish44

IFFinish44:
	la %62 , result
	lw %62 , 0(%62)
	lw %63 , -8(Initialsp)
	li %NewRegist19 , 4
	mul %NewRegist19, %NewRegist19, %63
	add %64, %62, %NewRegist19
	lw %65 , 0(%64)
	lw %66 , -12(Initialsp)
	li %NewRegist20 , 4
	mul %NewRegist20, %NewRegist20, %66
	add %67, %65, %NewRegist20
	lw %68 , 0(%67)
	li %NewRegist21 , 0
	li %NewRegist22 , 1
	sub %69, %NewRegist21, %NewRegist22
	xor %70, %68, %69
	seqz %70 , %70
	bnez %70,IFTrue74
	j IFFalse74

IFTrue74:
	la %71 , result
	lw %71 , 0(%71)
	lw %72 , -8(Initialsp)
	li %NewRegist23 , 4
	mul %NewRegist23, %NewRegist23, %72
	add %73, %71, %NewRegist23
	lw %74 , 0(%73)
	lw %75 , -12(Initialsp)
	li %NewRegist24 , 4
	mul %NewRegist24, %NewRegist24, %75
	add %76, %74, %NewRegist24
	lw %77 , 0(%76)
	li %NewRegist25 , 1
	sw %NewRegist25 , 0(%76)
	j IFFinish74

IFFalse74:
	j IFFinish74

IFFinish74:
	la %78 , result
	lw %78 , 0(%78)
	lw %79 , -8(Initialsp)
	li %NewRegist26 , 4
	mul %NewRegist26, %NewRegist26, %79
	add %80, %78, %NewRegist26
	lw %81 , 0(%80)
	lw %82 , -12(Initialsp)
	li %NewRegist27 , 4
	mul %NewRegist27, %NewRegist27, %82
	add %83, %81, %NewRegist27
	lw %84 , 0(%83)
	sw %84 , -16(Initialsp)
	lw %85 , -16(Initialsp)
	mv a0 , %85
	mv ra , %raAddr
	addi sp,sp,0
	ret


    .globl  printF
    .p2align    2
printF:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,0
	mv %raAddr , ra
	j entry5
entry5:
	lw %3 , -4(Initialsp)
	mv a0 , %3
	call toString
	mv %4 , a0
	mv a0 , %4
	call print
	j ForCond115

ForCond115:
	lw %5 , -12(Initialsp)
	li %NewRegist0 , 0
	slt %6, %NewRegist0, %5
	bnez %6,ForLoop115
	j ForFinish115

ForLoop115:
	la %7 , .Str1
	mv a0 , %7
	call print
	lw %8 , -8(Initialsp)
	mv a0 , %8
	call toString
	mv %9 , a0
	mv a0 , %9
	call print
	lw %10 , -8(Initialsp)
	li %NewRegist1 , 2
	mul %11, %10, %NewRegist1
	lw %12 , -4(Initialsp)
	sub %13, %11, %12
	sw %13 , -8(Initialsp)
	lw %14 , -4(Initialsp)
	lw %15 , -8(Initialsp)
	add %16, %14, %15
	li %NewRegist2 , 2
	div %17, %16, %NewRegist2
	sw %17 , -4(Initialsp)
	lw %18 , -12(Initialsp)
	li %NewRegist3 , 1
	sub %19, %18, %NewRegist3
	sw %19 , -12(Initialsp)
	j ForEnd115

ForEnd115:
	j ForCond115

ForFinish115:
	la %20 , .Str2
	mv a0 , %20
	call print
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

	.type	primeCount,@object             # @primeCount
	.section	.sbss,"aw",@nobits
	.globl	primeCount
	.p2align	2
primeCount:
	.word	0
	.size	primeCount, 4

	.type	resultCount,@object             # @resultCount
	.section	.sbss,"aw",@nobits
	.globl	resultCount
	.p2align	2
resultCount:
	.word	0
	.size	resultCount, 4

	.type	b,@object             # @b
	.section	.sbss,"aw",@nobits
	.globl	b
	.p2align	2
b:
	.word	0
	.size	b, 4

	.type	prime,@object             # @prime
	.section	.sbss,"aw",@nobits
	.globl	prime
	.p2align	2
prime:
	.word	0
	.size	prime, 4

	.type	gps,@object             # @gps
	.section	.sbss,"aw",@nobits
	.globl	gps
	.p2align	2
gps:
	.word	0
	.size	gps, 4

	.type	tmp,@object             # @tmp
	.section	.sbss,"aw",@nobits
	.globl	tmp
	.p2align	2
tmp:
	.word	0
	.size	tmp, 4

	.type	result,@object             # @result
	.section	.sbss,"aw",@nobits
	.globl	result
	.p2align	2
result:
	.word	0
	.size	result, 4

	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	"Total: "
	.size	.Str0, 8

	.type	.Str1,@object           # @.Str1
	.section	.rodata,"a",@progbits
	.globl	.Str1
.Str1:
	.asciz	" "
	.size	.Str1, 2

	.type	.Str2,@object           # @.Str2
	.section	.rodata,"a",@progbits
	.globl	.Str2
.Str2:
	.asciz	"\n"
	.size	.Str2, 2

