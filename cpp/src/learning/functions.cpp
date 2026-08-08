/*
    - built-in functions amd methods
        - C stdlib functions <cstdlib>
            - rand()
                - used to generate random numbers
                - syntax:
                    rand();
                - example:
                    rand() % 101; // generates a number from 0 - 100
                - sidenote:
                    - thie method of randon number generation only works once
                        - due to it only randomizing the number in the same process
                        - meaning, it will be the same the number in-between program runs
                    - to solve this, the srand()
            - srand()
                - used to initialize the rand() function
                    - or seed the function, truly randomizing it
                - syntax:
                    srand(<seed>);
                - example:
                    srand(21);
                - commonly used with the time() for true randomness
                    - it makes the number generation a lot more randomized
                    - example:
                        srand(time(0));
                        int myNum = rand() % 101;
        - string functions <string>
            - .append()
                - concatenates (or adds) two strings together
                - returns the new string to the first string
                    - with the second string appended to it
                - syntax 
                    <string1>.append(<string2>);
                - example:
                    std::string("idk").append("man"); // "idkman"
            - .at()
                - returns the character at the specified index in the string
                - syntax:
                    <string>.at(<index>)
                - example:
                    std::string("idkman").at(1); // 'd'
                - changes a character in a string object through its index
                    - syntax
                        <string>.at(<index>) = <newValue>;
                    - example:
                        std::string("idkman").at(2) = 'c'; // "idcman"
            - .back()
                - returns the last character in the string
                - syntax:
                    <string>.back();
                - example:
                    std::string("idkman").back(); // 'n'
            - .c_str()
                - returns a C-style const char* type string
                    - returned with a null terminator
                - syntax:
                    <string>.c_str();
                - example
                    std::string("idkman").c_str(); // "idkman\0"
            - .clear()  
                - truncates or clears the string
                - returns an empty string
                - syntax:
                    <string>.clear();
                - example:
                    std::string("idkman").clear(); // ""
            - .compare()
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
                    <string1>.compare(<string2>);
                - example:
                    std::string("idkman").compare("lumbago"); // 3
            - .empty()
                - queries if the string is empty or not
                - returns a bool value
                    - returns true if it is empty
                    - returns false if it is not
                - syntax:
                    <string>.empty();
                - example:
                    std::string("idkman").empty(); // false
            - .erase()
                - deletes parts of a straing
                - takes in two arguments
                    - <index> refers to the start of the index to be deleted
                    - <count> if the number of characters to delete
                - syntax:
                    <string>.erase(<index>, <count>);
                - example:
                    std::string("idkman").erase(3, 3); // "idk"
            - .find()
                - queries the string for the first occurence of a character or substring
                - returns an in values
                    - if found, retuns a number corresponding to the index of the character
                        - or the first index of substring if matched with a substring
                    - if not, returns a std::string::npos static value
                - syntax:
                    <string>.find(<substring>);
                - example:
                    std::string("idkman").find("man"); // 3
            - .front()
                - returns the first character in the string
                - syntax:
                    <string>.fromt();
                - example:
                    std::string("idkman").front(); // 'i'
            - getline()
                - able to extract strings from the cin object
                    - even with whitespace
                - syntax:
                    std::getline(std::cin, <stringVariable>);
                - example:
                    std::string myString;
                    std::getline(std::cin, myString);
            - .insert()
                - inserts a substring at a given index
                - syntax:
                    <string1>.insert(<index>, <string2>);
                - example:
                    std::string("idkman").insert(6, "lumbago"); // "idkman lumbago"
            - .length()
                - queries the length of a string object
                - syntax:
                    <string>.length();
                - example:
                    std::string("idkman").length(); // 6
            - .operator[]
                - the long form of the square brackets [ ] index access
                - queries the character at that location
                    - note that it does not check if the index is valid or not
                - syntax:
                    <string>[<index>];
                    // or
                    <string>.operator[](<index>);
                - example:
                    std::string("idkman")[0]; // 'i'
                    // or
                    std::string("idkman").operator[](0); // 'i'
            - .pop_back()
                - removes the last character in the string
                - syntax:
                    <string>.pop_back();
                - example:
                    std::string("idkman").pop_back(); // "idkma"
            - .push_back()
                - adds a single character to the end of the string
                - syntax:
                    <string>.push_back();
                - example:
                    std::string("idkma").push_back('n'); // "idkman"
            - .replace()
                - replaces a portion of a string with a substring
                - syntax:
                    <string>.replace(<index>, <count>, <substring>);
                - example:
                    std::string("idkman").replace(3, 3, "lumbago"); // "idklumbago"
            - .rfind()
                - queries the string for the last occurence of a character or substring
                - returns an in values
                    - if found, retuns a number corresponding to the index of the character
                        - or the first index of substring if matched with a substring
                    - if not, returns a std::string::npos static value
                - syntax:
                    <string>.rfind(<substring>);
                - example:
                    std::string("idkman").rfind("man"); // 3
            - .resize()
                - resizes a string to a new size
                - the second argument is the "fill" value
                    - ignoring it fills the empty part of the string with null terminators '\0'
                - syntax:
                    <string>.resize(<size>, <char>);
                - example:
                    std::string("idkman").resize(10); // "idkman\0\0\0\0"
            - .size()
                - alias of .length(); queries the length of a string object
                - syntax:
                    <string>.size();
                - example:
                    std::string("idkman").size(); // 6
            - .substr()
                - returns a substring of a string
                - leavning the second argument empty copies the string from the index to the end
                - syntax:
                    <string>.substr(<startIndex>, <endIndex>);
                - example:
                    std::string("idkman").substr(3); // "man"
            - .swap()
                - swaps two string values
                - syntax:
                    <string1>.swap(<string2>);
                - example:
                    std::string("idkman").swap("lumbago"); // "lumbago"
        
        - math functions
            - max()
                - std::max()
                - queries the highest value between two values
                - syntax:
                    - max(x, y);
            - min()
                - std::min()
                - queries the lowest value between two values
                - syntax:
                    - min(x, y);
            
            - requires the cmath library
            - sqrt()
                - performs a square root operation
                - syntax:
                    - sqrt(x);
            - round()
                - performs a rounding operation
                - syntax:
                    - round(x);
            - log()
                - performs a natural logarithm operation
                - syntax:
                    - log(x);

        - file functions
            - getline()
                - requires the <fstream> header library
                - used to read lines from file
                - syntax:
                    // assuming std::ofstream or std::fstream file variable has been done
                    getline(<fileVariable>, <variableName>);

    - objects
        - cout
            - prints text output to the terminal
            - requires the "<<" operator to work
            - syntax:
                cout << <value>;
            - example:
                cout << "Hello World"; // Hello World
            - sidenote:
                - multiple cout calls doesn't automatically adds them to a new line
                - they will be in the same line without any explicit new line call

        - cin 
            - scans for user input, similar to scanf in C
            - requires the ">>" operator to assign values to variables
            - syntax:
                cin >> <variable>;
            - example:
                cin >> myNum;
            - strings
                - C++ is able to extract strings in a cin object
                - sidenote:
                    - whitespace are considered as teminating characters
                        - space, tab, etc.
                        - i.e. ends the string extraxtion
                        - example: idk man becomes idk

    - manipulators
        - std::boolalpha
            - tells the cout object to convert boolean values from integers to boolean
            - 1 becomes true and 0 becomes false
            - syntax
                std::cout << std::boolalpha << <valuy>;
            - example:
                std::cout << true;              //1
                std::cout << std:;boolalpha << true; // true
            - after declaration, boolalpha become active until deactivated
        - std::endl
            - adds a new line
            - commonly used at the end of a cout call
            - syntax:
                std::cout << <value> << std::endl;
            - example:
                std::cout << "Hello World" << std::endl; // Hello World\n
        - std::noboolalpha
            - tells the cout object to return to normal behavior
                - disables boolalpha
            - syntax
                std::cout << std::noboolalpha << <value>;
            - example:
                // assuming boolapha is activated
                std::cout << true;                     // true
                std::cout << std::noboolalpha << true; //1

    - user-defined functions
        - paves the way for the creation of custom functions
            - mainly for reusing code instead of redeclaring it
        - user-defined functions are designed by the programmer
        - declared outside of the main() function

        - declaration and definition
            - in C++, there are two parts of a function
                - declaration
                    - it is where function is declared but not defined
                    - example:
                        void printNum(int num);
                - definition
                    - it is where the function is defined
                    - example:
                        void printNum(int num) {
                            cout << num;
                        }
                - functions are often declared before the main() function and defined after it
                    - example:
                        - void functionStuff();
                        int main() {...}
                        void functionStuff() {
                            idk = "man";
                        }
            - functions are made to either have a return type or not
            - no return type:
                - syntax:
                    void <functionName>() {
                        <statements>
                    }
                - example:
                    void myFunction() {
                        cout << "man";
                    }
            - with return type:
                - syntax:
                    <dataType> <functionName>() {
                        <statements>
                        return <expression>
                    }
                - example:
                    int myFunction() {
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
                <returnType> <functionName>(<parameters>) {
                    <statements>
                    <returnStatementIfAny>
                }
            - example:
                void myFunction(int num) {
                    cout << num;
                }
            - the variable that is declared in the parameter is a temporary variable
                - it disappears after the function is finished
            - it is possible to declare multiple parameters
                - example:
                    double sumOfNumber(double x, double y) {
                        return x + y;
                    }

        - access and function calls
            - methods are accessed using the function name followed by parentheses ()
            - syntax:
                <functionName>();
            - example:
                myFunction();

        - function calls with arguments
            - if a function needs certain parameters, that is called "argument"
            - calling methods with parameters requires the corresponding arguments
            - syntax:
                <functionName>(<arguments>);
            - example:
                myFunction(19);
            - variables and values are able to be passed as arguments
            - when there are multiple arguments needed
                - the order of parameters matter
                    - if the order of arguments doesn't match the order of parameters, an error occues
                    - example:
                        // assuming myFunction(int x, float y)
                        int a = 10;
                        float b = .13;
                        myFunction(a, b);
                        myFunction(b, a); -> Error

        - functions with structs as arguments
            - it is possible to pass a struct as an argument to a function
                - the function gets a copy of the struct
                - unless it is passed by reference
            - the function must have the struct as a parameter
            - structs as copies
                - the struct is copied and given into the function
                - the original struct object is intact
                - syntax:
                    <returnType> <functionName>(<structName> <structObject>) {...}
                - example:
                    void printStuff(MyStruct yes) {
                        std::cout << yes.name;
                    };
            - structs by reference
                - the function takes in the reference to the struct
                - it is able to modify the struct directly
                - syntax:
                    <returnType> <functionName>(&<structName> <structObject>) {...}
                - example:
                    void modifyBalance(&MyStruct no) {
                        no.balance = 10;
                    };

        - inline functions
            - an function declared with the inline keyword makes frequently called functions faster
            - asks the compiler to inserts its code directly where it is called
                - instead of jumping to it
            - syntax:
                - inline <returnType> <functionName>(<parameters>) {
                    <statments>
                  }
            - example
                - inline int addStuff(int x, int y) {
                    return x + y;
                  } // declaration and definition
                  int main() {
                    result = addStuff(9, 10); // 21
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

        - lambda functions
            - a small anonymous function written directly into the code
                - doesn't need to be declared and defined
            - syntax:
                [<capture>](<parameters>) { <expression> };
            - the parameters arnd statements of lambda functions are similar to normal functions
            - the capture clause copies vraiables outside of its scope
                - example:
                    - int x = 10;
                      auto idkman [x]() { cout << x); } // 10
                - sidenote:
                    - capture takes a copy of the variable
                    - manipulating the actual value is done using a refenrence
                        - example:
                            int x = 10;
                            auto idkman [&x]() { cout << x); } // 10
                                                               // uses the memory address of x
            - usecases:
                - unlike regualar functions, lambda functions are not reusable
                    - they are a oneshot functions, no longer usable after used
                - lambda functions are most often used for simple and short expressions
                    - unlike regular functions wherein it can become extensive
                - lambda functions are used for quick, on-the-line function class
                    - unlike regular functions which requires logic and can be very complex

        - template functions
            - provieds a template or a placeholder for a function
            - allows functions to work with different data types
            
            - declaration and definition
                - requires the template keyword
                    - declared before a function
                - syntax:
                    template <typename (templateName)>
                - example:
                    template <typename tempVar>
                - the template is used as a placeholder for data types inside functions
                    - syntax:
                        <returnType> <functionName>(<parameters>) {
                            <statements>
                        }
                    - example:
                        int myFunc(tempVar yes) {
                            return yes;           // yes does not have a fixed data type
                                                  // it is controlled by the template
                        }
                - it is possible to have multiple templates for a single function
                    - syntax:
                        template <typename(<templateName1), typename (templateName2)>
                    - example:
                        template <typename idkman, template lumbago>
                    - example function with multiple templates
                        template <typename idkman, template lumbago>
                        void maybe(idkman yes, lumbago no) {
                            cout << yes << "\n" << no;
                        }

            - access and modification
                - accessing a function with a template, a special syntax is requires
                    - syntax:
                        <functionName><(dataType)>(<arguments>)
                    - example:
                        myFunc<int>(100); // sets the template to be a int variable
                - accessing a function with multiple templates
                    - syntax:
                        <functionName><(dataType), (dataType)>(<parameters>)
                    - example:
                        maybe<std::string, float>("World Hello", 3.14);
*/