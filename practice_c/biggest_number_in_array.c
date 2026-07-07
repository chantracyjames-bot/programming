#include <stdio.h>

int main() {
    int numArray[5] = {92, 109, 83, 43, 201};

    int *ptr = numArray;
    int curMax = *ptr;
    int *address = ptr;

    for (int i = 0; i < 5; i++) {
        if(curMax < *(ptr + i)) { curMax = *(ptr + i); address = (ptr + i); }
    }
    printf("%d\n", curMax);
    printf("%p", (void*)address);
    return 0;
}