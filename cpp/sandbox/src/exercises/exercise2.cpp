#include <iostream>
#include <string>

std::string check_triangle_type(int a, int b, int c)
{
    std::string output;
    if (((a + b) > c) || ((a + c) > b) || (b + c) > a)
    {
        if ((a == b) && (b == c) && (c == a))
        {
            output = "Equilateral";
        }
        else if ((a == b) || (b == c) || (c == a))
        {
            output = "Isosceles";
        }
        else {
        {
            output = "Scalene";
        }
        }
    }
    else
    {
        output = "Invalid";
    }
    return output;
}

int main() {
    int x, y, z;
    std::cout << "Enter traingle side lengths.";
    std::cout << "x: ";
    std::cin >> x;
    std::cout << "y: ";
    std::cin >> y;
    std::cout << "z: ";
    std::cin >> z;
    std::string result = check_triangle_type(x, y, z);
    std::cout << "Triangle is " << result;
}
