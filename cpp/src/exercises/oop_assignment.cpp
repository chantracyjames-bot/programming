#include <iostream>

class SortNumbers {
    public:
        void quickSort(int arr[], int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high); 
            }
        }

        int partition(int arr[], int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] > pivot) { 
                    i++;
                    std::swap(arr[i], arr[j]);
                }
            }

            std::swap(arr[i + 1], arr[high]);
            return i + 1;
        }
};

class Numbers {
    public:
        static void idk() {
            int sumOf3 = 0;
            int sumOf5 = 0;
            int sumOf3And5 = 0;
            int sumOf3Or5 = 0;
            int sumOfAll = 0;
            for (int i = 0; i <= 200; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sumOfAll += i;
                    sumOf3And5 += i;
                    std::cout << i << " is divisible by 3 and 5\n";
                    continue;
                } else if (i % 3 == 0) {
                    sumOf3 += i;
                    sumOf3Or5 += i;
                    sumOfAll += i;
                    std::cout << i << " is divisible by 3\n";
                    continue;
                } else if (i % 5 == 0) {
                    sumOf5 += i;
                    sumOf3Or5 += i;
                    sumOfAll += i;
                    std::cout << i << " is divisible by 5\n";
                    continue;
                } 
            }
            std::cout << "\n";
            std::cout << "Sum of 3: " << sumOf3 << "\n";
            std::cout << "Sum of 5: " << sumOf5 << "\n";
            std::cout << "Sum of 3 & 5: " << sumOf3And5 << "\n";
            std::cout << "Sum of 3 + 5: " << sumOf3Or5 << "\n";
            std::cout << "Sum of All: " << sumOfAll << "\n";
        }
};


void number_assignment() {
    Numbers::idk();
}

void sort_10() {
    int nums[10];

    std::cout << "Enter 10 random numbers.\n";
    for (int i = 0; i < 10; i++) {
        std::cout << "#" << i + 1 << ": ";
        std::cin >> nums[i];
    }

    SortNumbers *myObj = new SortNumbers;
    myObj->quickSort(nums, 0, 9);

    std::cout << "\nSorted 10 random numbers: ";
    for (int i = 0; i < 10; i++) {
        std::cout << nums[i] << ", ";
    }
    std::cout << (char) 10;
}

int main() {
    number_assignment();
    return 0;
}