section .data
    greet db "Hello "

section .bss
    name resb 6

section .text
    global _start

_start:
    mov rax, 0
    mov rdi, 0
    mov rsi, name
    mov rdx, 6
    syscall

    mov rax, 1
    mov rdi, 1
    mov rsi, greet
    mov rdx, 6
    syscall

    mov rax, 1
    mov rdi, 1
    mov rsi, name
    mov rdx, 6
    syscall

    mov rax, 60
    mov rdi, 0
    syscall

