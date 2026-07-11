/* data types
    - Primitive Data types
        - int
            - whole numbers, contains no decimals
            - size of 2 or 4 bytes
            - example:
                int x = 1000;
        - float
            - decimal numbers, can store up to 6-7 decimal places
            - requires the f or F suffix to declare a value as float
            - size of 4 bytes
            - example:
                int y = 3.141592f;
        - double
            - decimal numbers, can store up to 15 decimal places
            - can be declared with the d or D suffix, commonly when casting
                - decimals numbers default to being doubles
            - size of 8 bytes
            - example:
                int y = 23456789101112;
        - char
            - stores a single character or a Unicode escape sequence
                - refer to general.c for escape code sequences and ASCII characters
                - ASCII characters are not required to be enclosed
            - requres to be encased in single quotes ' '
            - example:
                char z = 'Y';
                char ASCII = 66; // B
            - note that storing multiple characters only stores the last letter
                - example:
                    char my_char = 'hello'; // 'o'
                                            // other preceeding characters gets discarded

    - Extended Data Types
        - short int
            - whole numbers
            - ranges from -32,768 to 32,767
            - size of 2 bytes
            - example:
                short x = 32767;
        - unsigned int
            - positive whole numbers
            - stores up to 65,535 or 4,294,967,295
            - size of 2 or 4 bytes
            - example:
                unsigned int x = 4294967295;
        - long 
            - whole numbers
            - ranges from -2,147,483,648 to 2,147,483,647 (Windows)
            - or -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (Unix-like)
            - size of 4 or 8 bytes, Windows or Unix-like respectively
            - requires the l or L suffix to declare the value as a long
            - example:
                long x = 9223372036854775807L;
        - long long
            - whole numbers
            - ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            - size of 8 bytes
            - requires the ll or LL suffix to declare the value as a long long
            - example:
                long long x = 9223372036854775807LL;
        - unsigned long
            - positive whole numbers
            - stores up to 4,294,967,295 (Windows)
            - or 18,446,744,073,709,551,615 (Unix-like)
            - size of 4 or 8 bytes, Windows or Unix-like, respectively
            - requires the ul or UL suffix to declare the value as unsigned long
            - example:
                unsigned long x = 18446744073709551615UL;
        - unsigned long long
            - positive whole numbers
            - stores up to 18,446,744,073,709,551,615
            - size of 8 bytes
            - requires the ull or ULL suffix to declare the value as unsigned long long
            - example:
                unsigned long long x = 18446744073709551615ULL;
        - long double
            - decimal numbers, can store up to 19 decimal places (Intel-based Linux)
            - stores up to 1.7976931348623157e+308 (Windows)
            - or 1.18973149535723176502e+4932 (Intel-based Linux)
            - or 1.189731495357231765085759326628007016e+4932 (IEEE 754 with 34 decimal places precision)
            - requires the l or L suffix to declare the valye as a long double
                - without it, it will be truncated as a normal double
            - example:
                long double y = 3.14159265358979323846L;

    - Other Data Types
        - string
            - technically not a data type since C does not have a native string data type
            - C uses a char array to act as a string
                - syntax:
                    // explicit declaration
                    char <variable_name>[<size>];
                    // implicit declaration
                    char <variable_name> = <value>
                - example:
                    // explicit declaration
                    char my_string[10];
                    // implicit declaration
                    char my_string[] = "Hello World"
                - unlike a normal char, char arrays requires double quotes instead of single quotes
                - another way to declare char arrays
                    - example:
                        char my_string[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '\0'}; // "Hello World"
                    - '\0' is a null terminating character
                        - it tells C that reaching it means it's at the end of the string
                        - automatically declared when using the double quotes to declare strings
            - since strings in C are actually char arrays, it is possible to treat them as such
                - i.e. accesseing through their index, modifying values, etc.
                    - example:
                        - char my_string[] = "idkman";
                          my_string[5];                // 'n'
                        - char my_string[] = "Hello World";
                          my_string[0] = 'G';               // "Gello World"
            - sidenote:
                - using special characters, like "", '', or \ inside a string will result in an error
                - to bypass this, refer to escape sequences for special charater declaration in a string

        - bool
            - requires the <stdbool.h> header library
            - a boolean value, either true or false
                - a 1 or 0 respectively
                - any number other than 0 is considered as true
            - technically a interger
                - uses the "%d" for printing
                - can be used without the standard library
                    - using int instead of bool

    - Other Data Type concepts
        - format specifiers
            - usually used in printf() or scanf() functions
            - formats:
                - %d - for integers (or %i)
                - %s - for strings
                - %c - for chars
                - %f - for floats (or %F)
                    - adding a .<value> will reduce (or increase) the number of decimals
                        - <value> dictates how many decimals places are needed
                        - values are auto-rounded (unsure)
                    - example: 
                        - float my_num = 1.5;
                        print("%f", my_num);   // 1.500000
                        print("%.3f", my_num); // 1.500
                - %lf - for doubles
                - %z - length modifier
                - %hd - for short int
                - %u - for unsigned integer 
                - %ld - for long int
                - %lld - for long long int
                - %lu - for unsigned long int
                - %llu - for unsigned long long int
                - %Lf - for long double 
                - %p - for pointer values
            - sidenote: %zu is required for short int, unsigned int, long int, long long int,
                        unsigned long int, unsigned long long int and long double when using 
                        the sizeof operator
        - scientific notation (e)
            - used to write very large or very small numbers
            - uses the letter e or E
            - example:
                double large_num = 10e10; // same as 10 x 10^10
                // or
                float small_num = 10e-10f; // same as 10 x 10^-10
        - type casting
            - data types are able to be converted into another type
            - either widening casting or narrowing casting
                - widening casting
                    - from a smaller type to a larger type
                    - done automatically without data loss
                    - byte -> short -> char -> int -> long -> float -> double
                    - example:
                        byte small_to_large = 100;
                        int large_type = small_to_large;
                - narrowing casting
                    - from a larger type to a smaller type
                    - done manually due to possible data loss
                    - double -> float -> long -> int -> char -> short -> byte
                    - example:
                        float large_to_small = 903.54f;
                        short small_type = (short) large_to_small; // has to be manually type casted using (<data_type>)
        - type conversions
            - converts data types from one type to another
            - has two types of conversion:
                - Implicit Conversion
                    - automatic conversion
                    - example: 
                        - float my_num = 7;     // assigned an int to a float variable
                        printf("%f", my_num); // 7.000000
                    - warning: adding a float value to an int variable will round it down
                - Explicit Conversion
                    - manual conversion
                    - done by adding the data type enclosed in parentheses
                    - example: 
                        - float my_num = (float) 5 / 2; // assigned an int but declared as a float to a float variable
                        printf("%f", my_num);         // 2.500000
*/