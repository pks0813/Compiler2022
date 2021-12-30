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
	addi sp sp -60
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
	li s0 , 9
	sw s0 , 28(sp)
	lw s1 , 28(sp)
	sw s1 , 0(sp)
	li s2 , 10
	sw s2 , 32(sp)
	lw s3 , 32(sp)
	sw s3 , 4(sp)
	li s4 , 11
	sw s4 , 36(sp)
	lw s5 , 36(sp)
	sw s5 , 8(sp)
	li s6 , 12
	sw s6 , 40(sp)
	lw s7 , 40(sp)
	sw s7 , 12(sp)
	li s8 , 13
	sw s8 , 44(sp)
	lw s9 , 44(sp)
	sw s9 , 16(sp)
	call f
	mv s10 , a0
	sw s10 , 48(sp)
	li s11 , 0
	sw s11 , 52(sp)
	lw t0 , 52(sp)
	sw t0 , 24(sp)
	lw t1 , 24(sp)
	sw t1 , 56(sp)
	lw t2 , 56(sp)
	mv a0 , t2
	addi sp sp 60
	lw ra , 20(sp)
	ret

.Lfunc_end1:
	.size	main, .Lfunc_end1-main

    .globl  f
    .p2align    2
	.type	f,@function
f:
	addi sp sp -68
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
	li s0 , 0
	sw s0 , 60(sp)
	lw s1 , 60(sp)
	sw s1 , 56(sp)
	lw s2 , 56(sp)
	sw s2 , 64(sp)
	lw s3 , 64(sp)
	mv a0 , s3
	addi sp sp 68
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

