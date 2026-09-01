/* functions
    - main()
        - is the "entry point" of the program
        - it is where the code execution starts

    - I/O functions <stdio.h>
        - terminal IO
            - fgets()
                - acts the same way as the scanf() function but is able to retrieve multiple lines of string
                    - i.e. able to retrieve whitespaces that would otherwise terminate scanf()
                - syntax:
                    fgets(<variable>, sizeof(<variable>), stdin);
                - the sizeof() and stdin arguments are required
            - printf()
                - standard way of printing text
                - syntax:
                    - printf(<value>);
                - printing variables other than string require format specifiers
                    - syntax:
                        printf("<format_identifier>", <variable>)
                    - format identifiers and text can be used together
                        - example: 
                            printf("My number is: %d", my_num);
                    - the variables must come in order with respect to the format identifiers used
                        - example: 
                            - printf("%d %s", my_num, my_string);
                    - it is porssible to print with format identifiers without assigning values to variables
                        - example: 
                            - printf("%d %s", 15, "Hello World");
            - scanf()
                - standard way of retrieving user input
                - syntax:
                    - scanf(<format_identifier>, &<variable>);
                - the function uses the reference operator "&" to assign values to the variables declared inside the function
                - the function also allows multiple inputs
                    - syntax:
                        scanf(<format_identifier>, &<variable1>, &<variable2>, etc.); // does two instances of scanning
                    - the format identifiers are separater using spaces
                        - example:
                            scanf("%d %c", my_num, my_char);
                - using scanf() to retrieve strings, a few things are considered
                    - the size of the variable (or array)
                        - the program will throw an error if the string retrieved is larger than the size of the string variable
                        - the use of reference operator is not needed when retrieving strings
                        - whitespaces (space, tabs, etc.) are considered as terminating characters
                            - values after whitespaces are disregarded
                            - the fgets() function bypasses this restriction
        - file IO
            - fclose()
                - used to close any files opened during program execution
                - it is generally recommended to close files after use
                    - used to prevent any memory leaks or resource hog
                - syntax:
                    fclose(<file_variable>);
                - example:
                    fclose(p_file);
            - fopen()
                - standard way of opening files in C
                - syntax:
                    fopen(<file_name>, <file_mode>)
                - <file_name>
                    - the file name is the name of the file or it's location in a filesystem
                    - the location of a file can either be a relative path or an absolute one
                - <file_mode>
                    - C has three types of access modes, w (write), a (append), or r (read)
                    - plus more advanced file access modes like r+, w+, or a+
                - example:
                    fopen("my_file", "r"); // opens the file in read mode
            - fprintf()
                - similar to printf
                    - takes in format arguments to print output to files
                    - but used for writing data into files
                        - requires any of the write or append modes
                - syntax:
                    fprintf(<file_variable>, <string>);
                - example:
                    fprintf(file_write, "yes"); // writes "yes" to the file
            - fputc()
                - prints a single characted into the file
                - syntax:
                    fputc(<char>, <file_variable>);
                - example:
                    fputc('Y', p_file);
            - fputs()
                - prints a whole line in the file
                    - also adds a newline '\n' at the end of said line
                - syntax:
                    fputs(<string>, <file_variable>);
                - example:
                    fputs(my_text, p_file);
            - fgets()
                - used to read whole lines from a file
                    - requires a variable to store said lines
                - sidenote:
                    - fgets() reads data from a line until a newline '\n' is reached
                    - it is commonly used with a loop, to read the entire file
                        - until it reaches EOF, End Of File
                - syntax:
                    fgets(<variable>, <size>, <file_variable>);
                - exampe:
                    fgets(text, 100, p_file); // reads 100 characters and places it in the variable text
            - fgetc()
                - used to read a character from a fle
                - syntax:
                    fgetc(<file_variable>);
                - example:
                    fgetc(p_file); // grabs a character from the file
            - fscanf()
                - simiar to scanf
                    - takes in format arguments to scan input from files
                    - but used for reading input from files
                        - requires any of the read files
                - syntax:
                    fscanf(<file_variable>, <format>);
                - example:
                    fscanf(p_file, "%10s");            // scans for 10 characters
            - fseek()
                - used to navigate through files
                - note that the file pointer points to the position according to the mode
                    - or the last read or write operation
                - it is possible to manually move the pointer to any position
                    - the offset position can be positive (advance) or negative (retract)
                - syntax:
                    fseek(<file_variable>, <offset_position>, <position>);
                - example:
                    fseek(p_file, 100, 0); // moves the pointer from 0, with a offset of positive 100
            - getw()
                - used to read a number from a fle
                - syntax:
                    getw(<file_variable>);
                - example:
                    getw(p_file); // grabs a character from the file
            - putw()
                - prints a number to the file
                - syntax:
                    putw(<int>, <file_variable>);
                - example:
                    putw(23, p_file);

    - math functions <math.h>
        - requires the <math.h> header library
        - sqrt()
            - returns the square root of a value
            - syntax:
                sqrt(<value>);
        - pow()
            - raises the first value to the power of the second value
            - returns the result
            - syntax:
                pow(<value1>, <value2>);

    - string functions <stdio.h>
        - strcat()
            - adds the second string to the end of the first string
            - syntax:
                strcat(<string1>, <string2>);
            - sidenote:
                - the first string value must be large enough to store the new value
        - strchr()
            - returns a char type pointer to the first occurence of a character in a string
                - and the rest of the string until the null terminator '\0'
                - returns NULL if no character was no found
            - syntax:
                strchr(<string>, <char>);
            - example:
                strchr("idkman", 'm'); // "man"
        - strcmp()
            - compares two strings through their ASCII values
            - returns an integer indicating the result
                - if the function returns zero
                    - there are no difference between the two strings
                - if the function returns a positve number
                    - the first string is greater than the second string
                - if the function returns a negative number
                    - the second string is greater than the first string
            - syntax:
                strcmp(<string1>, <string2>);  
            - example:
                strcmp("idkman", "lumbago"); // 3
        - strcspn
            - returns the position of the first occurence of a specified sequence of characters
                - returns the first position or the length of the string up to that point
                - note that the string provided is treated as individual characters
            - syntax:
                strcspn(<string>, <pattern>);
            - example:
                strcspn("lumbago", "uao"); // 1
        - strcpy()
            - copies the first string into the memory of another string
            - syntax:
                strcpy(<string1>, <string2>);
            - example:
                strcpy("yes", "no"); // "no"
            - sidenote:
                - before copying string, the second string variable must be declared
                - the second string must also be large enough to store the new value
        - strlen()
            - returns the length of a string
            - syntax:
                strlen(<string>);
            - sidenote
                - strlen and sizeof acts differently
                    - sizeof includes the '\0' at the end of a string
                    - strlen does not
        - strncmp()
            - compares two string up to a specified index of both strings
                - via their ASCII values
            - returns an integer indicating the result
                - if the function returns zero
                    - there are no difference between the two strings
                - if the function returns a positve number
                    - the first string is greater than the second string
                - if the function returns a negative number
                    - the second string is greater than the first string
            - syntax:
                strncmp(<string1>, <string2>, <index>);
            - example:
                strncmp("Hello", "Hellu", 4); // 6
        - strncpy()
            - copies a number of characters from one string into the memory of another string
            - syntax:
                strncpy(<string1>, <string2>, <number>);
            - example:
                strncpy("yes", "no", 2); // "nos"
        - strpbrk()
            - similar to the strcspn() or the strchr() functions, the only difference is that
                - this function returns a string from the first occurence of the specified pattern
                - until the end of the string
            - returns a string if the pattern is found inside the string
                - returns NULL if not
            - syntax:
                strpbrk(<string>, <pattern>);
            - example:
                strpbrk("idkman", "aeo"); // "an"
        - strrchr()
            - returns the position of the last occurence of a specified sequence of characters
                - returns the last position or the length of the string up to that point
                - note that the string provided is treated as individual characters
            - syntax:
                strrchr(<string>, <char>);
            - example:
                strrchr("Hello World", "o"); // orld
        - strspn()
            - returns the position of the first character in a string which does not match the specified pattern
            - syntax:
                strspn(<string>, <pattern>);
            - example:
                strspn("lumbago", "abcd"); // 5
        - strstr()
            - returns a substring of a string starting from the start of the first occuerence of a specified pattern
                - similar to the strpbrk() but instead of taking the string pattern as individual characters
                - this function takes the string pattern as a whole string
            - syntax:
                strstr(<string>, <pattern>);
            - example:
                strstr("idkman", "idk"); // idkman
        - strtok()
            - splits a string into multiple pieces
                - also known as tokens
                - through the use of delimiters
            - the first argument must become NULL to retrive more of the string
            - syntax:
                strtok(<string>, <pattern>);
            - example:
                strtok("lumbago", "b"); // "lum", "ago"
            - sample code:
                char my_str[] = "lumbago";
                char *p_ptr = strtok(my_str, "b");
                while(p_ptr != NULL) {
                    p_ptr = strtok(NULL, "b");
                }

    - standard library functions <stdlib.h>
        - atof()
            - returns a double value from a string representation of a number
                - i.e. returns the first occuerence of numbers from a string
                - discarding anything that is not a number
            - syntax:
                atof(<string>);
            - example:
                atof("1.00p2p3"); // 1.000000
        - atoi()
            - returns a int value from a string representation of a number
                - i.e. returns the first occuerence of numbers from a string
                - discarding anything that is not a number
            - syntax:
                atoi(<string>);
            - example:
                atoi("1.00p2p3"); // 1
        - atoil()
            - returns a long value from a string representation of a number
                - i.e. returns the first occuerence of numbers from a string
                - discarding anything that is not a number
            - syntax:
                atol(<string>);
            - example:
                atol("1.00p2p3"); // 1L
        - atoill()
            - returns a long long value from a string representation of a number
                - i.e. returns the first occuerence of numbers from a string
                - discarding anything that is not a number
            - syntax:
                atoll(<string>);
            - example:
                atoll("1.00p2p3"); // 1LL
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
        - div()
            - performs an integer division
            - returns a div_t structure with the quotient and remainder
                - .quot for the qoutient
                - .rem for the remainder
            - syntax:
                div(<int1>, <int2>);
            - example:
                div_t result = div(31, 20);
                result.quot;                // 1
                result.rem;                 // 11
        - exit()
            - exits the program with a return code
                - zero indicates EXIT_SUCCESS
                - any numbers indicate EXIT_FAILURE
        - free()
            - syntax:
                free(<name>)
            - <name> refers to the name of the pointer to be deallocated
            - it is good practice to point the released pointer variable to NULL
                - to mitigate any unexpected behaviors like use-after-free errors
            - example:
                free(p_ptr); // releases the memory at pointer p_ptr
        - malloc()
            - syntax:
                malloc(<size>):
            - <size> refers to the amount of memory to be allocated
                - must be declared in bytes, must also be an integer
                - refer to "data_types.c" for type sizes
            - example:
                malloc(8); // allocated 8 bytes of memory
        - rand()
            - generates a random integer
            - by default, this function returns the same number each time the program is executed
                - to prevent this, the srand() function is used
                - wherein it sets a starting point or seed
                    - the current time is typically used as a seed
            - syntax:
                rand()
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
        - srand()
            - initializes the rand() function
                - generating a unique seed depending on the input
            - typically used with the current time for true randomness
            - syntax:
                srand(<u_int>);
            - example:
                srand(time(NULL));
            - sample code:
                srand(time(NULL));
                rand();            // true randomness
                rand() % 10;       // random number ranging from 0 to 9

    - user-defined functions
        - paves the way for the creation of custom functions
            - mainly for reusing code instead of redeclaring it
        - user-defined functions are designed by the programmer
        - declared outside of the main() function

        - declaration and definition
            - in C, there are two parts of a function
                - declaration
                    - it is where function is declared but not defined
                    - example:
                        void print_num(int num);
                - definition
                    - it is where the function is defined
                    - example:
                        void print_num(int num) {
                            printf("%d", num);
                        }
                - functions are often declared before the main() function and defined after it
                    - example:
                        - void function_stuff();
                        int main() {...}
                        void function_stuff() {
                            idk = "man";
                        }
            - functions are made to either have a return type or not
            - no return type:
                - syntax:
                    void <function_name>() {
                        <statements>
                    }
                - example:
                    void my_function() {
                        printf("idkman");
                    }
            - with return type:
                - syntax:
                    <data_type> <function_name>() {
                        <statements>
                        return <expression>
                    }
                - example:
                    int my_function() {
                        return 1;
                    }
                - sidenote:
                    - when a return types is declared, the function must return a value
                        - a compilation error occurs when there is no return value
                        - the return value must be the same type as the return type declared
                    - the return type can be any of the primitive data types
                    - any code that is declared after the return value won't be run
                        - once the program reaches a return value, it will jump back to the main program
                            - ignoring any code after it
            
        - functions with parameters
            - functions that requires an input of data
            - syntax:
                <return_type> <method_name>(<parameters>) {
                    <statements>
                    <return_statement_if_any>
                }
            - example:
                void my_function(int num) {
                    printf("%d", num);
                }
            - the variable that is declared in the parameter is a temporary variable
                - it disappears after the function is finished
            - it is possible to declare multiple parameters
                - example:
                    double sum_of_number(double x, double y) {
                        return x + y;
                    }

        - access and function calls
            - methods are accessed using the function name followed by parentheses ()
            - syntax:
                <method_name>();
            - example:
                my_method();

        - function calls with arguments
            - if a function needs certain parameters, that is called "argument"
            - calling methods with parameters requires the corresponding arguments
            - syntax:
                <method_name>(<arguments>);
            - example:
                my_method(19);
            - variables and values are able to be passed as arguments
            - when there are multiple arguments needed
                - the order of parameters matter
                    - if the order of arguments doesn't match the order of parameters, an error occues
                    - example:
                        // assuming my_method(int x, float y)
                        int a = 10;
                        float b = .13;
                        my_method(a, b);
                        my_method(b, a); -> Error

        - inline functions
            - an function declared with the inline keyword makes frequently called functions faster
            - asks the compiler to inserts its code directly where it is called
                - instead of jumping to it
            - syntax:
                - inline <return_type> <function_name>(<parameters>) {
                    <statments>
                  }
            - example
                - inline int add_stuff(int x, int y) {
                    return x + y;
                  } // declaration and definition
                  int main() {
                    result = add_stuff(9, 10); // 21
                                               // result = 9 + 10;
                  }
            - usecase:
                - inline functions are recommended when the function is small
                 - larger functions add more complexity and is not advised to use the inline keyword with it
                - recursive and rarely called functions are also not advised to use inline functions

        - recursive functions
            - it is the act of a function calling upon itself
            - its generally recommended to add a halting condition
                - otherwise, it will go into an infinite loop
            - example:
                int factorial(int num) {
                    if(num > 0) {
                        return num * factorial(num - 1);
                    }
                    else {
                        return num;
                    }
                }
*/

#include <stdio.h>

int return_num() {
    return 0;
}

char return_char() {
    return 'Y';
}

void print_stuff() {
    printf("%i%c", return_num(), return_char());
}

int main() {
    print_stuff();
}