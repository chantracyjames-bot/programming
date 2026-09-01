/* errors
    - C Errors
        - when C encounters an error, it immediately stops the program
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
                        printf(my_value);
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
                        int *p_num = malloc(sizeof(int));
                        *p_num = 10;
                        free(p_num);
                        printf(*p_num)
            - Logical Errors
                - occurs no Compilation Errors or Runtime Errors occur
                    - the output is not accurate to what was supposed to happen
                - common examples are
                    - expecting a sum but the results is a difference
                        int x = 10;
                        int y = 8;
                        printf("Sum: %d", x - y);

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

    - C NULL
        - is a special value that represents a "null pointer"
            - a pointer that does not point to anything
        - C functions can return NULL when something wrong happens
            - examples are opering a file that does not exists
            - or when malloc fails allocating memory
        - comparing to NULL is a common error mitigation technique
            - preventing crashes when the pointer points to NULL
            - example:
                if p_ptr == NULL {
                    printf("error");
                }

    - C Error Handling
        - used to detect and respond to problems that may arise in the program
            - preventing crashes or unexpected behaviors
        - unlike other languages, C does not have a built-in exception handling
            - like try-catch in Java or C++
        - there differing ways to handle errors in C
            - using return values
                - a user-customized return values to indicate certain errors
                - example:
                    if p_ptr == NULL {
                        return 1;
                    }
            - using the perror() function
                - it prints a custom error
                    - followed by a description of what happened wrong
                - syntax:
                    perror(<custom_error>);
                - example:
                    if p_ptr == NULL {
                        perror("cannot open file");
                    }
            - using stderror() and errno
                - errno is a global variable that stores an error code
                    - code from the latest failed operation
                - it is accessible through the <errno.h> header
                    - used with the stderr() function
                - the stderr() function converts the error code into a readable message
                - example:
                    if p_ptr == NULL {
                        printf(stderror(errno));
                    }
                - common error codes:
                    Error Code      Description
                    ENOENT          No such file or directory
                    EACCES          Permission denied
                    ENOMEM          Not enough memory
                    EINVAL          Invalid argument
            - using the exit() function
                - the exit() function exits the program
                    - returning an error code that was given
                - a return code of 0 is an indicator of success
                    - or EXIT_SUCCESS
                - any other number corresponds to an error
                    - or EXIT_FAILURE
                - sidenote:
                    - EXIT_SUCCESS AND EXIT_FAILURE are accessible through the <stdlib.h> header
            - using input validation
                - when a program expecting a certain input
                    - sometimes, it may run into unexpected input
                - this is used to mitigate any errors encounted due to it
                - validating a number range:
                    int number;
                    do {
                        printf("Enter a number from 1 to 5: ");
                        scanf("%d", &number);
                        while (getchar() != '\n');
                    } while (number < 1 || number > 5);
                - validating text input
                    char text[100];
                    do {
                        printf("Enter text: ");
                        fgets(name, sizeof(name), stdin);
                        name[strcspn(name, '\n')] = 0;
                    } while (strlen(name) == 0);
                - validating integer input
                    int number;
                    char input[100];
                    while (fgets(input, sizeof(input), stdin)) {
                    if (sscanf(input, "%d", number) == 1)} {
                        break;
                    } else {
                        printf("invalid input") 
                    }
*/

#include <stdio.h>
#include <errno.h>
#include <string.h>

int main() {
    FILE *p_ptr = fopen("general.c", "r");

    if (p_ptr == NULL) {
        perror("Error: ");
        printf("Error: %s", strerror(errno));
    }
}