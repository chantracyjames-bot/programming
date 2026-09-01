section .data
    digit db 0, 10

section .text
    global _start

_start:
    call _perform_math

    mov rax, 60
    mov rdi, 0
    syscall

_print_digit:
    mov rax, 1
    mov rdi, 1
    mov rsi, digit
    mov rdx, 2
    syscall
    ret

_assign_digit:
    add rbx, 48
    add rax, rbx
    mov [digit], al ;> moves al to memory address [digit]
    ret

_perform_math:
    mov rax, 3
    mov rbx, 9
    div rbx
    call _assign_digit
    call _print_digit
    ret