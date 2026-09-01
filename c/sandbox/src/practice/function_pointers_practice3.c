#include <stdio.h>

int isEven(int n) {
    if((n % 2) == 0) {
        return 1;
    }          
    return 0;
   
}

int isPositive(int n) {
    if(n > 0) {
        return 1;
    }
    return 0;
}

void filter(int *numbers, int size, int (*test)(int)) {
    int i = 0;
    while (i < size) {
        if (test(numbers[i])) {
            printf("%d, ", numbers[i]);
        }
        i++;
    }
}

int main() {
    int num[] = {0, 1, -2, -3, 4, 5, 6, -7, 8, 9, 10};
    int numSize = (sizeof(num) / sizeof(num[0]));
    printf("\nEven numbers: ");
    filter(num, numSize, isEven);
    printf("\nPositive numbers: ");
    filter(num, numSize, isPositive);
    return 0;
}