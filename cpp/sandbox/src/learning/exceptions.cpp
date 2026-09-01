/* exceptions
    - C++ Errors
        - when C++ encounters an error, it immediately stops the program
            - whether it is still compiling or not
        - unlike Exceptions, it cannot be circumvented unless it's fixed
        - three types of errors
            - Compile-Time Errors
                - occurs duing compilation time
                    - preventing the file from compiling properly
                    - mainly due to syntax and type errors
                - common examples are:
                    - missing semilcolons
                        int x = 5
                    - incompatible types
                        bool yes = "Hello";
                    - undeclared variables
                        std::cout << myValue;
            - Runtime Errors
                - occurs after the program compiles
                    - but encounters sudden crashes or unintended behaviors
                - common examples are:
                    - division by zero
                        int x = 10 / 0;
                    - index out of bounds
                        std::string arr[1];
                        arr[10] = "yes";
                    - using deleted memory (dangling pointers)
                        int *ptr = new int(10);
                        delete ptr;
                        std::cout << *ptr;
            - Logical Errors
                - occurs no Compilation Errors or Runtime Errors occur
                    - the output is not accurate to what was supposed to happen
                - common examples are
                    - expecting a sum but the results is a difference
                        int x = 10;
                        int y = 8;
                        std::cout << "Sum: ", x - y;

        - how to avoid errors?
            - always initialize variables
            - use meaningful variable names
                - avoid typos and spellings
            - check for missing semicolons and braces
            - read the error messages carefully
                - gives valuable information in debugging

        - debugging
            - the process of identifying and fixing errors or bugs present in a program
            - it often includes:
                - reading error messages
                - tracing program flow step by step
                - testing small pieces of code independently
            - common debugging steps:
                - printing values for each step
                    - mainly used when encountering Logical Errors
                    - can reveal which part of the program is failing
                    - example:
                        int x = 10;
                        std::cout << x;
                        int y = 8;
                        std::cout << y;
                - using debugger tools
                    - examples are Visual Studio, Code::Blocks, VS Code, etc.
                        - these are able to:
                            - add breakpoints
                                - dictates where the program ends for testing
                            - inspect variables in real time
                                - being able to see their values step by step
                - commenting 
                    - using the comment // syntax to rule out problematic lines of code
                    - example:
                        int x = 10;
                        // float y = "Hello"; -> Error
                        String yes = "no";
                - looking for typos
                    - calling for elements can sometimes yield in mispellings ot typos
                    - example:
                        int myValue = 10;
                        std::cout << MyValue); // typo

    - C++ Exceptions
        - different types of problems and errors can occur while a program is running
            - yielding different error messages depending on the type
        - when the program encounters a roadblock or an error, C++ immediately stops the program
            - it then throws an error describing the reason for stopping the program
        - unlike Errors, these types of errors are able to be circumvented
            - commonly called as Exceptions 
        - these types of errors are "predicted" and have code that runs when the program runs into that error

    - Exception Handling
        - C++ has three keywords in exception handling
            - try
                - runs a block of code and "tests" it while being executed
                - any error messages will be "caught" by the catch statement
                - syntax:
                    try {...}
                - example:
                    try {
                        int x = 100;
                        int y = 0;
                        std::cout << x / y; -> Error
                    }
            - throw
                - "throws" or triggers an exception to occur
                - mainly used in a try-catch statement
                - syntax:
                    throw <exception>;
                - example:
                    try {
                        throw 100;
                    }
            - catch
                - runs a code block once an an exception is caught
                - uses the throw type to print out the error code
                - syntax:
                    catch (<exception>) {...}
                - example:
                    try {...}
                    catch (int errorCode) {...}
                - note that if the throw type is unknown, the three dots ... is used
                    - example:
                        catch (...) {...}

        - the try-catch and throw statements usually are grouped together
            - example:
                try {
                    int lumbago = 10
                    if(lumbago == 11) {
                        std::cout << "lumbago"
                    }
                    else {
                        throw 10;
                    }
                }
                catch (int idkman) {
                    std:cout << idkman;
                }

        - integer input validation
            - used when the underlying code requires an integer only
                - ignoring any other data type until a valid one is taken
            - example:
                int myNum;
                while (!(std::cin >> myNum)) {
                    std::cout << "idkman";
                }
                std::cout << "lumbago";
            
        - text input validation
            - used when the underlying code is expecting a text input
                - promopts the user to try again when the input is empty
            - example:
                std::string yes;
                do {
                    getlin(std::cin, yes);
                } while (yes.empty());
                std::cout << "no";
*/