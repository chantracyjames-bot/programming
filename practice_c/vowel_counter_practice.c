#include <stdio.h>

int vowelCount(char *str) {
    int curCount = 0;
    while(*str != '\0') {
        if(*str == 'a') {
            curCount++;
        }
        else if(*str == 'e') {
            curCount++;
        }
        else if(*str == 'i') {
            curCount++;
        }
        else if(*str == 'o') {
            curCount++;
        }
        else if(*str == 'u') {
            curCount++;
        }
        str++;
    }
    return curCount;
}

int main() {
    char test[15] = "HelloWorld";
    char *ptr = test;
    int num = vowelCount(ptr);
    printf("%d", num);
    return 0;
}