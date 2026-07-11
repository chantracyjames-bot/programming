#include <iostream>
#include <string>

struct Student {
    std::string name;
    int grades[3];
    double average;
    bool hasPassed;
};

void calculateStatus(Student &a) {
    int temp;
    a.average = (a.grades[0] + a.grades[1] + a.grades[2]) / 3;
    a.hasPassed = a.average >= 60.00;
}

int main() {
    Student studentsArray[5] = {
        {"Michael", {91, 96, 87}},
        {"Brian", {93, 46, 63}},
        {"Athena", {77, 84, 87}},
        {"Paula", {64, 96, 70}},
        {"Patricia", {91, 97, 92}}
    };
    for (Student num : studentsArray) {
        calculateStatus(num);
        std::cout << "Name: " << num.name << " (ave: " << std::to_string(num.average) << ") - Evaluation: " << std::boolalpha << num.hasPassed << std::noboolalpha << std::endl;
    }
    return 0;
}