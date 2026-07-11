#include <iostream>
#include <sstream>
#include <vector>

std::vector<int> parseInts(std::string str) {
	// Complete this function
    std::stringstream ss(str);
    char myChar;
    int x, y, z;
    ss >> x >> myChar >> y >> myChar >> z;
    return std::vector<int> {x, y, z};
}

int main() {
    std::string str;
    std::cin >> str;
    std::vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        std::cout << integers[i] << "\n";
    }
    
    return 0;
}