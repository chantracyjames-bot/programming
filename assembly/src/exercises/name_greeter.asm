section .data
    query db "what is your name? "
    display db "Hello, "

section .bss
    name resb 16

section .text
    global _start

_start:
    call _display_query
    call _get_name
    call _display_name

    mov rax, 60
    mov rdi, 1
    syscall

_display_query:
    mov rax, 1
    mov rdi, 1
    mov rsi, query
    mov rdx, 19
    syscall
    ret

_get_name:
    mov rdi, 0
    mov rax, 0
    mov rsi, name
    mov rdx, 16
    syscall
    ret

_display_name:
    mov rax, 1
    mov rdi, 1
    mov rsi, name
    mov rdx, 16
    syscall
    ret