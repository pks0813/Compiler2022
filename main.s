	.text
	.file	"test.ll"
	.globl	Init                    # -- Begin function Init
	.p2align	2
	.type	Init,@function
Init:                                   # @Init
	.cfi_startproc
# %bb.0:                                # %AllocaBlock
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
	addi	sp, sp, -16
	.cfi_def_cfa_offset 16
	sw	ra, 12(sp)
	.cfi_offset ra, -4
	call	Init
	lui	a0, %hi(.Str0)
	addi	a0, a0, %lo(.Str0)
	call	print
	mv	a0, zero
	lw	ra, 12(sp)
	addi	sp, sp, 16
	ret
.Lfunc_end1:
	.size	main, .Lfunc_end1-main
	.cfi_endproc
                                        # -- End function
	.type	QQ,@object              # @QQ
	.section	.sbss,"aw",@nobits
	.globl	QQ
	.p2align	2
QQ:
	.word	0                       # 0x0
	.size	QQ, 4

	.type	.Str0,@object           # @.Str0
	.section	.rodata,"a",@progbits
	.globl	.Str0
.Str0:
	.asciz	"\n\\23"
	.size	.Str0, 5

	.section	".note.GNU-stack","",@progbits
