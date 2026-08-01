/* headers
    - declared at the start of the program
    - required to use features
        - like printf, scanf, string, etc.
    - libraries:
        - errno.h
            - enables the use of errno
                - used for error handling
            - syntax:
                #include <errno.h>
        - math.h
            - includes the math functions and libraries
            - enables the use of math functions
            - syntax:
                #include <math.h>
        - stdbool.h
            - includes the boolean libraries
            - enables the use of the bool data type
            - syntax:
                #include <stdbool.h>
        - stdlib.h
            - includes most of the low-level libraries
                - like for dynamic memory management
            - syntax:
                #include <stdlib.h>
        - stdio.h
            - includes the input and output libraries
            - printf for output
            - scanf for input
            - syntax:
                #include <stdio.h>
        - string.h
            - includes the string libraries and functions
            - enables the use of string functions
            - syntax:
                #include <string.h>
*/

#include <errno.h>
#include <math.h>
#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main() {
    FILE *p_file = fopen("test", "r");
    if (p_file == NULL) {
        printf("Error: %s", strerror(errno));
    }

    double *p_num = malloc(sizeof(double));
    *p_num = round(1.2);
}