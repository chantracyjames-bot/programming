#include <stdio.h>

int main() {
    int n = 0;
    for(int i = 0; i < 10000; i++) {
        printf("%d", i);
    } 
    
    do {
        printf("%d", n);
        n++;
    } while (n < 10000);
    
    while (n < 10000) {
        printf("%d", n);
        n++;
    }
}