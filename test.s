	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,-228
	mv s2 , ra
	sw s2 , 212(sp)
	j entry0
entry0:
	li s2 , 0
	sw s2 , 208(sp)
	la s2 , ans
	sw s2 , 204(sp)
	lw s2 , 204(sp)
	lw s3 , 208(sp)
	sw s3 , 0(s2)
	beqz zero,newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li s2 , 110
	sw s2 , 200(sp)
	li s2 , 32
	sw s2 , 196(sp)
	lw s3 , 200(sp)
	lw s2 , 196(sp)
	mul s2, s3, s2
	sw s2 , 192(sp)
	li s2 , 32
	sw s2 , 188(sp)
	lw s3 , 192(sp)
	lw s2 , 188(sp)
	add s2, s3, s2
	sw s2 , 184(sp)
	li s2 , 8
	sw s2 , 180(sp)
	lw s2 , 184(sp)
	lw s3 , 180(sp)
	div s2, s2, s3
	sw s2 , 176(sp)
	lw s2 , 176(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 172(sp)
	lw s2 , 172(sp)
	mv s2 , s2
	sw s2 , 168(sp)
	li s2 , 110
	sw s2 , 164(sp)
	lw s2 , 168(sp)
	lw s3 , 164(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 160(sp)
	li s2 , 1
	sw s2 , 156(sp)
	lw s3 , 160(sp)
	lw s2 , 156(sp)
	mul s2, s3, s2
	sw s2 , 160(sp)
	lw s2 , 168(sp)
	lw s3 , 160(sp)
	add s2, s2, s3
	sw s2 , 152(sp)
	lw s2 , 152(sp)
	mv s2 , s2
	sw s2 , 148(sp)
	lw s2 , 148(sp)
	mv s2 , s2
	sw s2 , 144(sp)
	lw s2 , 144(sp)
	sw s2 , 224(sp)
	beqz zero,newExpr0.Finish0

newExpr0.Finish0:
	lw s2 , 224(sp)
	sw s2 , 140(sp)
	la s2 , visit
	sw s2 , 136(sp)
	lw s3 , 136(sp)
	lw s2 , 140(sp)
	sw s2 , 0(s3)
	beqz zero,newExpr1.dep0.Initial0

newExpr1.dep0.Initial0:
	li s2 , 110
	sw s2 , 132(sp)
	li s2 , 32
	sw s2 , 128(sp)
	lw s3 , 132(sp)
	lw s2 , 128(sp)
	mul s2, s3, s2
	sw s2 , 124(sp)
	li s2 , 32
	sw s2 , 120(sp)
	lw s2 , 124(sp)
	lw s3 , 120(sp)
	add s2, s2, s3
	sw s2 , 116(sp)
	li s2 , 8
	sw s2 , 112(sp)
	lw s2 , 116(sp)
	lw s3 , 112(sp)
	div s2, s2, s3
	sw s2 , 108(sp)
	lw s2 , 108(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 104(sp)
	lw s2 , 104(sp)
	mv s2 , s2
	sw s2 , 100(sp)
	li s2 , 110
	sw s2 , 96(sp)
	lw s3 , 100(sp)
	lw s2 , 96(sp)
	sw s2 , 0(s3)
	li s2 , 4
	sw s2 , 92(sp)
	li s2 , 1
	sw s2 , 88(sp)
	lw s2 , 92(sp)
	lw s3 , 88(sp)
	mul s2, s2, s3
	sw s2 , 92(sp)
	lw s3 , 100(sp)
	lw s2 , 92(sp)
	add s2, s3, s2
	sw s2 , 84(sp)
	lw s2 , 84(sp)
	mv s2 , s2
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	mv s2 , s2
	sw s2 , 76(sp)
	lw s2 , 76(sp)
	sw s2 , 220(sp)
	beqz zero,newExpr1.Finish0

newExpr1.Finish0:
	lw s2 , 220(sp)
	sw s2 , 72(sp)
	la s2 , pre
	sw s2 , 68(sp)
	lw s2 , 68(sp)
	lw s3 , 72(sp)
	sw s3 , 0(s2)
	beqz zero,newExpr2.dep0.Initial0

newExpr2.dep0.Initial0:
	li s2 , 110
	sw s2 , 64(sp)
	li s2 , 32
	sw s2 , 60(sp)
	lw s2 , 64(sp)
	lw s3 , 60(sp)
	mul s2, s2, s3
	sw s2 , 56(sp)
	li s2 , 32
	sw s2 , 52(sp)
	lw s3 , 56(sp)
	lw s2 , 52(sp)
	add s2, s3, s2
	sw s2 , 48(sp)
	li s2 , 8
	sw s2 , 44(sp)
	lw s3 , 48(sp)
	lw s2 , 44(sp)
	div s2, s3, s2
	sw s2 , 40(sp)
	lw s2 , 40(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 36(sp)
	lw s2 , 36(sp)
	mv s2 , s2
	sw s2 , 32(sp)
	li s2 , 110
	sw s2 , 28(sp)
	lw s2 , 32(sp)
	lw s3 , 28(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 24(sp)
	li s2 , 1
	sw s2 , 20(sp)
	lw s2 , 24(sp)
	lw s3 , 20(sp)
	mul s2, s2, s3
	sw s2 , 24(sp)
	lw s2 , 32(sp)
	lw s3 , 24(sp)
	add s2, s2, s3
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	mv s2 , s2
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	mv s2 , s2
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	sw s2 , 216(sp)
	beqz zero,newExpr2.Finish0

newExpr2.Finish0:
	lw s2 , 216(sp)
	sw s2 , 4(sp)
	la s2 , f
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	lw s3 , 4(sp)
	sw s3 , 0(s2)
	lw s2 , 212(sp)
	mv ra , s2
	addi sp,sp,228
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-104
	mv s2 , ra
	sw s2 , 76(sp)
	j entry1
entry1:
	call Init
	li a0 , 110
	call origin
	li s2 , 0
	sw s2 , 72(sp)
	lw s2 , 72(sp)
	sw s2 , 96(sp)
	li s2 , 99
	sw s2 , 68(sp)
	lw s2 , 68(sp)
	sw s2 , 92(sp)
	li s2 , 100
	sw s2 , 64(sp)
	lw s2 , 64(sp)
	sw s2 , 88(sp)
	li s2 , 0
	sw s2 , 60(sp)
	lw s2 , 60(sp)
	sw s2 , 84(sp)
	lw s2 , 92(sp)
	sw s2 , 56(sp)
	lw s2 , 88(sp)
	sw s2 , 52(sp)
	lw s2 , 56(sp)
	mv a0 , s2
	lw s2 , 52(sp)
	mv a1 , s2
	call build
	mv s2 , a0
	sw s2 , 48(sp)
	beqz zero,ForCond11

ForCond11:
	lw s2 , 88(sp)
	sw s2 , 44(sp)
	lw s2 , 92(sp)
	sw s2 , 40(sp)
	lw s2 , 84(sp)
	sw s2 , 36(sp)
	lw s2 , 44(sp)
	mv a0 , s2
	lw s2 , 40(sp)
	mv a1 , s2
	lw s2 , 36(sp)
	mv a2 , s2
	call find
	mv s2 , a0
	sw s2 , 32(sp)
	li s2 , 0
	sw s2 , 28(sp)
	lw s3 , 28(sp)
	lw s2 , 32(sp)
	slt s2, s3, s2
	sw s2 , 24(sp)
	lw s2 , 24(sp)
	bnez s2,ForLoop11
	lw s2 , 24(sp)
	beqz s2,ForFinish11

ForLoop11:
	lw s2 , 88(sp)
	sw s2 , 20(sp)
	lw s2 , 20(sp)
	mv a0 , s2
	call improve
	mv s2 , a0
	sw s2 , 16(sp)
	beqz zero,ForEnd11

ForEnd11:
	beqz zero,ForCond11

ForFinish11:
	la s2 , ans
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	lw s2 , 0(s2)
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	mv a0 , s2
	call toString
	mv s2 , a0
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	mv a0 , s2
	call println
	li s2 , 0
	sw s2 , 4(sp)
	lw s2 , 4(sp)
	sw s2 , 100(sp)
	lw s2 , 100(sp)
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	lw s2 , 76(sp)
	mv ra , s2
	addi sp,sp,104
	ret


    .globl  origin
    .p2align    2
origin:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-272
	mv s2 , ra
	sw s2 , 256(sp)
	j entry2
entry2:
	lw s2 , 268(sp)
	sw s2 , 252(sp)
	beqz zero,newExpr3.dep0.Initial2

newExpr3.dep0.Initial2:
	li s2 , 32
	sw s2 , 248(sp)
	lw s3 , 252(sp)
	lw s2 , 248(sp)
	mul s2, s3, s2
	sw s2 , 244(sp)
	li s2 , 32
	sw s2 , 240(sp)
	lw s2 , 244(sp)
	lw s3 , 240(sp)
	add s2, s2, s3
	sw s2 , 236(sp)
	li s2 , 8
	sw s2 , 232(sp)
	lw s2 , 236(sp)
	lw s3 , 232(sp)
	div s2, s2, s3
	sw s2 , 228(sp)
	lw s2 , 228(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 224(sp)
	lw s2 , 224(sp)
	mv s2 , s2
	sw s2 , 220(sp)
	lw s2 , 220(sp)
	lw s3 , 252(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 216(sp)
	li s2 , 1
	sw s2 , 212(sp)
	lw s2 , 216(sp)
	lw s3 , 212(sp)
	mul s2, s2, s3
	sw s2 , 216(sp)
	lw s3 , 220(sp)
	lw s2 , 216(sp)
	add s2, s3, s2
	sw s2 , 208(sp)
	lw s2 , 208(sp)
	mv s2 , s2
	sw s2 , 204(sp)
	lw s2 , 204(sp)
	mv s2 , s2
	sw s2 , 200(sp)
	lw s2 , 200(sp)
	sw s2 , 264(sp)
	beqz zero,newExpr3.Finish2

newExpr3.Finish2:
	lw s2 , 264(sp)
	sw s2 , 196(sp)
	la s2 , c
	sw s2 , 192(sp)
	lw s2 , 192(sp)
	lw s3 , 196(sp)
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 188(sp)
	la s2 , i
	sw s2 , 184(sp)
	lw s3 , 184(sp)
	lw s2 , 188(sp)
	sw s2 , 0(s3)
	beqz zero,ForCond22

ForCond22:
	la s2 , i
	sw s2 , 180(sp)
	lw s2 , 180(sp)
	lw s2 , 0(s2)
	sw s2 , 180(sp)
	lw s2 , 268(sp)
	sw s2 , 176(sp)
	lw s3 , 180(sp)
	lw s2 , 176(sp)
	slt s2, s3, s2
	sw s2 , 172(sp)
	lw s2 , 172(sp)
	bnez s2,ForLoop22
	lw s2 , 172(sp)
	beqz s2,ForFinish22

ForLoop22:
	la s2 , c
	sw s2 , 168(sp)
	lw s2 , 168(sp)
	lw s2 , 0(s2)
	sw s2 , 168(sp)
	la s2 , i
	sw s2 , 164(sp)
	lw s2 , 164(sp)
	lw s2 , 0(s2)
	sw s2 , 164(sp)
	li s2 , 4
	sw s2 , 160(sp)
	lw s3 , 160(sp)
	lw s2 , 164(sp)
	mul s2, s3, s2
	sw s2 , 160(sp)
	lw s2 , 168(sp)
	lw s3 , 160(sp)
	add s2, s2, s3
	sw s2 , 156(sp)
	lw s2 , 156(sp)
	lw s2 , 0(s2)
	sw s2 , 152(sp)
	lw s2 , 268(sp)
	sw s2 , 148(sp)
	beqz zero,newExpr4.dep0.Initial2

newExpr4.dep0.Initial2:
	li s2 , 32
	sw s2 , 144(sp)
	lw s2 , 148(sp)
	lw s3 , 144(sp)
	mul s2, s2, s3
	sw s2 , 140(sp)
	li s2 , 32
	sw s2 , 136(sp)
	lw s2 , 140(sp)
	lw s3 , 136(sp)
	add s2, s2, s3
	sw s2 , 132(sp)
	li s2 , 8
	sw s2 , 128(sp)
	lw s2 , 132(sp)
	lw s3 , 128(sp)
	div s2, s2, s3
	sw s2 , 124(sp)
	lw s2 , 124(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 120(sp)
	lw s2 , 120(sp)
	mv s2 , s2
	sw s2 , 116(sp)
	lw s2 , 116(sp)
	lw s3 , 148(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 112(sp)
	li s2 , 1
	sw s2 , 108(sp)
	lw s2 , 112(sp)
	lw s3 , 108(sp)
	mul s2, s2, s3
	sw s2 , 112(sp)
	lw s2 , 116(sp)
	lw s3 , 112(sp)
	add s2, s2, s3
	sw s2 , 104(sp)
	lw s2 , 104(sp)
	mv s2 , s2
	sw s2 , 100(sp)
	lw s2 , 100(sp)
	mv s2 , s2
	sw s2 , 96(sp)
	lw s2 , 96(sp)
	sw s2 , 260(sp)
	beqz zero,newExpr4.Finish2

newExpr4.Finish2:
	lw s2 , 260(sp)
	sw s2 , 92(sp)
	lw s2 , 156(sp)
	lw s3 , 92(sp)
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 88(sp)
	la s2 , j
	sw s2 , 84(sp)
	lw s2 , 84(sp)
	lw s3 , 88(sp)
	sw s3 , 0(s2)
	beqz zero,ForCond32

ForCond32:
	la s2 , j
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	lw s2 , 0(s2)
	sw s2 , 80(sp)
	lw s2 , 268(sp)
	sw s2 , 76(sp)
	lw s3 , 80(sp)
	lw s2 , 76(sp)
	slt s2, s3, s2
	sw s2 , 72(sp)
	lw s2 , 72(sp)
	bnez s2,ForLoop32
	lw s2 , 72(sp)
	beqz s2,ForFinish32

ForLoop32:
	la s2 , c
	sw s2 , 68(sp)
	lw s2 , 68(sp)
	lw s2 , 0(s2)
	sw s2 , 68(sp)
	la s2 , i
	sw s2 , 64(sp)
	lw s2 , 64(sp)
	lw s2 , 0(s2)
	sw s2 , 64(sp)
	li s2 , 4
	sw s2 , 60(sp)
	lw s2 , 60(sp)
	lw s3 , 64(sp)
	mul s2, s2, s3
	sw s2 , 60(sp)
	lw s3 , 68(sp)
	lw s2 , 60(sp)
	add s2, s3, s2
	sw s2 , 56(sp)
	lw s2 , 56(sp)
	lw s2 , 0(s2)
	sw s2 , 52(sp)
	la s2 , j
	sw s2 , 48(sp)
	lw s2 , 48(sp)
	lw s2 , 0(s2)
	sw s2 , 48(sp)
	li s2 , 4
	sw s2 , 44(sp)
	lw s3 , 44(sp)
	lw s2 , 48(sp)
	mul s2, s3, s2
	sw s2 , 44(sp)
	lw s2 , 52(sp)
	lw s3 , 44(sp)
	add s2, s2, s3
	sw s2 , 40(sp)
	lw s2 , 40(sp)
	lw s2 , 0(s2)
	sw s2 , 36(sp)
	li s2 , 0
	sw s2 , 32(sp)
	lw s3 , 40(sp)
	lw s2 , 32(sp)
	sw s2 , 0(s3)
	beqz zero,ForEnd32

ForEnd32:
	la s2 , j
	sw s2 , 28(sp)
	lw s2 , 28(sp)
	lw s2 , 0(s2)
	sw s2 , 28(sp)
	li s2 , 1
	sw s2 , 24(sp)
	lw s2 , 28(sp)
	lw s3 , 24(sp)
	add s2, s2, s3
	sw s2 , 20(sp)
	la s2 , j
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	lw s3 , 20(sp)
	sw s3 , 0(s2)
	beqz zero,ForCond32

ForFinish32:
	beqz zero,ForEnd22

ForEnd22:
	la s2 , i
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	lw s2 , 0(s2)
	sw s2 , 12(sp)
	li s2 , 1
	sw s2 , 8(sp)
	lw s3 , 12(sp)
	lw s2 , 8(sp)
	add s2, s3, s2
	sw s2 , 4(sp)
	la s2 , i
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	lw s3 , 4(sp)
	sw s3 , 0(s2)
	beqz zero,ForCond22

ForFinish22:
	lw s2 , 256(sp)
	mv ra , s2
	addi sp,sp,272
	ret


    .globl  build
    .p2align    2
build:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-12
	mv s2 , ra
	j entry3
entry3:
	li s3 , 1
	la s4 , i
	sw s3 , 0(s4)
	beqz zero,ForCond43

ForCond43:
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 49
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop43
	beqz s3,ForFinish43

ForLoop43:
	li s4 , 50
	la s3 , j
	sw s4 , 0(s3)
	beqz zero,ForCond53

ForCond53:
	la s3 , j
	lw s3 , 0(s3)
	la s5 , i
	lw s5 , 0(s5)
	li s4 , 98
	sub s5, s4, s5
	li s4 , 1
	add s4, s5, s4
	slt s3, s4, s3
	xori s3, s3, 1
	bnez s3,ForLoop53
	beqz s3,ForFinish53

ForLoop53:
	la s4 , c
	lw s4 , 0(s4)
	la s5 , i
	lw s5 , 0(s5)
	li s3 , 4
	mul s3, s3, s5
	add s3, s4, s3
	lw s5 , 0(s3)
	la s4 , j
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 1
	sw s3 , 0(s4)
	beqz zero,ForEnd53

ForEnd53:
	la s3 , j
	lw s3 , 0(s3)
	li s4 , 1
	add s3, s3, s4
	la s4 , j
	sw s3 , 0(s4)
	beqz zero,ForCond53

ForFinish53:
	beqz zero,ForEnd43

ForEnd43:
	la s3 , i
	lw s3 , 0(s3)
	li s4 , 1
	add s3, s3, s4
	la s4 , i
	sw s3 , 0(s4)
	beqz zero,ForCond43

ForFinish43:
	li s3 , 1
	la s4 , i
	sw s3 , 0(s4)
	beqz zero,ForCond63

ForCond63:
	la s3 , i
	lw s3 , 0(s3)
	li s4 , 49
	slt s3, s4, s3
	xori s3, s3, 1
	bnez s3,ForLoop63
	beqz s3,ForFinish63

ForLoop63:
	la s4 , c
	lw s4 , 0(s4)
	lw s3 , 8(sp)
	li s5 , 4
	mul s5, s5, s3
	add s3, s4, s5
	lw s4 , 0(s3)
	la s3 , i
	lw s3 , 0(s3)
	li s5 , 4
	mul s5, s5, s3
	add s3, s4, s5
	lw s2 , 0(s3)
	li s4 , 1
	sw s4 , 0(s3)
	beqz zero,ForEnd63

ForEnd63:
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 1
	add s4, s4, s3
	la s3 , i
	sw s4 , 0(s3)
	beqz zero,ForCond63

ForFinish63:
	li s4 , 50
	la s3 , i
	sw s4 , 0(s3)
	beqz zero,ForCond73

ForCond73:
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 98
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop73
	beqz s3,ForFinish73

ForLoop73:
	la s5 , c
	lw s5 , 0(s5)
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s5 , 0(s3)
	lw s4 , 4(sp)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 1
	sw s3 , 0(s4)
	beqz zero,ForEnd73

ForEnd73:
	la s3 , i
	lw s3 , 0(s3)
	li s4 , 1
	add s3, s3, s4
	la s4 , i
	sw s3 , 0(s4)
	beqz zero,ForCond73

ForFinish73:
	li s3 , 0
	sw s3 , 0(sp)
	lw s3 , 0(sp)
	mv a0 , s3
	mv ra , s2
	addi sp,sp,12
	ret


    .globl  find
    .p2align    2
find:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,-24
	mv s2 , ra
	j entry4
entry4:
	li s3 , 0
	la s4 , open
	sw s3 , 0(s4)
	li s3 , 1
	la s4 , closed
	sw s3 , 0(s4)
	li s3 , 1
	la s4 , i
	sw s3 , 0(s4)
	beqz zero,ForCond84

ForCond84:
	la s4 , i
	lw s4 , 0(s4)
	lw s3 , 20(sp)
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop84
	beqz s3,ForFinish84

ForLoop84:
	la s5 , visit
	lw s5 , 0(s5)
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 0
	sw s3 , 0(s4)
	beqz zero,ForEnd84

ForEnd84:
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 1
	add s4, s4, s3
	la s3 , i
	sw s4 , 0(s3)
	beqz zero,ForCond84

ForFinish84:
	la s5 , f
	lw s5 , 0(s5)
	li s3 , 4
	li s4 , 1
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	lw s3 , 16(sp)
	sw s3 , 0(s4)
	la s5 , visit
	lw s5 , 0(s5)
	lw s4 , 16(sp)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 1
	sw s3 , 0(s4)
	la s5 , pre
	lw s5 , 0(s5)
	lw s4 , 16(sp)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 0
	sw s3 , 0(s4)
	li s3 , 0
	sw s3 , 12(sp)
	beqz zero,ForCond94

ForCond94:
	la s4 , open
	lw s4 , 0(s4)
	la s3 , closed
	lw s3 , 0(s3)
	slt s3, s4, s3
	sw s3 , 4(sp)
	bnez s3,Binary0.Right4
	beqz s3,Binary0.Finish4

Binary0.Right4:
	lw s4 , 12(sp)
	li s3 , 0
	xor s3, s4, s3
	seqz s3 , s3
	sw s3 , 4(sp)
	beqz zero,Binary0.Finish4

Binary0.Finish4:
	lw s3 , 4(sp)
	bnez s3,ForLoop94
	beqz s3,ForFinish94

ForLoop94:
	la s4 , open
	lw s4 , 0(s4)
	li s3 , 1
	add s4, s4, s3
	la s3 , open
	sw s4 , 0(s3)
	la s5 , f
	lw s5 , 0(s5)
	la s4 , open
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s4 , 0(s3)
	la s3 , i
	sw s4 , 0(s3)
	li s4 , 1
	la s3 , j
	sw s4 , 0(s3)
	beqz zero,ForCond104

ForCond104:
	la s4 , j
	lw s4 , 0(s4)
	lw s3 , 20(sp)
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop104
	beqz s3,ForFinish104

ForLoop104:
	la s5 , c
	lw s5 , 0(s5)
	la s4 , i
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s5 , 0(s3)
	la s4 , j
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s4 , 0(s3)
	li s3 , 0
	slt s3, s3, s4
	sw s3 , 0(sp)
	bnez s3,Binary1.Right4
	beqz s3,Binary1.Finish4

Binary1.Right4:
	la s5 , visit
	lw s5 , 0(s5)
	la s4 , j
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s4 , 0(s3)
	li s3 , 0
	xor s3, s4, s3
	seqz s3 , s3
	sw s3 , 0(sp)
	beqz zero,Binary1.Finish4

Binary1.Finish4:
	lw s3 , 0(sp)
	bnez s3,IFTrue14
	beqz s3,IFFalse14

IFTrue14:
	la s5 , visit
	lw s5 , 0(s5)
	la s4 , j
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	li s3 , 1
	sw s3 , 0(s4)
	la s4 , closed
	lw s4 , 0(s4)
	li s3 , 1
	add s4, s4, s3
	la s3 , closed
	sw s4 , 0(s3)
	la s5 , f
	lw s5 , 0(s5)
	la s4 , closed
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	la s3 , j
	lw s3 , 0(s3)
	sw s3 , 0(s4)
	la s5 , pre
	lw s5 , 0(s5)
	la s4 , j
	lw s4 , 0(s4)
	li s3 , 4
	mul s3, s3, s4
	add s4, s5, s3
	lw s2 , 0(s4)
	la s3 , i
	lw s3 , 0(s3)
	sw s3 , 0(s4)
	la s4 , closed
	lw s4 , 0(s4)
	lw s3 , 20(sp)
	xor s3, s4, s3
	seqz s3 , s3
	bnez s3,IFTrue24
	beqz s3,IFFalse24

IFTrue24:
	li s3 , 1
	sw s3 , 12(sp)
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
	la s3 , j
	lw s3 , 0(s3)
	li s4 , 1
	add s3, s3, s4
	la s4 , j
	sw s3 , 0(s4)
	beqz zero,ForCond104

ForFinish104:
	beqz zero,ForEnd94

ForEnd94:
	beqz zero,ForCond94

ForFinish94:
	lw s3 , 12(sp)
	sw s3 , 8(sp)
	lw s3 , 8(sp)
	mv a0 , s3
	mv ra , s2
	addi sp,sp,24
	ret


    .globl  improve
    .p2align    2
improve:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-8
	mv s3 , ra
	j entry5
entry5:
	lw s2 , 4(sp)
	la s4 , i
	sw s2 , 0(s4)
	la s2 , ans
	lw s2 , 0(s2)
	li s4 , 1
	add s2, s2, s4
	la s4 , ans
	sw s2 , 0(s4)
	beqz zero,ForCond115

ForCond115:
	la s4 , pre
	lw s4 , 0(s4)
	la s2 , i
	lw s2 , 0(s2)
	li s5 , 4
	mul s5, s5, s2
	add s2, s4, s5
	lw s2 , 0(s2)
	li s4 , 0
	slt s2, s4, s2
	bnez s2,ForLoop115
	beqz s2,ForFinish115

ForLoop115:
	la s2 , pre
	lw s2 , 0(s2)
	la s4 , i
	lw s4 , 0(s4)
	li s5 , 4
	mul s5, s5, s4
	add s2, s2, s5
	lw s4 , 0(s2)
	la s2 , j
	sw s4 , 0(s2)
	la s4 , c
	lw s4 , 0(s4)
	la s2 , j
	lw s2 , 0(s2)
	li s5 , 4
	mul s5, s5, s2
	add s2, s4, s5
	lw s4 , 0(s2)
	la s2 , i
	lw s2 , 0(s2)
	li s5 , 4
	mul s5, s5, s2
	add s4, s4, s5
	lw s2 , 0(s4)
	li s5 , 1
	sub s2, s2, s5
	sw s2 , 0(s4)
	la s2 , c
	lw s2 , 0(s2)
	la s5 , i
	lw s5 , 0(s5)
	li s4 , 4
	mul s4, s4, s5
	add s2, s2, s4
	lw s5 , 0(s2)
	la s4 , j
	lw s4 , 0(s4)
	li s2 , 4
	mul s2, s2, s4
	add s5, s5, s2
	lw s4 , 0(s5)
	li s2 , 1
	add s2, s4, s2
	sw s2 , 0(s5)
	la s4 , j
	lw s4 , 0(s4)
	la s2 , i
	sw s4 , 0(s2)
	beqz zero,ForEnd115

ForEnd115:
	beqz zero,ForCond115

ForFinish115:
	li s2 , 0
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	mv ra , s3
	addi sp,sp,8
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

