#include <iostream>
#include <limits>
#include <cstdio>


void print_menu() {
    std::cout << "\n";
    std::cout << "What type of array to calculate?:" << "\n";
    std::cout << "1. Two-Dimensional Arrays" << "\n";
    std::cout << "2. Three-Dimensional Arrays" << "\n";
    std::cout << "3. Exit Program" << "\n";
    std::cout << "Input: ";
}


int get_int_input() {
    int userInput;

    while (!(std::cin >> userInput)) {
        std::cout << "Invalid input! Please enter an integer" << "\n";
        std::cout << "\n" << "Input:";
        
        std::cin.clear();
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); 
    }
    return userInput;
}


void calculate_2d() {
    std::cout << "\n" << "Enter details";
    std::cout << "\n" << "Base address: ";
    int base = get_int_input();

    std::cout << "Data type size: ";
    int size = get_int_input();

    std::cout << "Value of i: ";
    int i = get_int_input();

    std::cout << "Value of j: ";
    int j = get_int_input();

    std::cout << "Upperbound 2: ";
    int ub2 = get_int_input();

    int result = base + size * (i * ub2 + j);
    std::printf("A[%d][%d] = %d\n", i, j, result);
}


void calculate_3d() {
    std::cout << "\n" << "Enter details";
    std::cout << "\n" << "Base address: ";
    int base = get_int_input();

    std::cout << "Data type size: ";
    int size = get_int_input();

    std::cout << "Value of i: ";
    int i = get_int_input();

    std::cout << "Value of j: ";
    int j = get_int_input();

    std::cout << "Value of k: ";
    int k = get_int_input();

    std::cout << "Upperbound 2: ";
    int ub2 = get_int_input();

    std::cout << "Upperbound 3: ";
    int ub3 = get_int_input();

    int result = base + size * ((i * ub2 * ub3) + (j * ub3) + k);
    std::printf("A[%d][%d][%d] = %d\n", i, j, k, result);
}


void driver_main() {
    bool isRunning = true;
    int userChoice;

    while (isRunning) {
        print_menu();
        userChoice = get_int_input();

        switch (userChoice) {
            case 1:
                calculate_2d();
                break;
            case 2:
                calculate_3d();
                break;
            case 3:
                std::cout << "Goodbye!!!" << "\n";
                isRunning = false;
                break;
            default:
                std::cout << "\n" << "Invalid input! Try again.";
                break;
        }
    }
}


int main() {
    
    int yes = 1;
    std::cout << &yes << "\n";

    return 0;
}

