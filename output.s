	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,-12
	mv s2 , ra
	sw s2 , 8(sp)
	j entry0
entry0:
	li s3 , 0
	sw s3 , 4(sp)
	la s4 , M
	sw s4 , 0(sp)
	lw s5 , 0(sp)
	lw s6 , 4(sp)
	sw s6 , 0(s5)
	lw s7 , 8(sp)
	mv ra , s7
	addi sp,sp,12
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-816
	mv s2 , ra
	sw s2 , 768(sp)
	j entry1
entry1:
	call Init
	call getInt
	mv s3 , a0
	sw s3 , 764(sp)
	la s4 , N
	sw s4 , 760(sp)
	lw s5 , 760(sp)
	lw s6 , 764(sp)
	sw s6 , 0(s5)
	la s7 , N
	sw s7 , 756(sp)
	lw s8 , 756(sp)
	lw s9 , 0(s8)
	sw s9 , 756(sp)
	li s10 , 5
	sw s10 , 752(sp)
	lw s11 , 756(sp)
	lw t0 , 752(sp)
	add t1, s11, t0
	sw t1 , 748(sp)
	beqz zero,newExpr0.dep0.Initial1

newExpr0.dep0.Initial1:
	li t2 , 32
	sw t2 , 744(sp)
	lw t3 , 748(sp)
	lw t4 , 744(sp)
	mul t5, t3, t4
	sw t5 , 740(sp)
	li t6 , 32
	sw t6 , 736(sp)
	lw s2 , 740(sp)
	lw s3 , 736(sp)
	add s4, s2, s3
	sw s4 , 732(sp)
	li s5 , 8
	sw s5 , 728(sp)
	lw s6 , 732(sp)
	lw s7 , 728(sp)
	div s8, s6, s7
	sw s8 , 724(sp)
	lw s9 , 724(sp)
	mv a0 , s9
	call malloc
	mv s10 , a0
	sw s10 , 720(sp)
	lw s11 , 720(sp)
	mv t0 , s11
	sw t0 , 716(sp)
	lw t1 , 716(sp)
	lw t2 , 748(sp)
	sw t2 , 0(t1)
	li t3 , 4
	sw t3 , 712(sp)
	li t4 , 1
	sw t4 , 708(sp)
	lw t5 , 712(sp)
	lw t6 , 708(sp)
	mul s2, t5, t6
	sw s2 , 712(sp)
	lw s3 , 716(sp)
	lw s4 , 712(sp)
	add s5, s3, s4
	sw s5 , 704(sp)
	lw s6 , 704(sp)
	mv s7 , s6
	sw s7 , 700(sp)
	lw s8 , 700(sp)
	mv s9 , s8
	sw s9 , 696(sp)
	lw s10 , 696(sp)
	sw s10 , 808(sp)
	beqz zero,newExpr0.Finish1

newExpr0.Finish1:
	lw s11 , 808(sp)
	sw s11 , 692(sp)
	la t0 , check
	sw t0 , 688(sp)
	lw t1 , 688(sp)
	lw t2 , 692(sp)
	sw t2 , 0(t1)
	li t3 , 0
	sw t3 , 684(sp)
	lw t4 , 684(sp)
	sw t4 , 804(sp)
	beqz zero,ForCond11

ForCond11:
	lw t5 , 804(sp)
	sw t5 , 680(sp)
	la t6 , N
	sw t6 , 676(sp)
	lw s2 , 676(sp)
	lw s3 , 0(s2)
	sw s3 , 676(sp)
	lw s4 , 676(sp)
	lw s5 , 680(sp)
	slt s6, s4, s5
	sw s6 , 672(sp)
	lw s7 , 672(sp)
	xori s8, s7, 1
	sw s8 , 672(sp)
	lw s9 , 672(sp)
	bnez s9,ForLoop11
	lw s10 , 672(sp)
	beqz s10,ForFinish11

