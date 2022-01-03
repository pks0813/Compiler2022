	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,-76
	mv s2 , ra
	sw s2 , 68(sp)
	j entry0
entry0:
	beqz zero,newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li s3 , 4
	sw s3 , 64(sp)
	li s4 , 32
	sw s4 , 60(sp)
	lw s5 , 64(sp)
	lw s6 , 60(sp)
	mul s7, s5, s6
	sw s7 , 56(sp)
	li s8 , 32
	sw s8 , 52(sp)
	lw s9 , 56(sp)
	lw s10 , 52(sp)
	add s11, s9, s10
	sw s11 , 48(sp)
	li t0 , 8
	sw t0 , 44(sp)
	lw t1 , 48(sp)
	lw t2 , 44(sp)
	div t3, t1, t2
	sw t3 , 40(sp)
	lw t4 , 40(sp)
	mv a0 , t4
	call malloc
	mv t5 , a0
	sw t5 , 36(sp)
	lw t6 , 36(sp)
	mv s2 , t6
	sw s2 , 32(sp)
	li s3 , 4
	sw s3 , 28(sp)
	lw s4 , 32(sp)
	lw s5 , 28(sp)
	sw s5 , 0(s4)
	li s6 , 4
	sw s6 , 24(sp)
	li s7 , 1
	sw s7 , 20(sp)
	lw s8 , 24(sp)
	lw s9 , 20(sp)
	mul s10, s8, s9
	sw s10 , 24(sp)
	lw s11 , 32(sp)
	lw t0 , 24(sp)
	add t1, s11, t0
	sw t1 , 16(sp)
	lw t2 , 16(sp)
	mv t3 , t2
	sw t3 , 12(sp)
	lw t4 , 12(sp)
	mv t5 , t4
	sw t5 , 8(sp)
	lw t6 , 8(sp)
	sw t6 , 72(sp)
	beqz zero,newExpr0.Finish0

newExpr0.Finish0:
	lw s2 , 72(sp)
	sw s2 , 4(sp)
	la s3 , a
	sw s3 , 0(sp)
	lw s4 , 0(sp)
	lw s5 , 4(sp)
	sw s5 , 0(s4)
	lw s6 , 68(sp)
	mv ra , s6
	addi sp,sp,76
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-636
	mv s2 , ra
	sw s2 , 616(sp)
	j entry1
entry1:
	call Init
	beqz zero,newExpr1.dep0.Initial1

newExpr1.dep0.Initial1:
	li s3 , 4
	sw s3 , 612(sp)
	li s4 , 32
	sw s4 , 608(sp)
	lw s5 , 612(sp)
	lw s6 , 608(sp)
	mul s7, s5, s6
	sw s7 , 604(sp)
	li s8 , 32
	sw s8 , 600(sp)
	lw s9 , 604(sp)
	lw s10 , 600(sp)
	add s11, s9, s10
	sw s11 , 596(sp)
	li t0 , 8
	sw t0 , 592(sp)
	lw t1 , 596(sp)
	lw t2 , 592(sp)
	div t3, t1, t2
	sw t3 , 588(sp)
	lw t4 , 588(sp)
	mv a0 , t4
	call malloc
	mv t5 , a0
	sw t5 , 584(sp)
	lw t6 , 584(sp)
	mv s2 , t6
	sw s2 , 580(sp)
	li s3 , 4
	sw s3 , 576(sp)
	lw s4 , 580(sp)
	lw s5 , 576(sp)
	sw s5 , 0(s4)
	li s6 , 4
	sw s6 , 572(sp)
	li s7 , 1
	sw s7 , 568(sp)
	lw s8 , 572(sp)
	lw s9 , 568(sp)
	mul s10, s8, s9
	sw s10 , 572(sp)
	lw s11 , 580(sp)
	lw t0 , 572(sp)
	add t1, s11, t0
	sw t1 , 564(sp)
	lw t2 , 564(sp)
	mv t3 , t2
	sw t3 , 560(sp)
	lw t4 , 560(sp)
	mv t5 , t4
	sw t5 , 556(sp)
	lw t6 , 556(sp)
	sw t6 , 628(sp)
	beqz zero,newExpr1.Finish1

