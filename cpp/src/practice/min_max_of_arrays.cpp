#include <iostream>

void findExtremes(int arr[], int &min, int &max, int size) {
    for(int i = 0; i < size; i++) {
        if(min > arr[i]) { min = arr[i]; }
        if(max < arr[i]) { max = arr[i]; }
    }
}

int main() {
    int testArray[6] = {100, 293, 43, 192, 2, 38};
    int maxVal = testArray[0];
    int minVal = testArray[0];
    findExtremes(testArray, minVal, maxVal, 6);
    std::cout << minVal << " " << maxVal;
    return 0;
}