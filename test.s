	.text

    .globl  Init
    .p2align    2
Init:
	mv s0 , sp
	addi sp,sp,0
	mv s2 , ra
	j entry0
entry0:
	mv ra , s2
	addi sp,sp,0
	ret


    .globl  main
    .p2align    2
main:
	mv s0 , sp
	addi sp,sp,-4
	mv s2 , ra
	sw s2 , 0(sp)
	j entry1
entry1:
	call Init
	li a0 , 18
	li a1 , 12
	li a2 , 6
	call tak
	mv s2 , a0
	mv s2 , s2
	mv s2 , s2
	mv a0 , s2
	lw s2 , 0(sp)
	mv ra , s2
	addi sp,sp,4
	ret


    .globl  tak
    .p2align    2
tak:
	mv s0 , sp
	addi sp,sp,-24
	mv s2 , a0
	sw s2 , 20(sp)
	mv s2 , a1
	sw s2 , 16(sp)
	mv s2 , a2
	sw s2 , 12(sp)
	mv s2 , ra
	sw s2 , 8(sp)
	j entry2
entry2:
	lw s2 , 16(sp)
	mv s3 , s2
	lw s2 , 20(sp)
	mv s2 , s2
	slt s2, s3, s2
	bnez s2,IFTrue12
	j IFFalse12

IFTrue12:
	lw s2 , 20(sp)
	mv s3 , s2
	li s2 , 1
	sub s4, s3, s2
	lw s2 , 16(sp)
	mv s3 , s2
	lw s2 , 12(sp)
	mv s2 , s2
	mv a0 , s4
	mv a1 , s3
	mv a2 , s2
	call tak
	mv s2 , a0
	sw s2 , 4(sp)
	lw s2 , 16(sp)
	mv s3 , s2
	li s2 , 1
	sub s4, s3, s2
	lw s2 , 12(sp)
	mv s3 , s2
	lw s2 , 20(sp)
	mv s2 , s2
	mv a0 , s4
	mv a1 , s3
	mv a2 , s2
	call tak
	mv s2 , a0
	sw s2 , 0(sp)
	lw s2 , 12(sp)
	mv s3 , s2
	li s2 , 1
	sub s4, s3, s2
	lw s2 , 20(sp)
	mv s3 , s2
	lw s2 , 16(sp)
	mv s2 , s2
	mv a0 , s4
	mv a1 , s3
	mv a2 , s2
	call tak
	mv s3 , a0
	lw s2 , 4(sp)
	mv a0 , s2
	lw s2 , 0(sp)
	mv a1 , s2
	mv a2 , s3
	call tak
	mv s3 , a0
	li s2 , 1
	add s2, s2, s3
	mv s2 , s2
	mv s2 , s2
	mv a0 , s2
	lw s2 , 8(sp)
	mv ra , s2
	addi sp,sp,24
	ret

IFFalse12:
	lw s2 , 12(sp)
	mv s2 , s2
	mv s2 , s2
	mv s2 , s2
	mv a0 , s2
	lw s2 , 8(sp)
	mv ra , s2
	addi sp,sp,24
	ret

IFFinish12:
	mv s2 , s2
	mv a0 , s2
	lw s2 , 8(sp)
	mv ra , s2
	addi sp,sp,24
	ret