ForLoop11:
	la s11 , check
	sw s11 , 668(sp)
	lw t0 , 668(sp)
	lw t1 , 0(t0)
	sw t1 , 668(sp)
	lw t2 , 804(sp)
	sw t2 , 664(sp)
	li t3 , 1
	sw t3 , 660(sp)
	lw t4 , 664(sp)
	lw t5 , 660(sp)
	add t6, t4, t5
	sw t6 , 656(sp)
	lw s2 , 656(sp)
	sw s2 , 804(sp)
	li s3 , 4
	sw s3 , 652(sp)
	lw s4 , 652(sp)
	lw s5 , 664(sp)
	mul s6, s4, s5
	sw s6 , 652(sp)
	lw s7 , 668(sp)
	lw s8 , 652(sp)
	add s9, s7, s8
	sw s9 , 648(sp)
	lw s10 , 648(sp)
	lw s11 , 0(s10)
	sw s11 , 644(sp)
	li t0 , 1
	sw t0 , 640(sp)
	lw t1 , 648(sp)
	lw t2 , 640(sp)
	sw t2 , 0(t1)
	beqz zero,ForEnd11

ForEnd11:
	beqz zero,ForCond11

ForFinish11:
	la t3 , N
	sw t3 , 636(sp)
	lw t4 , 636(sp)
	lw t5 , 0(t4)
	sw t5 , 636(sp)
	li t6 , 5
	sw t6 , 632(sp)
	lw s2 , 636(sp)
	lw s3 , 632(sp)
	add s4, s2, s3
	sw s4 , 628(sp)
	beqz zero,newExpr1.dep0.Initial1

newExpr1.dep0.Initial1:
	li s5 , 32
	sw s5 , 624(sp)
	lw s6 , 628(sp)
	lw s7 , 624(sp)
	mul s8, s6, s7
	sw s8 , 620(sp)
	li s9 , 32
	sw s9 , 616(sp)
	lw s10 , 620(sp)
	lw s11 , 616(sp)
	add t0, s10, s11
	sw t0 , 612(sp)
	li t1 , 8
	sw t1 , 608(sp)
	lw t2 , 612(sp)
	lw t3 , 608(sp)
	div t4, t2, t3
	sw t4 , 604(sp)
	lw t5 , 604(sp)
	mv a0 , t5
	call malloc
	mv t6 , a0
	sw t6 , 600(sp)
	lw s2 , 600(sp)
	mv s3 , s2
	sw s3 , 596(sp)
	lw s4 , 596(sp)
	lw s5 , 628(sp)
	sw s5 , 0(s4)
	li s6 , 4
	sw s6 , 592(sp)
	li s7 , 1
	sw s7 , 588(sp)
	lw s8 , 592(sp)
	lw s9 , 588(sp)
	mul s10, s8, s9
	sw s10 , 592(sp)
	lw s11 , 596(sp)
	lw t0 , 592(sp)
	add t1, s11, t0
	sw t1 , 584(sp)
	lw t2 , 584(sp)
	mv t3 , t2
	sw t3 , 580(sp)
	lw t4 , 580(sp)
	mv t5 , t4
	sw t5 , 576(sp)
	lw t6 , 576(sp)
	sw t6 , 800(sp)
	beqz zero,newExpr1.Finish1

newExpr1.Finish1:
	lw s2 , 800(sp)
	sw s2 , 572(sp)
	lw s3 , 572(sp)
	sw s3 , 796(sp)
	la s4 , N
	sw s4 , 568(sp)
	lw s5 , 568(sp)
	lw s6 , 0(s5)
	sw s6 , 568(sp)
	li s7 , 5
	sw s7 , 564(sp)
	lw s8 , 568(sp)
	lw s9 , 564(sp)
	add s10, s8, s9
	sw s10 , 560(sp)
	beqz zero,newExpr2.dep0.Initial1

