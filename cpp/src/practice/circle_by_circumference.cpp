#include <iostream>

int main() {
    double x;
    std::cout << "Enter circle radius: ";
    std::cin >> x;
    double result = 2 * 3.1415 * x;
    std::cout << "The circumference is " << result;
}