newExpr1.Finish1:
	lw s2 , 628(sp)
	sw s2 , 552(sp)
	lw s3 , 552(sp)
	sw s3 , 624(sp)
	lw s4 , 624(sp)
	sw s4 , 548(sp)
	li s5 , 4
	sw s5 , 544(sp)
	li s6 , 0
	sw s6 , 540(sp)
	lw s7 , 544(sp)
	lw s8 , 540(sp)
	mul s9, s7, s8
	sw s9 , 544(sp)
	lw s10 , 548(sp)
	lw s11 , 544(sp)
	add t0, s10, s11
	sw t0 , 536(sp)
	lw t1 , 536(sp)
	lw t2 , 0(t1)
	sw t2 , 532(sp)
	la t3 , a
	sw t3 , 528(sp)
	lw t4 , 528(sp)
	lw t5 , 0(t4)
	sw t5 , 528(sp)
	lw t6 , 536(sp)
	lw s2 , 528(sp)
	sw s2 , 0(t6)
	lw s3 , 624(sp)
	sw s3 , 524(sp)
	li s4 , 4
	sw s4 , 520(sp)
	li s5 , 1
	sw s5 , 516(sp)
	lw s6 , 520(sp)
	lw s7 , 516(sp)
	mul s8, s6, s7
	sw s8 , 520(sp)
	lw s9 , 524(sp)
	lw s10 , 520(sp)
	add s11, s9, s10
	sw s11 , 512(sp)
	lw t0 , 512(sp)
	lw t1 , 0(t0)
	sw t1 , 508(sp)
	la t2 , a
	sw t2 , 504(sp)
	lw t3 , 504(sp)
	lw t4 , 0(t3)
	sw t4 , 504(sp)
	lw t5 , 512(sp)
	lw t6 , 504(sp)
	sw t6 , 0(t5)
	lw s2 , 624(sp)
	sw s2 , 500(sp)
	li s3 , 4
	sw s3 , 496(sp)
	li s4 , 2
	sw s4 , 492(sp)
	lw s5 , 496(sp)
	lw s6 , 492(sp)
	mul s7, s5, s6
	sw s7 , 496(sp)
	lw s8 , 500(sp)
	lw s9 , 496(sp)
	add s10, s8, s9
	sw s10 , 488(sp)
	lw s11 , 488(sp)
	lw t0 , 0(s11)
	sw t0 , 484(sp)
	la t1 , a
	sw t1 , 480(sp)
	lw t2 , 480(sp)
	lw t3 , 0(t2)
	sw t3 , 480(sp)
	lw t4 , 488(sp)
	lw t5 , 480(sp)
	sw t5 , 0(t4)
	lw t6 , 624(sp)
	sw t6 , 476(sp)
	li s2 , 4
	sw s2 , 472(sp)
	li s3 , 3
	sw s3 , 468(sp)
	lw s4 , 472(sp)
	lw s5 , 468(sp)
	mul s6, s4, s5
	sw s6 , 472(sp)
	lw s7 , 476(sp)
	lw s8 , 472(sp)
	add s9, s7, s8
	sw s9 , 464(sp)
	lw s10 , 464(sp)
	lw s11 , 0(s10)
	sw s11 , 460(sp)
	la t0 , a
	sw t0 , 456(sp)
	lw t1 , 456(sp)
	lw t2 , 0(t1)
	sw t2 , 456(sp)
	lw t3 , 464(sp)
	lw t4 , 456(sp)
	sw t4 , 0(t3)
	lw t5 , 624(sp)
	sw t5 , 452(sp)
	lw t6 , 452(sp)
	mv s2 , t6
	sw s2 , 448(sp)
	li s3 , 4
	sw s3 , 444(sp)
	li s4 , -1
	sw s4 , 440(sp)
	lw s5 , 444(sp)
	lw s6 , 440(sp)
	mul s7, s5, s6
	sw s7 , 444(sp)
	lw s8 , 448(sp)
	lw s9 , 444(sp)
	add s10, s8, s9
	sw s10 , 436(sp)
	lw s11 , 436(sp)
	lw t0 , 0(s11)
	sw t0 , 432(sp)
	lw t1 , 432(sp)
	mv a0 , t1
	call toString
	mv t2 , a0
	sw t2 , 428(sp)
	lw t3 , 428(sp)
	mv a0 , t3
	call println
	li t4 , 0
	sw t4 , 424(sp)
	lw t5 , 424(sp)
	sw t5 , 620(sp)
	beqz zero,ForCond11