newExpr2.dep0.Initial1:
	li s11 , 32
	sw s11 , 556(sp)
	lw t0 , 560(sp)
	lw t1 , 556(sp)
	mul t2, t0, t1
	sw t2 , 552(sp)
	li t3 , 32
	sw t3 , 548(sp)
	lw t4 , 552(sp)
	lw t5 , 548(sp)
	add t6, t4, t5
	sw t6 , 544(sp)
	li s2 , 8
	sw s2 , 540(sp)
	lw s3 , 544(sp)
	lw s4 , 540(sp)
	div s5, s3, s4
	sw s5 , 536(sp)
	lw s6 , 536(sp)
	mv a0 , s6
	call malloc
	mv s7 , a0
	sw s7 , 532(sp)
	lw s8 , 532(sp)
	mv s9 , s8
	sw s9 , 528(sp)
	lw s10 , 528(sp)
	lw s11 , 560(sp)
	sw s11 , 0(s10)
	li t0 , 4
	sw t0 , 524(sp)
	li t1 , 1
	sw t1 , 520(sp)
	lw t2 , 524(sp)
	lw t3 , 520(sp)
	mul t4, t2, t3
	sw t4 , 524(sp)
	lw t5 , 528(sp)
	lw t6 , 524(sp)
	add s2, t5, t6
	sw s2 , 516(sp)
	lw s3 , 516(sp)
	mv s4 , s3
	sw s4 , 512(sp)
	lw s5 , 512(sp)
	mv s6 , s5
	sw s6 , 508(sp)
	lw s7 , 508(sp)
	sw s7 , 792(sp)
	beqz zero,newExpr2.Finish1

newExpr2.Finish1:
	lw s8 , 792(sp)
	sw s8 , 504(sp)
	lw s9 , 504(sp)
	sw s9 , 788(sp)
	lw s10 , 796(sp)
	sw s10 , 500(sp)
	li s11 , 4
	sw s11 , 496(sp)
	li t0 , 1
	sw t0 , 492(sp)
	lw t1 , 496(sp)
	lw t2 , 492(sp)
	mul t3, t1, t2
	sw t3 , 496(sp)
	lw t4 , 500(sp)
	lw t5 , 496(sp)
	add t6, t4, t5
	sw t6 , 488(sp)
	lw s2 , 488(sp)
	lw s3 , 0(s2)
	sw s3 , 484(sp)
	li s4 , 1
	sw s4 , 480(sp)
	lw s5 , 488(sp)
	lw s6 , 480(sp)
	sw s6 , 0(s5)
	li s7 , 2
	sw s7 , 476(sp)
	lw s8 , 476(sp)
	sw s8 , 804(sp)
	beqz zero,ForCond21

ForCond21:
	beqz zero,ForLoop21

ForLoop21:
	lw s9 , 804(sp)
	sw s9 , 472(sp)
	la s10 , N
	sw s10 , 468(sp)
	lw s11 , 468(sp)
	lw t0 , 0(s11)
	sw t0 , 468(sp)
	lw t1 , 468(sp)
	lw t2 , 472(sp)
	slt t3, t1, t2
	sw t3 , 464(sp)
	lw t4 , 464(sp)
	bnez t4,IFTrue11
	lw t5 , 464(sp)
	beqz t5,IFFalse11

IFTrue11:
	beqz zero,ForFinish21

IFFalse11:
	beqz zero,IFFinish11

IFFinish11:
	la t6 , check
	sw t6 , 460(sp)
	lw s2 , 460(sp)
	lw s3 , 0(s2)
	sw s3 , 460(sp)
	lw s4 , 804(sp)
	sw s4 , 456(sp)
	li s5 , 4
	sw s5 , 452(sp)
	lw s6 , 452(sp)
	lw s7 , 456(sp)
	mul s8, s6, s7
	sw s8 , 452(sp)
	lw s9 , 460(sp)
	lw s10 , 452(sp)
	add s11, s9, s10
	sw s11 , 448(sp)
	lw t0 , 448(sp)
	lw t1 , 0(t0)
	sw t1 , 444(sp)
	lw t2 , 444(sp)
	bnez t2,IFTrue21
	lw t3 , 444(sp)
	beqz t3,IFFalse21

