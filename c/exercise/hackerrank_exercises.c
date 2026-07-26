#include <stdio.h>

int sum_of_two(int a, int b) {
    return a + b;
}

int array_sum(const int *p_arr, int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += p_arr[i];
    }
    return sum;
}

void compare_triplets(int *result, const int *p_a, const int* p_b, int size) {
    for(int i = 0; i < size; i++) {
        if (p_a[i] > p_b[i]) {
            result[0] += 1;
        } else if (p_a[i] < p_b[i]) {
            result[1] += 1;
        } 
    }
}

int a_very_big_sum(const int *arr, int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    return sum;
}

int main() {
    int size = 3;
    int a[] = {65536, 32767, 16384};
    printf("%d", a_very_big_sum(a, size));
}