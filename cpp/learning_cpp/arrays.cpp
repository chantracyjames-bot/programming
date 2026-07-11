/* arrays
    - are used to store multiple values using a single variable
    - instead of declarating multiple variables to store multiple value, arrays makes the process easier

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

    - dynamic arrays
        - in C++, these are called "vectors"
        - initialized using the <vector> library
        - the size of this type of array is dynamic
            - it can grow and shrink without errors

        - definition and initialization
            - to create a vector, the vector keyword followd by the data type is done
            - syntax:
                std::vector<(dataType)> <vectorName>;
            - exmaple:
                std::vector<std::string> idkman;
            - it is possible to directly assign values to a vector array
                - using a comma separated list inside curly braces { }
                - syntax:
                    std::vector<(dataType)> <vectorName> = {<values>};
                - example:
                    std::vector<std::string> idkman = {"yes", "no", "maybe"};
            - note that when a vector array has been assigned a data type
                - it cannot be changed and will only hold that data type

            - it is possible for vectors to hold more than one data type
                - it is achieved through the use of tyhe <variable> header
                    - note that the data types that the vector is going to hold must be declared
                - syntax:
                    std::vector<std::variant<(dataTypes)>> <vectorName>;
                - example:
                    std::vector<std::variant<std::string, int, double>> myArray;

        - access and modification
            - like normal arrays, vector arrays are accessed using indexes
                - starting from 0, being the first element
                - syntax:
                    <vectorName>[<index>];
                - example:
                    idkman[2];
                - unlike normal arrays, the <vector> library has methods for vector arrays
                    - like the .front() and .back() methods
                    - syntax:
                        <vectorName>.front();
                        // or
                        <vectorName>.back();
                    - example:
                        idkman.front();
                        // or
                        idkman.back();
                    - it is recommended to us the .at() method to access elements rather than the square brackets
                        - it lets programmers know if an error occurs
                        - syntax:
                            <vectorName>.at(<index>);
                        - example:
                            idkman.at(2) // same as idkman[2]
            - similar to normal arrays, elements are able to be modified using the assignment = operator
                - syntax:
                    <vectorName>.at(<index>) = <newValue>;
                - example:
                    idkman.at(1) = 100;
            - unlike normal arrays, the biggest difference between it and vector arrays is the ability to add elements
                - it is done using the .push_back() method
                    - it adds method to the back (last) of a vector array
                - syntax:
                    <vectorName>.push_back(<newValue>);
                - example:
                    idkman.push_back(5);
                - similarly, it is elements at the back of the vector array can also be removed
                    - using the .pop_back() method
                    - syntax:
                        <vectorName>.pop_back();
                    - example:
                        idkman.pop_back();
            - the size of vector arrays are able to be queried using the .size() method
                - syntax:
                    <vectorNmae>.size();
                - example:
                    idkman.size();
                - vectors can also be queried if they are empty or not
                    - using the .empty() method
                        - returns 1 if it is empty
                        - returns 0 if it is not
                    - syntax:
                        <vectorName>.empty();
                    - example:
                        idkman.empty();
*/


