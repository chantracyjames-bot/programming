#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    size_t yes = rand();

    switch (yes % 5) {
        case 0:
            printf("yes");
            break;
        case 1:
            printf("no");
            break;
        case 2:
            printf("maybe");
            break;
        case 3:
            printf("probs");
            break;
        case 4:
            printf("idk");
            break;
    }

    printf("\n");
    return 0;
}