/* arrays
    - arrays are used to store multiple values in a single variable
        - instead of declaring multiple variables to store multiple values, arrays makes the process easier

    - declaration and definition
        - arrays are declared using a data type and square brackers
        - two ways to create arrays
            - explicit declartion
                - it is possible to create arrays by directly assigning values to it
                - values are stored using curly braces { }
                    - multiple values are declared using a comma-separated list
                - syntax:
                    <data_type> <array_name> = {<values>};
                - example:
                    int my_array = {1, 2, 3, 4, 5};
            - implicit declaration
                - an empty array is automatically created when only the size is specified
                - syntax:
                    <data_type> <array_name>[<size>]
                - example:
                    char my_string[10];

    - access and modification
        - the elements inside an array is accessed through the use of indices
            - in most languages, the index number usually starts at 0
                - i.e. the first element has an index of 0
            - trying to access an index that is greater than the size of the array will result in an error
            - syntax:
                <array_name>[<index>];
            - example:
                my_array[10]; // tries to access the 9th element
        - values of an array are able to be changed
            - through accessing them via their index and using the = assignment operator
            - syntax:
                <array_name>[<index>] = <new_value>;
             - example:
                my_array[1] = 10;
        - the size of an array is obtained through the sizeof() operator
            - syntax:
                - sizeof(<array_name>);
            - sidenote:
                - the sizeof() operator returns the size in bytes
                    - not the actual element count
                - element counts is obtained through a mathematical operation
                    - syntax:
                        - sizeof(<array_name>) / sizeof(<array_name>[<index_value>]);

    - multidimensional arrays
        - also called "nested arrays"
        - it is possible to insert array inside arrays
        - example:
            int my_array[3][4] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
        - note that the size of a multidimensional arrays must be declared unlike normal arrays
        - accessing a nested array is done through using the index of the parent array and then the child array
            - syntax:
                <array_name>[<outer_index>][<inner_index>];
            - example:
                my_array[1][2];
            - note that the leftmost index is the parent array and every succeeding index is the child array
        - modifying the values if done through the same process as normal arrays
            - only adding another index to represent the leaf values
            - syntax:
                <array_name>[<outer_index>][<inner_index>] = <new_value>;
            - example:
                my_array[1][3] = 100;
*/