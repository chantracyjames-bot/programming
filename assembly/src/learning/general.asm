; general
;   - syntax
;       - statements
;           - in assembly, it is usually in this format:
;               [label]    mnemonic    [operands]    [;comment]
;           - note that the fields inside the square brackets [ ] are optional
;       - comments
;           - the semicolon usually indicates a comment in assembly
;           - syntax;
;               ; message here idkwhy
;           - on some compilers, they have other interpretations of what a comment is
;               - like GNU's assembly compiler, GAS
;               - which uses C-style comments
;                   ; idkman
;       - sections
;           - code in assembly is generally divided into a few sections
;               - data section
;                   - this is where data or constants are initialized before compilation
;                       - constant values, file names, buffer size, etc.
;                   - the data stored here does not change at runtime
;                   - syntax:
;                       section .data
;               - bss section
;                   - this is where variables are declared for future use
;                   - syntax:
;                       section .bss
;               - text section
;                   - this is where the actual code resides in
;                   - this section muct begin with the global _start declaration
;                       - basically the main() function in languages like C or Rust
;                   - syntax:
;                       section .text
;       - labels
;           - is used to label a part of code
;           - upon compilation
;               - the compiler will calculate the location in which the label will sit in memory
;           - any time the label is used (or called)
;               - the name is replaced by the location in memory by the compiler
;           - _start is an example of a label
;               - it is also the entry point of the program
;       - global
;           - is a keyword used to tell the linker to know the addess of some labels
;           - the object file created will contain a link to every link
;               - if declared global in the source file
;           - the code "global _start" is required for the code to be properly linked
;       - registers
;           - are part of the processor that temporarily holds memory
;           - in the x86_64 architectur, registers hold 64 bits
;               - each register can hold:
;                   - unsigned = from 0 to 2^64 - 1
;                   - signed   = from -9.223 * 10^18 to 9.223 * 10^18
;           - comparison with other registers
;               8 bit   16 bit  32 bit  64 bit  
;               al      ax      eax     rax
;               bl      bx      ebx     rbx
;               cl      cx      ecx     rcx
;               dl      dx      edx     rdx
;               sil     si      esi     rsi
;               dil     di      edi     rdi
;               bpl     bl      ebp     rbp
;               spl     sp      esp     rsp
;               r8b     r8w     r8d     r8
;               r9b     r9w     r9d     r9
;               r10b    r10w    r10d    r10
;               r11b    r11w    r11d    r11
;               r12b    r12w    r12d    r12
;               r13b    r13w    r13d    r13
;               r14b    r14w    r14d    r14
;               r15b    r15w    r15d    r15
;           - sidenote:
;               - the eax register is actually half of the rax register
;                   - while the ax register is the actual half of the eax register
;                   - finally, the al register if the actual half of the ax register
;               - technically, when using the al register
;                   - it will act like it is an 8-bit register
;                   - when in actuality, it is modifying the lower 8 bits of the rax register
;           - registers as pointers
;               - the default registers are able to be treated as pointers
;               - to treat a register as a pointer, it is surrounded by square brackers [ ]
;               - syntax:
;                   <mnemonic> <register>, [<register>]
;               - example:
;                   mov rax, [rbx] ;> loads the value thar rbx is pointing to into rax
;       - flags
;           - like registers, flags hold data
;           - flags can only hold 1 bit each
;               - like a boolean, it can only be either a true or a false
;           - individual flags are part of a larger register
;           - flag table:
;               flag    description
;               CF     carry
;               PF     parity
;               ZF     zero
;               SF     sign
;               OF     overflow
;               AF     adjust
;               IF     interupt enabled
;       - jumps
;           - is used to "jump" to different parts of code
;               - which is based on the labels
;           - can be used to control the flow of the program
;           - snytax:
;               jmp <label>
;           - example:
;               jmp _start ;> jumps to the start of _start
;                          ;> loads the value "_start" into the rip register
;                          ;> the programs goes into an infinite loop
;       - comparisons
;           - allow programs to be able to take different paths
;               - based on certain conditions
;               - similar to conditional statements in C or C++
;           - these are done to registers
;           - syntax:
;               cmp <register>, <value>
;           - example:
;               cmp rax, 23
;               ;> or
;               cmp rax, rbx
;           - comparison with flags
;               - after a comparison is made, certain flags are set
;               - if a is equal to b, or a = b
;                   - ZF = 1, or the ZF flag is set
;               - if a is not equal to bm or a != b
;                   - ZF = 0, or the ZF flag is reset
;               - the SF flag gets set to the most significant bit
;                   - which is a - b
;           - conditional jumps
;               - after a comparison is made, a conditional jump is able to be made
;               - conditional jumps are based on the status of the flags
;               - conditional jumps in code are written just like unconditional jumps
;                   - though, the "jmp" syntax is replaced
;                   - by the synbol for the conditional jump
;               - list of conditional jumps:
;                        jump symbol 
;                    (signed) (unsigned)    if cmp a, b
;                       je        -            a = b
;                       jme       -            a != b
;                       jg        ja           a > b
;                       jge       jae          a >= b
;                       jl        jb           a < b
;                       jle       jbe          a <= b
;                       jz        -            a = 0
;                       jnz       -            a != 0
;                       jo        -            overflow occured
;                       jno       -            overflow did not occur
;                       js        -            jump if signed
;                       jns       -            jump if not signed
;               - example:
;                   cmp rax, 24  ;> compares rax to 24
;                   je  _my_code ;> jumps to _my_code if rax is equal to 24
;
;                   cmp rax, rbx ;> compared rax to sbx
;                   jg  _my_code ;> jumps to _my_code if rax is greaten than rbx
;           - calls
;               - essentially, calls and jumps are the same thing
;               - however, when a "call" is used, the original position of the call
;                   - was made in, is able to be returned by using ret (return?)
;               - example:
;                   _start:
;                       call _print_hello
;                   _print_hello:
;                       mov rax, 1
;                       mov rdi, 1
;                       mov rsi, text
;                       mov rdx, 14
;                       syscall
;                       ret
;               - the code that prints the "Hello World" string is moved into its own section
;                   - called "_print_hello", and this section was called
;                   - this term is called "subroutine"
;                       - presumably similar to functions (?)
;
;   - system call
;       - also known as "syscall"
;       - it is used when a program requests a service from the kernel
;       - differing devices, notable operating systems, use different system calls
;           - this is due to them having different kernels
;       - all system calls have an ID associated with them, usually a number
;       - system calls can also take in arguments or a list of inputs
;       - system call inputs by register:
;            argument    registers
;               ID          rax
;               1           rdi
;               2           rsi           
;               3           rdx
;               4           r10
;               5           r8
;               6           r9
;       - syscall arguments:
;           syscall     ID (rax)    arg1 (rdi)          arg2 (rsi)      arg 3 (rdx)
;           sys_read       0        #filedescriptor     $buffer     #count
;           sys_write      1        #filedescriptor     $buffer     #count
;           sys_open       2        $filename           #flags      #mode
;           sys_close      3        #filedescriptor
;           sys_exit       60       #errorcode
;       - sys_write
;           argument type       argument description
;           file descriptor         0 (std input)
;                                   1 (std input)
;                                   2 (std input)
;           buffer                  location of string
;           count                   length of string
;
;   - pointers
;       - are also registers that hold data
;       - they point to a certain memory address
;           - that is the data they hold, a memory address
;           - a pointer to another data in memory
;       - pointers:
;           pointer name    meaning     description
;           rip (eip, ip)   index ptr   points to the next memory address
;                                       to be executed in the control flow
;           rsp(esp, sp)    stack ptr   points to the top address in the stack
;           rbp(ebp, bp)    stack bptr  points to the bottom of the stack (base)
;       - rip (control flow)
;           - by default, all code runs from top to bottom
;               - the direction that a progrom flows to is called "control flow"
;           - the rip register holds the address of the next instruction to be executed
;               - after each instruction, it is incremented by 1
;               - making the control flow naturally flow from top to bottom
;           - some instructions can increment rip by more than one
;               - as some instructions take more than one byte of data

