
#include <iostream>
#include <vector>
class Stack {
    private:
        int size = 0;
        std::vector<std::string> store;
    public:
        bool isEmpty() const {
            return size == 0;
        }
        void pushNew(std::string element) {
            store.push_back(element);
            size += 1;
        }

        std::string popElement() {
            if (isEmpty()) {
                std::cout << "Stack is empty.\n";
                return "";
            }
            std::string temp = store.back();
            store.pop_back();
            size -= 1;
            return temp;
        }

        std::string peekElement() {
            if (isEmpty()) {
                std::cout << "Stack is empty.\n";
                return "";
            }
            return store.back();
        }

        int getSize() const {
            return size;
        }

        void traverse() {
            std::vector<std::string> current = store;
            for(int i = 0; i < size; i++) {
                std::cout << current.at(i) << " ";
            }
        }
};

int main() {
    Stack stack;
    std::cout << stack.getSize() << "\n";
    stack.pushNew("yes");
    stack.pushNew("no");
    stack.pushNew("maybe");
    stack.traverse();
    std::cout << stack.popElement() << "\n";
}