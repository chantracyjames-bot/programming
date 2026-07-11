#include <stdio.h>

void loudPrinter(int n) {
    printf("WOW! THE NUMBER IS: %d\n", n);
}

void quietPrinter(int n) {
    printf("the number is: %d\n", n);
}

void processNumber(void (*printStyle)(int), int n) {
    printStyle(n);
}

int main() {
    printf("Choose your number from 1-10.");
    int choice;
    scanf("%d", &choice);
    processNumber(loudPrinter, choice);
    processNumber(quietPrinter, choice);
    return 0;
}