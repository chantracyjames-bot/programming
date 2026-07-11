/* functions
    - main()
        - is the "entry point" of the program
        - it is where the code execution starts

    - I/O functions
        - requres the stdio.h header library
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
        - fgets()
            - acts the same way as the scanf() function but is able to retrieve multiple lines of string
                - i.e. able to retrieve whitespaces that would otherwise terminate scanf()
            - syntax:
                fgets(<variable>, sizeof(<variable>), stdin);
            - the sizeof() and stdin arguments are required

    - string functions
        - requires the <string.h> header library
        - strlen()
            - returns the length of a string
            - syntax:
                strlen(<string>);
            - sidenote
                - strlen and sizeof acts differently
                    - sizeof includes the '\0' at the end of a string
                    - strlen does not
        - strcat()
            - concatenates (or add) two string values
                - the result is returned to the first value
            - syntax:
                strcat(<string1>, <string2>);
            - sidenote:
                - the first string value must be large enough to store the new value
        - strcpy()
            - copies the first value into the second
            - syntax:
                strcpy(<string1>, <string2>);
            - sidenote:
                - before copying string, the second string variable must be declared
                - the second string must also be large enough to store the new value
        - strcmp()
            - compares two string values
            - if the string values are equal, returns a 0
                - any other number means inequality
            - syntax:
                strcmp(<string1>, <string2>);

    - math functions
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
    
    - file functions
        - fopen()
            - opens a file using three modes
                - w, a, r
            - syntax:
                fopen(<file_name>, <file_mode>);
        - fclose()
            - closes the file after usage
            - typically used after fopen()
            - syntax:
                fclose(<variable>);
        - fprintf()
            - used when using the write or append modes in file access
                - refer to file manipulation for differences when using write or append
            - syntax:
                fprintf(<variable>, <string>);
        - fgets()
            - used to read and store the content of files
                - requires read mode 
            - syntax:
                fgets(<variable_to_store>, <size_of_variable>, <variable_name_of_name>);

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