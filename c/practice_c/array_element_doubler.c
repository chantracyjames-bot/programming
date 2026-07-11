#include <stdio.h>

void elementDoubler(int *arr, int size) {
    for(int i = 0; i < size; i++) {
        (*arr) *= 2;
        arr++;
    } 
}

int main() {
    int arrTest[5] = {1, 23, 34, 5, 10};

    elementDoubler(arrTest, 5);
    printf("%d %d %d %d %d", arrTest[0], arrTest[1], arrTest[2], arrTest[3], arrTest[4]);
    return 0;
}