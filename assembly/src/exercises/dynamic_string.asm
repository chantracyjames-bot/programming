section .data
    text db "lumbago", 10, 0
    text2 db "idkman", 10, 0

section .text
    global _start

_start:
    mov rax, text
    call _print

    mov rax, text2
    call _print

    mov rax, 60
    mov rdi, 1
    syscall

_print:
    push rax
    mov rbx, 0

_print_loop:
    inc rax
    inc rbx
    mov cl, [rax]
    cmp cl, 0
    jne _print_loop

    mov rax, 1
    mov rdi, 1
    pop rsi
    mov rdx, rbx
    syscall
    ret