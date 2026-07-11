#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

void reallocateMem(int **arr, int *oldSize) {
    int newSize = *oldSize * 2;
    int *temp;
    temp = realloc(*arr, newSize * sizeof(int));
    if(temp == NULL) { printf("Out of Memory Error"); exit(1); } 
    *arr = temp;
    *oldSize = newSize;
}

int main() {
    int *myArray = NULL;
    int cap = 2;
    int size = 0;
    myArray = malloc(cap * sizeof(int));
    if(myArray == NULL) { printf("Out of Memory Error"); return 1; }

    while(true) {
        int temp;
        printf("Enter new int: ");
        scanf("%d", &temp);
        if(temp == -1) { break; }
        if(size == cap) {
            printf("Array size is close to full, reallocating...\n");
            reallocateMem(&myArray, &cap);
            printf("Array size has been doubled, continuing...");
        }
        myArray[size] = temp;
        size++;
    }
    printf("\nStored elements: ");
    for(int i = 0; i < size; i++) {
        printf("%d ", myArray[i]);
    }
    free(myArray);
    return 0;
}