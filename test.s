    .globl  Init
    .p2align    2
	.type	Init,@function
Init:
	addi sp sp -4
	sw ra , 0(sp)
	j entry
entry0:
	addi sp sp 4
	lw ra , 0(sp)
	ret

.Lfunc_end0:
	.size	Init, .Lfunc_end0-Init

    .globl  main
    .p2align    2
	.type	main,@function
main:
	addi sp sp -28
	sw ra , 20(sp)
	j entry
entry1:
	call Init
	li a0 , 1
	li a1 , 2
	li a2 , 3
	li a3 , 4
	li a4 , 5
	li a5 , 6
	li a6 , 7
	li a7 , 8
	li %NewRegist0 , 9
	sw %NewRegist0 , 0(sp)
	li %NewRegist1 , 10
	sw %NewRegist1 , 4(sp)
	li %NewRegist2 , 11
	sw %NewRegist2 , 8(sp)
	li %NewRegist3 , 12
	sw %NewRegist3 , 12(sp)
	li %NewRegist4 , 13
	sw %NewRegist4 , 16(sp)
	call f
	mv %0 , a0
	li %NewRegist5 , 0
	sw %NewRegist5 , 24(sp)
	lw %1 , 24(sp)
	mv a0 , %1
	addi sp sp 28
	lw ra , 20(sp)
	ret

.Lfunc_end1:
	.size	main, .Lfunc_end1-main

    .globl  f
    .p2align    2
	.type	f,@function
f:
	addi sp sp -60
	sw ra , 0(sp)
	sw a0 , 4(sp)
	sw a1 , 8(sp)
	sw a2 , 12(sp)
	sw a3 , 16(sp)
	sw a4 , 20(sp)
	sw a5 , 24(sp)
	sw a6 , 28(sp)
	sw a7 , 32(sp)
	lw a0 , 0(sp)
	sw a0 , 36(sp)
	lw a0 , 4(sp)
	sw a0 , 40(sp)
	lw a0 , 8(sp)
	sw a0 , 44(sp)
	lw a0 , 12(sp)
	sw a0 , 48(sp)
	lw a0 , 16(sp)
	sw a0 , 52(sp)
	j entry
entry2:
	li %NewRegist0 , 0
	sw %NewRegist0 , 56(sp)
	lw %13 , 56(sp)
	mv a0 , %13
	addi sp sp 60
	lw ra , 0(sp)
	ret

.Lfunc_end2:
	.size	f, .Lfunc_end2-f

    .globl  _struct_pks_pks
    .p2align    2
	.type	_struct_pks_pks,@function
_struct_pks_pks:
	addi sp sp -8
	sw ra , 0(sp)
	sw a0 , 4(sp)
	j entry
entry3:
	addi sp sp 8
	lw ra , 0(sp)
	ret

.Lfunc_end3:
	.size	_struct_pks_pks, .Lfunc_end3-_struct_pks_pks

