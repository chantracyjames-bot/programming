/* memory management
    - memory addresses
        - different machines, primarily those with differing architectures, have different memory configurations
            - this is one of the main reasons why some programs work on other machines while being incompatible with others
            - e.g. a C++ program written in x86_64 won't work on ARM-based systems
        - memory management in C is important for a program's efficiency
            - mainly towards memory usage and performaance
        - when an element in C++ is created, it gets assigned with a memory address
            - i.e. a location in memory
            - each data type has its own memory size
                - refer to data_types.c for more details

        - pointer referencing
            - a reference is a representation to a value's location in memory
            - it is done using the reference & operator
            - syntax:
                &<element>;
            - example:
                &myNum;
            - printing a memory address requires the "%p" format specifier
                - example:
                    // inside main()
                    std::cout << &myNum;

            - arrays
                - referencing an array will return the memory address of the first element inside that array
                - note that the name of the array is a pointer to the memory address of its first element
                - example:
                    // inside main()
                    int myArray[] = {1, 2, 3, 4, 5}; 

                    std::cout << &myArray[0];       // 0x7fffa2931470

            - element referencing
                - in C++, it is possible to create aliases of variables
                    - unlike in C which does not support this feature
                - it uses the reference & operator to create aliases
                - syntax:
                    <dataType> &<aliasName> = <variableName>;
                - example:
                    double &lumbago = idkman; 

        - pointer dereferencing
            - it retrives the value at a given memory address
            - mainly used to find the value of a reference in memory
            - it is done using the dereference * operator
            - syntax:
                *<memoryAddress>
            - example:
                *&myNum;

            - pointer variables
                - used to store the pointer to the memory address of a variable
                    - uses a pointer variable
                - uses the dereference * operator
                - syntax:
                    <dataType> *<pointerName> = &<variableName>;
                - example:
                    int *pmyPtr = &myNum;
                - sidenote:
                    - the pointer type must match the data type of the variable being pointed to
                    - it is a convention to add a p_ prefix to pointer variable names
                        - it makes reading code easier
                - double pointers
                    - like normal pointer variable, it is possible to declare a pointer to point at another pointer
                    - uses a double derefence ** operator
                    - syntax:
                        <dataType> **<doublePointerVariable> = &<pointerVariable>
                    - example:
                        int **ppmyPtr = &pmyPtr;

                - arrays
                    - references to arrays are able to be dereferenced
                    - it is posible to increment the pointer to an array
                        - similar to incrementing indexes
                        - uses the ++, --, -= or += operators
                    - example:
                        char myChar[] = {'i', 'd', 'k', 'm', 'a', 'n', '\0'};
                        char *pmyChar = myChar;

                        std::cout myChar[0];                              // 'i'
                        std::cout *pmyChar;                               // 'i'

                        pmyChar++;                                            // 'd'
                    - sidenote:
                        - unlike normal negative indexing, when a pointer goes to a negative pointer value
                            - i.e. goes out of bounds from the array, it yields garbage characters

    - memory allocation
        - while C++ can still use C-style memory management using the <cstdlib> library
            - it is generally recommended to use C++'s own memory management utilities
        - C++ uses the new and delete operators to manage memory    
            - new
                - similar to malloc() or calloc()
                    - querying the operating system for free memory to be allocated
                - unlike malloc() or calloc(), after the memory is allocated
                    - new goes to the memory address allocated and initializes the memory automatically
                - syntax:
                    <dataType> *<pointerName> = new <dataType>(<arguements>);
                - example:
                    // initializing a double variable
                    double *yes = new double(3.14); // initializes yes with a value of 3.14
                    // initialing an object
                    MyClass *no = new MyClass('Y');

            - delete
                - similar to free()
                - unlike free(), delete calls the destructor for the object
                    - before returning the heap back to the operating system
                - syntax:
                    delete <pointerName>;
                - example:
                    delete yes;

        - C++ has special operators to handle memory management of arrays
            - new[]
                - using this operator, it goes through every single index
                    - initializing and using their constructor for every item in the array
                - it also initializes a "Allocation Cookie"
                    - keeping track how many items are inside the array
                    - occupying the first initial bytes of the allocated memory
                    - returning the memory address of the first item in the array (index 0)
                - syntax:
                    <dataType> *<pointerName> = new <dataType>[<size>];
                - example:
                    int *myArray = new int[10]; // creates an array with size 10
                - it is possible to declare an array of objects that expects arguments
                    - syntax:
                        <dataType> *<pointerName> = new <dataType>[<size>] {<arguments>};
                    - example:
                        class MyClass {
                            public:
                                int test = 19;
                                MyClass(const char *yes) {
                                    std::cout << yes;
                                }
                        };

                        int main() {
                            MyClass *idkman = new MyClass[2] { "hello", "world" };
                            return 0;
                        }

            - delete[]
                - uses the Allocation Cookie intialized by the new[] keyword to delete the elements inside the array
                    - requiring no extra input
                - syntax:
                    delete[] <pointerName>;
                - example:
                    delete[] idkman;
                - note that the delete operator must not be used to release memory
                    - it does not consider the other elements inside the array
                        - only the first element located in index 0
                    - prolonged use of a program which exhibits this code leads to a Heap Corruption Crash                    
*/

#include <iostream>

class MyClass {
    public:
        int test = 19;
        MyClass(const char *yes) {
            std::cout << yes;
        }
};

int main() {
    MyClass *idkman = new MyClass[2] { "hello", "world" };
    return 0;
}