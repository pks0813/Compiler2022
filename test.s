	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,-292
	mv s2 , ra
	sw s2 , 272(sp)
	j entry0
entry0:
	j newExpr0.dep0.Initial0

newExpr0.dep0.Initial0:
	li s2 , 1001
	sw s2 , 268(sp)
	li s2 , 32
	sw s2 , 264(sp)
	lw s3 , 268(sp)
	lw s2 , 264(sp)
	mul s2, s3, s2
	sw s2 , 260(sp)
	li s2 , 32
	sw s2 , 256(sp)
	lw s2 , 260(sp)
	lw s3 , 256(sp)
	add s2, s2, s3
	sw s2 , 252(sp)
	li s2 , 8
	sw s2 , 248(sp)
	lw s2 , 252(sp)
	lw s3 , 248(sp)
	div s2, s2, s3
	sw s2 , 244(sp)
	lw s2 , 244(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 240(sp)
	lw s2 , 240(sp)
	mv s2 , s2
	sw s2 , 236(sp)
	li s2 , 1001
	sw s2 , 232(sp)
	lw s3 , 236(sp)
	lw s2 , 232(sp)
	sw s2 , 0(s3)
	li s2 , 4
	sw s2 , 228(sp)
	li s2 , 1
	sw s2 , 224(sp)
	lw s3 , 228(sp)
	lw s2 , 224(sp)
	mul s2, s3, s2
	sw s2 , 228(sp)
	lw s2 , 236(sp)
	lw s3 , 228(sp)
	add s2, s2, s3
	sw s2 , 220(sp)
	lw s2 , 220(sp)
	mv s2 , s2
	sw s2 , 216(sp)
	lw s2 , 216(sp)
	mv s2 , s2
	sw s2 , 212(sp)
	lw s2 , 212(sp)
	sw s2 , 288(sp)
	j newExpr0.Finish0

newExpr0.Finish0:
	lw s2 , 288(sp)
	sw s2 , 208(sp)
	la s2 , b
	sw s2 , 204(sp)
	lw s3 , 204(sp)
	lw s2 , 208(sp)
	sw s2 , 0(s3)
	j newExpr1.dep0.Initial0

newExpr1.dep0.Initial0:
	li s2 , 170
	sw s2 , 200(sp)
	li s2 , 32
	sw s2 , 196(sp)
	lw s2 , 200(sp)
	lw s3 , 196(sp)
	mul s2, s2, s3
	sw s2 , 192(sp)
	li s2 , 32
	sw s2 , 188(sp)
	lw s2 , 192(sp)
	lw s3 , 188(sp)
	add s2, s2, s3
	sw s2 , 184(sp)
	li s2 , 8
	sw s2 , 180(sp)
	lw s3 , 184(sp)
	lw s2 , 180(sp)
	div s2, s3, s2
	sw s2 , 176(sp)
	lw s2 , 176(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 172(sp)
	lw s2 , 172(sp)
	mv s2 , s2
	sw s2 , 168(sp)
	li s2 , 170
	sw s2 , 164(sp)
	lw s3 , 168(sp)
	lw s2 , 164(sp)
	sw s2 , 0(s3)
	li s2 , 4
	sw s2 , 160(sp)
	li s2 , 1
	sw s2 , 156(sp)
	lw s3 , 160(sp)
	lw s2 , 156(sp)
	mul s2, s3, s2
	sw s2 , 160(sp)
	lw s3 , 168(sp)
	lw s2 , 160(sp)
	add s2, s3, s2
	sw s2 , 152(sp)
	lw s2 , 152(sp)
	mv s2 , s2
	sw s2 , 148(sp)
	lw s2 , 148(sp)
	mv s2 , s2
	sw s2 , 144(sp)
	lw s2 , 144(sp)
	sw s2 , 284(sp)
	j newExpr1.Finish0

newExpr1.Finish0:
	lw s2 , 284(sp)
	sw s2 , 140(sp)
	la s2 , prime
	sw s2 , 136(sp)
	lw s2 , 136(sp)
	lw s3 , 140(sp)
	sw s3 , 0(s2)
	j newExpr2.dep0.Initial0

newExpr2.dep0.Initial0:
	li s2 , 1001
	sw s2 , 132(sp)
	li s2 , 32
	sw s2 , 128(sp)
	lw s2 , 132(sp)
	lw s3 , 128(sp)
	mul s2, s2, s3
	sw s2 , 124(sp)
	li s2 , 32
	sw s2 , 120(sp)
	lw s3 , 124(sp)
	lw s2 , 120(sp)
	add s2, s3, s2
	sw s2 , 116(sp)
	li s2 , 8
	sw s2 , 112(sp)
	lw s3 , 116(sp)
	lw s2 , 112(sp)
	div s2, s3, s2
	sw s2 , 108(sp)
	lw s2 , 108(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 104(sp)
	lw s2 , 104(sp)
	mv s2 , s2
	sw s2 , 100(sp)
	li s2 , 1001
	sw s2 , 96(sp)
	lw s2 , 100(sp)
	lw s3 , 96(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 92(sp)
	li s2 , 1
	sw s2 , 88(sp)
	lw s2 , 92(sp)
	lw s3 , 88(sp)
	mul s2, s2, s3
	sw s2 , 92(sp)
	lw s2 , 100(sp)
	lw s3 , 92(sp)
	add s2, s2, s3
	sw s2 , 84(sp)
	lw s2 , 84(sp)
	mv s2 , s2
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	mv s2 , s2
	sw s2 , 76(sp)
	lw s2 , 76(sp)
	sw s2 , 280(sp)
	j newExpr2.Finish0

newExpr2.Finish0:
	lw s2 , 280(sp)
	sw s2 , 72(sp)
	la s2 , gps
	sw s2 , 68(sp)
	lw s3 , 68(sp)
	lw s2 , 72(sp)
	sw s2 , 0(s3)
	j newExpr3.dep0.Initial0

newExpr3.dep0.Initial0:
	li s2 , 1
	sw s2 , 64(sp)
	li s2 , 32
	sw s2 , 60(sp)
	lw s3 , 64(sp)
	lw s2 , 60(sp)
	mul s2, s3, s2
	sw s2 , 56(sp)
	li s2 , 32
	sw s2 , 52(sp)
	lw s2 , 56(sp)
	lw s3 , 52(sp)
	add s2, s2, s3
	sw s2 , 48(sp)
	li s2 , 8
	sw s2 , 44(sp)
	lw s2 , 48(sp)
	lw s3 , 44(sp)
	div s2, s2, s3
	sw s2 , 40(sp)
	lw s2 , 40(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 36(sp)
	lw s2 , 36(sp)
	mv s2 , s2
	sw s2 , 32(sp)
	li s2 , 1
	sw s2 , 28(sp)
	lw s2 , 32(sp)
	lw s3 , 28(sp)
	sw s3 , 0(s2)
	li s2 , 4
	sw s2 , 24(sp)
	li s2 , 1
	sw s2 , 20(sp)
	lw s3 , 24(sp)
	lw s2 , 20(sp)
	mul s2, s3, s2
	sw s2 , 24(sp)
	lw s3 , 32(sp)
	lw s2 , 24(sp)
	add s2, s3, s2
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	mv s2 , s2
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	mv s2 , s2
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	sw s2 , 276(sp)
	j newExpr3.Finish0

newExpr3.Finish0:
	lw s2 , 276(sp)
	sw s2 , 4(sp)
	la s2 , tmp
	sw s2 , 0(sp)
	lw s3 , 0(sp)
	lw s2 , 4(sp)
	sw s2 , 0(s3)
	lw s2 , 272(sp)
	mv ra , s2
	addi sp,sp,292
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-712
	mv s2 , ra
	sw s2 , 704(sp)
	j entry1
entry1:
	call Init
	li a0 , 170
	call origin
	li s2 , 1000
	sw s2 , 700(sp)
	la s2 , N
	sw s2 , 696(sp)
	lw s3 , 696(sp)
	lw s2 , 700(sp)
	sw s2 , 0(s3)
	call getInt
	mv s2 , a0
	sw s2 , 692(sp)
	la s2 , M
	sw s2 , 688(sp)
	lw s2 , 688(sp)
	lw s3 , 692(sp)
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 684(sp)
	la s2 , primeCount
	sw s2 , 680(sp)
	lw s2 , 680(sp)
	lw s3 , 684(sp)
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 676(sp)
	la s2 , resultCount
	sw s2 , 672(sp)
	lw s3 , 672(sp)
	lw s2 , 676(sp)
	sw s2 , 0(s3)
	la s2 , tmp
	sw s2 , 668(sp)
	lw s2 , 668(sp)
	lw s2 , 0(s2)
	sw s2 , 668(sp)
	li s2 , 4
	sw s2 , 664(sp)
	li s2 , 0
	sw s2 , 660(sp)
	lw s2 , 664(sp)
	lw s3 , 660(sp)
	mul s2, s2, s3
	sw s2 , 664(sp)
	lw s2 , 668(sp)
	lw s3 , 664(sp)
	add s2, s2, s3
	sw s2 , 656(sp)
	lw s2 , 656(sp)
	lw s2 , 0(s2)
	sw s2 , 652(sp)
	li s2 , 0
	sw s2 , 648(sp)
	lw s2 , 656(sp)
	lw s3 , 648(sp)
	sw s3 , 0(s2)
	li s2 , 0
	sw s2 , 644(sp)
	la s2 , i
	sw s2 , 640(sp)
	lw s3 , 640(sp)
	lw s2 , 644(sp)
	sw s2 , 0(s3)
	j ForCond11

ForCond11:
	la s2 , i
	sw s2 , 636(sp)
	lw s2 , 636(sp)
	lw s2 , 0(s2)
	sw s2 , 636(sp)
	la s2 , N
	sw s2 , 632(sp)
	lw s2 , 632(sp)
	lw s2 , 0(s2)
	sw s2 , 632(sp)
	li s2 , 1
	sw s2 , 628(sp)
	lw s2 , 632(sp)
	lw s3 , 628(sp)
	add s2, s2, s3
	sw s2 , 624(sp)
	lw s2 , 636(sp)
	lw s3 , 624(sp)
	slt s2, s2, s3
	sw s2 , 620(sp)
	lw s2 , 620(sp)
	bnez s2,ForLoop11
	j ForFinish11

ForLoop11:
	la s2 , b
	sw s2 , 616(sp)
	lw s2 , 616(sp)
	lw s2 , 0(s2)
	sw s2 , 616(sp)
	la s2 , i
	sw s2 , 612(sp)
	lw s2 , 612(sp)
	lw s2 , 0(s2)
	sw s2 , 612(sp)
	li s2 , 4
	sw s2 , 608(sp)
	lw s2 , 608(sp)
	lw s3 , 612(sp)
	mul s2, s2, s3
	sw s2 , 608(sp)
	lw s3 , 616(sp)
	lw s2 , 608(sp)
	add s2, s3, s2
	sw s2 , 604(sp)
	lw s2 , 604(sp)
	lw s2 , 0(s2)
	sw s2 , 600(sp)
	li s2 , 1
	sw s2 , 596(sp)
	lw s2 , 604(sp)
	lw s3 , 596(sp)
	sw s3 , 0(s2)
	la s2 , gps
	sw s2 , 592(sp)
	lw s2 , 592(sp)
	lw s2 , 0(s2)
	sw s2 , 592(sp)
	la s2 , i
	sw s2 , 588(sp)
	lw s2 , 588(sp)
	lw s2 , 0(s2)
	sw s2 , 588(sp)
	li s2 , 4
	sw s2 , 584(sp)
	lw s2 , 584(sp)
	lw s3 , 588(sp)
	mul s2, s2, s3
	sw s2 , 584(sp)
	lw s3 , 592(sp)
	lw s2 , 584(sp)
	add s2, s3, s2
	sw s2 , 580(sp)
	lw s2 , 580(sp)
	lw s2 , 0(s2)
	sw s2 , 576(sp)
	li s2 , 0
	sw s2 , 572(sp)
	lw s2 , 580(sp)
	lw s3 , 572(sp)
	sw s3 , 0(s2)
	j ForEnd11

ForEnd11:
	la s2 , i
	sw s2 , 568(sp)
	lw s2 , 568(sp)
	lw s2 , 0(s2)
	sw s2 , 568(sp)
	li s2 , 1
	sw s2 , 564(sp)
	lw s2 , 568(sp)
	lw s3 , 564(sp)
	add s2, s2, s3
	sw s2 , 560(sp)
	la s2 , i
	sw s2 , 556(sp)
	lw s3 , 556(sp)
	lw s2 , 560(sp)
	sw s2 , 0(s3)
	j ForCond11

ForFinish11:
	li s2 , 0
	sw s2 , 552(sp)
	la s2 , i
	sw s2 , 548(sp)
	lw s3 , 548(sp)
	lw s2 , 552(sp)
	sw s2 , 0(s3)
	j ForCond21

ForCond21:
	la s2 , i
	sw s2 , 544(sp)
	lw s2 , 544(sp)
	lw s2 , 0(s2)
	sw s2 , 544(sp)
	la s2 , M
	sw s2 , 540(sp)
	lw s2 , 540(sp)
	lw s2 , 0(s2)
	sw s2 , 540(sp)
	li s2 , 1
	sw s2 , 536(sp)
	lw s2 , 540(sp)
	lw s3 , 536(sp)
	add s2, s2, s3
	sw s2 , 532(sp)
	lw s2 , 544(sp)
	lw s3 , 532(sp)
	slt s2, s2, s3
	sw s2 , 528(sp)
	lw s2 , 528(sp)
	bnez s2,ForLoop21
	j ForFinish21

ForLoop21:
	la s2 , prime
	sw s2 , 524(sp)
	lw s2 , 524(sp)
	lw s2 , 0(s2)
	sw s2 , 524(sp)
	la s2 , i
	sw s2 , 520(sp)
	lw s2 , 520(sp)
	lw s2 , 0(s2)
	sw s2 , 520(sp)
	li s2 , 4
	sw s2 , 516(sp)
	lw s2 , 516(sp)
	lw s3 , 520(sp)
	mul s2, s2, s3
	sw s2 , 516(sp)
	lw s2 , 524(sp)
	lw s3 , 516(sp)
	add s2, s2, s3
	sw s2 , 512(sp)
	lw s2 , 512(sp)
	lw s2 , 0(s2)
	sw s2 , 508(sp)
	li s2 , 0
	sw s2 , 504(sp)
	lw s2 , 512(sp)
	lw s3 , 504(sp)
	sw s3 , 0(s2)
	j ForEnd21

ForEnd21:
	la s2 , i
	sw s2 , 500(sp)
	lw s2 , 500(sp)
	lw s2 , 0(s2)
	sw s2 , 500(sp)
	li s2 , 1
	sw s2 , 496(sp)
	lw s2 , 500(sp)
	lw s3 , 496(sp)
	add s2, s2, s3
	sw s2 , 492(sp)
	la s2 , i
	sw s2 , 488(sp)
	lw s2 , 488(sp)
	lw s3 , 492(sp)
	sw s3 , 0(s2)
	j ForCond21

ForFinish21:
	li s2 , 0
	sw s2 , 484(sp)
	la s2 , i
	sw s2 , 480(sp)
	lw s3 , 480(sp)
	lw s2 , 484(sp)
	sw s2 , 0(s3)
	j ForCond31

ForCond31:
	la s2 , i
	sw s2 , 476(sp)
	lw s2 , 476(sp)
	lw s2 , 0(s2)
	sw s2 , 476(sp)
	la s2 , M
	sw s2 , 472(sp)
	lw s2 , 472(sp)
	lw s2 , 0(s2)
	sw s2 , 472(sp)
	lw s3 , 472(sp)
	lw s2 , 476(sp)
	slt s2, s3, s2
	sw s2 , 468(sp)
	lw s2 , 468(sp)
	xori s2, s2, 1
	sw s2 , 468(sp)
	lw s2 , 468(sp)
	bnez s2,ForLoop31
	j ForFinish31

ForLoop31:
	li s2 , 0
	sw s2 , 464(sp)
	la s2 , j
	sw s2 , 460(sp)
	lw s2 , 460(sp)
	lw s3 , 464(sp)
	sw s3 , 0(s2)
	j ForCond41

ForCond41:
	la s2 , j
	sw s2 , 456(sp)
	lw s2 , 456(sp)
	lw s2 , 0(s2)
	sw s2 , 456(sp)
	la s2 , M
	sw s2 , 452(sp)
	lw s2 , 452(sp)
	lw s2 , 0(s2)
	sw s2 , 452(sp)
	lw s3 , 452(sp)
	lw s2 , 456(sp)
	slt s2, s3, s2
	sw s2 , 448(sp)
	lw s2 , 448(sp)
	xori s2, s2, 1
	sw s2 , 448(sp)
	lw s2 , 448(sp)
	bnez s2,ForLoop41
	j ForFinish41

ForLoop41:
	la s2 , result
	sw s2 , 444(sp)
	lw s2 , 444(sp)
	lw s2 , 0(s2)
	sw s2 , 444(sp)
	la s2 , i
	sw s2 , 440(sp)
	lw s2 , 440(sp)
	lw s2 , 0(s2)
	sw s2 , 440(sp)
	li s2 , 4
	sw s2 , 436(sp)
	lw s3 , 436(sp)
	lw s2 , 440(sp)
	mul s2, s3, s2
	sw s2 , 436(sp)
	lw s2 , 444(sp)
	lw s3 , 436(sp)
	add s2, s2, s3
	sw s2 , 432(sp)
	lw s2 , 432(sp)
	lw s2 , 0(s2)
	sw s2 , 428(sp)
	la s2 , j
	sw s2 , 424(sp)
	lw s2 , 424(sp)
	lw s2 , 0(s2)
	sw s2 , 424(sp)
	li s2 , 4
	sw s2 , 420(sp)
	lw s2 , 420(sp)
	lw s3 , 424(sp)
	mul s2, s2, s3
	sw s2 , 420(sp)
	lw s2 , 428(sp)
	lw s3 , 420(sp)
	add s2, s2, s3
	sw s2 , 416(sp)
	lw s2 , 416(sp)
	lw s2 , 0(s2)
	sw s2 , 412(sp)
	li s2 , 0
	sw s2 , 408(sp)
	li s2 , 1
	sw s2 , 404(sp)
	lw s3 , 408(sp)
	lw s2 , 404(sp)
	sub s2, s3, s2
	sw s2 , 400(sp)
	lw s2 , 416(sp)
	lw s3 , 400(sp)
	sw s3 , 0(s2)
	j ForEnd41

ForEnd41:
	la s2 , j
	sw s2 , 396(sp)
	lw s2 , 396(sp)
	lw s2 , 0(s2)
	sw s2 , 396(sp)
	li s2 , 1
	sw s2 , 392(sp)
	lw s3 , 396(sp)
	lw s2 , 392(sp)
	add s2, s3, s2
	sw s2 , 388(sp)
	la s2 , j
	sw s2 , 384(sp)
	lw s2 , 384(sp)
	lw s3 , 388(sp)
	sw s3 , 0(s2)
	j ForCond41

ForFinish41:
	j ForEnd31

ForEnd31:
	la s2 , i
	sw s2 , 380(sp)
	lw s2 , 380(sp)
	lw s2 , 0(s2)
	sw s2 , 380(sp)
	li s2 , 1
	sw s2 , 376(sp)
	lw s2 , 380(sp)
	lw s3 , 376(sp)
	add s2, s2, s3
	sw s2 , 372(sp)
	la s2 , i
	sw s2 , 368(sp)
	lw s3 , 368(sp)
	lw s2 , 372(sp)
	sw s2 , 0(s3)
	j ForCond31

ForFinish31:
	la s2 , N
	sw s2 , 364(sp)
	lw s2 , 364(sp)
	lw s2 , 0(s2)
	sw s2 , 364(sp)
	lw s2 , 364(sp)
	mv a0 , s2
	call getPrime
	la s2 , tmp
	sw s2 , 360(sp)
	lw s2 , 360(sp)
	lw s2 , 0(s2)
	sw s2 , 360(sp)
	li s2 , 4
	sw s2 , 356(sp)
	li s2 , 0
	sw s2 , 352(sp)
	lw s2 , 356(sp)
	lw s3 , 352(sp)
	mul s2, s2, s3
	sw s2 , 356(sp)
	lw s3 , 360(sp)
	lw s2 , 356(sp)
	add s2, s3, s2
	sw s2 , 348(sp)
	lw s2 , 348(sp)
	lw s2 , 0(s2)
	sw s2 , 344(sp)
	la s2 , primeCount
	sw s2 , 340(sp)
	lw s2 , 340(sp)
	lw s3 , 344(sp)
	sw s3 , 0(s2)
	li s2 , 1
	sw s2 , 336(sp)
	la s2 , i
	sw s2 , 332(sp)
	lw s2 , 332(sp)
	lw s3 , 336(sp)
	sw s3 , 0(s2)
	j ForCond51

ForCond51:
	la s2 , i
	sw s2 , 328(sp)
	lw s2 , 328(sp)
	lw s2 , 0(s2)
	sw s2 , 328(sp)
	la s2 , primeCount
	sw s2 , 324(sp)
	lw s2 , 324(sp)
	lw s2 , 0(s2)
	sw s2 , 324(sp)
	lw s3 , 328(sp)
	lw s2 , 324(sp)
	slt s2, s3, s2
	sw s2 , 320(sp)
	lw s2 , 320(sp)
	bnez s2,ForLoop51
	j ForFinish51

ForLoop51:
	la s2 , i
	sw s2 , 316(sp)
	lw s2 , 316(sp)
	lw s2 , 0(s2)
	sw s2 , 316(sp)
	li s2 , 1
	sw s2 , 312(sp)
	lw s2 , 316(sp)
	lw s3 , 312(sp)
	add s2, s2, s3
	sw s2 , 308(sp)
	la s2 , j
	sw s2 , 304(sp)
	lw s2 , 304(sp)
	lw s3 , 308(sp)
	sw s3 , 0(s2)
	j ForCond61

ForCond61:
	la s2 , j
	sw s2 , 300(sp)
	lw s2 , 300(sp)
	lw s2 , 0(s2)
	sw s2 , 300(sp)
	la s2 , primeCount
	sw s2 , 296(sp)
	lw s2 , 296(sp)
	lw s2 , 0(s2)
	sw s2 , 296(sp)
	lw s3 , 296(sp)
	lw s2 , 300(sp)
	slt s2, s3, s2
	sw s2 , 292(sp)
	lw s2 , 292(sp)
	xori s2, s2, 1
	sw s2 , 292(sp)
	lw s2 , 292(sp)
	bnez s2,ForLoop61
	j ForFinish61

ForLoop61:
	la s2 , result
	sw s2 , 288(sp)
	lw s2 , 288(sp)
	lw s2 , 0(s2)
	sw s2 , 288(sp)
	la s2 , i
	sw s2 , 284(sp)
	lw s2 , 284(sp)
	lw s2 , 0(s2)
	sw s2 , 284(sp)
	li s2 , 4
	sw s2 , 280(sp)
	lw s3 , 280(sp)
	lw s2 , 284(sp)
	mul s2, s3, s2
	sw s2 , 280(sp)
	lw s2 , 288(sp)
	lw s3 , 280(sp)
	add s2, s2, s3
	sw s2 , 276(sp)
	lw s2 , 276(sp)
	lw s2 , 0(s2)
	sw s2 , 272(sp)
	la s2 , j
	sw s2 , 268(sp)
	lw s2 , 268(sp)
	lw s2 , 0(s2)
	sw s2 , 268(sp)
	li s2 , 4
	sw s2 , 264(sp)
	lw s2 , 264(sp)
	lw s3 , 268(sp)
	mul s2, s2, s3
	sw s2 , 264(sp)
	lw s2 , 272(sp)
	lw s3 , 264(sp)
	add s2, s2, s3
	sw s2 , 260(sp)
	lw s2 , 260(sp)
	lw s2 , 0(s2)
	sw s2 , 256(sp)
	li s2 , 0
	sw s2 , 252(sp)
	li s2 , 1
	sw s2 , 248(sp)
	lw s2 , 252(sp)
	lw s3 , 248(sp)
	sub s2, s2, s3
	sw s2 , 244(sp)
	lw s2 , 256(sp)
	lw s3 , 244(sp)
	xor s2, s2, s3
	sw s2 , 240(sp)
	lw s2 , 240(sp)
	seqz s2 , s2
	sw s2 , 240(sp)
	lw s2 , 240(sp)
	bnez s2,IFTrue11
	j IFFalse11

IFTrue11:
	la s2 , result
	sw s2 , 236(sp)
	lw s2 , 236(sp)
	lw s2 , 0(s2)
	sw s2 , 236(sp)
	la s2 , i
	sw s2 , 232(sp)
	lw s2 , 232(sp)
	lw s2 , 0(s2)
	sw s2 , 232(sp)
	li s2 , 4
	sw s2 , 228(sp)
	lw s3 , 228(sp)
	lw s2 , 232(sp)
	mul s2, s3, s2
	sw s2 , 228(sp)
	lw s2 , 236(sp)
	lw s3 , 228(sp)
	add s2, s2, s3
	sw s2 , 224(sp)
	lw s2 , 224(sp)
	lw s2 , 0(s2)
	sw s2 , 220(sp)
	la s2 , j
	sw s2 , 216(sp)
	lw s2 , 216(sp)
	lw s2 , 0(s2)
	sw s2 , 216(sp)
	li s2 , 4
	sw s2 , 212(sp)
	lw s3 , 212(sp)
	lw s2 , 216(sp)
	mul s2, s3, s2
	sw s2 , 212(sp)
	lw s3 , 220(sp)
	lw s2 , 212(sp)
	add s2, s3, s2
	sw s2 , 208(sp)
	lw s2 , 208(sp)
	lw s2 , 0(s2)
	sw s2 , 204(sp)
	la s2 , N
	sw s2 , 200(sp)
	lw s2 , 200(sp)
	lw s2 , 0(s2)
	sw s2 , 200(sp)
	la s2 , i
	sw s2 , 196(sp)
	lw s2 , 196(sp)
	lw s2 , 0(s2)
	sw s2 , 196(sp)
	la s2 , j
	sw s2 , 192(sp)
	lw s2 , 192(sp)
	lw s2 , 0(s2)
	sw s2 , 192(sp)
	lw s2 , 200(sp)
	mv a0 , s2
	lw s2 , 196(sp)
	mv a1 , s2
	lw s2 , 192(sp)
	mv a2 , s2
	call getResult
	mv s2 , a0
	sw s2 , 188(sp)
	lw s2 , 208(sp)
	lw s3 , 188(sp)
	sw s3 , 0(s2)
	la s2 , result
	sw s2 , 184(sp)
	lw s2 , 184(sp)
	lw s2 , 0(s2)
	sw s2 , 184(sp)
	la s2 , i
	sw s2 , 180(sp)
	lw s2 , 180(sp)
	lw s2 , 0(s2)
	sw s2 , 180(sp)
	li s2 , 4
	sw s2 , 176(sp)
	lw s2 , 176(sp)
	lw s3 , 180(sp)
	mul s2, s2, s3
	sw s2 , 176(sp)
	lw s2 , 184(sp)
	lw s3 , 176(sp)
	add s2, s2, s3
	sw s2 , 172(sp)
	lw s2 , 172(sp)
	lw s2 , 0(s2)
	sw s2 , 168(sp)
	la s2 , j
	sw s2 , 164(sp)
	lw s2 , 164(sp)
	lw s2 , 0(s2)
	sw s2 , 164(sp)
	li s2 , 4
	sw s2 , 160(sp)
	lw s2 , 160(sp)
	lw s3 , 164(sp)
	mul s2, s2, s3
	sw s2 , 160(sp)
	lw s3 , 168(sp)
	lw s2 , 160(sp)
	add s2, s3, s2
	sw s2 , 156(sp)
	lw s2 , 156(sp)
	lw s2 , 0(s2)
	sw s2 , 152(sp)
	li s2 , 1
	sw s2 , 148(sp)
	lw s3 , 148(sp)
	lw s2 , 152(sp)
	slt s2, s3, s2
	sw s2 , 144(sp)
	lw s2 , 144(sp)
	bnez s2,IFTrue21
	j IFFalse21

IFTrue21:
	la s2 , prime
	sw s2 , 140(sp)
	lw s2 , 140(sp)
	lw s2 , 0(s2)
	sw s2 , 140(sp)
	la s2 , i
	sw s2 , 136(sp)
	lw s2 , 136(sp)
	lw s2 , 0(s2)
	sw s2 , 136(sp)
	li s2 , 4
	sw s2 , 132(sp)
	lw s2 , 132(sp)
	lw s3 , 136(sp)
	mul s2, s2, s3
	sw s2 , 132(sp)
	lw s3 , 140(sp)
	lw s2 , 132(sp)
	add s2, s3, s2
	sw s2 , 128(sp)
	lw s2 , 128(sp)
	lw s2 , 0(s2)
	sw s2 , 124(sp)
	la s2 , prime
	sw s2 , 120(sp)
	lw s2 , 120(sp)
	lw s2 , 0(s2)
	sw s2 , 120(sp)
	la s2 , j
	sw s2 , 116(sp)
	lw s2 , 116(sp)
	lw s2 , 0(s2)
	sw s2 , 116(sp)
	li s2 , 4
	sw s2 , 112(sp)
	lw s2 , 112(sp)
	lw s3 , 116(sp)
	mul s2, s2, s3
	sw s2 , 112(sp)
	lw s3 , 120(sp)
	lw s2 , 112(sp)
	add s2, s3, s2
	sw s2 , 108(sp)
	lw s2 , 108(sp)
	lw s2 , 0(s2)
	sw s2 , 104(sp)
	la s2 , result
	sw s2 , 100(sp)
	lw s2 , 100(sp)
	lw s2 , 0(s2)
	sw s2 , 100(sp)
	la s2 , i
	sw s2 , 96(sp)
	lw s2 , 96(sp)
	lw s2 , 0(s2)
	sw s2 , 96(sp)
	li s2 , 4
	sw s2 , 92(sp)
	lw s2 , 92(sp)
	lw s3 , 96(sp)
	mul s2, s2, s3
	sw s2 , 92(sp)
	lw s3 , 100(sp)
	lw s2 , 92(sp)
	add s2, s3, s2
	sw s2 , 88(sp)
	lw s2 , 88(sp)
	lw s2 , 0(s2)
	sw s2 , 84(sp)
	la s2 , j
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	lw s2 , 0(s2)
	sw s2 , 80(sp)
	li s2 , 4
	sw s2 , 76(sp)
	lw s3 , 76(sp)
	lw s2 , 80(sp)
	mul s2, s3, s2
	sw s2 , 76(sp)
	lw s2 , 84(sp)
	lw s3 , 76(sp)
	add s2, s2, s3
	sw s2 , 72(sp)
	lw s2 , 72(sp)
	lw s2 , 0(s2)
	sw s2 , 68(sp)
	lw s2 , 124(sp)
	mv a0 , s2
	lw s2 , 104(sp)
	mv a1 , s2
	lw s2 , 68(sp)
	mv a2 , s2
	call printF
	la s2 , resultCount
	sw s2 , 64(sp)
	lw s2 , 64(sp)
	lw s2 , 0(s2)
	sw s2 , 64(sp)
	li s2 , 1
	sw s2 , 60(sp)
	lw s3 , 64(sp)
	lw s2 , 60(sp)
	add s2, s3, s2
	sw s2 , 56(sp)
	la s2 , resultCount
	sw s2 , 52(sp)
	lw s2 , 52(sp)
	lw s3 , 56(sp)
	sw s3 , 0(s2)
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
	la s2 , j
	sw s2 , 48(sp)
	lw s2 , 48(sp)
	lw s2 , 0(s2)
	sw s2 , 48(sp)
	li s2 , 1
	sw s2 , 44(sp)
	lw s2 , 48(sp)
	lw s3 , 44(sp)
	add s2, s2, s3
	sw s2 , 40(sp)
	la s2 , j
	sw s2 , 36(sp)
	lw s3 , 36(sp)
	lw s2 , 40(sp)
	sw s2 , 0(s3)
	j ForCond61

ForFinish61:
	j ForEnd51

ForEnd51:
	la s2 , i
	sw s2 , 32(sp)
	lw s2 , 32(sp)
	lw s2 , 0(s2)
	sw s2 , 32(sp)
	li s2 , 1
	sw s2 , 28(sp)
	lw s3 , 32(sp)
	lw s2 , 28(sp)
	add s2, s3, s2
	sw s2 , 24(sp)
	la s2 , i
	sw s2 , 20(sp)
	lw s2 , 20(sp)
	lw s3 , 24(sp)
	sw s3 , 0(s2)
	j ForCond51

ForFinish51:
	la s2 , .Str0
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	mv a0 , s2
	call print
	la s2 , resultCount
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
	sw s2 , 708(sp)
	lw s2 , 708(sp)
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	lw s2 , 704(sp)
	mv ra , s2
	addi sp,sp,712
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
	j newExpr4.dep0.Initial2

newExpr4.dep0.Initial2:
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
	j newExpr4.Finish2

newExpr4.Finish2:
	lw s2 , 264(sp)
	sw s2 , 196(sp)
	la s2 , result
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
	j ForCond72

ForCond72:
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
	bnez s2,ForLoop72
	j ForFinish72

ForLoop72:
	la s2 , result
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
	lw s3 , 168(sp)
	lw s2 , 160(sp)
	add s2, s3, s2
	sw s2 , 156(sp)
	lw s2 , 156(sp)
	lw s2 , 0(s2)
	sw s2 , 152(sp)
	lw s2 , 268(sp)
	sw s2 , 148(sp)
	j newExpr5.dep0.Initial2

newExpr5.dep0.Initial2:
	li s2 , 32
	sw s2 , 144(sp)
	lw s2 , 148(sp)
	lw s3 , 144(sp)
	mul s2, s2, s3
	sw s2 , 140(sp)
	li s2 , 32
	sw s2 , 136(sp)
	lw s3 , 140(sp)
	lw s2 , 136(sp)
	add s2, s3, s2
	sw s2 , 132(sp)
	li s2 , 8
	sw s2 , 128(sp)
	lw s3 , 132(sp)
	lw s2 , 128(sp)
	div s2, s3, s2
	sw s2 , 124(sp)
	lw s2 , 124(sp)
	mv a0 , s2
	call malloc
	mv s2 , a0
	sw s2 , 120(sp)
	lw s2 , 120(sp)
	mv s2 , s2
	sw s2 , 116(sp)
	lw s3 , 116(sp)
	lw s2 , 148(sp)
	sw s2 , 0(s3)
	li s2 , 4
	sw s2 , 112(sp)
	li s2 , 1
	sw s2 , 108(sp)
	lw s3 , 112(sp)
	lw s2 , 108(sp)
	mul s2, s3, s2
	sw s2 , 112(sp)
	lw s3 , 116(sp)
	lw s2 , 112(sp)
	add s2, s3, s2
	sw s2 , 104(sp)
	lw s2 , 104(sp)
	mv s2 , s2
	sw s2 , 100(sp)
	lw s2 , 100(sp)
	mv s2 , s2
	sw s2 , 96(sp)
	lw s2 , 96(sp)
	sw s2 , 260(sp)
	j newExpr5.Finish2

newExpr5.Finish2:
	lw s2 , 260(sp)
	sw s2 , 92(sp)
	lw s3 , 156(sp)
	lw s2 , 92(sp)
	sw s2 , 0(s3)
	li s2 , 0
	sw s2 , 88(sp)
	la s2 , j
	sw s2 , 84(sp)
	lw s3 , 84(sp)
	lw s2 , 88(sp)
	sw s2 , 0(s3)
	j ForCond82

ForCond82:
	la s2 , j
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	lw s2 , 0(s2)
	sw s2 , 80(sp)
	lw s2 , 268(sp)
	sw s2 , 76(sp)
	lw s2 , 80(sp)
	lw s3 , 76(sp)
	slt s2, s2, s3
	sw s2 , 72(sp)
	lw s2 , 72(sp)
	bnez s2,ForLoop82
	j ForFinish82

ForLoop82:
	la s2 , result
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
	lw s2 , 40(sp)
	lw s3 , 32(sp)
	sw s3 , 0(s2)
	j ForEnd82

ForEnd82:
	la s2 , j
	sw s2 , 28(sp)
	lw s2 , 28(sp)
	lw s2 , 0(s2)
	sw s2 , 28(sp)
	li s2 , 1
	sw s2 , 24(sp)
	lw s3 , 28(sp)
	lw s2 , 24(sp)
	add s2, s3, s2
	sw s2 , 20(sp)
	la s2 , j
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	lw s3 , 20(sp)
	sw s3 , 0(s2)
	j ForCond82

ForFinish82:
	j ForEnd72

ForEnd72:
	la s2 , i
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	lw s2 , 0(s2)
	sw s2 , 12(sp)
	li s2 , 1
	sw s2 , 8(sp)
	lw s2 , 12(sp)
	lw s3 , 8(sp)
	add s2, s2, s3
	sw s2 , 4(sp)
	la s2 , i
	sw s2 , 0(sp)
	lw s3 , 0(sp)
	lw s2 , 4(sp)
	sw s2 , 0(s3)
	j ForCond72

ForFinish72:
	lw s2 , 256(sp)
	mv ra , s2
	addi sp,sp,272
	ret


    .globl  getPrime
    .p2align    2
getPrime:
	mv s0 , sp
	sw a0 , -4(sp)
	addi sp,sp,-12
	mv s2 , ra
	j entry3
entry3:
	li s3 , 2
	sw s3 , 4(sp)
	li s3 , 2
	sw s3 , 0(sp)
	j ForCond93

ForCond93:
	lw s4 , 0(sp)
	lw s3 , 8(sp)
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop93
	j ForFinish93

ForLoop93:
	la s5 , b
	lw s5 , 0(s5)
	lw s4 , 0(sp)
	li s3 , 4
	mul s3, s3, s4
	add s3, s5, s3
	lw s4 , 0(s3)
	li s3 , 1
	xor s3, s4, s3
	seqz s3 , s3
	bnez s3,IFTrue33
	j IFFalse33

IFTrue33:
	la s5 , tmp
	lw s5 , 0(s5)
	li s3 , 4
	li s4 , 0
	mul s3, s3, s4
	add s3, s5, s3
	lw zero , 0(s3)
	la s6 , tmp
	lw s6 , 0(s6)
	li s4 , 4
	li s5 , 0
	mul s4, s4, s5
	add s4, s6, s4
	lw s5 , 0(s4)
	li s4 , 1
	add s4, s5, s4
	sw s4 , 0(s3)
	la s3 , prime
	lw s3 , 0(s3)
	la s5 , tmp
	lw s5 , 0(s5)
	li s4 , 4
	li s6 , 0
	mul s4, s4, s6
	add s4, s5, s4
	lw s4 , 0(s4)
	li s5 , 4
	mul s5, s5, s4
	add s4, s3, s5
	lw zero , 0(s4)
	lw s3 , 0(sp)
	sw s3 , 0(s4)
	la s4 , gps
	lw s4 , 0(s4)
	lw s3 , 0(sp)
	li s5 , 4
	mul s5, s5, s3
	add s4, s4, s5
	lw zero , 0(s4)
	la s3 , tmp
	lw s3 , 0(s3)
	li s6 , 4
	li s5 , 0
	mul s6, s6, s5
	add s3, s3, s6
	lw s3 , 0(s3)
	sw s3 , 0(s4)
	j IFFinish33

IFFalse33:
	j IFFinish33

IFFinish33:
	j ForCond103

ForCond103:
	lw s4 , 0(sp)
	lw s3 , 4(sp)
	mul s4, s4, s3
	lw s3 , 8(sp)
	slt s3, s3, s4
	xori s3, s3, 1
	bnez s3,ForLoop103
	j ForFinish103

ForLoop103:
	la s5 , b
	lw s5 , 0(s5)
	lw s4 , 0(sp)
	lw s3 , 4(sp)
	mul s3, s4, s3
	li s4 , 4
	mul s4, s4, s3
	add s3, s5, s4
	lw zero , 0(s3)
	li s4 , 0
	sw s4 , 0(s3)
	lw s3 , 4(sp)
	li s4 , 1
	add s3, s3, s4
	sw s3 , 4(sp)
	j ForEnd103

ForEnd103:
	j ForCond103

ForFinish103:
	li s3 , 2
	sw s3 , 4(sp)
	j ForEnd93

ForEnd93:
	lw s3 , 0(sp)
	li s4 , 1
	add s3, s3, s4
	sw s3 , 0(sp)
	j ForCond93

ForFinish93:
	mv ra , s2
	addi sp,sp,12
	ret


    .globl  getResult
    .p2align    2
getResult:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,-464
	mv s2 , ra
	sw s2 , 444(sp)
	j entry4
entry4:
	la s2 , result
	sw s2 , 440(sp)
	lw s2 , 440(sp)
	lw s2 , 0(s2)
	sw s2 , 440(sp)
	lw s2 , 456(sp)
	sw s2 , 436(sp)
	li s2 , 4
	sw s2 , 432(sp)
	lw s2 , 432(sp)
	lw s3 , 436(sp)
	mul s2, s2, s3
	sw s2 , 432(sp)
	lw s3 , 440(sp)
	lw s2 , 432(sp)
	add s2, s3, s2
	sw s2 , 428(sp)
	lw s2 , 428(sp)
	lw s2 , 0(s2)
	sw s2 , 424(sp)
	lw s2 , 452(sp)
	sw s2 , 420(sp)
	li s2 , 4
	sw s2 , 416(sp)
	lw s3 , 416(sp)
	lw s2 , 420(sp)
	mul s2, s3, s2
	sw s2 , 416(sp)
	lw s2 , 424(sp)
	lw s3 , 416(sp)
	add s2, s2, s3
	sw s2 , 412(sp)
	lw s2 , 412(sp)
	lw s2 , 0(s2)
	sw s2 , 408(sp)
	li s2 , 0
	sw s2 , 404(sp)
	li s2 , 1
	sw s2 , 400(sp)
	lw s2 , 404(sp)
	lw s3 , 400(sp)
	sub s2, s2, s3
	sw s2 , 396(sp)
	lw s3 , 408(sp)
	lw s2 , 396(sp)
	xor s2, s3, s2
	sw s2 , 392(sp)
	lw s2 , 392(sp)
	seqz s2 , s2
	sw s2 , 392(sp)
	lw s2 , 392(sp)
	bnez s2,IFTrue44
	j IFFalse44

IFTrue44:
	la s2 , prime
	sw s2 , 388(sp)
	lw s2 , 388(sp)
	lw s2 , 0(s2)
	sw s2 , 388(sp)
	lw s2 , 452(sp)
	sw s2 , 384(sp)
	li s2 , 4
	sw s2 , 380(sp)
	lw s3 , 380(sp)
	lw s2 , 384(sp)
	mul s2, s3, s2
	sw s2 , 380(sp)
	lw s3 , 388(sp)
	lw s2 , 380(sp)
	add s2, s3, s2
	sw s2 , 376(sp)
	lw s2 , 376(sp)
	lw s2 , 0(s2)
	sw s2 , 372(sp)
	li s2 , 2
	sw s2 , 368(sp)
	lw s3 , 372(sp)
	lw s2 , 368(sp)
	mul s2, s3, s2
	sw s2 , 364(sp)
	la s2 , prime
	sw s2 , 360(sp)
	lw s2 , 360(sp)
	lw s2 , 0(s2)
	sw s2 , 360(sp)
	lw s2 , 456(sp)
	sw s2 , 356(sp)
	li s2 , 4
	sw s2 , 352(sp)
	lw s2 , 352(sp)
	lw s3 , 356(sp)
	mul s2, s2, s3
	sw s2 , 352(sp)
	lw s3 , 360(sp)
	lw s2 , 352(sp)
	add s2, s3, s2
	sw s2 , 348(sp)
	lw s2 , 348(sp)
	lw s2 , 0(s2)
	sw s2 , 344(sp)
	lw s3 , 364(sp)
	lw s2 , 344(sp)
	sub s2, s3, s2
	sw s2 , 340(sp)
	lw s2 , 460(sp)
	sw s2 , 336(sp)
	lw s3 , 336(sp)
	lw s2 , 340(sp)
	slt s2, s3, s2
	sw s2 , 332(sp)
	lw s2 , 332(sp)
	xori s2, s2, 1
	sw s2 , 332(sp)
	lw s2 , 332(sp)
	bnez s2,IFTrue54
	j IFFalse54

IFTrue54:
	la s2 , b
	sw s2 , 328(sp)
	lw s2 , 328(sp)
	lw s2 , 0(s2)
	sw s2 , 328(sp)
	la s2 , prime
	sw s2 , 324(sp)
	lw s2 , 324(sp)
	lw s2 , 0(s2)
	sw s2 , 324(sp)
	lw s2 , 452(sp)
	sw s2 , 320(sp)
	li s2 , 4
	sw s2 , 316(sp)
	lw s3 , 316(sp)
	lw s2 , 320(sp)
	mul s2, s3, s2
	sw s2 , 316(sp)
	lw s2 , 324(sp)
	lw s3 , 316(sp)
	add s2, s2, s3
	sw s2 , 312(sp)
	lw s2 , 312(sp)
	lw s2 , 0(s2)
	sw s2 , 308(sp)
	li s2 , 2
	sw s2 , 304(sp)
	lw s3 , 308(sp)
	lw s2 , 304(sp)
	mul s2, s3, s2
	sw s2 , 300(sp)
	la s2 , prime
	sw s2 , 296(sp)
	lw s2 , 296(sp)
	lw s2 , 0(s2)
	sw s2 , 296(sp)
	lw s2 , 456(sp)
	sw s2 , 292(sp)
	li s2 , 4
	sw s2 , 288(sp)
	lw s3 , 288(sp)
	lw s2 , 292(sp)
	mul s2, s3, s2
	sw s2 , 288(sp)
	lw s3 , 296(sp)
	lw s2 , 288(sp)
	add s2, s3, s2
	sw s2 , 284(sp)
	lw s2 , 284(sp)
	lw s2 , 0(s2)
	sw s2 , 280(sp)
	lw s2 , 300(sp)
	lw s3 , 280(sp)
	sub s2, s2, s3
	sw s2 , 276(sp)
	li s2 , 4
	sw s2 , 272(sp)
	lw s2 , 272(sp)
	lw s3 , 276(sp)
	mul s2, s2, s3
	sw s2 , 272(sp)
	lw s2 , 328(sp)
	lw s3 , 272(sp)
	add s2, s2, s3
	sw s2 , 268(sp)
	lw s2 , 268(sp)
	lw s2 , 0(s2)
	sw s2 , 264(sp)
	li s2 , 0
	sw s2 , 260(sp)
	lw s2 , 264(sp)
	lw s3 , 260(sp)
	xor s2, s2, s3
	sw s2 , 256(sp)
	lw s2 , 256(sp)
	snez s2 , s2
	sw s2 , 256(sp)
	lw s2 , 256(sp)
	bnez s2,IFTrue64
	j IFFalse64

IFTrue64:
	la s2 , result
	sw s2 , 252(sp)
	lw s2 , 252(sp)
	lw s2 , 0(s2)
	sw s2 , 252(sp)
	lw s2 , 456(sp)
	sw s2 , 248(sp)
	li s2 , 4
	sw s2 , 244(sp)
	lw s3 , 244(sp)
	lw s2 , 248(sp)
	mul s2, s3, s2
	sw s2 , 244(sp)
	lw s2 , 252(sp)
	lw s3 , 244(sp)
	add s2, s2, s3
	sw s2 , 240(sp)
	lw s2 , 240(sp)
	lw s2 , 0(s2)
	sw s2 , 236(sp)
	lw s2 , 452(sp)
	sw s2 , 232(sp)
	li s2 , 4
	sw s2 , 228(sp)
	lw s2 , 228(sp)
	lw s3 , 232(sp)
	mul s2, s2, s3
	sw s2 , 228(sp)
	lw s2 , 236(sp)
	lw s3 , 228(sp)
	add s2, s2, s3
	sw s2 , 224(sp)
	lw s2 , 224(sp)
	lw s2 , 0(s2)
	sw s2 , 220(sp)
	lw s2 , 460(sp)
	sw s2 , 216(sp)
	lw s2 , 452(sp)
	sw s2 , 212(sp)
	la s2 , gps
	sw s2 , 208(sp)
	lw s2 , 208(sp)
	lw s2 , 0(s2)
	sw s2 , 208(sp)
	la s2 , prime
	sw s2 , 204(sp)
	lw s2 , 204(sp)
	lw s2 , 0(s2)
	sw s2 , 204(sp)
	lw s2 , 452(sp)
	sw s2 , 200(sp)
	li s2 , 4
	sw s2 , 196(sp)
	lw s3 , 196(sp)
	lw s2 , 200(sp)
	mul s2, s3, s2
	sw s2 , 196(sp)
	lw s3 , 204(sp)
	lw s2 , 196(sp)
	add s2, s3, s2
	sw s2 , 192(sp)
	lw s2 , 192(sp)
	lw s2 , 0(s2)
	sw s2 , 188(sp)
	li s2 , 2
	sw s2 , 184(sp)
	lw s3 , 188(sp)
	lw s2 , 184(sp)
	mul s2, s3, s2
	sw s2 , 180(sp)
	la s2 , prime
	sw s2 , 176(sp)
	lw s2 , 176(sp)
	lw s2 , 0(s2)
	sw s2 , 176(sp)
	lw s2 , 456(sp)
	sw s2 , 172(sp)
	li s2 , 4
	sw s2 , 168(sp)
	lw s3 , 168(sp)
	lw s2 , 172(sp)
	mul s2, s3, s2
	sw s2 , 168(sp)
	lw s2 , 176(sp)
	lw s3 , 168(sp)
	add s2, s2, s3
	sw s2 , 164(sp)
	lw s2 , 164(sp)
	lw s2 , 0(s2)
	sw s2 , 160(sp)
	lw s2 , 180(sp)
	lw s3 , 160(sp)
	sub s2, s2, s3
	sw s2 , 156(sp)
	li s2 , 4
	sw s2 , 152(sp)
	lw s2 , 152(sp)
	lw s3 , 156(sp)
	mul s2, s2, s3
	sw s2 , 152(sp)
	lw s2 , 208(sp)
	lw s3 , 152(sp)
	add s2, s2, s3
	sw s2 , 148(sp)
	lw s2 , 148(sp)
	lw s2 , 0(s2)
	sw s2 , 144(sp)
	lw s2 , 216(sp)
	mv a0 , s2
	lw s2 , 212(sp)
	mv a1 , s2
	lw s2 , 144(sp)
	mv a2 , s2
	call getResult
	mv s2 , a0
	sw s2 , 140(sp)
	li s2 , 1
	sw s2 , 136(sp)
	lw s3 , 140(sp)
	lw s2 , 136(sp)
	add s2, s3, s2
	sw s2 , 132(sp)
	lw s2 , 224(sp)
	lw s3 , 132(sp)
	sw s3 , 0(s2)
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
	la s2 , result
	sw s2 , 128(sp)
	lw s2 , 128(sp)
	lw s2 , 0(s2)
	sw s2 , 128(sp)
	lw s2 , 456(sp)
	sw s2 , 124(sp)
	li s2 , 4
	sw s2 , 120(sp)
	lw s2 , 120(sp)
	lw s3 , 124(sp)
	mul s2, s2, s3
	sw s2 , 120(sp)
	lw s3 , 128(sp)
	lw s2 , 120(sp)
	add s2, s3, s2
	sw s2 , 116(sp)
	lw s2 , 116(sp)
	lw s2 , 0(s2)
	sw s2 , 112(sp)
	lw s2 , 452(sp)
	sw s2 , 108(sp)
	li s2 , 4
	sw s2 , 104(sp)
	lw s2 , 104(sp)
	lw s3 , 108(sp)
	mul s2, s2, s3
	sw s2 , 104(sp)
	lw s2 , 112(sp)
	lw s3 , 104(sp)
	add s2, s2, s3
	sw s2 , 100(sp)
	lw s2 , 100(sp)
	lw s2 , 0(s2)
	sw s2 , 96(sp)
	li s2 , 0
	sw s2 , 92(sp)
	li s2 , 1
	sw s2 , 88(sp)
	lw s2 , 92(sp)
	lw s3 , 88(sp)
	sub s2, s2, s3
	sw s2 , 84(sp)
	lw s3 , 96(sp)
	lw s2 , 84(sp)
	xor s2, s3, s2
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	seqz s2 , s2
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	bnez s2,IFTrue74
	j IFFalse74

IFTrue74:
	la s2 , result
	sw s2 , 76(sp)
	lw s2 , 76(sp)
	lw s2 , 0(s2)
	sw s2 , 76(sp)
	lw s2 , 456(sp)
	sw s2 , 72(sp)
	li s2 , 4
	sw s2 , 68(sp)
	lw s3 , 68(sp)
	lw s2 , 72(sp)
	mul s2, s3, s2
	sw s2 , 68(sp)
	lw s2 , 76(sp)
	lw s3 , 68(sp)
	add s2, s2, s3
	sw s2 , 64(sp)
	lw s2 , 64(sp)
	lw s2 , 0(s2)
	sw s2 , 60(sp)
	lw s2 , 452(sp)
	sw s2 , 56(sp)
	li s2 , 4
	sw s2 , 52(sp)
	lw s2 , 52(sp)
	lw s3 , 56(sp)
	mul s2, s2, s3
	sw s2 , 52(sp)
	lw s3 , 60(sp)
	lw s2 , 52(sp)
	add s2, s3, s2
	sw s2 , 48(sp)
	lw s2 , 48(sp)
	lw s2 , 0(s2)
	sw s2 , 44(sp)
	li s2 , 1
	sw s2 , 40(sp)
	lw s2 , 48(sp)
	lw s3 , 40(sp)
	sw s3 , 0(s2)
	j IFFinish74

IFFalse74:
	j IFFinish74

IFFinish74:
	la s2 , result
	sw s2 , 36(sp)
	lw s2 , 36(sp)
	lw s2 , 0(s2)
	sw s2 , 36(sp)
	lw s2 , 456(sp)
	sw s2 , 32(sp)
	li s2 , 4
	sw s2 , 28(sp)
	lw s3 , 28(sp)
	lw s2 , 32(sp)
	mul s2, s3, s2
	sw s2 , 28(sp)
	lw s2 , 36(sp)
	lw s3 , 28(sp)
	add s2, s2, s3
	sw s2 , 24(sp)
	lw s2 , 24(sp)
	lw s2 , 0(s2)
	sw s2 , 20(sp)
	lw s2 , 452(sp)
	sw s2 , 16(sp)
	li s2 , 4
	sw s2 , 12(sp)
	lw s2 , 12(sp)
	lw s3 , 16(sp)
	mul s2, s2, s3
	sw s2 , 12(sp)
	lw s3 , 20(sp)
	lw s2 , 12(sp)
	add s2, s3, s2
	sw s2 , 8(sp)
	lw s2 , 8(sp)
	lw s2 , 0(s2)
	sw s2 , 4(sp)
	lw s2 , 4(sp)
	sw s2 , 448(sp)
	lw s2 , 448(sp)
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	lw s2 , 444(sp)
	mv ra , s2
	addi sp,sp,464
	ret


    .globl  printF
    .p2align    2
printF:
	mv s0 , sp
	sw a0 , -4(sp)
	sw a1 , -8(sp)
	sw a2 , -12(sp)
	addi sp,sp,-104
	mv s2 , ra
	sw s2 , 88(sp)
	j entry5
entry5:
	lw s2 , 100(sp)
	sw s2 , 84(sp)
	lw s2 , 84(sp)
	mv a0 , s2
	call toString
	mv s2 , a0
	sw s2 , 80(sp)
	lw s2 , 80(sp)
	mv a0 , s2
	call print
	j ForCond115

ForCond115:
	lw s2 , 92(sp)
	sw s2 , 76(sp)
	li s2 , 0
	sw s2 , 72(sp)
	lw s3 , 72(sp)
	lw s2 , 76(sp)
	slt s2, s3, s2
	sw s2 , 68(sp)
	lw s2 , 68(sp)
	bnez s2,ForLoop115
	j ForFinish115

ForLoop115:
	la s2 , .Str1
	sw s2 , 64(sp)
	lw s2 , 64(sp)
	mv a0 , s2
	call print
	lw s2 , 96(sp)
	sw s2 , 60(sp)
	lw s2 , 60(sp)
	mv a0 , s2
	call toString
	mv s2 , a0
	sw s2 , 56(sp)
	lw s2 , 56(sp)
	mv a0 , s2
	call print
	lw s2 , 96(sp)
	sw s2 , 52(sp)
	li s2 , 2
	sw s2 , 48(sp)
	lw s2 , 52(sp)
	lw s3 , 48(sp)
	mul s2, s2, s3
	sw s2 , 44(sp)
	lw s2 , 100(sp)
	sw s2 , 40(sp)
	lw s2 , 44(sp)
	lw s3 , 40(sp)
	sub s2, s2, s3
	sw s2 , 36(sp)
	lw s2 , 36(sp)
	sw s2 , 96(sp)
	lw s2 , 100(sp)
	sw s2 , 32(sp)
	lw s2 , 96(sp)
	sw s2 , 28(sp)
	lw s3 , 32(sp)
	lw s2 , 28(sp)
	add s2, s3, s2
	sw s2 , 24(sp)
	li s2 , 2
	sw s2 , 20(sp)
	lw s3 , 24(sp)
	lw s2 , 20(sp)
	div s2, s3, s2
	sw s2 , 16(sp)
	lw s2 , 16(sp)
	sw s2 , 100(sp)
	lw s2 , 92(sp)
	sw s2 , 12(sp)
	li s2 , 1
	sw s2 , 8(sp)
	lw s2 , 12(sp)
	lw s3 , 8(sp)
	sub s2, s2, s3
	sw s2 , 4(sp)
	lw s2 , 4(sp)
	sw s2 , 92(sp)
	j ForEnd115

ForEnd115:
	j ForCond115

ForFinish115:
	la s2 , .Str2
	sw s2 , 0(sp)
	lw s2 , 0(sp)
	mv a0 , s2
	call print
	lw s2 , 88(sp)
	mv ra , s2
	addi sp,sp,104
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

