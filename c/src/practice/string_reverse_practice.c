#include <stdio.h>

void reverseString(char *str) {
    char *begin = str;
    char *end = str;
    while(*end != '\0') { end++; }
    end--;
    while(begin < end) {
        char temp = *begin;
        *begin = *end;
        *end = temp;
        begin++;
        end--;
    }
} 

int main() {
    char myText[21];
    scanf("%20s", myText);
    reverseString(myText);
    printf("%s", myText);
}