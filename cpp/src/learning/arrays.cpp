/* arrays
    - are used to store multiple values using a single variable
    - instead of declarating multiple variables to store multiple value, arrays makes the process easier

    - C-style arrays
        - arrays that are nearly identical to C arrays
        - declaration and definition
            - arrays are declared using a data type and square brackets
            - two ways to create arrays
                - explicit declartion
                    - it is possible to create arrays by directly assigning values to it
                    - values are stored using curly braces { }
                        - multiple values are declared using a comma-separated list
                    - syntax:
                        <dataType> <arrayName> = {<values>};
                    - example:
                        int myArray = {1, 2, 3, 4, 5};
                - implicit declaration
                    - an empty array is automatically created when only the size is specified
                    - syntax:
                        <dataType> <arrayName>[<size>]
                    - example:
                        float myFloat[10];

        - access and modification
            - the elements inside an array is accessed through the use of indices
                - in most languages, the index number usually starts at 0
                    - i.e. the first element has an index of 0
                - trying to access an index that is greater than the size of the array will result in an error
                - syntax:
                    <arrayName>[<index>];
                - example:
                    myArray[10]; // tries to access the 9th element
            - values of an array are able to be changed
                - through accessing them via their index and using the = assignment operator
                - syntax:
                    <arrayName>[<index>] = <newValue>;
                - example:
                    myArray[1] = 10;
            - the size of an array is obtained through the sizeof() operator
                - syntax:
                    - sizeof(<arrayName>);
                - sidenote:
                    - the sizeof() operator returns the size in bytes
                        - not the actual element count
                    - element counts is obtained through a mathematical operation
                        - syntax:
                            - sizeof(<arrayName>) / sizeof(<arrayName>[<index>]);
                            
        - multidimensional arrays
            - also called "nested arrays"
            - it is possible to insert array inside arrays
            - example:
                int myArray[3][4] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                };
            - note that the size of a multidimensional arrays must be declared unlike normal arrays
            - accessing a nested array is done through using the index of the parent array and then the child array
                - syntax:
                    <arrayName>[<outer_index>][<inner_index>];
                - example:
                    myArray[1][2];
                - note that the leftmost index is the parent array and every succeeding index is the child array
            - modifying the values if done through the same process as normal arrays
                - only adding another index to represent the leaf values
                - syntax:
                    <arrayName>[<outer_index>][<inner_index>] = <newValue>;
                - example:
                    myArray[1][3] = 100;

    - C++ style arrays
        - differs from the traditional C-style arrays
        - requires the <array> header library
        - syntax:
            #include <array>

        - declaration and initialization
            - to create an array, the array keyword is followed by the data type and size of the array
            - syntax:
                std::array<(dataType), (size)> <arrayName>;
            - example:
                std::array<int, 5> world; // declares an array with size of 5 ints
            - it is possible to assign values to the array during declaration
                - using a comma separated list inside curly braces { }
                - syntax:
                    std::array<(dataType), (size)> <arrayName> = {value/s};
                - example:
                    std::array<int, 5> world = {1, 2, 3, 4. 5};
            - after an array has been assigned to a data type
                - it cannot be changed and can only hold that specific data type

            - it is possible for arrays to hold more than one data type
                - it is achieved through the use of the <variant> header
                    - using the std::variant type
                    - note that the data types that the array is able to hold must be specified
                - syntax:
                    std::array<std::variant<(dataTypes)>, (size)> <arrayName>;
                - example:
                    std::array<std::variant<std::string, int>, 5> myArray;

        - access and modification
            - like normal arrays, C++ arrays are accessed using indexes
                - starting from 0, being the first element
                - syntax:
                    <arrayName>[<index>];
                - example:
                    world[2];
                - unlike normal arrays, the <array> library has methods for C++ arrays
                    - like the .front() and .back() methods
                    - syntax:
                        <arrayName>.front();
                        // or
                        <arrayName>.back();
                    - example:
                        world.front();
                        // or
                        world.back();
                    - it is recommended to us the .at() method to access elements rather than the square brackets
                        - it lets programmers know if an error occurs
                        - syntax:
                            <arrayName>.at(<index>);
                        - example:
                            world.at(2) // same as world[2]
            - similar to normal arrays, elements are able to be modified using the assignment = operator
                - syntax:
                    <arrayName>.at(<index>) = <newValue>;
                - example:
                    world.at(1) = 100;
            - like normal arrays, C++ arrays still hold the same limitations
                - it remains to a fixed sized
                - it cannot grow nor shrink like vectors
            - the size of C++ arrays are able to be queried using the .size() method
                - syntax:
                    <arrayName>.size();
                - example:
                    world.size();
                - arrays can also be queried if they are empty or not
                    - using the .empty() method
                        - returns 1 if it is empty
                        - returns 0 if it is not
                    - syntax:
                        <arrayName>.empty();
                    - example:
                        world.empty();

    - dynamic arrays
        - refer to data_structures for vectors and lists
*/