IFTrue21:
	lw t4 , 788(sp)
	sw t4 , 440(sp)
	la t5 , M
	sw t5 , 436(sp)
	lw t6 , 436(sp)
	lw s2 , 0(t6)
	sw s2 , 436(sp)
	li s3 , 1
	sw s3 , 432(sp)
	lw s4 , 436(sp)
	lw s5 , 432(sp)
	add s6, s4, s5
	sw s6 , 428(sp)
	la s7 , M
	sw s7 , 424(sp)
	lw s8 , 424(sp)
	lw s9 , 428(sp)
	sw s9 , 0(s8)
	li s10 , 4
	sw s10 , 420(sp)
	lw s11 , 420(sp)
	lw t0 , 428(sp)
	mul t1, s11, t0
	sw t1 , 420(sp)
	lw t2 , 440(sp)
	lw t3 , 420(sp)
	add t4, t2, t3
	sw t4 , 416(sp)
	lw t5 , 416(sp)
	lw t6 , 0(t5)
	sw t6 , 412(sp)
	lw s2 , 804(sp)
	sw s2 , 408(sp)
	lw s3 , 416(sp)
	lw s4 , 408(sp)
	sw s4 , 0(s3)
	lw s5 , 796(sp)
	sw s5 , 404(sp)
	lw s6 , 804(sp)
	sw s6 , 400(sp)
	li s7 , 4
	sw s7 , 396(sp)
	lw s8 , 396(sp)
	lw s9 , 400(sp)
	mul s10, s8, s9
	sw s10 , 396(sp)
	lw s11 , 404(sp)
	lw t0 , 396(sp)
	add t1, s11, t0
	sw t1 , 392(sp)
	lw t2 , 392(sp)
	lw t3 , 0(t2)
	sw t3 , 388(sp)
	lw t4 , 804(sp)
	sw t4 , 384(sp)
	li t5 , 1
	sw t5 , 380(sp)
	lw t6 , 384(sp)
	lw s2 , 380(sp)
	sub s3, t6, s2
	sw s3 , 376(sp)
	lw s4 , 392(sp)
	lw s5 , 376(sp)
	sw s5 , 0(s4)
	beqz zero,IFFinish21

IFFalse21:
	beqz zero,IFFinish21

IFFinish21:
	lw s6 , 804(sp)
	sw s6 , 372(sp)
	lw s7 , 372(sp)
	sw s7 , 784(sp)
	li s8 , 1
	sw s8 , 368(sp)
	lw s9 , 368(sp)
	sw s9 , 780(sp)
	beqz zero,ForCond31

ForCond31:
	lw s10 , 780(sp)
	sw s10 , 364(sp)
	la s11 , M
	sw s11 , 360(sp)
	lw t0 , 360(sp)
	lw t1 , 0(t0)
	sw t1 , 360(sp)
	lw t2 , 360(sp)
	lw t3 , 364(sp)
	slt t4, t2, t3
	sw t4 , 356(sp)
	lw t5 , 356(sp)
	xori t6, t5, 1
	sw t6 , 356(sp)
	lw s2 , 356(sp)
	sw s2 , 776(sp)
	lw s3 , 356(sp)
	bnez s3,Binary0.Right1
	lw s4 , 356(sp)
	beqz s4,Binary0.Finish1

