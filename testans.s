	.text
	.file	"test.ll"
	.globl	Init                    # -- Begin function Init
	.p2align	2
	.type	Init,@function
Init:                                   # @Init
	.cfi_startproc
# %bb.0:                                # %AllocaBlock
	addi	sp, sp, -16
	.cfi_def_cfa_offset 16
	sw	ra, 12(sp)
	.cfi_offset ra, -4
	addi	a0, zero, 164
	call	malloc
	addi	a1, zero, 20
	sw	a1, 0(a0)
	addi	a0, a0, 4
	sw	a0, 8(sp)
	lui	a1, %hi(a)
	sw	a0, %lo(a)(a1)
	lw	ra, 12(sp)
	addi	sp, sp, 16
	ret
.Lfunc_end0:
	.size	Init, .Lfunc_end0-Init
	.cfi_endproc
                                        # -- End function
	.globl	main                    # -- Begin function main
	.p2align	2
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:                                # %AllocaBlock
	addi	sp, sp, -32
	.cfi_def_cfa_offset 32
	sw	ra, 28(sp)
	sw	s0, 24(sp)
	sw	s1, 20(sp)
	sw	s2, 16(sp)
	sw	s3, 12(sp)
	.cfi_offset ra, -4
	.cfi_offset s0, -8
	.cfi_offset s1, -12
	.cfi_offset s2, -16
	.cfi_offset s3, -20
	call	Init
	call	getInt
	lui	s2, %hi(n)
	sw	a0, %lo(n)(s2)
	lui	s1, %hi(i)
	sw	zero, %lo(i)(s1)
	lui	s3, %hi(a)
.LBB1_1:                                # %ForCond1
                                        # =>This Inner Loop Header: Depth=1
	lw	a0, %lo(i)(s1)
	lw	a1, %lo(n)(s2)
	bge	a0, a1, .LBB1_3
# %bb.2:                                # %ForLoop1
                                        #   in Loop: Header=BB1_1 Depth=1
	lw	a0, %lo(i)(s1)
	lw	a1, %lo(a)(s3)
	slli	a0, a0, 2
	add	s0, a1, a0
	call	getInt
	sw	a0, 0(s0)
	lw	a0, %lo(i)(s1)
	addi	a0, a0, 1
	sw	a0, %lo(i)(s1)
	j	.LBB1_1
.LBB1_3:                                # %ForFinish1
	lui	a0, %hi(n)
	lw	a0, %lo(n)(a0)
	srli	a1, a0, 31
	add	a0, a0, a1
	srai	a0, a0, 1
	call	jud
	sw	zero, 8(sp)
	mv	a0, zero
	lw	s3, 12(sp)
	lw	s2, 16(sp)
	lw	s1, 20(sp)
	lw	s0, 24(sp)
	lw	ra, 28(sp)
	addi	sp, sp, 32
	ret
.Lfunc_end1:
	.size	main, .Lfunc_end1-main
	.cfi_endproc
                                        # -- End function
	.globl	jud                     # -- Begin function jud
	.p2align	2
	.type	jud,@function
jud:                                    # @jud
	.cfi_startproc
# %bb.0:                                # %AllocaBlock
	addi	sp, sp, -32
	.cfi_def_cfa_offset 32
	sw	ra, 28(sp)
	sw	s0, 24(sp)
	sw	s1, 20(sp)
	.cfi_offset ra, -4
	.cfi_offset s0, -8
	.cfi_offset s1, -12
	sw	a0, 16(sp)
	sw	zero, 8(sp)
	lui	s0, %hi(n)
.LBB2_1:                                # %ForCond2
                                        # =>This Inner Loop Header: Depth=1
	lw	s1, 8(sp)
	lw	a0, %lo(n)(s0)
	lw	a1, 16(sp)
	call	__divsi3
	bge	s1, a0, .LBB2_4
# %bb.2:                                # %ForLoop2
                                        #   in Loop: Header=BB2_1 Depth=1
	sb	zero, 7(sp)
	beqz	zero, .LBB2_5
# %bb.3:                                # %IFFalse1
                                        #   in Loop: Header=BB2_1 Depth=1
	lw	a0, 8(sp)
	addi	a0, a0, 1
	sw	a0, 8(sp)
	j	.LBB2_1
.LBB2_4:                                # %ForFinish2
	sw	zero, 12(sp)
	mv	a0, zero
	j	.LBB2_6
.LBB2_5:                                # %IFTrue1
	addi	a1, zero, 1
	addi	a0, zero, 1
	sw	a1, 12(sp)
.LBB2_6:                                # %ForFinish2
	lw	s1, 20(sp)
	lw	s0, 24(sp)
	lw	ra, 28(sp)
	addi	sp, sp, 32
	ret
.Lfunc_end2:
	.size	jud, .Lfunc_end2-jud
	.cfi_endproc
                                        # -- End function
	.type	n,@object               # @n
	.section	.sbss,"aw",@nobits
	.globl	n
	.p2align	2
n:
	.word	0                       # 0x0
	.size	n, 4

	.type	a,@object               # @a
	.globl	a
	.p2align	2
a:
	.word	0
	.size	a, 4

	.type	i,@object               # @i
	.globl	i
	.p2align	2
i:
	.word	0                       # 0x0
	.size	i, 4

	.section	".note.GNU-stack","",@progbits
