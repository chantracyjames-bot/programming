/* iteratives
    - commonly called as loops
    - runs a code block until a certain condition is met
        - may it be until the loop counter reaches a certain number, the condition becomes false, etc.
    - uses a boolean value to dictate if the loop runs or stops
        - using loop counter values other than whole numbers will cause errors
    - loop keywords
        - break
            - the break keyword is used to stop loops
            - breaking a loop means ending it prematurely
        - continue 
            - the continue keyword is used to skip the current iteration
            - using it will end the current iteration and move on to the next
    - types of loops:
        - while loop
            - runs a loop while the condition is true
                - if the initial condition is false, the loop never runs
            - syntax:
                while (<condition>) {
                    <statements>
                }
            - example:
                while (10 > 11) {
                    std::cout << "lumbago";
                }
        - do-while loops
            - a variant of the while loop
            - unlike while loop, this loop runs the block of code first before checking the condition
                - it always runs the statements once
            - stops when the condition becomes false
            - syntax:
                do {
                    <statements>
                } while (<condition>)
            - example:
                do {
                    std::cout << "idkman";
                } while (29 < 1);
        - for loops
            - an extensive type of loop
            - runs a loop while the condition is true
                - if the initial condition is false, the loop never runs
            - takes in three statements:
                - statement 1:
                    - executed before the code block
                    - usually is reserved for initializing the loop counter (or variable)
                - statement 2:
                    - represents the condition of the loop
                    - usually is reserve for conditional operations
                - statement 3:
                    - executed after the code block
                    - usually is reserved to increment or decrement the loop counter (or variable)
            - syntaxx:
                for(<statement1>; <statement2>; <statement3>) {
                    <statement>
                }
            - example:
                for(int i = 0; i < 10; i++) {
                    std::cout << "yes";
                }
        - for each loop
            - a variant of the for loop
            - used to loop through iterables
                - like arrays
            - syntax:
                for(<dataType> <loopVariableName> : <iterable>) {
                    <statement>
                }
            - example:
                float myFloat[] = {3.13, 4.19, 5.15, 6.18};
                for(float myNum : myFloat) {
                    std::cout << "no";
                }
            - sidenote:
                - the loop variable type must match the iterable type

    - iterators
        - are used to access and iterate through elements inside a data structure
            - like vectors, sets, maps, etc.
            - done by "pointing" to them
        - the term comes from "iterating" which is a technical from of looping
        - note that stacks and queues do not support iterators

        - for-each vs iterators
            - a for-each loop is generally used when only reading through a data structure
            - an iterator is used to add, modify, or remove elements during iteration
                - it is also able to iterate in reverse or skip elements

        - declaration and initialization
            - to create an iterator, an iterator of a data structure type is declared
            - syntax:
                std::<data_structure><(dataType)>::iterator <iteratorName>;
            - example:
                std::vector<std::string>::iterator lumbago;
            - using the auto keyword lets the compiler determine the correct data type automatically
                - simplifying the code and makes it more readable
                - example:
                    // before auto
                    std::vector<std::string>::iterator idkman = myVector.begin();

                    // after auto
                    auto idkman = myVector.begin();
                - note that it is also possible to use the auto type in for loops
        - access and iteration
            - to increment or decrement an iterator
                - the increment ++ or decrement -- operators are used, respectively
                - syntax:
                    ++<iteratorName>;
                    // or
                    --<iteratorName>;
                - example:
                    ++lumbago;
                    // or
                    --lumbago;
            - .begin() and .end() methods
                - these are methods that belong to the data structure type
                    - not to the iterator type
                - used to point to the start or end of a data structure, respectively
                - syntax:
                    <iteratorName>.begin();
                    // or
                    <iteratorName>.end()
                - example:
                    lumbago.begin(); // points to the start of the data structure
                    // or
                    lumbago.end();   // points to the end of the data structure
                - sidenote:
                    - these methods return a pointer to the memory location of each respective end
                        - .begin() points to the first element, and
                        - .end() points to the end of the data structure
                    - the .end() method points to the next position after the last element of a data structure
                        - meaning, it does not actually point to an element unlesss it is decremented by 1
                - it is possible to use the addition + and subtraction - operators on these methods
                    - syntax:
                        <iteratorName>.begin() + 1;
                        // or
                        <iteratorName>.end() - 1;
                    - example:
                        lumbago.begin() + 1; // points to the second element
                        // or
                        lumbagi.end() - 1;   // points to the last element
            - .rbegin() and .rend()
                - similar to the .begin() and .end methods
                    - only that it iterates the data structure in reverse order
                - example:
                    for (auto idkman = myVector.rbegin(); lumbago != myVector.rend(); ++lumbago) {...}
*/