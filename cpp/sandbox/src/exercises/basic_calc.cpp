// calc stands for calculator btw
#include <iostream>

double calcIsCalculcator(double a, double b, char c);
double addNum(double a, double b);
double subNum(double a, double b);
double mulNum(double a, double b);
double divNum(double a, double b);
bool isOperatorValid(char c);

int main() {
    double *firstNum = new double;
    double *secondNum = new double;
    char *opeeratorChar = new char;
    std::cout << "tarcy\'s stupid calc\n"; 
    std::cout << "\'+\' is add ~! \'-\' is subtract ~! \'x\' is multiply ~! \'/\' is divide\n";
    std::cout << "Enter first num: ";
    std::cin >> *firstNum;
    std::cout << "Enter operation: ";
    std::cin >> *opeeratorChar;
    if (!isOperatorValid(*opeeratorChar)) {
        std::cout << "Invalid Operator.";
        return 1;
    }
    std::cout << "Enter second num: ";
    std::cin >> *secondNum;
    std::cout << "Result is: " << calcIsCalculcator(*firstNum, *secondNum, *opeeratorChar) << "\n";
}

double calcIsCalculcator(double a, double b, char c) {
    switch (c) {
        case '+':
            return addNum(a, b);
            break;
        case '-':
            return subNum(a, b);
            break;
        case '*' :
        case 'x':
            return mulNum(a, b);
            break;
        case '/':
            return divNum(a, b);
            break;
        default:
            std::cout << "Something went wrong";
            break;
    }
    return 0;
}

double addNum(double a, double b) {
    return a + b;
}

double subNum(double a, double b) {
    return a - b;;
}

double mulNum (double a, double b) {
    return a * b;;
}

double divNum (double a, double b) {
    return a / b;;
}

bool isOperatorValid(char c) {
    return c == '+' || c == '-' || c == '*' || c == 'x' || c == '/';
}