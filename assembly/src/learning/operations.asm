; operations
;   - math operations are used to mathematically manipulate registers
;       - syntax:
;           <operation> <register>, <value>
;       - note that the first register is the subject of the operation
;       - example:
;           add rax, 5   ;> adds 5 to rax
;           sub rbx, rax ;> decrements rbx by rax
;       - operations list
;           operation   (signed)    description
;           add a, b       -        a = a + b
;           sub a, b       -        a = a - b
;           mul reg     imul reg    rax = rax * reg
;           dev reg     idiv reg    rax = rax / reg
;           neg reg        -        reg = -reg      ;> negate
;           inc reg        -        reg = reg + 1   ;> increment
;           dec reg        -        reg = reg - 1   ;> decrement
;           adc a, b       -        a = a + b + CF  ;> add carry
;           sbb a, b       -        a = b - b - CF  ;> subtract borrow
;       - sidenote:
;           - that the operations that requires only one argument
;               - it assumes that the first argument is rax (mul and div only)
;           - the add carry and subtract borrow, are mostly the same ass add and sub
;               - the only difference is that the it adds and subtracts the carry flag, respectively
;
;   - jumps
;       - is used to "jump" to different parts of code
;           - which is based on the labels
;       - can be used to control the flow of the program
;       - syntax:
;           jmp <label>
;       - example:
;           jmp _start ;> jumps to the start of _start
;                      ;> loads the value "_start" into the rip register
;                      ;> the programs goes into an infinite loop
;   - comparisons
;       - allow programs to be able to take different paths
;           - based on certain conditions
;           - similar to conditional statements in C or C++
;       - these are done to registers
;       - syntax:
;           cmp <register>, <value>
;       - example:
;           cmp rax, 23
;           ;> or
;           cmp rax, rbx
;       - comparison with flags
;           - after a comparison is made, certain flags are set
;           - if a is equal to b, or a = b
;               - ZF = 1, or the ZF flag is set
;           - if a is not equal to bm or a != b
;               - ZF = 0, or the ZF flag is reset
;           - the SF flag gets set to the most significant bit
;               - which is a - b
;       - conditional jumps
;           - after a comparison is made, a conditional jump is able to be made
;           - conditional jumps are based on the status of the flags
;           - conditional jumps in code are written just like unconditional jumps
;               - though, the "jmp" syntax is replaced
;               - by the synbol for the conditional jump
;           - list of conditional jumps:
;                   jump symbol 
;               (signed) (unsigned)    if cmp a, b
;                   je        -            a = b
;                   jme       -            a != b
;                   jg        ja           a > b
;                   jge       jae          a >= b
;                   jl        jb           a < b
;                   jle       jbe          a <= b
;                   jz        -            a = 0
;                   jnz       -            a != 0
;                   jo        -            overflow occured
;                   jno       -            overflow did not occur
;                   js        -            jump if signed
;                   jns       -            jump if not signed
;           - example:
;               cmp rax, 24  ;> compares rax to 24
;               je  _my_code ;> jumps to _my_code if rax is equal to 24
;
;               cmp rax, rbx ;> compared rax to sbx
;               jg  _my_code ;> jumps to _my_code if rax is greaten than rbx
;
;   - calls
;       - essentially, calls and jumps are the same thing
;           - however, when a "call" is used, the original position of the call
;               - was made in, is able to be returned by using ret (return?)
;       - example:
;           _start:
;               call _print_hello
;           _print_hello:
;               mov rax, 1
;               mov rdi, 1
;               mov rsi, text
;               mov rdx, 14
;               syscall
;               ret
;       - the code that prints the "Hello World" string is moved into its own section
;               - called "_print_hello", and this section was called
;               - this term is called "subroutine"
;                   - presumably similar to functions (?)
;
;   - the stack
;       - like registers, is another way to temporarily store data
;       - as the name suggests, the stack is where data is piled up
;           - the data that is accessible is the data on the top of the stack
;           - trying to access data from the middle of the stack requires to remove the data on top
;       - sidenote:
;           - when adding data onto the top of the stack
;               - the data gets "pushed" onto the stack
;           - when removing data from the top of the stack
;               - the data gets "popped" from the stack
;           - when viewing the data at the top of the satck
;               - this is called "peeking"
;           - only the data on the top of the stack is accessible
;               - it is able to be accessed using rsp
;       - stack operations
;           operation       description
;           push value      pushes a value onto the stack
;           pop reg         pops a value off of the stack
;                           stores the popped value into reg
;           mov reg, [rsp]  stores the peek value in reg
;                           rsp is a pointer to the top of the stack
;       - note that in places wherein registers are able to be used
;           - pointers are also able to be utilized
;           - instead of "pop reg", "pop [label]" is also applicable
;               - the popped value gets stored to what memory address the pointer holds