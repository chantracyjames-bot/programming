/* error handling
    - C++ Errors
        - when C++ encounters an error, it immediately stops the program
        - three types of errors
            - Compile-Time Errors
                - occurs duing compilation time
                    - preventing the file from compiling properly
                    - mainly due to syntax and type errors
                - common examples are:
                    - missing semilcolons
                        int x = 5
                    - incompatible types
                        float yes = "Hello";
                    - undeclared variables
                        std::cout << my_value;
            - Runtime Errors
                - occurs after the program compiles
                    - but encounters sudden crashes or unintended behaviors
                - common examples are:
                    - division by zero
                        int x = 10 / 0;
                    - index out of bounds
                        int arr[] = [1];
                        arr[10] = "yes";
                    - using freed memory
                        int *p_num = new int(10);
                        delete p_num;
                        std::cout << p_num;
            - Logical Errors
                - occurs no Compilation Errors or Runtime Errors occur
                    - the output is not accurate to what was supposed to happen
                - common examples are
                    - expecting a sum but the results is a difference
                        int x = 10;
                        int y = 8;
                        std::cout << "Sum: " << x - y;

        - how to avoid errors?
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
                        printf("%d", x);
                        int y = 8;
                        printf("%d", y);
                - using IDEs for debugging
                    - modern Java IDEs comes with debugging tools
                        - examples: Code::Blocks, Visual Studio, VS Code, etc.
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
                        int n = 10;
                - looking for typos
                    - calling for elements can sometimes yield in mispellings ot typos
                    - example:
                        int myValue = 10;
                        printf("%d", MyValue); // typo

        - Exception Handling
            - C++ has three keywords for Exception Handling
                - try
                - runs a block of code and "tests" it while being executed
                - any error messages will be "caught" by the catch statement
                - syntax:
                    try {...}
                - example:
                    try {
                        std::cout << "idkman";
                    }
            - catch
                - runs a block of code after the Exception it is "expecting" is caught
                - note that Exceptions are manually thrown
                - syntax:
                    catch(<dataType> <identifier>) {...}
                - example:
                    catch(int errorCode) {
                        std::cout << "Error: Code: " << errorCode; // prints when an Exception is triggered
                    }
            - throw
                - used to throw Exceptions
                - can be used outside a try-catch statement
                    - note that the program will be stopped after an Exception is thrown
                - syntax:
                    throw <value>;
                - example:
                    throw 404;

        - the try, throw, and catch keywords usually come in as a trio
            - syntax:
                try {
                    <statements>
                    throw <value>;
                }
                catch(<data_type> <identifier>) {...}
            - example:
                try {
                    int *age = new int;
                    std::cout << "Enter your age: ";
                    std::cin >> *age;
                    if (*age < 18) {
                        throw (*age);                 // triggers the ArithmeticException error
                    }
                    std::cout << "idkman";
                } catch (int errroStuff) {
                    std::cout << errorStuff;         // prints after the Exception is triggered
                }
        - it is possible to handle any types of exception
            - through the use of the three dots ... syntax
            - syntax:
                try {...}
                catch (...) {...}
            - example:
                try {
                    int *age = new int;
                    std::cout << "Enter your age: ";
                    std::cin >> *age;
                    if (*age < 18) {
                        throw (age);
                    }
                    std::cout << "idkman";
                } catch (...) {
                    std::cout << errorStuff;
                }
    - C++ Input Validation
        - when a program expecting a certain input
            - sometimes, it may run into unexpected input
        - this is used to mitigate any errors encounted due to it
        - validating a number range:
            int number;
            do {
                std::cout << "Choose a number between 1 and 5: ";
                std::cin >> number;
            } while (number < 1 || number> 5);

            std::cout << "You chose: " << number;
        - validating text input
            string name;
            do {
                std::cout << "Enter your name: ";
                std::getline(cin, name);
            } while (name.empty()); 

            std::cout << "Hello, " << name;
        - validating integer input
            int number;
            std::cout << "Enter a number: ";
            while (!(std::cin >> number)) {
                std::cout << "Invalid input. Try again: ";
                std::cin.clear();
                std::cin.ignore(10000, '\n'); 
            }
            std::cout << "You entered: " << number;
*/