ForCond11:
	lw t6 , 620(sp)
	sw t6 , 420(sp)
	lw s2 , 624(sp)
	sw s2 , 416(sp)
	li s3 , 4
	sw s3 , 412(sp)
	li s4 , 0
	sw s4 , 408(sp)
	lw s5 , 412(sp)
	lw s6 , 408(sp)
	mul s7, s5, s6
	sw s7 , 412(sp)
	lw s8 , 416(sp)
	lw s9 , 412(sp)
	add s10, s8, s9
	sw s10 , 404(sp)
	lw s11 , 404(sp)
	lw t0 , 0(s11)
	sw t0 , 400(sp)
	lw t1 , 400(sp)
	mv t2 , t1
	sw t2 , 396(sp)
	li t3 , 4
	sw t3 , 392(sp)
	li t4 , -1
	sw t4 , 388(sp)
	lw t5 , 392(sp)
	lw t6 , 388(sp)
	mul s2, t5, t6
	sw s2 , 392(sp)
	lw s3 , 396(sp)
	lw s4 , 392(sp)
	add s5, s3, s4
	sw s5 , 384(sp)
	lw s6 , 384(sp)
	lw s7 , 0(s6)
	sw s7 , 380(sp)
	lw s8 , 420(sp)
	lw s9 , 380(sp)
	slt s10, s8, s9
	sw s10 , 376(sp)
	lw s11 , 376(sp)
	bnez s11,ForLoop11
	lw t0 , 376(sp)
	beqz t0,ForFinish11

ForLoop11:
	lw t1 , 624(sp)
	sw t1 , 372(sp)
	li t2 , 4
	sw t2 , 368(sp)
	li t3 , 0
	sw t3 , 364(sp)
	lw t4 , 368(sp)
	lw t5 , 364(sp)
	mul t6, t4, t5
	sw t6 , 368(sp)
	lw s2 , 372(sp)
	lw s3 , 368(sp)
	add s4, s2, s3
	sw s4 , 360(sp)
	lw s5 , 360(sp)
	lw s6 , 0(s5)
	sw s6 , 356(sp)
	lw s7 , 620(sp)
	sw s7 , 352(sp)
	li s8 , 4
	sw s8 , 348(sp)
	lw s9 , 348(sp)
	lw s10 , 352(sp)
	mul s11, s9, s10
	sw s11 , 348(sp)
	lw t0 , 356(sp)
	lw t1 , 348(sp)
	add t2, t0, t1
	sw t2 , 344(sp)
	lw t3 , 344(sp)
	lw t4 , 0(t3)
	sw t4 , 340(sp)
	call getInt
	mv t5 , a0
	sw t5 , 336(sp)
	lw t6 , 344(sp)
	lw s2 , 336(sp)
	sw s2 , 0(t6)
	beqz zero,ForEnd11

ForEnd11:
	lw s3 , 620(sp)
	sw s3 , 332(sp)
	li s4 , 1
	sw s4 , 328(sp)
	lw s5 , 332(sp)
	lw s6 , 328(sp)
	add s7, s5, s6
	sw s7 , 324(sp)
	lw s8 , 324(sp)
	sw s8 , 620(sp)
	beqz zero,ForCond11

ForFinish11:
	li s9 , 0
	sw s9 , 320(sp)
	lw s10 , 320(sp)
	sw s10 , 620(sp)
	beqz zero,ForCond21

ForCond21:
	lw s11 , 620(sp)
	sw s11 , 316(sp)
	lw t0 , 624(sp)
	sw t0 , 312(sp)
	li t1 , 4
	sw t1 , 308(sp)
	li t2 , 1
	sw t2 , 304(sp)
	lw t3 , 308(sp)
	lw t4 , 304(sp)
	mul t5, t3, t4
	sw t5 , 308(sp)
	lw t6 , 312(sp)
	lw s2 , 308(sp)
	add s3, t6, s2
	sw s3 , 300(sp)
	lw s4 , 300(sp)
	lw s5 , 0(s4)
	sw s5 , 296(sp)
	lw s6 , 296(sp)
	mv s7 , s6
	sw s7 , 292(sp)
	li s8 , 4
	sw s8 , 288(sp)
	li s9 , -1
	sw s9 , 284(sp)
	lw s10 , 288(sp)
	lw s11 , 284(sp)
	mul t0, s10, s11
	sw t0 , 288(sp)
	lw t1 , 292(sp)
	lw t2 , 288(sp)
	add t3, t1, t2
	sw t3 , 280(sp)
	lw t4 , 280(sp)
	lw t5 , 0(t4)
	sw t5 , 276(sp)
	lw t6 , 316(sp)
	lw s2 , 276(sp)
	slt s3, t6, s2
	sw s3 , 272(sp)
	lw s4 , 272(sp)
	bnez s4,ForLoop21
	lw s5 , 272(sp)
	beqz s5,ForFinish21

