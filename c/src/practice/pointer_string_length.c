#include <stdio.h>

int stringLength(char *arr) {
    char *end = arr;
    int charCount = 0;
    while(*end != '\0') { end++; }

    while(arr < end) { charCount++; arr++; }
    return charCount;
}

int main() {
    char test[10] = "HelloWord";
    int num = stringLength(test);
    printf("%d", num);
    return 0;
}