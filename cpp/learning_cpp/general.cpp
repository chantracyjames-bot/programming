/* general
    - syntaxes
        - statements
            - a statement is a single line (or compound) that performs a single operation
                - i.e. calling a function, initializing a variable, declaring a loop, etc.
            - every statement must end with a semicolon ;
            - example:
                std::string myString = "Hello World"; // declaring a variable
                std::cout << myString;          // print statement
        - using namespace
            - using namespace is used to omit certain namespaces in C++
                - reduces the time and complexity when calling certain namespaces
            - usually declared at the beginning of the program, below the header declarations
            - syntax:
                using namespace <namespace>;
            - example:
                using namespace std;

                // inside a function or method
                cout << "yes";
                // without using namespace
                std::cout << "yes"

        - comments
            - comments in C++ is done by declaring a double frontslash //
            - comments are not compiled into code
            - syntax:
                // <comment>
            - example:
                // comment here
        - case-sensitive
            - C++ is case-sensitive when it comes to naming
            - true and True are not the same thing
        - numbers and text
            - text in C++ must be wrapped in double quotes " "
                - a single character (char) is usually wrapped in single quotes ' '
                - example:
                    char myString[] = "idkman" // string
                    char myChar = 'Z'          // char
            - numbers doesn't need to be inside quotations
                - doing so will convert the number into a string
                - example:
                    int myNum = 100    // int
                    int myFloat = 3.14 // floats
        - code blocks
            - blocks or groups of code are often encased in curly bracer { }
            - it is recommended to encase blocks of code that is connected to each other in code blocks to group the,m
            - in an if, else if, else statements, and even in iterative statements
                - without a code block, only the first line will get executed as part of the statement
                    - any succeeding lines will get ignored or get executed outside of the statements
                - example:
                    if (true):
                        std::cout << "yes" // gets executed
                        std::cout << "no"  // does not get executed

    - naming conventions
        - there are industry standard when naming certain elements in C++
        - variables and attributes
            - usually in camelCase
            - example:
                int myString;
                char myNum[];
        - functions and methods
            - usually in camelCase
            - example:
                myFunction();
                sumAll();
        - filenames and folders
            - usually in snake_case
            - example:
                my_program.cpp
                idkman.cpp
        - enums, classes, structs and unions
            - usually in PascalCase
            - example:
                enum MyEnum {...};
                class MyClass {...};
                struct MyStruct {...};
        - pointers
            - usually in camelCase with a prefix of p
            - example:
                int *pnumPtr;
                float *pfloatPtr;
        - constants (const) and enum values
            - since enum values are similar to const variables, both follow the SCREAMING_SNAKE_CASE
            - example:
                const MY_VAR;
                enum MyEnum {
                    IDKMAN,
                    LUMBAGO
                }

    - scope
        - by default, the compiler compiles code from the top to bottom, first line until the last line
        - calling a variable that is not defined until later in the code will throw an error
        - example:
            std::cout << x; -> Error
            int x = 10;    // defined later while called before declared
        - block scope
            - are statements inside a block of code
            - variables inside a block scope only exists inside that code block
            - trying to access a variable inside a block scope from the outside will throw an error
            - example:
                void myFunc() {
                    int x = 10;
                }
                std::cout << x;        -> Error
            - loop scope
                - like block scope, variables inside a loop (e.g. for loops) are only accessible inside of it
                    - trying to access it outside the code block will throw an error
                - example:
                    while(true) {
                        int i = 10;
                        break;
                    }
                    std::cout << i -> Error

    - namespaces
        - is a way to group related code together under a name
        - helps in avoiding naming conflicts due to code size or library imports
        - why use namespaces?
            - avoids naming conflicts
                - mainly in large projects
            - organizes related code
                - groups them logically
            - separates code from code in libraries
        
        - declaration and definition
            - uses the namespace keyword
            - syntax:
                namespace <namespaceName> {...}
            - example:
                namespace idkman {
                    int yes = 10;
                }

        - access and namespace calls
            - members of a namespace are called using the double colon :: syntax
            - syntax:
                <namespaceName>::<member>;
            - example:
                idkman::yes;
            - to avoid typing the name of the namespace
                - it is paired using the "using" keyword before the main() function
                - syntax:
                    using namespace <namespaceName>;
                - example:
                    using namespace idkman;
                    // inside main()
                    yes;
                - note that is required to be careful when omitting namespaces due to possible conflicts

    - escape sequence
        - \n
            - the most common escape sequence
            - it represents a new line
        - \t
            - it represents a horizontal tab rule
        - \\
            - represents a single backslash as text
        - \"
            - represents a double quote ias text
*/

#include <iostream>
// header of the program
// you can import libraries here

int main() {
// main() denotes the main program
// the entry point of the program
    std::cout << "Hello World" << std::endl;
    // std::std::cout means print out, see-out
    // similar to printf() in C
    // semicolons ; are required to end statments
    // like C, errors will occur if statements don't end with ";"

    return 0;
    // marks the end of the program
    // 0 returns that the program ended with no errors
}
// basic C++ program