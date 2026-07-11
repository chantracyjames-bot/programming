#include <stdio.h>
#include <stdbool.h>

int isPalindrome(char *arr) {
    char *end = arr;
    while(*end != '\0') { end++; }
    end--;
    int isTrue = 1;

    while(arr < end) {
        if(*end != *arr) { return 0; }
        isTrue = 1;
        end--;
        arr++;
    }
    return 1;
}

int main() {
    char test[10] = "ili";
    int res = isPalindrome(test);
    printf("%d\n", res);
    return 0;
}