Binary0.Right1:
	lw s5 , 784(sp)
	sw s5 , 352(sp)
	lw s6 , 788(sp)
	sw s6 , 348(sp)
	lw s7 , 780(sp)
	sw s7 , 344(sp)
	li s8 , 4
	sw s8 , 340(sp)
	lw s9 , 340(sp)
	lw s10 , 344(sp)
	mul s11, s9, s10
	sw s11 , 340(sp)
	lw t0 , 348(sp)
	lw t1 , 340(sp)
	add t2, t0, t1
	sw t2 , 336(sp)
	lw t3 , 336(sp)
	lw t4 , 0(t3)
	sw t4 , 332(sp)
	lw t5 , 352(sp)
	lw t6 , 332(sp)
	mul s2, t5, t6
	sw s2 , 328(sp)
	la s3 , N
	sw s3 , 324(sp)
	lw s4 , 324(sp)
	lw s5 , 0(s4)
	sw s5 , 324(sp)
	lw s6 , 324(sp)
	lw s7 , 328(sp)
	slt s8, s6, s7
	sw s8 , 320(sp)
	lw s9 , 320(sp)
	xori s10, s9, 1
	sw s10 , 320(sp)
	lw s11 , 320(sp)
	sw s11 , 776(sp)
	beqz zero,Binary0.Finish1

Binary0.Finish1:
	lw t0 , 776(sp)
	sw t0 , 316(sp)
	lw t1 , 316(sp)
	bnez t1,ForLoop31
	lw t2 , 316(sp)
	beqz t2,ForFinish31

ForLoop31:
	lw t3 , 784(sp)
	sw t3 , 312(sp)
	lw t4 , 788(sp)
	sw t4 , 308(sp)
	lw t5 , 780(sp)
	sw t5 , 304(sp)
	li t6 , 4
	sw t6 , 300(sp)
	lw s2 , 300(sp)
	lw s3 , 304(sp)
	mul s4, s2, s3
	sw s4 , 300(sp)
	lw s5 , 308(sp)
	lw s6 , 300(sp)
	add s7, s5, s6
	sw s7 , 296(sp)
	lw s8 , 296(sp)
	lw s9 , 0(s8)
	sw s9 , 292(sp)
	lw s10 , 312(sp)
	lw s11 , 292(sp)
	mul t0, s10, s11
	sw t0 , 288(sp)
	lw t1 , 288(sp)
	sw t1 , 772(sp)
	lw t2 , 772(sp)
	sw t2 , 284(sp)
	la t3 , N
	sw t3 , 280(sp)
	lw t4 , 280(sp)
	lw t5 , 0(t4)
	sw t5 , 280(sp)
	lw t6 , 280(sp)
	lw s2 , 284(sp)
	slt s3, t6, s2
	sw s3 , 276(sp)
	lw s4 , 276(sp)
	bnez s4,IFTrue31
	lw s5 , 276(sp)
	beqz s5,IFFalse31

IFTrue31:
	beqz zero,For End31

IFFalse31:
	beqz zero,IFFinish31

IFFinish31:
	la s6 , check
	sw s6 , 272(sp)
	lw s7 , 272(sp)
	lw s8 , 0(s7)
	sw s8 , 272(sp)
	lw s9 , 772(sp)
	sw s9 , 268(sp)
	li s10 , 4
	sw s10 , 264(sp)
	lw s11 , 264(sp)
	lw t0 , 268(sp)
	mul t1, s11, t0
	sw t1 , 264(sp)
	lw t2 , 272(sp)
	lw t3 , 264(sp)
	add t4, t2, t3
	sw t4 , 260(sp)
	lw t5 , 260(sp)
	lw t6 , 0(t5)
	sw t6 , 256(sp)
	li s2 , 0
	sw s2 , 252(sp)
	lw s3 , 260(sp)
	lw s4 , 252(sp)
	sw s4 , 0(s3)
	lw s5 , 784(sp)
	sw s5 , 248(sp)
	lw s6 , 788(sp)
	sw s6 , 244(sp)
	lw s7 , 780(sp)
	sw s7 , 240(sp)
	li s8 , 4
	sw s8 , 236(sp)
	lw s9 , 236(sp)
	lw s10 , 240(sp)
	mul s11, s9, s10
	sw s11 , 236(sp)
	lw t0 , 244(sp)
	lw t1 , 236(sp)
	add t2, t0, t1
	sw t2 , 232(sp)
	lw t3 , 232(sp)
	lw t4 , 0(t3)
	sw t4 , 228(sp)
	lw t5 , 248(sp)
	lw t6 , 228(sp)
	rem s2, t5, t6
	sw s2 , 224(sp)
	li s3 , 0
	sw s3 , 220(sp)
	lw s4 , 224(sp)
	lw s5 , 220(sp)
	xor s6, s4, s5
	sw s6 , 216(sp)
	lw s7 , 216(sp)
	seqz s8 , s7
	sw s8 , 216(sp)
	lw s9 , 216(sp)
	bnez s9,IFTrue41
	lw s10 , 216(sp)
	beqz s10,IFFalse41

