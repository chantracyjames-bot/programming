#include <iostream>

std::string calculate_grade(int grade)
{
    std::string output;
    if((grade >= 90) && (grade <= 100))
    {
        output = "A";
    }
    else if((grade <= 89) && (grade >= 80))
    {
        output = "B";
    }
    else if((grade <= 79) && (grade >= 70))
    {
        output = "C";
    }
    else if((grade <= 69) && (grade >= 60))
    {
        output = "D";
    }
    else if((grade < 69) && (grade >= 0))
    {
        output = "F";
    }
    else
    {
        output = "Invalid input!!!";
    }
    return output;
}

int main()
{
    int x;
    std::cout << "Enter your grade here: ";
    std::cin >> x;
    std::string result = calculate_grade(x);
    std::cout << result;
}
