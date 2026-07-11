/* general
    - syntaxes
        - statements
            - a statement is a single line (or many) that performs a single operation
                - i.e. calling a function or method, initialiazing a variable, declaring a loop, etc.
            - every statement in java must end with a semicolon ;
            - example:
                String myString = "Hello World";
                int myNum = 28;
        - case-sensitive
            - Java is case-sensitive when it comes to naming
            - myClass and MyClass are not the same thing
        - filename
            - Java is class-oriented program
                - this extends to its file name, the class name must match it
            - since this file is named GeneralBasics, the class name must match it
        - numbers and text
            - text in Java must be wrapped in double quotes " "
                - a single character is usually wrapped in single quotes ' '
                - example:
                    String myString = "string";
                    char myChar = 'A';
            - numbers don't need to be inside double qoutes
                - doing so will make convert them into string
                - example:
                    int myInt = 100;
                    float myFloat = 27.9;
        - code blocks
            - blocks or groups of code are often encased in curly braces { }
            - it is recommended to encase blocks of code in curly braces to group them
            - in an if, else-if, else statements, and possible even in iterative statements
                - with out a code block, only the first line will get executed as part of the statement
                    - the succeding lines will get ignored or get executed outside of the statemnts
                - example:
                    if (dayIsSunny)
                        sunnyDayCount++;                            // runs if the if statement is true
                        System.out.println("Today is a sunny day"); // runs regradless if the if statement if true or false

    - naming conventions
        - there are industry conventions when naming certain elements in java
        - attributes and variables
            - usually in camelCase
            - example:
                int myNum;
                String myString;
        - methds and functions
            - usually in camelCase
            - example:
                myMethod();
                myFunction();
        - filenames
            - usually in PascalCase
            - example:
                MyJavaProgram.java
                GeneralBasics.java
        - classes, interfaces, and enumerations
            - since classes must match the filename, it follows PascalCase
            - interfaces and enumerations are a type of class, following the PascalCase naming scheme
            - example:
                class MyClass {...}
                interface MyAbstract {...}
                enum MyEnum {...}
        - constants (final) and enum values
            - since enum values are similar to final variables, both follow the SCREAMING_SNAKE_CASE
            - example:
                final String MY_MESSAGE = "Hello World";
                // inside an enum
                IDKMAN;

    - scope
        - by default, the compiler compiles code from the top to bottom, first line unitl the last line
        - calling a variable that is not defined until later in the code will throu an error
        - example:
            int sum = x + 10; -> Error
            int x = 10;       // x is declared later in the code
        - block scope
            - are statements inside a block of code
            - variables inside a block scope only exists inside that code block
            - trying to access a variable inside a block scope from the outside will through an error
            - examoke
                void myFunc() {
                    int x;      // variable only exists inside of myFunc
                }
                x = 10;         -> Error
        - loop scope
            - like in block scope, variables declared inside a loop will only exist inside that loop block
            - calling it from the outside will result in an error
            - example:
                while(true) {
                    int x = 10; // variable only exists inside the code block
                    break;
                }
                x = 100;        -> Error

        - escape sequences
            - \n
                - the most common escape sequence
                - it represents a new line
            - \t
                - it represents a horizontal tab rule
                - same thing as pressing the TAB key
            - \\
                - represents a single backslash as text
            - \"
                - represents a double quote as text
            - \b
                - represents a backspace
            - \r
                - represents a Carriage Return
            - \f
                - represents a Form Feed
*/

public class General {
    public static void main(String args[])
    // main() signifies the start of the program
        // it is the entry point for the program to start in
    {
        System.out.print("Hello World");
        // System.out.print() sends text to output in the terminal or screen
            // System is a built-in Java class
            // out is a member of the System class
            // print() is a method used for printing
        // statement need to end with a semicolon to avoid errors
    }
    // basic Java program
}

