#include <iostream>

class IntVector {
    private:
        int *data;
        int capacity;
        int size;
    public:
    IntVector() : capacity(2), size(0) {
        data = new int[capacity];
    }

    IntVector(const IntVector &yes) {
        data = new int[capacity];
        *data = *(yes.data);
    }

    void push_back(int value) {
        if(!(size == capacity)) {
            data[size] = value;
        }
        else {
            std::cout << "Dynamic array is full! Reallocating and doubling size.";
            capacity *= 2;
            int *temp = new int[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
            delete[] data;
            data = temp;
            std::cout << "Array size has been doubled! Appending new value.";
            data[size] = value;
        }
    }

    int operator[](int index) {
        if (index >= size) {
            std::cout << "Index out of bounds!";
        }
        return data[index];
    }

    int getValueAt(int index) {
        if (index >= size) {
            std::cout << "Index out of bounds!";
        }
        return data[index];
    }

    ~IntVector() {
        delete[] data;
        std::cout << "Freed up memory.";
    }
};

std::ostream& operator<<(std::ostream& os, IntVector& arr) {
    os << arr;
    return os; // Return the stream to allow chaining
}

int main() {
    IntVector *maybe = new IntVector();

    maybe[1].push_back(10);
    std::cout << maybe[1];
}