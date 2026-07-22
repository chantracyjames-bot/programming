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
;                   - example:
;                       section .data
;                           text db "idkman", 10 ;> allocates memory for the text "idkman\n"
;                                                ;> "text" holds the memory address for those values
;               - bss section
;                   - this is where variables are declared for future use
;                   - syntax:
;                       section .bss
;                   - example:
;                       section .bss
;                           input resb 16 ;> resb stands for "reserve bytes"
;                                         ;> allocated 16 bytes of memory
;                                         ;> "input" holds the memory address for these bytes
;               - text section
;                   - this is where the actual code resides in
;                   - this section muct begin with the global _start declaration
;                       - basically the main() function in languages like C or Rust
;                   - syntax:
;                       section .text
;                           global _start ;> makes _start be visible for the linker 
;                       _start:           ;> the entry point of the program
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
;       - ASCII
;           - is the method which moderm computers use to represent strings of text
;               - this is due to computers being able to only store numbers
;           - to get around this, ASCII works by mapping numbers to specific characters
;               - to letters, numbers, symbols, etc.
;           - ASCII uses 7-bit binary codes to represent characters
;               - however, a byte, is 8 bit, is the primary unit of imformation
;               - and so, modern computers today support extended ASCII, which is 8 bit codes
;           - ASCII Printable Characters
;              Char	    Number	Description
;                       0 - 31	Control characters
;               NUL     0       null   
;               SOH     1       start of heading   
;               STX     2       start of transmission
;               ETX     3       end of text
;               EOT     4       end of transmission
;               ENQ     5       enquiry
;               ACK     6       acknowledge
;               BEL     7       bell
;               BS      8       backspace   
;               TAB     9       horizontal tab
;               LF      10      line feed, new line
;               VT      11      vertical tab
;               FF      12      form feed, new page
;               CR      13      carriage return
;               SO      14      shift out
;               SI      15      shift in
;               DLE     16      data tink escape
;               DC1     17      device control 1
;               DC2     18      device control 2
;               DC3     19      device control 3
;               DC4     20      device control 4
;               NAK     21      negative acknowledge
;               SYN     22      synchronous, idle
;               ETS     23      end of transmission block
;               CAN     24      cancek
;               EM      25      end of medium 
;               SUB     26      substitue
;               ESC     27      escape
;               FS      28      file separator 
;               GS      29      group separator
;               RS      30      record separator   
;               US      31      unit separator
;                       32	    space
;               !	    33  	exclamation mark
;               " 	    34	    quotation mark
;               #	    35	    number sign
;               $	    36	    dollar sign
;               %	    37	    percent sign
;               &	    38	    ampersand
;               '	    39	    apostrophe
;               (	    40	    left parenthesis
;               )	    41	    right parenthesis
;               *	    42  	asterisk
;               +	    43  	plus sign
;               ,	    44  	comma
;               -	    45	    hyphen
;               .	    46  	period
;               /	    47  	slash
;               0	    48  	digit 0
;               1	    49  	digit 1
;               2	    50  	digit 2
;               3	    51  	digit 3
;               4	    52  	digit 4
;               5	    53  	digit 5
;               6	    54  	digit 6
;               7	    55  	digit 7
;               8	    56  	digit 8
;               9	    57  	digit 9
;               :	    58  	colon
;               ;	    59  	semicolon
;               <	    60  	less-than
;               =	    61  	equals-to
;               >	    62  	greater-than
;               ?	    63  	question mark
;               @	    64  	at sign
;               A	    65  	uppercase A
;               B	    66  	uppercase B
;               C	    67  	uppercase C
;               D	    68  	uppercase D
;               E	    69  	uppercase E
;               F	    70  	uppercase F
;               G	    71  	uppercase G
;               H	    72  	uppercase H
;               I	    73  	uppercase I
;               J	    74  	uppercase J
;               K	    75  	uppercase K
;               L	    76  	uppercase L
;               M	    77	    uppercase M
;               N	    78  	uppercase N
;               O	    79  	uppercase O
;               P	    80  	uppercase P
;               Q	    81  	uppercase Q
;               R	    82  	uppercase R
;               S	    83  	uppercase S
;               T	    84  	uppercase T
;               U	    85  	uppercase U
;               V	    86  	uppercase V
;               W	    87  	uppercase W
;               X	    88  	uppercase X
;               Y	    89  	uppercase Y
;               Z	    90  	uppercase Z
;               [	    91  	left square bracket
;               \	    92  	backslash
;               ]	    93  	right square bracket
;               ^	    94  	caret
;               _	    95	    underscore
;               `	    96  	grave accent
;               a	    97  	lowercase a
;               b	    98  	lowercase b
;               c	    99  	lowercase c
;               d	    100 	lowercase d
;               e	    101 	lowercase e
;               f	    102 	lowercase f
;               g	    103 	lowercase g
;               h	    104 	lowercase h
;               i	    105 	lowercase i
;               j	    106 	lowercase j
;               k	    107 	lowercase k
;               l	    108 	lowercase l
;               m	    109 	lowercase m
;               n	    110 	lowercase n
;               o	    111 	lowercase o
;               p	    112 	lowercase p
;               q	    113 	lowercase q
;               r	    114 	lowercase r
;               s	    115 	lowercase s
;               t	    116 	lowercase t
;               u	    117	    lowercase u
;               v	    118	    lowercase v
;               w	    119 	lowercase w
;               x	    120 	lowercase x
;               y	    121 	lowercase y
;               z	    122 	lowercase z
;               {	    123 	left curly brace
;               |	    124 	vertical bar
;               }	    125 	right curly brace
;               ~	    126 	tilde
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