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
    private:
        static bool isDivisibleByThree(int num) {
            return num % 3 == 0;
        }

        static bool isDivisibleByFive(int num)  {
            return num % 5 == 0;
        }
    public:
        static int idk() {
            int sum = 0;
            for (int i = 0; i <= 200; i++) {
                sum += i;
                if (Numbers::isDivisibleByThree(i) && Numbers::isDivisibleByFive(i)) {
                    std::cout << i << " is divisible by 3 and 5\n";
                    continue;
                } else if (Numbers::isDivisibleByThree(i)) {
                    std::cout << i << " is divisible by 3\n";
                    continue;
                } else if (Numbers::isDivisibleByFive(i)) {
                    std::cout << i << " is divisible by 5\n";
                    continue;
                } else {
                    std::cout << i << "\n";
                    continue;
                }
            }
            return sum;
        }
};

int main() {
    int nums[10];

    std::cout << "Enter 10 random numbers.\n";
    for (int i = 0; i < 10; i++) {
        std::cout << "#" << i + 1 << ": ";
        std::cin >> nums[i];
    }

    SortNumbers *myObj = new SortNumbers;
    myObj->quickSort(nums, 0, 9);
    int result = Numbers::idk();

    std::cout << "The sum of 0 to 200 is: " << result;
    std::cout << "\nSorted 10 random numbers: ";
    for (int i = 0; i < 10; i++) {
        std::cout << nums[i] << ", ";
    }
    std::cout << (char) 10;
}