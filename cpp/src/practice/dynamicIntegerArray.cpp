#include <iostream>

void arrayResize(int *oldSize, int *&arr) {
    int newCap = *oldSize * 2;
    int *newArr = new int[newCap];
    for(int i = 0; i < *oldSize; i++) { newArr[i] = arr[i]; }
    delete[] arr;
    arr = newArr;
    *oldSize = newCap;
}

int main() {
    int size = 0, cap = 8;
    int *dynaArray = new int[cap];
    int input = 0;
    
    while(true) {
        std::cout << "Enter integer value to add to the array: ";
        
        if (!(std::cin >> input)) {
            continue;
        }
        if(input == -1) {
            break;
        }

        if(size == (cap -1)) {
            std::cout << "Array is almost full, doubling the size.\n";
            arrayResize(&cap, dynaArray);
        }
        dynaArray[size] = input;
        size++;
    } 

    std::cout << "Final Values:";
    for(int i = 0; i < size; i++) { std::cout << dynaArray[i] << " "; }
    delete[] dynaArray;
    return 0;
}