#include <cmath>
#include <iostream>

int floorFunc(double num) {
    return std::floor(num);
}
int ceilFunc(double num) {
    return std::floor(num);
}
int moduloFunc(int num, int mod) {
    return num % mod;
}

int main() {
    while(true) {
        int input;
        double inNum;
        int mod;
        std::printf("%s\n%s\n%s\n%s\n\n%s",
            "The task to perform :",
            "1. Floor Function",
            "2. Ceiling Function",
            "3. Modulo Function",
            "Choose a Mathematical Function: "
        );
        std::cin >> input;

        switch (input) {
            case 1:
                std::cout << "Enter a number: ";
                std::cin >> inNum;
                std::cout << "The floor of " << inNum << " is " << floorFunc(inNum) << ".\n";
                break;
            case 2:
                std::cout << "Enter a number: ";
                std::cin >> inNum;
                std::cout << "The ceiling of " << inNum << " is " << ceilFunc(inNum) << ".\n";
                break;
            case 3:
                std::cout << "Enter a number: ";
                std::cin >> inNum;
                std::cout << "Enter modulo: ";
                std::cin >> mod;
                std::cout << "The modulo of " << (int) inNum << " mod " << mod << " is " << moduloFunc((int)inNum, mod) << ".\n";
                break;
            default:
                std::cout << "Invalid Option.\n";
        }
    }
}