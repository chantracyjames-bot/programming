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

    - Non-primitive data types
        - std::string
            - a collection of char objects
                - enclosed in double quotes " "
            - example:
                std::string = "idkman";
            - considered as an object
            - acts as an alternative to C-style strings
                - instead of;
                    char myString[] = "Hello World";
                - in C++ Strings;
                    string myString = "Hello World";
            - note that some C++ string functions and methods are behind a header file
                - called the <string> library

            - string concatenation
                - strings can be combined using the + operator
                    - syntax
                        <string1> + <string2>;
                    - example:
                        "idk" + "man"; // "idkman"
                - strings can also be concatenated using the .append() function
                    - syntax
                        <string1>.append(<string2>)
                    - example:
                        string name = "idk"; // "idk"
                        name.append("man"); // "idkman"

            - string access
                - string characters are able to be accessed through it index
                    - syntax:
                        <variableName>[<index>];
                    - example:
                        string name = "idk";
                        name[1]; // 'd'
                - specific string characters can also be changed, using the same concepts
                    - syntax
                        <variableName>[<index>] = <new_value>;
                    - example:
                        string name = "idk";
                        name[2] = 'c'; // "idc"

    - Other data type concepts:
        - automatic data type declaration
            - leaves it to the compiler to determince the data types or an attribute or variable
            - uses the auto keyword
            - auto only works if the value the variable holds is assigned alongside it
            - the data type cannot be changed after the compiter determines its type
                - i.e. float cannot become int
            - example:
                auto myVar = "value";
*/