section .data
    text db "Hello World", 10
    ; - text is the usual "variable" name
    ;   - it is assigned to the memory address of the values that have been defined to it
    ;   - it is able to be called later in the program when its value is needed
    ;   - after the program is compiled, any mention of this variable "text"
    ;       - gets replaced with the memory address of the values it has been assigned to
    ; - db stands for define bytes
    ;   - meaning, this line will define raw bytes into the code
    ; - "Hello World", 10 is the bytes of data that is being defined
    ;   - each character in the string is a byte
    ;   - 10 represents a newline or "\n"


section .text
    global _start

_start:                                                             ;> control flow
    mov rax, 1    ;> initiates sys_write                             ;> rip = 1
    mov rdi, 1    ;> initiates the file descriptor to 1 (stdin)      ;> rip = x + 1
    mov rsi, text ;> gives the address of the string                 ;> rip = x + 2
    mov rdx, 12   ;> gives the length of string to write             ;> rip = x + 3
    syscall       ;> calls the kernel to run the system call         ;> rip = x + 4

    mov rax, 60   ;> initiates sys_exit                              ;> rip = x + 5
    mov rdi, 0    ;> gives the error code 0 (success)                ;> rip = x + 6
    syscall       ;> calls the kernel to run the system calls        ;> rip = x + 7