ForLoop21:
	lw s6 , 624(sp)
	sw s6 , 268(sp)
	li s7 , 4
	sw s7 , 264(sp)
	li s8 , 1
	sw s8 , 260(sp)
	lw s9 , 264(sp)
	lw s10 , 260(sp)
	mul s11, s9, s10
	sw s11 , 264(sp)
	lw t0 , 268(sp)
	lw t1 , 264(sp)
	add t2, t0, t1
	sw t2 , 256(sp)
	lw t3 , 256(sp)
	lw t4 , 0(t3)
	sw t4 , 252(sp)
	lw t5 , 620(sp)
	sw t5 , 248(sp)
	li t6 , 4
	sw t6 , 244(sp)
	lw s2 , 244(sp)
	lw s3 , 248(sp)
	mul s4, s2, s3
	sw s4 , 244(sp)
	lw s5 , 252(sp)
	lw s6 , 244(sp)
	add s7, s5, s6
	sw s7 , 240(sp)
	lw s8 , 240(sp)
	lw s9 , 0(s8)
	sw s9 , 236(sp)
	lw s10 , 236(sp)
	mv a0 , s10
	call toString
	mv s11 , a0
	sw s11 , 232(sp)
	lw t0 , 232(sp)
	mv a0 , t0
	call print
	beqz zero,ForEnd21

ForEnd21:
	lw t1 , 620(sp)
	sw t1 , 228(sp)
	li t2 , 1
	sw t2 , 224(sp)
	lw t3 , 228(sp)
	lw t4 , 224(sp)
	add t5, t3, t4
	sw t5 , 220(sp)
	lw t6 , 220(sp)
	sw t6 , 620(sp)
	beqz zero,ForCond21

ForFinish21:
	la s2 , .Str0
	sw s2 , 216(sp)
	lw s3 , 216(sp)
	mv a0 , s3
	call println
	li s4 , 0
	sw s4 , 212(sp)
	lw s5 , 212(sp)
	sw s5 , 620(sp)
	beqz zero,ForCond31

ForCond31:
	lw s6 , 620(sp)
	sw s6 , 208(sp)
	lw s7 , 624(sp)
	sw s7 , 204(sp)
	li s8 , 4
	sw s8 , 200(sp)
	li s9 , 2
	sw s9 , 196(sp)
	lw s10 , 200(sp)
	lw s11 , 196(sp)
	mul t0, s10, s11
	sw t0 , 200(sp)
	lw t1 , 204(sp)
	lw t2 , 200(sp)
	add t3, t1, t2
	sw t3 , 192(sp)
	lw t4 , 192(sp)
	lw t5 , 0(t4)
	sw t5 , 188(sp)
	lw t6 , 188(sp)
	mv s2 , t6
	sw s2 , 184(sp)
	li s3 , 4
	sw s3 , 180(sp)
	li s4 , -1
	sw s4 , 176(sp)
	lw s5 , 180(sp)
	lw s6 , 176(sp)
	mul s7, s5, s6
	sw s7 , 180(sp)
	lw s8 , 184(sp)
	lw s9 , 180(sp)
	add s10, s8, s9
	sw s10 , 172(sp)
	lw s11 , 172(sp)
	lw t0 , 0(s11)
	sw t0 , 168(sp)
	lw t1 , 208(sp)
	lw t2 , 168(sp)
	slt t3, t1, t2
	sw t3 , 164(sp)
	lw t4 , 164(sp)
	bnez t4,ForLoop31
	lw t5 , 164(sp)
	beqz t5,ForFinish31

ForLoop31:
	lw t6 , 624(sp)
	sw t6 , 160(sp)
	li s2 , 4
	sw s2 , 156(sp)
	li s3 , 2
	sw s3 , 152(sp)
	lw s4 , 156(sp)
	lw s5 , 152(sp)
	mul s6, s4, s5
	sw s6 , 156(sp)
	lw s7 , 160(sp)
	lw s8 , 156(sp)
	add s9, s7, s8
	sw s9 , 148(sp)
	lw s10 , 148(sp)
	lw s11 , 0(s10)
	sw s11 , 144(sp)
	lw t0 , 620(sp)
	sw t0 , 140(sp)
	li t1 , 4
	sw t1 , 136(sp)
	lw t2 , 136(sp)
	lw t3 , 140(sp)
	mul t4, t2, t3
	sw t4 , 136(sp)
	lw t5 , 144(sp)
	lw t6 , 136(sp)
	add s2, t5, t6
	sw s2 , 132(sp)
	lw s3 , 132(sp)
	lw s4 , 0(s3)
	sw s4 , 128(sp)
	li s5 , 0
	sw s5 , 124(sp)
	lw s6 , 132(sp)
	lw s7 , 124(sp)
	sw s7 , 0(s6)
	beqz zero,ForEnd31

