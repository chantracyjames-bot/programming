section .data
    input_text db "Enter your grade: "
    invalid db "Invalid Input!!", 10
    again db "Press 'q' to exit: "

    eval1 db "Your grade of "
    eval2 db " is equivalent to "

    grade_A db "A", 10
    grade_B db "B", 10
    grade_C db "C", 10
    grade_D db "D", 10
    grade_F db "F", 10

section .bss
    input resb 4
    output resb 1
    len resb 1

section .text
    global _start

_start:
    ;> calls the get input routine
    call _get_input
    ;> moves the gathered input into rsi
    mov rsi, input
    ;> sets rax to 0
    xor rax, rax
    ;> parses the input
    call _parse_input
    ;> goes into the conditionals
    jmp _calculate_grade

_exit:
    ;> exits the program, return code 0
    mov rax, 60
    mov rdi, 0
    syscall

_get_input:
    ;> prints the "enter grade" thing'ma'bob
    mov rax, 1
    mov rdi, 1
    mov rsi, input_text
    mov rdx, 18
    syscall

    ;> gathers user input
    mov rax, 0
    mov rdi, 0
    mov rsi, input
    mov rdx, 4
    syscall

    ;> removes the newline after an input
    mov byte [input + rax - 1], 0 ;> thanks LLM
    ;> returns to _start                              
    ret

_parse_input:
    ;> sets rbx ti 0
    xor rbx, rbx
    ;> moves the input (copied into rsi) into bl (the first 8 bits)
    mov bl, [rsi]
    ;> compares if the current byte is a newline or null terminator
    ;> returns if those bytes are reached
    cmp bl, 10
    je _calculate_grade
    cmp bl, 0
    je _calculate_grade

    ;> converts the ASCII character into raw numbers
    sub bl, 48
    ;> multiples the byte by 10 if its not in the ones position
    imul rax, 10
    ;> adds raw numbers from rbx into rax
    add rax, rbx

    ;> increments rsi, moving onto the next byte
    inc rsi 
    ;> jumps back into the loop
    ;> only stops if a newline or a null terminator is caught
    jmp _parse_input

_calculate_grade:
    ;> compares if the input is invalid
    ;> if its above 100 or below 0
    cmp rax, 0
    jl  _print_invalid
    cmp rax, 100
    jg  _print_invalid

    ;> compares the number to 60
    ;> if it is less than 60, 'F' grade
    cmp rax, 60
    jl _print_F

    ;> compares the number to 70
    ;> if it is less than 60, 'D' grade
    cmp rax, 70
    jl  _print_D

    ;> compares the number to 80
    ;> if it is less than 60, 'C' grade
    cmp rax, 80
    jl  _print_C

    ;> compares the number to 90
    ;> if it is less than 60, 'B' grade
    cmp rax, 90
    jl  _print_B

    ;> compares the number to 100
    ;> if it is less than 60, 'A' grade
    cmp rax, 100
    jle _print_A

_print_A:
    ;> moves the grade_A text into rbx
    mov rbx, [grade_A]
    ;> moves the grade_A text into output, via rbx
    mov [output], rbx
    ;> jumps into printing the grade
    jmp _print_grade

_print_B:
    ;> moves the grade_B text into rbx
    mov rbx, [grade_B]
    ;> moves the grade_B text into output, via rbx
    mov [output], rbx
    ;> jumps into printing the grade
    jmp _print_grade

_print_C:
    ;> moves the grade_C text into rbx
    mov rbx, [grade_C]
    ;> moves the grade_C text into output, via rbx
    mov [output], rbx
    jmp _print_grade

_print_D:
    ;> moves the grade_D text into rbx
    mov rbx, [grade_D]
    ;> moves the grade_D text into output, via rbx
    mov [output], rbx
    ;> jumps into printing the grade
    jmp _print_grade

_print_F:
    ;> moves the grade_F text into rbx
    mov rbx, [grade_F]
    ;> moves the grade_F text into output, via rbx
    mov [output], rbx
    ;> jumps into printing the grade
    jmp _print_grade

_print_invalid:
    ;> prints if the input is invalid
    mov rax, 1
    mov rdi, 1
    mov rsi, invalid
    mov rdx, 16
    syscall
    ;> jumps into _start, looping the program
    jmp _start

_print_grade:
    ;> prints the first part of the output
    mov rax, 1
    mov rdi, 1
    mov rsi, eval1
    mov rdx, 14
    syscall

    ;> prints the user input
    mov rax, 1
    mov rdi, 1
    mov rsi, input
    mov rdx, 4
    syscall

    ;> prints the second part of the output
    mov rax, 1
    mov rdi, 1
    mov rsi, eval2
    mov rdx, 18
    syscall

    ;> prints the grade
    mov rax, 1
    mov rdi, 1
    mov rsi, output
    mov rdx, 2
    syscall
    ;> jumps into _start, looping the program
    jmp _ask_again

;> asks the user if they want to continue
_ask_again:
    ;> prints the "run again" thing'ma'bob
    mov rax, 1
    mov rdi, 1
    mov rsi, again
    mov rdx, 19
    syscall

    ;> gathers user input
    mov rax, 0
    mov rdi, 0
    mov rsi, input
    mov rdx, 4
    syscall

    ;> goes to interpret user input
    jmp _parse_ask

;> parses the user's input
_parse_ask:
    ;> moves the user's input into rax
    mov rax, [input]
    ;> if the input is 'q' exits the program
    ;> if not, goes back to the start
    cmp al, 'q'
    je  _exit
    jne _start
