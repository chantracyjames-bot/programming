/* general
    - syntaxes
        - statements
            - a statement is a single line (or compound) that performs a single operation
                - i.e. calling a function, initializing a variable, declaring a loop, etc.
            - every statement must end with a semicolon ;
            - example:
                char my_string[] = "Hello World"; // declaring a variable
                printf("%s", my_string);          // print statement
        - comments
            - comments in C is done by declaring a double frontslash //
            - comments are not compiled into code
            - syntax:
                // <comment>
            - example:
                // comment here
        - case-sensitive
            - C is case-sensitive when it comes to naming
            - true and True are not the same thing
        - numbers and text
            - text in C must be wrapped in double quotes " "
                - a single character (char) is usually wrapped in single quotes ' '
                - example:
                    char my_string[] = "idkman" // string
                    char my_char = 'Z'          // char
            - numbers doesn't need to be inside quotations
                - doing so will convert the number into a string
                - example:
                    int my_num = 100    // int
                    int my_float = 3.14 // floats
        - code blocks
            - blocks or groups of code are often encased in cutly bracer { }
            - it is recommended to encase blocks of code that is connected to each other in code blocks to group the,m
            - in an if, else if, else statements, and even in iterative statements
                - without a code block, only the first line will get executed as part of the statement
                    - any succeeding lines will get ignored or get executed outside of the statements
                - example:
                    if (true):
                        printf("yes") // gets executed
                        printf("no")  // does not get executed

    - naming conventions
        - there are industry standard when naming certain elements in C
        - variables
            - usually in snake_case
            - example:
                int my_string;
                char my_num[];
        - functions
            - usually in snake_case
            - example:
                my_function();
                sum_all();
        - filenames and folders
            - usually in snake_case
            - example:
                my_program.c
                idkman.c
        - enums
            - usually in snake_case
            - example:
                enum my_enum {...}
                enum constants_enum {...}
        - pointers
            - usually in snake_case with a prefix of p_
            - example:
                int *p_num_ptr;
                float *p_idk_ptr;
        - structs
            - usualy in snake_case with a suffic of _t or _s
            - example:
                struct my_struct_t {...}
                typedef struct idkman_s {...}
        - constants (const) and enum values
            - since enum values are similar to const variables, both follow the SCREAMING_SNAKE_CASE
            - example:
                const MY_VAR;
                enum my_enum {
                    IDKMAN,
                    LUMBAGO
                }

    - scope
        - by default, the compiler compiles code from the top to bottom, first line until the last line
        - calling a variable that is not defined until later in the code will throw an error
        - example:
            printf(x + 10); -> Error
            int x = 10;    // defined later while called before declared
        - block scope
            - are statements inside a block of code
            - variables inside a block scope only exists inside that code block
            - trying to access a variable inside a block scope from the outside will throw an error
            - example:
                void my_func() {
                    int x = 10;
                }
                printf("%d", x)        -> Error
            - loop scope
                - like block scope, variables inside a loop (e.g. for loops) are only accessible inside of it
                    - trying to access it outside the code block will throw an error
                - example:
                    while(true) {
                        int i = 10;
                        break;
                    }
                    printf("%d", i) -> Error

    - escape sequence
        - \n
            - the most common escape sequence
            - it represents a new line
        - \t
            - it represents a horizontal tab rule
        - \\
            - represents a single backslash as text
        /-\"
            - represents a double quote ias text
*/
/* ASCII Printable Characters
    Char	Number	Description
        0 - 31	Control characters (see below)
        32	space
    !	33	exclamation mark
    "	34	quotation mark
    #	35	number sign
    $	36	dollar sign
    %	37	percent sign
    &	38	ampersand
    '	39	apostrophe
    (	40	left parenthesis
    )	41	right parenthesis
    *	42	asterisk
    +	43	plus sign
    ,	44	comma
    -	45	hyphen
    .	46	period
    /	47	slash
    0	48	digit 0
    1	49	digit 1
    2	50	digit 2
    3	51	digit 3
    4	52	digit 4
    5	53	digit 5
    6	54	digit 6
    7	55	digit 7
    8	56	digit 8
    9	57	digit 9
    :	58	colon
    ;	59	semicolon
    <	60	less-than
    =	61	equals-to
    >	62	greater-than
    ?	63	question mark
    @	64	at sign
    A	65	uppercase A
    B	66	uppercase B
    C	67	uppercase C
    D	68	uppercase D
    E	69	uppercase E
    F	70	uppercase F
    G	71	uppercase G
    H	72	uppercase H
    I	73	uppercase I
    J	74	uppercase J
    K	75	uppercase K
    L	76	uppercase L
    M	77	uppercase M
    N	78	uppercase N
    O	79	uppercase O
    P	80	uppercase P
    Q	81	uppercase Q
    R	82	uppercase R
    S	83	uppercase S
    T	84	uppercase T
    U	85	uppercase U
    V	86	uppercase V
    W	87	uppercase W
    X	88	uppercase X
    Y	89	uppercase Y
    Z	90	uppercase Z
    [	91	left square bracket
    \	92	backslash
    ]	93	right square bracket
    ^	94	caret
    _	95	underscore
    `	96	grave accent
    a	97	lowercase a
    b	98	lowercase b
    c	99	lowercase c
    d	100	lowercase d
    e	101	lowercase e
    f	102	lowercase f
    g	103	lowercase g
    h	104	lowercase h
    i	105	lowercase i
    j	106	lowercase j
    k	107	lowercase k
    l	108	lowercase l
    m	109	lowercase m
    n	110	lowercase n
    o	111	lowercase o
    p	112	lowercase p
    q	113	lowercase q
    r	114	lowercase r
    s	115	lowercase s
    t	116	lowercase t
    u	117	lowercase u
    v	118	lowercase v
    w	119	lowercase w
    x	120	lowercase x
    y	121	lowercase y
    z	122	lowercase z
    {	123	left curly brace
    |	124	vertical bar
    }	125	right curly brace
    ~	126	tilde
*/

#include <stdio.h>
// header of the program
// it is the place where you can import modules like stdio.h for printing and scanning

int main() {
// int main() acts as the entry point of the program
// anything inside its curly braces {} runs code
    printf("Hello World\n");
    // printf prints text to the terminal
    // every line of code must end in semicolons ;
    // the program throws an error if not present

    return 0;
    // standard way of closing the program
    // 0 returns that the program ended without errors
}
// basic C program