IFTrue41:
	lw s11 , 796(sp)
	sw s11 , 212(sp)
	lw t0 , 772(sp)
	sw t0 , 208(sp)
	li t1 , 4
	sw t1 , 204(sp)
	lw t2 , 204(sp)
	lw t3 , 208(sp)
	mul t4, t2, t3
	sw t4 , 204(sp)
	lw t5 , 212(sp)
	lw t6 , 204(sp)
	add s2, t5, t6
	sw s2 , 200(sp)
	lw s3 , 200(sp)
	lw s4 , 0(s3)
	sw s4 , 196(sp)
	lw s5 , 796(sp)
	sw s5 , 192(sp)
	lw s6 , 784(sp)
	sw s6 , 188(sp)
	li s7 , 4
	sw s7 , 184(sp)
	lw s8 , 184(sp)
	lw s9 , 188(sp)
	mul s10, s8, s9
	sw s10 , 184(sp)
	lw s11 , 192(sp)
	lw t0 , 184(sp)
	add t1, s11, t0
	sw t1 , 180(sp)
	lw t2 , 180(sp)
	lw t3 , 0(t2)
	sw t3 , 176(sp)
	lw t4 , 788(sp)
	sw t4 , 172(sp)
	lw t5 , 780(sp)
	sw t5 , 168(sp)
	li t6 , 4
	sw t6 , 164(sp)
	lw s2 , 164(sp)
	lw s3 , 168(sp)
	mul s4, s2, s3
	sw s4 , 164(sp)
	lw s5 , 172(sp)
	lw s6 , 164(sp)
	add s7, s5, s6
	sw s7 , 160(sp)
	lw s8 , 160(sp)
	lw s9 , 0(s8)
	sw s9 , 156(sp)
	lw s10 , 176(sp)
	lw s11 , 156(sp)
	mul t0, s10, s11
	sw t0 , 152(sp)
	lw t1 , 200(sp)
	lw t2 , 152(sp)
	sw t2 , 0(t1)
	beqz zero,ForFinish31

