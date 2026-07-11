#include <iostream>
#include <fstream>

int main() {
    std::fstream idkman("../../main.txt", std::ios::out | std::ios::in);
    std::string test;
    idkman >> test;
    getline(idkman, test);
    std::cout << test;
    return 0;
}