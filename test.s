	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,-4
	mv s2 , ra
	sw s2 , 0(sp)
	j entry0
entry0:
	lw s3 , 0(sp)
	mv ra , s3
	addi sp,sp,4
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-300
	mv s2 , ra
	sw s2 , 272(sp)
	j entry1
entry1:
	call Init
	li a0 , 4
	call malloc
	mv s3 , a0
	sw s3 , 268(sp)
	lw s4 , 268(sp)
	mv s5 , s4
	sw s5 , 264(sp)
	lw s6 , 264(sp)
	mv a0 , s6
	call _struct_vector_vector
	lw s7 , 264(sp)
	sw s7 , 292(sp)
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li s8 , 10
	sw s8 , 260(sp)
	li s9 , 32
	sw s9 , 256(sp)
	lw s10 , 260(sp)
	lw s11 , 256(sp)
	mul t0, s10, s11
	sw t0 , 252(sp)
	li t1 , 32
	sw t1 , 248(sp)
	lw t2 , 252(sp)
	lw t3 , 248(sp)
	add t4, t2, t3
	sw t4 , 244(sp)
	li t5 , 8
	sw t5 , 240(sp)
	lw t6 , 244(sp)
	lw s2 , 240(sp)
	div s3, t6, s2
	sw s3 , 236(sp)
	lw s4 , 236(sp)
	mv a0 , s4
	call malloc
	mv s5 , a0
	sw s5 , 232(sp)
	lw s6 , 232(sp)
	mv s7 , s6
	sw s7 , 228(sp)
	li s8 , 10
	sw s8 , 224(sp)
	lw s9 , 228(sp)
	lw s10 , 224(sp)
	sw s10 , 0(s9)
	li s11 , 4
	sw s11 , 220(sp)
	li t0 , 1
	sw t0 , 216(sp)
	lw t1 , 220(sp)
	lw t2 , 216(sp)
	mul t3, t1, t2
	sw t3 , 220(sp)
	lw t4 , 228(sp)
	lw t5 , 220(sp)
	add t6, t4, t5
	sw t6 , 212(sp)
	lw s2 , 212(sp)
	mv s3 , s2
	sw s3 , 208(sp)
	lw s4 , 208(sp)
	mv s5 , s4
	sw s5 , 204(sp)
	lw s6 , 204(sp)
	sw s6 , 288(sp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw s7 , 288(sp)
	sw s7 , 200(sp)
	lw s8 , 200(sp)
	sw s8 , 284(sp)
	li s9 , 0
	sw s9 , 196(sp)
	lw s10 , 196(sp)
	sw s10 , 280(sp)
	beqz zero,ForCond11

ForCond11:
	lw s11 , 280(sp)
	sw s11 , 192(sp)
	li t0 , 10
	sw t0 , 188(sp)
	lw t1 , 192(sp)
	lw t2 , 188(sp)
	slt t3, t1, t2
	sw t3 , 184(sp)
	lw t4 , 184(sp)
	bnez t4,ForLoop11
	lw t5 , 184(sp)
	beqz t5,ForFinish11

ForLoop11:
	lw t6 , 284(sp)
	sw t6 , 180(sp)
	lw s2 , 280(sp)
	sw s2 , 176(sp)
	li s3 , 4
	sw s3 , 172(sp)
	lw s4 , 172(sp)
	lw s5 , 176(sp)
	mul s6, s4, s5
	sw s6 , 172(sp)
	lw s7 , 180(sp)
	lw s8 , 172(sp)
	add s9, s7, s8
	sw s9 , 168(sp)
	lw s10 , 168(sp)
	lw s11 , 0(s10)
	sw s11 , 164(sp)
	lw t0 , 280(sp)
	sw t0 , 160(sp)
	li t1 , 9
	sw t1 , 156(sp)
	lw t2 , 156(sp)
	lw t3 , 160(sp)
	sub t4, t2, t3
	sw t4 , 152(sp)
	lw t5 , 168(sp)
	lw t6 , 152(sp)
	sw t6 , 0(t5)
	beqz zero,ForEnd11

ForEnd11:
	lw s2 , 280(sp)
	sw s2 , 148(sp)
	li s3 , 1
	sw s3 , 144(sp)
	lw s4 , 148(sp)
	lw s5 , 144(sp)
	add s6, s4, s5
	sw s6 , 140(sp)
	lw s7 , 140(sp)
	sw s7 , 280(sp)
	beqz zero,ForCond11

ForFinish11:
	lw s8 , 292(sp)
	sw s8 , 136(sp)
	lw s9 , 284(sp)
	sw s9 , 132(sp)
	lw s10 , 136(sp)
	mv a0 , s10
	lw s11 , 132(sp)
	mv a1 , s11
	call _struct_vector_init
	la t0 , .Str0
	sw t0 , 128(sp)
	lw t1 , 128(sp)
	mv a0 , t1
	call print
	lw t2 , 292(sp)
	sw t2 , 124(sp)
	lw t3 , 124(sp)
	mv a0 , t3
	call _struct_vector_tostring
	mv t4 , a0
	sw t4 , 120(sp)
	lw t5 , 120(sp)
	mv a0 , t5
	call println
	li a0 , 4
	call malloc
	mv t6 , a0
	sw t6 , 116(sp)
	lw s2 , 116(sp)
	mv s3 , s2
	sw s3 , 112(sp)
	lw s4 , 112(sp)
	mv a0 , s4
	call _struct_vector_vector
	lw s5 , 112(sp)
	sw s5 , 276(sp)
	lw s6 , 276(sp)
	sw s6 , 108(sp)
	lw s7 , 292(sp)
	sw s7 , 104(sp)
	lw s8 , 108(sp)
	mv a0 , s8
	lw s9 , 104(sp)
	mv a1 , s9
	call _struct_vector_copy
	mv s10 , a0
	sw s10 , 100(sp)
	lw s11 , 276(sp)
	sw s11 , 96(sp)
	lw t0 , 96(sp)
	mv a0 , t0
	li a1 , 3
	li a2 , 817
	call _struct_vector_set
	mv t1 , a0
	sw t1 , 92(sp)
	lw t2 , 92(sp)
	bnez t2,IFTrue11
	lw t3 , 92(sp)
	beqz t3,IFFalse11

IFTrue11:
	la t4 , .Str1
	sw t4 , 88(sp)
	lw t5 , 88(sp)
	mv a0 , t5
	call println
	beqz zero,IFFinish11

IFFalse11:
	beqz zero,IFFinish11

IFFinish11:
	la t6 , .Str2
	sw t6 , 84(sp)
	lw s2 , 84(sp)
	mv a0 , s2
	call print
	lw s3 , 276(sp)
	sw s3 , 80(sp)
	lw s4 , 80(sp)
	mv a0 , s4
	call _struct_vector_tostring
	mv s5 , a0
	sw s5 , 76(sp)
	lw s6 , 76(sp)
	mv a0 , s6
	call println
	la s7 , .Str3
	sw s7 , 72(sp)
	lw s8 , 72(sp)
	mv a0 , s8
	call print
	lw s9 , 292(sp)
	sw s9 , 68(sp)
	lw s10 , 276(sp)
	sw s10 , 64(sp)
	lw s11 , 68(sp)
	mv a0 , s11
	lw t0 , 64(sp)
	mv a1 , t0
	call _struct_vector_add
	mv t1 , a0
	sw t1 , 60(sp)
	lw t2 , 60(sp)
	mv a0 , t2
	call _struct_vector_tostring
	mv t3 , a0
	sw t3 , 56(sp)
	lw t4 , 56(sp)
	mv a0 , t4
	call println
	la t5 , .Str4
	sw t5 , 52(sp)
	lw t6 , 52(sp)
	mv a0 , t6
	call print
	lw s2 , 292(sp)
	sw s2 , 48(sp)
	lw s3 , 276(sp)
	sw s3 , 44(sp)
	lw s4 , 48(sp)
	mv a0 , s4
	lw s5 , 44(sp)
	mv a1 , s5
	call _struct_vector_dot
	mv s6 , a0
	sw s6 , 40(sp)
	lw s7 , 40(sp)
	mv a0 , s7
	call toString
	mv s8 , a0
	sw s8 , 36(sp)
	lw s9 , 36(sp)
	mv a0 , s9
	call println
	la s10 , .Str5
	sw s10 , 32(sp)
	lw s11 , 32(sp)
	mv a0 , s11
	call print
	lw t0 , 276(sp)
	sw t0 , 28(sp)
	li t1 , 1
	sw t1 , 24(sp)
	li t2 , 3
	sw t2 , 20(sp)
	lw t3 , 24(sp)
	lw t4 , 20(sp)
	sll t5, t3, t4
	sw t5 , 16(sp)
	lw t6 , 28(sp)
	mv a0 , t6
	lw s2 , 16(sp)
	mv a1 , s2
	call _struct_vector_scalarInPlaceMultiply
	mv s3 , a0
	sw s3 , 12(sp)
	lw s4 , 12(sp)
	mv a0 , s4
	call _struct_vector_tostring
	mv s5 , a0
	sw s5 , 8(sp)
	lw s6 , 8(sp)
	mv a0 , s6
	call println
	li s7 , 0
	sw s7 , 4(sp)
	lw s8 , 4(sp)
	sw s8 , 296(sp)
	lw s9 , 296(sp)
	sw s9 , 0(sp)
	lw s10 , 0(sp)
	mv a0 , s10
	lw s11 , 272(sp)
	mv ra , s11
	addi sp,sp,300
	ret


    .globl  _struct_vector_init
    .p2align    2
_struct_vector_init:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-216
	mv s2 , ra
	sw s2 , 196(sp)
	j entry2
entry2:
	lw s3 , 208(sp)
	sw s3 , 192(sp)
	li s4 , 0
	sw s4 , 188(sp)
	lw s5 , 192(sp)
	lw s6 , 188(sp)
	xor s7, s5, s6
	sw s7 , 184(sp)
	lw s8 , 184(sp)
	seqz s9 , s8
	sw s9 , 184(sp)
	lw s10 , 184(sp)
	bnez s10,IFTrue22
	lw s11 , 184(sp)
	beqz s11,IFFalse22

IFTrue22:
	lw t0 , 196(sp)
	mv ra , t0
	addi sp,sp,216
	ret

IFFalse22:
	beqz zero,IFFinish22

IFFinish22:
	lw t1 , 212(sp)
	sw t1 , 180(sp)
	lw t2 , 180(sp)
	addi t3, t2, 0
	sw t3 , 176(sp)
	lw t4 , 208(sp)
	sw t4 , 172(sp)
	lw t5 , 172(sp)
	mv t6 , t5
	sw t6 , 168(sp)
	li s2 , 4
	sw s2 , 164(sp)
	li s3 , -1
	sw s3 , 160(sp)
	lw s4 , 164(sp)
	lw s5 , 160(sp)
	mul s6, s4, s5
	sw s6 , 164(sp)
	lw s7 , 168(sp)
	lw s8 , 164(sp)
	add s9, s7, s8
	sw s9 , 156(sp)
	lw s10 , 156(sp)
	lw s11 , 0(s10)
	sw s11 , 152(sp)
	beqz zero,newExpr1.dep0.Initial2

newExpr1.dep0.Initial2:
	li t0 , 32
	sw t0 , 148(sp)
	lw t1 , 152(sp)
	lw t2 , 148(sp)
	mul t3, t1, t2
	sw t3 , 144(sp)
	li t4 , 32
	sw t4 , 140(sp)
	lw t5 , 144(sp)
	lw t6 , 140(sp)
	add s2, t5, t6
	sw s2 , 136(sp)
	li s3 , 8
	sw s3 , 132(sp)
	lw s4 , 136(sp)
	lw s5 , 132(sp)
	div s6, s4, s5
	sw s6 , 128(sp)
	lw s7 , 128(sp)
	mv a0 , s7
	call malloc
	mv s8 , a0
	sw s8 , 124(sp)
	lw s9 , 124(sp)
	mv s10 , s9
	sw s10 , 120(sp)
	lw s11 , 120(sp)
	lw t0 , 152(sp)
	sw t0 , 0(s11)
	li t1 , 4
	sw t1 , 116(sp)
	li t2 , 1
	sw t2 , 112(sp)
	lw t3 , 116(sp)
	lw t4 , 112(sp)
	mul t5, t3, t4
	sw t5 , 116(sp)
	lw t6 , 120(sp)
	lw s2 , 116(sp)
	add s3, t6, s2
	sw s3 , 108(sp)
	lw s4 , 108(sp)
	mv s5 , s4
	sw s5 , 104(sp)
	lw s6 , 104(sp)
	mv s7 , s6
	sw s7 , 100(sp)
	lw s8 , 100(sp)
	sw s8 , 204(sp)
	beqz zero,newExpr1.Finish2

newExpr1.Finish2:
	lw s9 , 204(sp)
	sw s9 , 96(sp)
	lw s10 , 176(sp)
	lw s11 , 96(sp)
	sw s11 , 0(s10)
	li t0 , 0
	sw t0 , 92(sp)
	lw t1 , 92(sp)
	sw t1 , 200(sp)
	beqz zero,ForCond22

ForCond22:
	lw t2 , 200(sp)
	sw t2 , 88(sp)
	lw t3 , 208(sp)
	sw t3 , 84(sp)
	lw t4 , 84(sp)
	mv t5 , t4
	sw t5 , 80(sp)
	li t6 , 4
	sw t6 , 76(sp)
	li s2 , -1
	sw s2 , 72(sp)
	lw s3 , 76(sp)
	lw s4 , 72(sp)
	mul s5, s3, s4
	sw s5 , 76(sp)
	lw s6 , 80(sp)
	lw s7 , 76(sp)
	add s8, s6, s7
	sw s8 , 68(sp)
	lw s9 , 68(sp)
	lw s10 , 0(s9)
	sw s10 , 64(sp)
	lw s11 , 88(sp)
	lw t0 , 64(sp)
	slt t1, s11, t0
	sw t1 , 60(sp)
	lw t2 , 60(sp)
	bnez t2,ForLoop22
	lw t3 , 60(sp)
	beqz t3,ForFinish22

ForLoop22:
	lw t4 , 212(sp)
	sw t4 , 56(sp)
	lw t5 , 56(sp)
	addi t6, t5, 0
	sw t6 , 52(sp)
	lw s2 , 52(sp)
	lw s3 , 0(s2)
	sw s3 , 48(sp)
	lw s4 , 200(sp)
	sw s4 , 44(sp)
	li s5 , 4
	sw s5 , 40(sp)
	lw s6 , 40(sp)
	lw s7 , 44(sp)
	mul s8, s6, s7
	sw s8 , 40(sp)
	lw s9 , 48(sp)
	lw s10 , 40(sp)
	add s11, s9, s10
	sw s11 , 36(sp)
	lw t0 , 36(sp)
	lw t1 , 0(t0)
	sw t1 , 32(sp)
	lw t2 , 208(sp)
	sw t2 , 28(sp)
	lw t3 , 200(sp)
	sw t3 , 24(sp)
	li t4 , 4
	sw t4 , 20(sp)
	lw t5 , 20(sp)
	lw t6 , 24(sp)
	mul s2, t5, t6
	sw s2 , 20(sp)
	lw s3 , 28(sp)
	lw s4 , 20(sp)
	add s5, s3, s4
	sw s5 , 16(sp)
	lw s6 , 16(sp)
	lw s7 , 0(s6)
	sw s7 , 12(sp)
	lw s8 , 36(sp)
	lw s9 , 12(sp)
	sw s9 , 0(s8)
	beqz zero,ForEnd22

ForEnd22:
	lw s10 , 200(sp)
	sw s10 , 8(sp)
	li s11 , 1
	sw s11 , 4(sp)
	lw t0 , 8(sp)
	lw t1 , 4(sp)
	add t2, t0, t1
	sw t2 , 0(sp)
	lw t3 , 0(sp)
	sw t3 , 200(sp)
	beqz zero,ForCond22

ForFinish22:
	lw t4 , 196(sp)
	mv ra , t4
	addi sp,sp,216
	ret


    .globl  _struct_vector_getDim
    .p2align    2
_struct_vector_getDim:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-76
	mv s2 , ra
	sw s2 , 64(sp)
	j entry3
entry3:
	lw s3 , 72(sp)
	sw s3 , 60(sp)
	lw s4 , 60(sp)
	addi s5, s4, 0
	sw s5 , 56(sp)
	lw s6 , 56(sp)
	lw s7 , 0(s6)
	sw s7 , 52(sp)
	li s8 , 0
	sw s8 , 48(sp)
	lw s9 , 52(sp)
	lw s10 , 48(sp)
	xor s11, s9, s10
	sw s11 , 44(sp)
	lw t0 , 44(sp)
	seqz t1 , t0
	sw t1 , 44(sp)
	lw t2 , 44(sp)
	bnez t2,IFTrue33
	lw t3 , 44(sp)
	beqz t3,IFFalse33

IFTrue33:
	li t4 , 0
	sw t4 , 40(sp)
	lw t5 , 40(sp)
	sw t5 , 68(sp)
	lw t6 , 68(sp)
	sw t6 , 36(sp)
	lw s2 , 36(sp)
	mv a0 , s2
	lw s3 , 64(sp)
	mv ra , s3
	addi sp,sp,76
	ret

IFFalse33:
	beqz zero,IFFinish33

IFFinish33:
	lw s4 , 72(sp)
	sw s4 , 32(sp)
	lw s5 , 32(sp)
	addi s6, s5, 0
	sw s6 , 28(sp)
	lw s7 , 28(sp)
	lw s8 , 0(s7)
	sw s8 , 24(sp)
	lw s9 , 24(sp)
	mv s10 , s9
	sw s10 , 20(sp)
	li s11 , 4
	sw s11 , 16(sp)
	li t0 , -1
	sw t0 , 12(sp)
	lw t1 , 16(sp)
	lw t2 , 12(sp)
	mul t3, t1, t2
	sw t3 , 16(sp)
	lw t4 , 20(sp)
	lw t5 , 16(sp)
	add t6, t4, t5
	sw t6 , 8(sp)
	lw s2 , 8(sp)
	lw s3 , 0(s2)
	sw s3 , 4(sp)
	lw s4 , 4(sp)
	sw s4 , 68(sp)
	lw s5 , 68(sp)
	sw s5 , 0(sp)
	lw s6 , 0(sp)
	mv a0 , s6
	lw s7 , 64(sp)
	mv ra , s7
	addi sp,sp,76
	ret


    .globl  _struct_vector_dot
    .p2align    2
_struct_vector_dot:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-128
	mv s2 , ra
	sw s2 , 104(sp)
	j entry4
entry4:
	li s3 , 0
	sw s3 , 100(sp)
	lw s4 , 100(sp)
	sw s4 , 112(sp)
	li s5 , 0
	sw s5 , 96(sp)
	lw s6 , 96(sp)
	sw s6 , 108(sp)
	beqz zero,ForCond34

ForCond34:
	lw s7 , 112(sp)
	sw s7 , 92(sp)
	lw s8 , 124(sp)
	sw s8 , 88(sp)
	lw s9 , 88(sp)
	mv a0 , s9
	call _struct_vector_getDim
	mv s10 , a0
	sw s10 , 84(sp)
	lw s11 , 92(sp)
	lw t0 , 84(sp)
	slt t1, s11, t0
	sw t1 , 80(sp)
	lw t2 , 80(sp)
	bnez t2,ForLoop34
	lw t3 , 80(sp)
	beqz t3,ForFinish34

ForLoop34:
	lw t4 , 124(sp)
	sw t4 , 76(sp)
	lw t5 , 76(sp)
	addi t6, t5, 0
	sw t6 , 72(sp)
	lw s2 , 72(sp)
	lw s3 , 0(s2)
	sw s3 , 68(sp)
	lw s4 , 112(sp)
	sw s4 , 64(sp)
	li s5 , 4
	sw s5 , 60(sp)
	lw s6 , 60(sp)
	lw s7 , 64(sp)
	mul s8, s6, s7
	sw s8 , 60(sp)
	lw s9 , 68(sp)
	lw s10 , 60(sp)
	add s11, s9, s10
	sw s11 , 56(sp)
	lw t0 , 56(sp)
	lw t1 , 0(t0)
	sw t1 , 52(sp)
	lw t2 , 120(sp)
	sw t2 , 48(sp)
	lw t3 , 48(sp)
	addi t4, t3, 0
	sw t4 , 44(sp)
	lw t5 , 44(sp)
	lw t6 , 0(t5)
	sw t6 , 40(sp)
	lw s2 , 112(sp)
	sw s2 , 36(sp)
	li s3 , 4
	sw s3 , 32(sp)
	lw s4 , 32(sp)
	lw s5 , 36(sp)
	mul s6, s4, s5
	sw s6 , 32(sp)
	lw s7 , 40(sp)
	lw s8 , 32(sp)
	add s9, s7, s8
	sw s9 , 28(sp)
	lw s10 , 28(sp)
	lw s11 , 0(s10)
	sw s11 , 24(sp)
	lw t0 , 52(sp)
	lw t1 , 24(sp)
	mul t2, t0, t1
	sw t2 , 20(sp)
	lw t3 , 20(sp)
	sw t3 , 108(sp)
	lw t4 , 112(sp)
	sw t4 , 16(sp)
	li t5 , 1
	sw t5 , 12(sp)
	lw t6 , 16(sp)
	lw s2 , 12(sp)
	add s3, t6, s2
	sw s3 , 8(sp)
	lw s4 , 8(sp)
	sw s4 , 112(sp)
	beqz zero,ForEnd34

ForEnd34:
	beqz zero,ForCond34

ForFinish34:
	lw s5 , 108(sp)
	sw s5 , 4(sp)
	lw s6 , 4(sp)
	sw s6 , 116(sp)
	lw s7 , 116(sp)
	sw s7 , 0(sp)
	lw s8 , 0(sp)
	mv a0 , s8
	lw s9 , 104(sp)
	mv ra , s9
	addi sp,sp,128
	ret


    .globl  _struct_vector_scalarInPlaceMultiply
    .p2align    2
_struct_vector_scalarInPlaceMultiply:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-152
	mv s2 , ra
	sw s2 , 132(sp)
	j entry5
entry5:
	lw s3 , 148(sp)
	sw s3 , 128(sp)
	lw s4 , 128(sp)
	addi s5, s4, 0
	sw s5 , 124(sp)
	lw s6 , 124(sp)
	lw s7 , 0(s6)
	sw s7 , 120(sp)
	li s8 , 0
	sw s8 , 116(sp)
	lw s9 , 120(sp)
	lw s10 , 116(sp)
	xor s11, s9, s10
	sw s11 , 112(sp)
	lw t0 , 112(sp)
	seqz t1 , t0
	sw t1 , 112(sp)
	lw t2 , 112(sp)
	bnez t2,IFTrue45
	lw t3 , 112(sp)
	beqz t3,IFFalse45

IFTrue45:
	li t4 , 0
	sw t4 , 108(sp)
	lw t5 , 108(sp)
	sw t5 , 140(sp)
	lw t6 , 140(sp)
	sw t6 , 104(sp)
	lw s2 , 104(sp)
	mv a0 , s2
	lw s3 , 132(sp)
	mv ra , s3
	addi sp,sp,152
	ret

IFFalse45:
	beqz zero,IFFinish45

IFFinish45:
	li s4 , 0
	sw s4 , 100(sp)
	lw s5 , 100(sp)
	sw s5 , 136(sp)
	beqz zero,ForCond45

ForCond45:
	lw s6 , 136(sp)
	sw s6 , 96(sp)
	lw s7 , 148(sp)
	sw s7 , 92(sp)
	lw s8 , 92(sp)
	mv a0 , s8
	call _struct_vector_getDim
	mv s9 , a0
	sw s9 , 88(sp)
	lw s10 , 96(sp)
	lw s11 , 88(sp)
	slt t0, s10, s11
	sw t0 , 84(sp)
	lw t1 , 84(sp)
	bnez t1,ForLoop45
	lw t2 , 84(sp)
	beqz t2,ForFinish45

ForLoop45:
	lw t3 , 148(sp)
	sw t3 , 80(sp)
	lw t4 , 80(sp)
	addi t5, t4, 0
	sw t5 , 76(sp)
	lw t6 , 76(sp)
	lw s2 , 0(t6)
	sw s2 , 72(sp)
	lw s3 , 136(sp)
	sw s3 , 68(sp)
	li s4 , 4
	sw s4 , 64(sp)
	lw s5 , 64(sp)
	lw s6 , 68(sp)
	mul s7, s5, s6
	sw s7 , 64(sp)
	lw s8 , 72(sp)
	lw s9 , 64(sp)
	add s10, s8, s9
	sw s10 , 60(sp)
	lw s11 , 60(sp)
	lw t0 , 0(s11)
	sw t0 , 56(sp)
	lw t1 , 144(sp)
	sw t1 , 52(sp)
	lw t2 , 148(sp)
	sw t2 , 48(sp)
	lw t3 , 48(sp)
	addi t4, t3, 0
	sw t4 , 44(sp)
	lw t5 , 44(sp)
	lw t6 , 0(t5)
	sw t6 , 40(sp)
	lw s2 , 136(sp)
	sw s2 , 36(sp)
	li s3 , 4
	sw s3 , 32(sp)
	lw s4 , 32(sp)
	lw s5 , 36(sp)
	mul s6, s4, s5
	sw s6 , 32(sp)
	lw s7 , 40(sp)
	lw s8 , 32(sp)
	add s9, s7, s8
	sw s9 , 28(sp)
	lw s10 , 28(sp)
	lw s11 , 0(s10)
	sw s11 , 24(sp)
	lw t0 , 52(sp)
	lw t1 , 24(sp)
	mul t2, t0, t1
	sw t2 , 20(sp)
	lw t3 , 60(sp)
	lw t4 , 20(sp)
	sw t4 , 0(t3)
	beqz zero,ForEnd45

ForEnd45:
	lw t5 , 136(sp)
	sw t5 , 16(sp)
	li t6 , 1
	sw t6 , 12(sp)
	lw s2 , 16(sp)
	lw s3 , 12(sp)
	add s4, s2, s3
	sw s4 , 8(sp)
	lw s5 , 8(sp)
	sw s5 , 136(sp)
	beqz zero,ForCond45

ForFinish45:
	lw s6 , 148(sp)
	sw s6 , 4(sp)
	lw s7 , 4(sp)
	sw s7 , 140(sp)
	lw s8 , 140(sp)
	sw s8 , 0(sp)
	lw s9 , 0(sp)
	mv a0 , s9
	lw s10 , 132(sp)
	mv ra , s10
	addi sp,sp,152
	ret


    .globl  _struct_vector_add
    .p2align    2
_struct_vector_add:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-292
	mv s2 , ra
	sw s2 , 260(sp)
	j entry6
entry6:
	lw s3 , 288(sp)
	sw s3 , 256(sp)
	lw s4 , 256(sp)
	mv a0 , s4
	call _struct_vector_getDim
	mv s5 , a0
	sw s5 , 252(sp)
	lw s6 , 284(sp)
	sw s6 , 248(sp)
	lw s7 , 248(sp)
	mv a0 , s7
	call _struct_vector_getDim
	mv s8 , a0
	sw s8 , 244(sp)
	lw s9 , 252(sp)
	lw s10 , 244(sp)
	xor s11, s9, s10
	sw s11 , 240(sp)
	lw t0 , 240(sp)
	snez t1 , t0
	sw t1 , 240(sp)
	lw t2 , 240(sp)
	sw t2 , 276(sp)
	lw t3 , 240(sp)
	bnez t3,Binary0.Finish6
	lw t4 , 240(sp)
	beqz t4,Binary0.Right6

Binary0.Right6:
	lw t5 , 288(sp)
	sw t5 , 236(sp)
	lw t6 , 236(sp)
	mv a0 , t6
	call _struct_vector_getDim
	mv s2 , a0
	sw s2 , 232(sp)
	li s3 , 0
	sw s3 , 228(sp)
	lw s4 , 232(sp)
	lw s5 , 228(sp)
	xor s6, s4, s5
	sw s6 , 224(sp)
	lw s7 , 224(sp)
	seqz s8 , s7
	sw s8 , 224(sp)
	lw s9 , 224(sp)
	sw s9 , 276(sp)
	beqz zero,Binary0.Finish6

Binary0.Finish6:
	lw s10 , 276(sp)
	sw s10 , 220(sp)
	lw s11 , 220(sp)
	bnez s11,IFTrue56
	lw t0 , 220(sp)
	beqz t0,IFFalse56

IFTrue56:
	li t1 , 0
	sw t1 , 216(sp)
	lw t2 , 216(sp)
	sw t2 , 280(sp)
	lw t3 , 280(sp)
	sw t3 , 212(sp)
	lw t4 , 212(sp)
	mv a0 , t4
	lw t5 , 260(sp)
	mv ra , t5
	addi sp,sp,292
	ret

IFFalse56:
	beqz zero,IFFinish56

IFFinish56:
	li a0 , 4
	call malloc
	mv t6 , a0
	sw t6 , 208(sp)
	lw s2 , 208(sp)
	mv s3 , s2
	sw s3 , 204(sp)
	lw s4 , 204(sp)
	mv a0 , s4
	call _struct_vector_vector
	lw s5 , 204(sp)
	sw s5 , 272(sp)
	lw s6 , 272(sp)
	sw s6 , 200(sp)
	lw s7 , 200(sp)
	addi s8, s7, 0
	sw s8 , 196(sp)
	lw s9 , 196(sp)
	lw s10 , 0(s9)
	sw s10 , 192(sp)
	lw s11 , 288(sp)
	sw s11 , 188(sp)
	lw t0 , 188(sp)
	mv a0 , t0
	call _struct_vector_getDim
	mv t1 , a0
	sw t1 , 184(sp)
	beqz zero,newExpr2.dep0.Initial6

newExpr2.dep0.Initial6:
	li t2 , 32
	sw t2 , 180(sp)
	lw t3 , 184(sp)
	lw t4 , 180(sp)
	mul t5, t3, t4
	sw t5 , 176(sp)
	li t6 , 32
	sw t6 , 172(sp)
	lw s2 , 176(sp)
	lw s3 , 172(sp)
	add s4, s2, s3
	sw s4 , 168(sp)
	li s5 , 8
	sw s5 , 164(sp)
	lw s6 , 168(sp)
	lw s7 , 164(sp)
	div s8, s6, s7
	sw s8 , 160(sp)
	lw s9 , 160(sp)
	mv a0 , s9
	call malloc
	mv s10 , a0
	sw s10 , 156(sp)
	lw s11 , 156(sp)
	mv t0 , s11
	sw t0 , 152(sp)
	lw t1 , 152(sp)
	lw t2 , 184(sp)
	sw t2 , 0(t1)
	li t3 , 4
	sw t3 , 148(sp)
	li t4 , 1
	sw t4 , 144(sp)
	lw t5 , 148(sp)
	lw t6 , 144(sp)
	mul s2, t5, t6
	sw s2 , 148(sp)
	lw s3 , 152(sp)
	lw s4 , 148(sp)
	add s5, s3, s4
	sw s5 , 140(sp)
	lw s6 , 140(sp)
	mv s7 , s6
	sw s7 , 136(sp)
	lw s8 , 136(sp)
	mv s9 , s8
	sw s9 , 132(sp)
	lw s10 , 132(sp)
	sw s10 , 264(sp)
	beqz zero,newExpr2.Finish6

newExpr2.Finish6:
	lw s11 , 264(sp)
	sw s11 , 128(sp)
	lw t0 , 196(sp)
	lw t1 , 128(sp)
	sw t1 , 0(t0)
	li t2 , 0
	sw t2 , 124(sp)
	lw t3 , 124(sp)
	sw t3 , 268(sp)
	beqz zero,ForCond56

ForCond56:
	lw t4 , 268(sp)
	sw t4 , 120(sp)
	lw t5 , 288(sp)
	sw t5 , 116(sp)
	lw t6 , 116(sp)
	mv a0 , t6
	call _struct_vector_getDim
	mv s2 , a0
	sw s2 , 112(sp)
	lw s3 , 120(sp)
	lw s4 , 112(sp)
	slt s5, s3, s4
	sw s5 , 108(sp)
	lw s6 , 108(sp)
	bnez s6,ForLoop56
	lw s7 , 108(sp)
	beqz s7,ForFinish56

ForLoop56:
	lw s8 , 272(sp)
	sw s8 , 104(sp)
	lw s9 , 104(sp)
	addi s10, s9, 0
	sw s10 , 100(sp)
	lw s11 , 100(sp)
	lw t0 , 0(s11)
	sw t0 , 96(sp)
	lw t1 , 268(sp)
	sw t1 , 92(sp)
	li t2 , 4
	sw t2 , 88(sp)
	lw t3 , 88(sp)
	lw t4 , 92(sp)
	mul t5, t3, t4
	sw t5 , 88(sp)
	lw t6 , 96(sp)
	lw s2 , 88(sp)
	add s3, t6, s2
	sw s3 , 84(sp)
	lw s4 , 84(sp)
	lw s5 , 0(s4)
	sw s5 , 80(sp)
	lw s6 , 288(sp)
	sw s6 , 76(sp)
	lw s7 , 76(sp)
	addi s8, s7, 0
	sw s8 , 72(sp)
	lw s9 , 72(sp)
	lw s10 , 0(s9)
	sw s10 , 68(sp)
	lw s11 , 268(sp)
	sw s11 , 64(sp)
	li t0 , 4
	sw t0 , 60(sp)
	lw t1 , 60(sp)
	lw t2 , 64(sp)
	mul t3, t1, t2
	sw t3 , 60(sp)
	lw t4 , 68(sp)
	lw t5 , 60(sp)
	add t6, t4, t5
	sw t6 , 56(sp)
	lw s2 , 56(sp)
	lw s3 , 0(s2)
	sw s3 , 52(sp)
	lw s4 , 284(sp)
	sw s4 , 48(sp)
	lw s5 , 48(sp)
	addi s6, s5, 0
	sw s6 , 44(sp)
	lw s7 , 44(sp)
	lw s8 , 0(s7)
	sw s8 , 40(sp)
	lw s9 , 268(sp)
	sw s9 , 36(sp)
	li s10 , 4
	sw s10 , 32(sp)
	lw s11 , 32(sp)
	lw t0 , 36(sp)
	mul t1, s11, t0
	sw t1 , 32(sp)
	lw t2 , 40(sp)
	lw t3 , 32(sp)
	add t4, t2, t3
	sw t4 , 28(sp)
	lw t5 , 28(sp)
	lw t6 , 0(t5)
	sw t6 , 24(sp)
	lw s2 , 52(sp)
	lw s3 , 24(sp)
	add s4, s2, s3
	sw s4 , 20(sp)
	lw s5 , 84(sp)
	lw s6 , 20(sp)
	sw s6 , 0(s5)
	beqz zero,ForEnd56

ForEnd56:
	lw s7 , 268(sp)
	sw s7 , 16(sp)
	li s8 , 1
	sw s8 , 12(sp)
	lw s9 , 16(sp)
	lw s10 , 12(sp)
	add s11, s9, s10
	sw s11 , 8(sp)
	lw t0 , 8(sp)
	sw t0 , 268(sp)
	beqz zero,ForCond56

ForFinish56:
	lw t1 , 272(sp)
	sw t1 , 4(sp)
	lw t2 , 4(sp)
	sw t2 , 280(sp)
	lw t3 , 280(sp)
	sw t3 , 0(sp)
	lw t4 , 0(sp)
	mv a0 , t4
	lw t5 , 260(sp)
	mv ra , t5
	addi sp,sp,292
	ret


    .globl  _struct_vector_set
    .p2align    2
_struct_vector_set:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,-84
	mv s2 , ra
	sw s2 , 64(sp)
	j entry7
entry7:
	lw s3 , 80(sp)
	sw s3 , 60(sp)
	lw s4 , 60(sp)
	mv a0 , s4
	call _struct_vector_getDim
	mv s5 , a0
	sw s5 , 56(sp)
	lw s6 , 76(sp)
	sw s6 , 52(sp)
	lw s7 , 56(sp)
	lw s8 , 52(sp)
	slt s9, s7, s8
	sw s9 , 48(sp)
	lw s10 , 48(sp)
	bnez s10,IFTrue67
	lw s11 , 48(sp)
	beqz s11,IFFalse67

IFTrue67:
	li t0 , 0
	sw t0 , 44(sp)
	lw t1 , 44(sp)
	sw t1 , 68(sp)
	lw t2 , 68(sp)
	sw t2 , 40(sp)
	lw t3 , 40(sp)
	mv a0 , t3
	lw t4 , 64(sp)
	mv ra , t4
	addi sp,sp,84
	ret

IFFalse67:
	beqz zero,IFFinish67

IFFinish67:
	lw t5 , 80(sp)
	sw t5 , 36(sp)
	lw t6 , 36(sp)
	addi s2, t6, 0
	sw s2 , 32(sp)
	lw s3 , 32(sp)
	lw s4 , 0(s3)
	sw s4 , 28(sp)
	lw s5 , 76(sp)
	sw s5 , 24(sp)
	li s6 , 4
	sw s6 , 20(sp)
	lw s7 , 20(sp)
	lw s8 , 24(sp)
	mul s9, s7, s8
	sw s9 , 20(sp)
	lw s10 , 28(sp)
	lw s11 , 20(sp)
	add t0, s10, s11
	sw t0 , 16(sp)
	lw t1 , 16(sp)
	lw t2 , 0(t1)
	sw t2 , 12(sp)
	lw t3 , 72(sp)
	sw t3 , 8(sp)
	lw t4 , 16(sp)
	lw t5 , 8(sp)
	sw t5 , 0(t4)
	li t6 , 1
	sw t6 , 4(sp)
	lw s2 , 4(sp)
	sw s2 , 68(sp)
	lw s3 , 68(sp)
	sw s3 , 0(sp)
	lw s4 , 0(sp)
	mv a0 , s4
	lw s5 , 64(sp)
	mv ra , s5
	addi sp,sp,84
	ret


    .globl  _struct_vector_tostring
    .p2align    2
_struct_vector_tostring:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-180
	mv s2 , ra
	sw s2 , 160(sp)
	j entry8
entry8:
	la s3 , .Str6
	sw s3 , 156(sp)
	lw s4 , 156(sp)
	sw s4 , 168(sp)
	lw s5 , 176(sp)
	sw s5 , 152(sp)
	lw s6 , 152(sp)
	mv a0 , s6
	call _struct_vector_getDim
	mv s7 , a0
	sw s7 , 148(sp)
	li s8 , 0
	sw s8 , 144(sp)
	lw s9 , 144(sp)
	lw s10 , 148(sp)
	slt s11, s9, s10
	sw s11 , 140(sp)
	lw t0 , 140(sp)
	bnez t0,IFTrue78
	lw t1 , 140(sp)
	beqz t1,IFFalse78

IFTrue78:
	lw t2 , 168(sp)
	sw t2 , 136(sp)
	lw t3 , 176(sp)
	sw t3 , 132(sp)
	lw t4 , 132(sp)
	addi t5, t4, 0
	sw t5 , 128(sp)
	lw t6 , 128(sp)
	lw s2 , 0(t6)
	sw s2 , 124(sp)
	li s3 , 4
	sw s3 , 120(sp)
	li s4 , 0
	sw s4 , 116(sp)
	lw s5 , 120(sp)
	lw s6 , 116(sp)
	mul s7, s5, s6
	sw s7 , 120(sp)
	lw s8 , 124(sp)
	lw s9 , 120(sp)
	add s10, s8, s9
	sw s10 , 112(sp)
	lw s11 , 112(sp)
	lw t0 , 0(s11)
	sw t0 , 108(sp)
	lw t1 , 108(sp)
	mv a0 , t1
	call toString
	mv t2 , a0
	sw t2 , 104(sp)
	lw t3 , 136(sp)
	mv a0 , t3
	lw t4 , 104(sp)
	mv a1 , t4
	call _struct_string_AddString
	mv t5 , a0
	sw t5 , 100(sp)
	lw t6 , 100(sp)
	sw t6 , 168(sp)
	beqz zero,IFFinish78

IFFalse78:
	beqz zero,IFFinish78

IFFinish78:
	li s2 , 1
	sw s2 , 96(sp)
	lw s3 , 96(sp)
	sw s3 , 164(sp)
	beqz zero,ForCond68

ForCond68:
	lw s4 , 164(sp)
	sw s4 , 92(sp)
	lw s5 , 176(sp)
	sw s5 , 88(sp)
	lw s6 , 88(sp)
	mv a0 , s6
	call _struct_vector_getDim
	mv s7 , a0
	sw s7 , 84(sp)
	lw s8 , 92(sp)
	lw s9 , 84(sp)
	slt s10, s8, s9
	sw s10 , 80(sp)
	lw s11 , 80(sp)
	bnez s11,ForLoop68
	lw t0 , 80(sp)
	beqz t0,ForFinish68

ForLoop68:
	lw t1 , 168(sp)
	sw t1 , 76(sp)
	la t2 , .Str7
	sw t2 , 72(sp)
	lw t3 , 76(sp)
	mv a0 , t3
	lw t4 , 72(sp)
	mv a1 , t4
	call _struct_string_AddString
	mv t5 , a0
	sw t5 , 68(sp)
	lw t6 , 176(sp)
	sw t6 , 64(sp)
	lw s2 , 64(sp)
	addi s3, s2, 0
	sw s3 , 60(sp)
	lw s4 , 60(sp)
	lw s5 , 0(s4)
	sw s5 , 56(sp)
	lw s6 , 164(sp)
	sw s6 , 52(sp)
	li s7 , 4
	sw s7 , 48(sp)
	lw s8 , 48(sp)
	lw s9 , 52(sp)
	mul s10, s8, s9
	sw s10 , 48(sp)
	lw s11 , 56(sp)
	lw t0 , 48(sp)
	add t1, s11, t0
	sw t1 , 44(sp)
	lw t2 , 44(sp)
	lw t3 , 0(t2)
	sw t3 , 40(sp)
	lw t4 , 40(sp)
	mv a0 , t4
	call toString
	mv t5 , a0
	sw t5 , 36(sp)
	lw t6 , 68(sp)
	mv a0 , t6
	lw s2 , 36(sp)
	mv a1 , s2
	call _struct_string_AddString
	mv s3 , a0
	sw s3 , 32(sp)
	lw s4 , 32(sp)
	sw s4 , 168(sp)
	beqz zero,ForEnd68

ForEnd68:
	lw s5 , 164(sp)
	sw s5 , 28(sp)
	li s6 , 1
	sw s6 , 24(sp)
	lw s7 , 28(sp)
	lw s8 , 24(sp)
	add s9, s7, s8
	sw s9 , 20(sp)
	lw s10 , 20(sp)
	sw s10 , 164(sp)
	beqz zero,ForCond68

ForFinish68:
	lw s11 , 168(sp)
	sw s11 , 16(sp)
	la t0 , .Str8
	sw t0 , 12(sp)
	lw t1 , 16(sp)
	mv a0 , t1
	lw t2 , 12(sp)
	mv a1 , t2
	call _struct_string_AddString
	mv t3 , a0
	sw t3 , 8(sp)
	lw t4 , 8(sp)
	sw t4 , 168(sp)
	lw t5 , 168(sp)
	sw t5 , 4(sp)
	lw t6 , 4(sp)
	sw t6 , 172(sp)
	lw s2 , 172(sp)
	sw s2 , 0(sp)
	lw s3 , 0(sp)
	mv a0 , s3
	lw s4 , 160(sp)
	mv ra , s4
	addi sp,sp,180
	ret


    .globl  _struct_vector_copy
    .p2align    2
_struct_vector_copy:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	addi sp,sp,-240
	mv s2 , ra
	sw s2 , 216(sp)
	j entry9
entry9:
	lw s3 , 232(sp)
	sw s3 , 212(sp)
	li s4 , 0
	sw s4 , 208(sp)
	lw s5 , 212(sp)
	lw s6 , 208(sp)
	xor s7, s5, s6
	sw s7 , 204(sp)
	lw s8 , 204(sp)
	seqz s9 , s8
	sw s9 , 204(sp)
	lw s10 , 204(sp)
	bnez s10,IFTrue89
	lw s11 , 204(sp)
	beqz s11,IFFalse89

IFTrue89:
	li t0 , 0
	sw t0 , 200(sp)
	lw t1 , 200(sp)
	sw t1 , 228(sp)
	lw t2 , 228(sp)
	sw t2 , 196(sp)
	lw t3 , 196(sp)
	mv a0 , t3
	lw t4 , 216(sp)
	mv ra , t4
	addi sp,sp,240
	ret

IFFalse89:
	beqz zero,IFFinish89

IFFinish89:
	lw t5 , 232(sp)
	sw t5 , 192(sp)
	lw t6 , 192(sp)
	mv a0 , t6
	call _struct_vector_getDim
	mv s2 , a0
	sw s2 , 188(sp)
	li s3 , 0
	sw s3 , 184(sp)
	lw s4 , 188(sp)
	lw s5 , 184(sp)
	xor s6, s4, s5
	sw s6 , 180(sp)
	lw s7 , 180(sp)
	seqz s8 , s7
	sw s8 , 180(sp)
	lw s9 , 180(sp)
	bnez s9,IFTrue99
	lw s10 , 180(sp)
	beqz s10,IFFalse99

IFTrue99:
	lw s11 , 236(sp)
	sw s11 , 176(sp)
	lw t0 , 176(sp)
	addi t1, t0, 0
	sw t1 , 172(sp)
	li t2 , 0
	sw t2 , 168(sp)
	lw t3 , 172(sp)
	lw t4 , 168(sp)
	sw t4 , 0(t3)
	beqz zero,IFFinish99

IFFalse99:
	lw t5 , 236(sp)
	sw t5 , 164(sp)
	lw t6 , 164(sp)
	addi s2, t6, 0
	sw s2 , 160(sp)
	lw s3 , 232(sp)
	sw s3 , 156(sp)
	lw s4 , 156(sp)
	mv a0 , s4
	call _struct_vector_getDim
	mv s5 , a0
	sw s5 , 152(sp)
	beqz zero,newExpr3.dep0.Initial9

newExpr3.dep0.Initial9:
	li s6 , 32
	sw s6 , 148(sp)
	lw s7 , 152(sp)
	lw s8 , 148(sp)
	mul s9, s7, s8
	sw s9 , 144(sp)
	li s10 , 32
	sw s10 , 140(sp)
	lw s11 , 144(sp)
	lw t0 , 140(sp)
	add t1, s11, t0
	sw t1 , 136(sp)
	li t2 , 8
	sw t2 , 132(sp)
	lw t3 , 136(sp)
	lw t4 , 132(sp)
	div t5, t3, t4
	sw t5 , 128(sp)
	lw t6 , 128(sp)
	mv a0 , t6
	call malloc
	mv s2 , a0
	sw s2 , 124(sp)
	lw s3 , 124(sp)
	mv s4 , s3
	sw s4 , 120(sp)
	lw s5 , 120(sp)
	lw s6 , 152(sp)
	sw s6 , 0(s5)
	li s7 , 4
	sw s7 , 116(sp)
	li s8 , 1
	sw s8 , 112(sp)
	lw s9 , 116(sp)
	lw s10 , 112(sp)
	mul s11, s9, s10
	sw s11 , 116(sp)
	lw t0 , 120(sp)
	lw t1 , 116(sp)
	add t2, t0, t1
	sw t2 , 108(sp)
	lw t3 , 108(sp)
	mv t4 , t3
	sw t4 , 104(sp)
	lw t5 , 104(sp)
	mv t6 , t5
	sw t6 , 100(sp)
	lw s2 , 100(sp)
	sw s2 , 224(sp)
	beqz zero,newExpr3.Finish9

newExpr3.Finish9:
	lw s3 , 224(sp)
	sw s3 , 96(sp)
	lw s4 , 160(sp)
	lw s5 , 96(sp)
	sw s5 , 0(s4)
	li s6 , 0
	sw s6 , 92(sp)
	lw s7 , 92(sp)
	sw s7 , 220(sp)
	beqz zero,ForCond79

ForCond79:
	lw s8 , 220(sp)
	sw s8 , 88(sp)
	lw s9 , 236(sp)
	sw s9 , 84(sp)
	lw s10 , 84(sp)
	mv a0 , s10
	call _struct_vector_getDim
	mv s11 , a0
	sw s11 , 80(sp)
	lw t0 , 88(sp)
	lw t1 , 80(sp)
	slt t2, t0, t1
	sw t2 , 76(sp)
	lw t3 , 76(sp)
	bnez t3,ForLoop79
	lw t4 , 76(sp)
	beqz t4,ForFinish79

ForLoop79:
	lw t5 , 236(sp)
	sw t5 , 72(sp)
	lw t6 , 72(sp)
	addi s2, t6, 0
	sw s2 , 68(sp)
	lw s3 , 68(sp)
	lw s4 , 0(s3)
	sw s4 , 64(sp)
	lw s5 , 220(sp)
	sw s5 , 60(sp)
	li s6 , 4
	sw s6 , 56(sp)
	lw s7 , 56(sp)
	lw s8 , 60(sp)
	mul s9, s7, s8
	sw s9 , 56(sp)
	lw s10 , 64(sp)
	lw s11 , 56(sp)
	add t0, s10, s11
	sw t0 , 52(sp)
	lw t1 , 52(sp)
	lw t2 , 0(t1)
	sw t2 , 48(sp)
	lw t3 , 232(sp)
	sw t3 , 44(sp)
	lw t4 , 44(sp)
	addi t5, t4, 0
	sw t5 , 40(sp)
	lw t6 , 40(sp)
	lw s2 , 0(t6)
	sw s2 , 36(sp)
	lw s3 , 220(sp)
	sw s3 , 32(sp)
	li s4 , 4
	sw s4 , 28(sp)
	lw s5 , 28(sp)
	lw s6 , 32(sp)
	mul s7, s5, s6
	sw s7 , 28(sp)
	lw s8 , 36(sp)
	lw s9 , 28(sp)
	add s10, s8, s9
	sw s10 , 24(sp)
	lw s11 , 24(sp)
	lw t0 , 0(s11)
	sw t0 , 20(sp)
	lw t1 , 52(sp)
	lw t2 , 20(sp)
	sw t2 , 0(t1)
	beqz zero,ForEnd79

ForEnd79:
	lw t3 , 220(sp)
	sw t3 , 16(sp)
	li t4 , 1
	sw t4 , 12(sp)
	lw t5 , 16(sp)
	lw t6 , 12(sp)
	add s2, t5, t6
	sw s2 , 8(sp)
	lw s3 , 8(sp)
	sw s3 , 220(sp)
	beqz zero,ForCond79

ForFinish79:
	beqz zero,IFFinish99

IFFinish99:
	li s4 , 1
	sw s4 , 4(sp)
	lw s5 , 4(sp)
	sw s5 , 228(sp)
	lw s6 , 228(sp)
	sw s6 , 0(sp)
	lw s7 , 0(sp)
	mv a0 , s7
	lw s8 , 216(sp)
	mv ra , s8
	addi sp,sp,240
	ret


    .globl  _struct_vector_vector
    .p2align    2
_struct_vector_vector:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-8
	mv s2 , ra
	sw s2 , 0(sp)
	j entry10
entry10:
	lw s3 , 0(sp)
	mv ra , s3
	addi sp,sp,8
	ret


	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	"vector x: "
	.size	.Str0, 11

	.type	.Str1,@object           # @.Str1
	.section	.rodata,"a",@progbits
	.globl	.Str1
.Str1:
	.asciz	"excited!"
	.size	.Str1, 9

	.type	.Str2,@object           # @.Str2
	.section	.rodata,"a",@progbits
	.globl	.Str2
.Str2:
	.asciz	"vector y: "
	.size	.Str2, 11

	.type	.Str3,@object           # @.Str3
	.section	.rodata,"a",@progbits
	.globl	.Str3
.Str3:
	.asciz	"x + y: "
	.size	.Str3, 8

	.type	.Str4,@object           # @.Str4
	.section	.rodata,"a",@progbits
	.globl	.Str4
.Str4:
	.asciz	"x * y: "
	.size	.Str4, 8

	.type	.Str5,@object           # @.Str5
	.section	.rodata,"a",@progbits
	.globl	.Str5
.Str5:
	.asciz	"(1 << 3) * y: "
	.size	.Str5, 15

	.type	.Str6,@object           # @.Str6
	.section	.rodata,"a",@progbits
	.globl	.Str6
.Str6:
	.asciz	"( "
	.size	.Str6, 3

	.type	.Str7,@object           # @.Str7
	.section	.rodata,"a",@progbits
	.globl	.Str7
.Str7:
	.asciz	", "
	.size	.Str7, 3

	.type	.Str8,@object           # @.Str8
	.section	.rodata,"a",@progbits
	.globl	.Str8
.Str8:
	.asciz	" )"
	.size	.Str8, 3