IFFalse41:
	lw t3 , 796(sp)
	sw t3 , 148(sp)
	lw t4 , 784(sp)
	sw t4 , 144(sp)
	lw t5 , 788(sp)
	sw t5 , 140(sp)
	lw t6 , 780(sp)
	sw t6 , 136(sp)
	li s2 , 4
	sw s2 , 132(sp)
	lw s3 , 132(sp)
	lw s4 , 136(sp)
	mul s5, s3, s4
	sw s5 , 132(sp)
	lw s6 , 140(sp)
	lw s7 , 132(sp)
	add s8, s6, s7
	sw s8 , 128(sp)
	lw s9 , 128(sp)
	lw s10 , 0(s9)
	sw s10 , 124(sp)
	lw s11 , 144(sp)
	lw t0 , 124(sp)
	mul t1, s11, t0
	sw t1 , 120(sp)
	li t2 , 4
	sw t2 , 116(sp)
	lw t3 , 116(sp)
	lw t4 , 120(sp)
	mul t5, t3, t4
	sw t5 , 116(sp)
	lw t6 , 148(sp)
	lw s2 , 116(sp)
	add s3, t6, s2
	sw s3 , 112(sp)
	lw s4 , 112(sp)
	lw s5 , 0(s4)
	sw s5 , 108(sp)
	lw s6 , 796(sp)
	sw s6 , 104(sp)
	lw s7 , 784(sp)
	sw s7 , 100(sp)
	li s8 , 4
	sw s8 , 96(sp)
	lw s9 , 96(sp)
	lw s10 , 100(sp)
	mul s11, s9, s10
	sw s11 , 96(sp)
	lw t0 , 104(sp)
	lw t1 , 96(sp)
	add t2, t0, t1
	sw t2 , 92(sp)
	lw t3 , 92(sp)
	lw t4 , 0(t3)
	sw t4 , 88(sp)
	lw t5 , 788(sp)
	sw t5 , 84(sp)
	lw t6 , 780(sp)
	sw t6 , 80(sp)
	li s2 , 4
	sw s2 , 76(sp)
	lw s3 , 76(sp)
	lw s4 , 80(sp)
	mul s5, s3, s4
	sw s5 , 76(sp)
	lw s6 , 84(sp)
	lw s7 , 76(sp)
	add s8, s6, s7
	sw s8 , 72(sp)
	lw s9 , 72(sp)
	lw s10 , 0(s9)
	sw s10 , 68(sp)
	li s11 , 1
	sw s11 , 64(sp)
	lw t0 , 68(sp)
	lw t1 , 64(sp)
	sub t2, t0, t1
	sw t2 , 60(sp)
	lw t3 , 88(sp)
	lw t4 , 60(sp)
	mul t5, t3, t4
	sw t5 , 56(sp)
	lw t6 , 112(sp)
	lw s2 , 56(sp)
	sw s2 , 0(t6)
	beqz zero,IFFinish41

IFFinish41:
	beqz zero,ForEnd31

ForEnd31:
	lw s3 , 780(sp)
	sw s3 , 52(sp)
	li s4 , 1
	sw s4 , 48(sp)
	lw s5 , 52(sp)
	lw s6 , 48(sp)
	add s7, s5, s6
	sw s7 , 44(sp)
	lw s8 , 44(sp)
	sw s8 , 780(sp)
	beqz zero,ForCond31

ForFinish31:
	lw s9 , 796(sp)
	sw s9 , 40(sp)
	lw s10 , 784(sp)
	sw s10 , 36(sp)
	li s11 , 4
	sw s11 , 32(sp)
	lw t0 , 32(sp)
	lw t1 , 36(sp)
	mul t2, t0, t1
	sw t2 , 32(sp)
	lw t3 , 40(sp)
	lw t4 , 32(sp)
	add t5, t3, t4
	sw t5 , 28(sp)
	lw t6 , 28(sp)
	lw s2 , 0(t6)
	sw s2 , 24(sp)
	lw s3 , 24(sp)
	mv a0 , s3
	call toString
	mv s4 , a0
	sw s4 , 20(sp)
	lw s5 , 20(sp)
	mv a0 , s5
	call println
	beqz zero,ForEnd21

ForEnd21:
	lw s6 , 804(sp)
	sw s6 , 16(sp)
	li s7 , 1
	sw s7 , 12(sp)
	lw s8 , 16(sp)
	lw s9 , 12(sp)
	add s10, s8, s9
	sw s10 , 8(sp)
	lw s11 , 8(sp)
	sw s11 , 804(sp)
	beqz zero,ForCond21

ForFinish21:
	li t0 , 0
	sw t0 , 4(sp)
	lw t1 , 4(sp)
	sw t1 , 812(sp)
	lw t2 , 812(sp)
	sw t2 , 0(sp)
	lw t3 , 0(sp)
	mv a0 , t3
	lw t4 , 768(sp)
	mv ra , t4
	addi sp,sp,816
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

