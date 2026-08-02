#include <iostream>

class Yes {
    public: 
        static void maybe(std::string yes) {
            std::cout << yes << "\n";
        }
};

int main() {
    Yes::maybe("maybe");
    Yes test;
    test.maybe("idkman");
    return 0;
}