ForEnd31:
	lw s8 , 620(sp)
	sw s8 , 120(sp)
	li s9 , 1
	sw s9 , 116(sp)
	lw s10 , 120(sp)
	lw s11 , 116(sp)
	add t0, s10, s11
	sw t0 , 112(sp)
	lw t1 , 112(sp)
	sw t1 , 620(sp)
	beqz zero,ForCond31

ForFinish31:
	li t2 , 0
	sw t2 , 108(sp)
	lw t3 , 108(sp)
	sw t3 , 620(sp)
	beqz zero,ForCond41

ForCond41:
	lw t4 , 620(sp)
	sw t4 , 104(sp)
	lw t5 , 624(sp)
	sw t5 , 100(sp)
	li t6 , 4
	sw t6 , 96(sp)
	li s2 , 3
	sw s2 , 92(sp)
	lw s3 , 96(sp)
	lw s4 , 92(sp)
	mul s5, s3, s4
	sw s5 , 96(sp)
	lw s6 , 100(sp)
	lw s7 , 96(sp)
	add s8, s6, s7
	sw s8 , 88(sp)
	lw s9 , 88(sp)
	lw s10 , 0(s9)
	sw s10 , 84(sp)
	lw s11 , 84(sp)
	mv t0 , s11
	sw t0 , 80(sp)
	li t1 , 4
	sw t1 , 76(sp)
	li t2 , -1
	sw t2 , 72(sp)
	lw t3 , 76(sp)
	lw t4 , 72(sp)
	mul t5, t3, t4
	sw t5 , 76(sp)
	lw t6 , 80(sp)
	lw s2 , 76(sp)
	add s3, t6, s2
	sw s3 , 68(sp)
	lw s4 , 68(sp)
	lw s5 , 0(s4)
	sw s5 , 64(sp)
	lw s6 , 104(sp)
	lw s7 , 64(sp)
	slt s8, s6, s7
	sw s8 , 60(sp)
	lw s9 , 60(sp)
	bnez s9,ForLoop41
	lw s10 , 60(sp)
	beqz s10,ForFinish41

ForLoop41:
	lw s11 , 624(sp)
	sw s11 , 56(sp)
	li t0 , 4
	sw t0 , 52(sp)
	li t1 , 3
	sw t1 , 48(sp)
	lw t2 , 52(sp)
	lw t3 , 48(sp)
	mul t4, t2, t3
	sw t4 , 52(sp)
	lw t5 , 56(sp)
	lw t6 , 52(sp)
	add s2, t5, t6
	sw s2 , 44(sp)
	lw s3 , 44(sp)
	lw s4 , 0(s3)
	sw s4 , 40(sp)
	lw s5 , 620(sp)
	sw s5 , 36(sp)
	li s6 , 4
	sw s6 , 32(sp)
	lw s7 , 32(sp)
	lw s8 , 36(sp)
	mul s9, s7, s8
	sw s9 , 32(sp)
	lw s10 , 40(sp)
	lw s11 , 32(sp)
	add t0, s10, s11
	sw t0 , 28(sp)
	lw t1 , 28(sp)
	lw t2 , 0(t1)
	sw t2 , 24(sp)
	lw t3 , 24(sp)
	mv a0 , t3
	call toString
	mv t4 , a0
	sw t4 , 20(sp)
	lw t5 , 20(sp)
	mv a0 , t5
	call print
	beqz zero,ForEnd41

ForEnd41:
	lw t6 , 620(sp)
	sw t6 , 16(sp)
	li s2 , 1
	sw s2 , 12(sp)
	lw s3 , 16(sp)
	lw s4 , 12(sp)
	add s5, s3, s4
	sw s5 , 8(sp)
	lw s6 , 8(sp)
	sw s6 , 620(sp)
	beqz zero,ForCond41

ForFinish41:
	li s7 , 0
	sw s7 , 4(sp)
	lw s8 , 4(sp)
	sw s8 , 632(sp)
	lw s9 , 632(sp)
	sw s9 , 0(sp)
	lw s10 , 0(sp)
	mv a0 , s10
	lw s11 , 616(sp)
	mv ra , s11
	addi sp,sp,636
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

