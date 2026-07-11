#include <array>
#include <vector>
#include <iostream>
int main() {
    std::array<int, 7> test = {10, 20, 30};
    for(int i = 0; i < test.size(); i++)
    {
        std::cout << "\nNumber: " + std::to_string(test[i]);
    }
}
