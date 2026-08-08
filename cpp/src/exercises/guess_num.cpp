#include <cstdlib>
#include <ctime>
#include <iostream>
#include <limits>

int main() {
    srand(time(nullptr));
    double ran = (rand() % 21) + 1;
    int *num = new int;

    while (*num < 1 || *num > 21) {
        if (std::cin.fail()) {
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            std::cout << "Invalid input! Please enter numbers only.\n";
            continue; 
        }
        std::cout << "tarcy\' stupid rng; pick a number between 1 and 21: ";
        std::cin >> *num;
    }

    if ((int) ran == (*num)) {
        std::cout << "congrats; you picked the correct number, " << *num << '\n';
    } else {
        std::cout << "i dunno man, you chose wrong; the correct num is " << ran << '\n';
    }

    return 0;
}