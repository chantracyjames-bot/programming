/* headers
    - declared at the start of the program
    - required to use features
        - like std::cout, std::cin, std::strings
    - libraries:
        - iostream
            - includes the input and output libraries
            - std::cout for output
            - std::cin for input
            - syntax:
                #include <iostream>
        - string
            - includes the string libraries
            - enables the string functionality
            - also enables string functions
                - like .length, .at(), etc.
            - syntax:
                #include <string>
        - cmath
            - includes the cmath libraries
            - enbales most math functionalities
            - includes cmath functions
                - example: sqrt(), round(), etc. 
            - syntax:
                #include <cmath>
        - fstream
            - includes the file manipulation libraries
            - enables the use of file functions
                - example: std::fstream, std::ofstream, std::ifstream
            - syntax:
                #include <fstream>
        - ctime
            - includes basic time and date libraries
            - allows querying of current time
            - syntax:
                #include <ctime>
        - cstdlib
            - includes random number generation
            - allowa the use of random functions
            - syntax:
                #include <cstdlib>
            - to generate random numbers
                - it is done using the rand() function
                - example:
                    // generate a number from 0 - 100
                    int myNum = rand() % 101;
                - sidenote:
                    - thie method of randon number generation only works one
                        - it will only randomize the number once
                        - meaning, it will be the same the same in-between program runs
                    - to solve this, the srad() and time() function is used
                        - it makes the number generation a lot more randomized
                        - example:
                            // inside a function
                            srand(time(0));
                            int myNum = rand() % 101;
*/
