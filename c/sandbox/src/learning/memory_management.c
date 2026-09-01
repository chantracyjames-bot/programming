/* memory management
    - memory layout
        - in C, memory is divided into varying segments
            - which are the text or code, data, heap and stack
        - knowing how memory works can greatly increase the efficiency of a program
            - optimizing performance, debugging, and prevent errors
                - errors like memory leaks and segmentation faults
        - text segment
            - also know as the code segment
            - this is where the executable code of a program lives
                - like a program's functions and instructions (or statements)
            - this segment is usually read-only
                - preventing any accidental modifications during program execution
            - it is typically stores in the lower part of memeory
                - its size depends on the number of instructions and the complexity of the program
        - data segment
            - this is where global and static variables of a program lives
            - variables inside this segment retain their values throughout program execution
            - the data segment is divided into two sections
                - the initialized and uninitialized segments
            - initialized data section
                - this is where the global and static variables live in
                    - only if the variables have been defined with their values
                - example:
                    int global_var = 10;            // global variable

                    int main() {
                        static int static_var = 12; // static variable
                    }
                - note that these variable only live in the initialized section
                    - if they have been assigned values during compilation time
            - uninitialized data section
                - also known as the BSS section
                - this is where global and static variables live in
                    - only if they were not assigned values during compilation time
                - these values get initialized to zero during runtime
                    - until they are assigned values
                - example:
                    int global_var;            // global variable
                                               // uninitialized
                    int main() {
                        static int static_var; // static variable
                                               // uninitialized
                    }
        - heap segment
            - this is where dynamic memory allocation is stored
                - starts at the end of the BSS segment
                - growing towards the higher memory addresses
            - memory in the heap is managed using functions
                - functions like malloc(), calloc(), free(), and realloc()
            - the hap is shared by all shared libraries and dynamucally loaded mdules in a process
            - example:
                #include <stdlib.h>
                int main() {
                    int *p_ptr = malloc(sizeof(int));
                    int* p_temp = realloc(p_ptr, sizeof(int) * 2);
                    p_ptr = p_temp;
                    free(p_ptr);
                }
        - stack segment
            - this is where local variables, function parameters, and return addresses are stored
                - for each function call during a program's execution
            - each function call creates a stack frame in this segment
            - the stack is usually at the higher memory addresses
                - growing in the opposite direction of the heap
            - then the stack and the heap meet, the program's free memory is exhausted
            - example:
                void func() {
                    int local_var = 10;
                }
                int main() {
                    func();
                }
        - sample code:
            #include <stdlib.h>
            int gl0bal_uvar;                // uninitialized global variable
                                            // stored in the bss section
                                                // of the data segment
            int global_ivar = 10            // initialized global variable
                                            // stored in the initialized section 
                                                // of the data segment
            void func() {
                int local_var = 10;         // local variable
                                            // stored at the stack segment
            }

            int main() {
                static int static_uvar;     // uninitialized static variable
                                            // stored in the bss section
                                                // of the data segment
                static int static_ivar = 9; // initialized static variable
                                            // stored in the initilized section
                                                // of the data segment
                int *p_ptr = malloc(4);     // dynamically allocated memory
                                            // stored in the heap segment
            }
    - memory addresses
        - different machines, primarily those with differing architectures, have different memory configurations
            - this is one of the main reasons why some programs work on other machines while being incompatible with others
            - e.g. a C program written in x86_64 won't work on ARM-based systems
        - memory management in C is important for a program's efficiency
            - mainly towards memory usage and performaance
        - when an element in C is created, it gets assigned with a memory address
            - i.e. a location in memory
            - each data type has its own memory size
                - refer to data_types.c for more details
        
        - pointer referencing
            - a reference is a representation to a value's location in memory
            - it is done using the reference & operator
            - syntax:
                &<element>;
            - example:
                &my_num;
            - printing a memory address requires the "%p" format specifier
                - example:
                    // inside main()
                    printf("%p", &my_num);

            - arrays
                - referencing an array will return the memory address of the first element inside that array
                - note that the name of the array is a pointer to the memory address of its first element
                - example:
                    // inside main()
                    int my_array[] = {1, 2, 3, 4, 5}; 

                    printf("%p", my_array);           // 0x7fffa2931470
                    printf("%p", &my_array[0]);       // 0x7fffa2931470

        - pointer dereferencing
            - it retrives the value at a given memory address
            - mainly used to find the value of a reference in memory
            - it is done using the dereference * operator
            - syntax:
                *<memory_address>
            - example:
                *&my_num;

            - pointer variables
                - used to store the pointer to the memory address of a variable
                    - uses a pointer variable
                - uses the dereference * operator
                - syntax:
                    <data_type> *<pointer_name> = &<variable_name>;
                - example:
                    int *p_my_ptr = &my_num;
                - sidenote:
                    - the pointer type must match the data type of the variable being pointed to
                    - it is a convention to add a p_ prefix to pointer variable names
                        - it makes reading code easier
                - double pointers
                    - like normal pointer variable, it is possible to declare a pointer to point at another pointer
                    - uses a double derefence ** operator
                    - syntax:
                        <data_type> **<double_pointer_variable> = &<pointer_variable>
                    - example:
                        int **pp_my_ptr = &p_my_ptr;

                - arrays
                    - references to arrays are able to be dereferenced
                    - it is posible to increment the pointer to an array
                        - similar to incrementing indexes
                        - uses the ++, --, -= or += operators
                    - example:
                        char my_char[] = {'i', 'd', 'k', 'm', 'a', 'n', '\0'};
                        char *p_my_char = my_char;

                        printf("%c", my_char[0]);                              // 'i'
                        printf("%c", *ptr_my_char);                            // 'i'

                        p_my_char++;                                           // 'd'
                    - sidenote:
                        - unlike normal negative indexing, when a pointer goes to a negative pointer value
                            - i.e. goes out of bounds from the array, it yields garbage characters

        - pointer referencing and dereferencing
            - both concepts are commonly used together in programs
            - example:
                int my_num[] = {1, 2, 3, 4, 5};
                my_num;                         // 0x7ffd962cf200
                &my_num[0]                      // 0x7ffd962cf200
                *my_num                         // 1
                *(my_num + 1)                   // 2

                int my_numbers[3] = {10, 20, 30};
                int *p_ptr = my_numbers; // my_numbers[0]
                printf("%d\n", *p_ptr);  // 10
                p_ptr++;                 // move to my_numbers[1]
                printf("%d\n", *p_ptr);  // 20
                p_ptr--;                 // back to my_numbers[0]
                printf("%d\n", *p_ptr);  // 10
                p_ptr += 2;              // jump to my_numbers[2]
                printf("%d\n", *p_ptr);  // 30
            - opearator usage
                - referencing only 
                    - only returns the memory address of an element
                    - example:
                        &my_var;
                - dereferencing only
                    - when not in pointer variable declarations
                        - it retrives the value of a given memory address
                        - example:
                            *p_ptr;
                    - when used in pointer variables
                        - it stores the reference of a memory address
                        - example:
                            int *p_ptr = &my_var;
                - paired together
                    - paring both a reference and a dereference on a single variable cancels the effects out
                    - example:
                        *&my_var; // does nothing

        - function pointers
            - similar to normal pointers but for functions
            - stores the memory address of the function
                - it is possible to call the function using a pointer variable
            - similar to arrays, function names store the memory address of the function
            - syntax:
                <return_type> (*<pointer_name>)(<parameters>) = <function_name>;
                // or
                <return_type> (*<pointer_name>)(<parameters>) = &<function_name>;
            - example:
                void (*idkman)() = lumbago;
                // or
                void (*idkman)() = &lumbago;
            - function example:
                void say_yes() {
                    printf("no");
                }

                // inside a function
                void (*maybe)() = say_yes;
                maybe();                   // "no"

            - why function pointers?
                - unlike normal functions, function pointers are called using pointers
                - function pointers enable dynamic programming
                    - unlike normal functions that is already predetermined before the function starts
                - it is used for more complex and reusable programming
                    - as opposed to normal functions being used in simple programming

            - functions as arguments
                - using the same concepts as function pointers
                    - it is possible to use functions as arguments for other funtions
                - syntax:
                    <return_type> <function_name>( <return_type> (*<pointer_name>)(<parameters>)) {
                        <statements>
                    }
                - example:
                    void call_func(void (*p_func)()) {
                            p_func();                         // calls the function called by the argument
                        }
                    void idkman() { printf("idkman"); } // example function to be called
                    int main() {
                        call_func(idkman);                    // calls the pointer function, using the example function as the argument
                        return 0;
                    }
            - arrays consisting of functions
                - functions are able to be part of arrays using function pointers
                - example:
                    void add(int a, int b) { printf("Result: %d\n", a + b); }
                        void subtract(int a, int b) { printf("Result: %d\n", a - b); }
                        void multiply(int a, int b) { printf("Result: %d\n", a * b); }

                    int main() {
                        int choice, x = 10, y = 5;

                        void (*p_operations[3])(int, int) = { add, subtract, multiply }; // generates a pointer array

                        printf("x = %d, y = %d\n\n", x, y);
                        printf("Choose an operation:\n");
                        printf("0: Add\n1: Subtract\n2: Multiply\n");
                        scanf("%d", &choice);                                           // asks the user choice which becomes the index

                        if (choice >= 0 && choice < 3) {
                            p_operations[choice](x, y);                                 // calls the respective function access in the array
                        } else {
                            printf("Invalid choice!\n");
                        }

                        return 0;
                    }

        - structure pointers
            - pointers are used in structure variables to access and modify values directly in memory
            - instaed of the dot . operator, the arrow -> operator is used instead
            - example:
                struct my_struct_t {
                    int my_num;
                };

                int main() {
                    struct my_struct_t lumbago = { 10 };
                    struct my_struct_t *p_idkman = &lumbago;

                    printf("%d\n", p_idkman -> my_num);
                    // the same as
                    printf("%d\n", (*p_idkman).my_num);
                }

            - structures are able to be argumnets for functions
                - example:
                    struct lumbago {
                        char my_string[12];
                    };

                    void print_stuff(struct lumbago *p_maybe) {
                        printf("%s\n", p_maybe -> my_string);
                    }

                    int main() {
                        struct lumbago idkman;
                        strcpy(idkman.my_string, "hello world");

                        print_stuff(&idkman);

                        return 0;
                    }

    - memory allocation
        - there are two types of memory allocation in C
            - static memory
                - memory that is allocated during compilation time
                    - i.e. before the program starts
                - example:
                    char my_string[100]; // memory gets allocated for my_string during compilation
                - either inefficient or insufficient depending on the situation
                    - inefficient if memory is wasted, when underutilizing allocated memory
                    - insufficient if memory allocated is not enough to hold data
            - dynamic memory
                - memory that is allocated during runtime
                    - i.e. during the program runtime
                - more efficient than static memory due to better control of memory usage
                    - though it is more complicated to maintain
                - dynamic memory is not a variable nor does it belong to any
                    - it is only accessible through pointer variables pointing to memory addresses
                
        - dynamic memory management
            - achievable through the <stdlib.h> header library
                - containing functions to deal with memory management
                - like allocating, deallocating, reallocating, etc.
            - improper handling of dynamic memory can lead to memory leaks or unintended behavior
            - memory leaks
                - dynamic memory that is allocated but never freed after used
                - occurs when the programmer forgets to free up memory
                    - like when the program is in a loop but never frees up memory allocation
                - example:
                    int lumbago = 10;
                    int *p_yes;
                    inr p_yes = (int *) malloc(sizeof(*p_yes));
                    int p_yes = &lumbago ;                      // the malloc() call gets disregarded
                                                                // data within it gets lost
            - functions
                - malloc()
                    - syntax:
                        malloc(<size>):
                    - <size> refers to the amount of memory to be allocated
                        - must be declared in bytes, must also be an integer
                        - refer to "data_types.c" for type sizes
                    - example:
                        malloc(8); // allocated 8 bytes of memory
                    - sample code:
                        char *p_ptr;                               // initializes a pointer variable
                        p_ptr = (char *) malloc(8 * sizeof(char)); // allocates dynamic memory
                                                                       // size of 8 char bytes
                                                                       // note that char has a size of 1 byte
                        strcpy(p_ptr, "lumbago");                  // assignes a value to the memory address help by p_ptr
                        p_ptr[7] = '\0';                           // adds a null terminator to the end of the string
                                                                       // required since without it, the string doesn't teminate
                                                                       // reading garbage values until a '\0' is reached
                - calloc()
                    - syntax:
                        calloc(<amount>, <size>);
                    - <amount> signifies the amount of items to be allocated in memory
                        - must be an integer
                    - <size> refers to the amount of memory to be allocated
                        - must be declared in bytes, must also be an integer
                        - refer to "data_types.c" for type sizes
                    - example:
                        calloc(1, 4); // allocates 4 bytes of memory for 1 item
                    - sample code:
                        char *p_ptr;                              // initializes a pointer variable
                        p_ptr = (char *) calloc(7, sizeof(char)); // allocates dynamic memory
                                                                    // size of 7 char bytes
                                                                    // note that char has a size of 1 byte
                        strcpy(p_ptr, "idkman");                  // assignes a value to the memory address help by p_ptr
                        p_ptr[6] = '\0';                          // adds a null terminator to the end of the string
                                                                    // required since without it, the string doesn't teminate
                                                                    // reading garbage values until a '\0' is reached
                - realloc()
                    - syntax:
                        realloc(<old_pointer>, <new_size>);
                    - <old_pointer> refers to the name of the pointer to be resized
                    - <new_size> refers to the new size of memory to be allocated
                        - must be declared in bytes, must also be an integer
                        - refer to "data_types.c" for type sizes
                    - note that it a new variable must be present to hold the new address
                        - it is generally unadvised to use the same pointer that is being reallocated
                    - example:
                        int *p_temp = realloc(p_ptr, 12); // reallocates 12 bytes of memory
                    - sample code:
                        char *p_text;                                              // initializes a pointer variable
                        p_temp = (char *) calloc(strlen("lumbago"), sizeof(char)); // allocates dynamic memory
                                                                                       // size of the length of "lumbago"
                        strcpy(p_text, "lumbago");                                 // assigns the "lumbago" to the memory address
                                                                                       // held by p_text
                        char *p_temp;                                              // initializes a temporary pointer variable
                        p_temp = (char *) realloc(p_text), strlen(" idkman"));     // reallocates dynamic memory
                                                                                       // size of the length of "idkman"
                                                                                       // note that char has a size of 1 byte
                        if (p_temp == NULL) {                                      // checks if reallocation wa successful
                            exit(1);                                               // runs a code block if reallocation failed
                        }
                        p_text = p_temp;                                           // moves the memory address from p_temp to p_text
                                                                                   // note that when reallocation is successful
                                                                                       // the original pointer is freed automatically
                                                                                       // i.e. freed using free()
                        strcat(p_text, " idkman");                                 // concatenates text to the end of the original text
                                                                                       // becoming "lumbago idkman"

                - free()
                    - syntax:
                        free(<name>)
                    - <name> refers to the name of the pointer to be deallocated
                    - it is good practice to point the released pointer variable to NULL
                        - to mitigate any unexpected behaviors like use-after-free errors
                    - example:
                        free(p_ptr); // releases the memory at pointer p_ptr
                    - sample code:
                        char *p_ptr;                              // initializes a pointer variable
                        p_ptr = (char *) malloc(7, sizeof(char)); // allocate dynamic memory
                                                                    // size of 7 bytes
                                                                    // note that char has a size of 1 byte
                        strncpy(p_ptr, "idkman", 6);              // assigns a value to the memory address
                                                                    // help by p_ptr
                                                                    // note that this is using strncpy() not strcpy()
                        p_ptr[6] = '\0';                          // adds a null terminator to the end of the string
                                                                    // required since without it, the string doesn't teminate
                                                                    // reading garbage values until a '\0' is reached
                        free(p_ptr);                              // releases the memory address at p_ptr
                        p_ptr = NULL;                             // points the variable to NULL
                                                                    // prevents use-after-free errors
            - sidenote:
                - using the malloc() function to allocate memory is unpredictable and unreliable
                    - this is due to it not initializing the values at that memory address
                        - meaning it keeps the garbage values at that memory addresss
                    - using the pointer's variable may yield unexpected values
                        - assigning a value to the pointer fixes this issue
                - using the calloc() function does not have the same problem as malloc()
                    - it initializes the values at that memory address to zeroes
                    - though, it comes at a performance penalty

    - memory access
        - pointer variables with dynamic memory behaves similarly to an array
            - meaning, it is possible to access its contents using an zero-indexed access
                - example:
                    p_ptr[0];
            - or increment or decerement the current index using their respective operators
                - example:
                    p_ptr++;
                    // or
                    p_ptr--;
        - note that dynamic memory is not a data type
            - it is a continuous sequence of bytes in memory
                - depending if memory is fragmented
            - it is possible to read dynamic memory
                - can be as an char, int, float, etc.
                - using type casting
                - example:
                    (char *) p_ptr;    // reads the memory address as char
                                           // meaning, one byte at a time
                    (int *) p_ptr;     // reads the memory address as int
                                           // meaning, four bytes at a time
                    (double) *) p_ptr; // reads the memory address as float
                                           // meaning, four bytes at a time

            
        - memory reallocation
            - resizes currently allocated memory
                - through the use of the realloc() function
            - syntax:
                <new_pointer> = realloc(<old_pointer>, <new_size>);
            - <old_pointer> refers to the pointer to the memory to be resized
            - <new_size> refers to the new size of memory to be allocated
                - must be declared in bytes, must also be an integer
                - refer to "data_types.c" for type sizes
            - example:
                int *p_temp = (int *) realloc(p_ptr, sizeof(int) * 2); 
            - sidenote:
                - if the current memory space is large enough
                    - it will enlarge the current memory space instead of reallocating elsewhere
                - if the current memory space is not sufficient
                    - it will reallocate memory elsewhere in the heap space
            - note that it a new variable must be present to hold the new address
                - it is generally unadvised to use the same pointer that is being reallocated
            - sample code:
                int size = 5, count = 0;
                int *p_num = (int *) calloc(size, sizeof(int));
                for(int i = 1; i <= size; i++, count++) { 
                    p_num[i - 1] = i; 
                } 
                
                for(int i = 0; i < count; i++) { 
                    printf("%d", p_num[i]); 
                }

                size *= 2;
                int *p_temp = (int *) realloc(p_num, size);
                if(p_temp == NULL) {
                    printf("failed to reallocate");
                    exit(1);
                }
                p_num = p_temp;

        - memory deallocation
            - frees up currently allocated memory
                - deallocating through the use of the free() function
            - memory that is allocated dynamically must be freed up
                - dynamic memory stays reserved, requiring to be freed to prevent memory hogging
            - it is recommended to deallocate memory to prevent memory leaks or errors
                - it is also recommended to point the deallocated pointer to NULL to avoid unknown side effects
            - syntax:
                free(<pointer>);
            - <pointer> refers to the pointer variable pointing to the memory address to be freed
            - example:
                free(p_ptr);
            - sample:
                int *p_num = malloc(sizeof(int));
                free(p_num);
                p_num = NULL;
*/

#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p_num = malloc(sizeof(int));

    printf("Before modification: %i\n", *p_num);

    *p_num = 10;

    printf("After modification: %i\n", *p_num);

    free(p_num);

    printf("Before ptr to NULL: %i\n", *p_num);

    p_num = NULL;

    printf("After ptr to NULL: %i", p_num);
}