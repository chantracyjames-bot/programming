/* memory management
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
        - there are two types of memory allocation
            - static memory
                - memory that is allocated during compilation time
                    - i.e. before the program starts
                - example:
                    char my_string[100]; // memory gets allocated for my_string during compilation
                - either inefficient or insufficient depending on the situation
                    - inefficient if memory is wasted, or not being utilized properly
                    - insufficient if memory allocated is not enough to hold data
            - dynamic memory
                - memory that is allocated during runtime
                    - i.e. during the program runtime
                - more effiecient than static memory due to better control of memory usage
                - dynamic memory does not belong to any variable
                    - it is only accessible through pointer variables
                - to perform dynamic memory managament, the <stdlib.h> header is required
                
        - dynamic memory management
            - contains functions to deal with memory management
                - like allocation, deallocation, reallocation, etc.
            - improper handling of dynamix memory leads to memory leaks
            - memory leaks
                - dynamic memory that is allocated but never freed
                - happens when the program is in a loop but never frees up memory allocation
                - example:
                    - int lumbago = 10;
                    int *p_yes;
                    inr p_yes = malloc(sizeof(*p_yes));
                    int p_yes = &lumbago;              // the malloc() call gets disregarded
                                                        // data within it gets lost
            - functions
                - malloc()
                    - syntax:
                        malloc(<size>):
                    - <size> refers to the amount of memory to be allocated
                        - declared in bytes
                    - example:
                        malloc(8); // allocated 8 bytes of memory
                    - sample:
                        // inside main()
                        int *p_yes = malloc(4);
                        *p_yes = 10;

                        printf("%d", *p_yes);   // 10
                - calloc()
                    - syntax:
                        calloc(<amount>, <size>);
                    - <amount> signifies the amount of items to be allocated in memory
                        - declared as int
                    - <size> refers to the amount of memory to be allocated
                        - declared as bytes
                    - example:
                        calloc(1, 4); // allocates 4 bytes of memory for 1 item
                    - sample:
                        // inside main()
                        int *p_yes = calloc(1, 4);
                        *p_yes = 10;

                        printf("%d\n", *p_yes);    // 10
                - realloc()
                    - syntax:
                        realloc(<name>, <new_size>);
                    - <name> refers to the name of the pointer to be resized
                    - <new_size> refers to the new size of memory to be allocated
                    - example:
                        realloc(p_ptr, 12); // reallocates 12 bytes of memory for p_ptr
                    - sample:
                        // inside main()
                        char *p_my_string = NULL;
                        p_my_string = malloc(5 * sizeof(char));
                        strncpy(p_my_string, "hell", 4);
                        p_my_string[5] = '\0';
                        printf(p_my_string);
                        char *p_new_string = realloc(p_my_string, 10 * sizeof(char));
                        strncpy(p_new_string, "lumbago", 9);
                        p_new_string[9] = '\0';
                        printf(p_new_string);
                - free()
                    - syntax:
                        free(<name>)
                    - <name> refers to the name of the pointer to be deallocated
                    - example:
                        free(p_ptr);
                    - sample:
                        char *p_yes = malloc(7 * sizeof(char));
                        strncpy(p_yes, "idkman", 6);
                        p_yes[6] = '\0';
                        printf(p_yes);
                        free(p_yes);
                        p_yes = NULL;
            - sidenote:
                - using malloc() to allocate memory is unpredictable and unreliable
                    - it does not clear out the memory space that it is reserving
                - as opposed to calloc() filling the allocated memory with zeroes
                    - but it sacrifices effieciency
                - it is recommended to write something in memory before reading it

    - memory access
        - dynamic memory behaves similarly to an array
            - it is possible to increment or decrement its constnets using an index
            - example:
                *p_ptr;
                // or
                p_ptr[0];
        - dynamic memory is not a data type
            - it is a sequence of bytes in memory
            - it is possible to read dynamic memory as an int, char, float, etc.
            - example:
                int *p_int = NULL;
                p_int = malloc(sizeof(int));
                *p_int = 65;
                char *p_char = (char*) p_int;
                printf("%c", *p_char);        // 'A'
                printf("\n%c", p_char[0]);    // 'A'
            
        - memory reallocation
            - used to resize allocated memory
            - uses the realloc() function to reallocate memory
            - syntax:
                realloc(<old_pointer>, <new_size>);
            - <old_pointer> refers to the pointer to the memory to be resized
            - <new_size> refers to the new size of memory to be allocated
            - example:
                realloc(p_ptr, 10); 
            - note that if the current memory space that the currently allocated memory is not sufficient enough to resize
                - it will reallocate memory somewhere else in the heap space
                - allocating to another memory address with the new size
            - it is recommended to initialize a new pointer to store the new memory address as opposed to using the old pointer
                - using the old pointer may yield invalid data since it is part of the new pointer
            - sample:
                int num = 5;
                int count = 0;
                int *p_int_array = calloc(num, sizeof(int));
                for(int i = 1; i <= num; i++, count++) { p_int_array[i - 1] = i; } 
                
                for(int i = 0; i < count; i++) { printf("%d", p_int_array[i]); }

                num *= 2;
                int *p_temp = realloc(p_int_array, num);
                if(p_temp == NULL) {
                    printf("Failed to reallocated!");
                    free(p_temp);
                    return 1;
                }
                p_int_array = p_temp;

        - memory deallocation
            - deallocates or frees up allocated memory
            - dynamic memory stays reserved (or in use) until it is manually deallocated or automatically freed after the program ends
            - it is recommended to deallocate memory to prevent memory leaks
                - it is also recommended to point the deallocated pointer to NULL to avoid unknown side effects
            - uses the free() function
            - syntax:
                free(<pointer>);
            - <pointer> refers to the pointer to the memory address to be freed
            - example:
                free(p_ptr);
            - sample:
                int *p_num = malloc(sizeof(int));
                free(p_num);
                p_num = NULL;
*/