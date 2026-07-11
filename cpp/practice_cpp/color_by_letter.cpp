#include <iostream>

int main() {
    char x;
    std::cout << "Enter basic color initial: ";
    std::cin >> x;
    if(x == 'B') {
        std::cout << "Blue";
    }
    else if((x == 'Y') || (x == 'y')) {
        std::cout << "Yellow";
    }
    else if((x == 'G') || (x == 'g')) {
        std::cout << "Green";
    }
    else if((x == 'R') || (x == 'r')) {
        std::cout << "Red";
    }
    else if((x == 'C') || (x == 'c')) {
        std::cout << "Cyan";
    }
    else {
        std::cout << "Invalid input bruh";
    }
    std::cout << "\n";
}
