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