#include <ios>
#include <iostream>
#include <stdbool.h>

class Box {
    private:
        int l, b, h;
    public:
        Box() {
            l = 0, b = 0, h = 0;
        }
        Box(int length, int breadth, int height) {
            l = length, b = breadth, h = height;
        }
        Box(const Box &B) {
            l = B.l, b = B.b, h = B.h;
        }
        int getLength() {
            return l;
        }
        int getBreadth() {
            return b;
        }
        int getHeight() {
            return h;
        }
        long long CalculateVolume() {
            return (long long)l * b * h;
        }
        bool operator<(const Box &B) {
            if(l < B.l) { return true; }
            if((b < B.b) && (l == B.l)) { return true; }
            if((h < B.h) && (b == B.b) && (l == B.l)) { return true; }
            return false;
        }
        friend std::ostream& operator<<(std::ostream& out, const Box& B) {
            out << B.l << " " << B.b << " " << B.h;
            return out;
        }
};

int main() {
    Box b1;
    Box b2(2, 3, 4);
    std::cout << b2.getLength() << std::endl << b2.getBreadth() << std::endl << b2.getHeight() << std::endl << b2.CalculateVolume() << std::endl;
    bool x = (b1 < b2);
    std::cout << std::boolalpha << x << std::endl << b2;
    return 0;
}