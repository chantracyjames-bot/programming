
#include <iostream>
#include <vector>

class DataStructures {
public:
    virtual ~DataStructures() = default;
    virtual bool isEmpty();
    virtual void pushNew(std::string element);
    virtual std::string popElement();
    virtual std::string peekElement();
    virtual int getSize();
    virtual void traverse();
};

class Stack: public DataStructures {
    private:
        int size;
        std::vector<std::string> store;
    public:
        bool isEmpty() override {
            return size == 0;
        }
        void pushNew(std::string element) override {
            store.push_back(element);
            size += 1;
        }

        std::string popElement() override {
            if (isEmpty()) {
                std::cout << "Stack is empty.\n";
                return "";
            }
            std::string temp = store.back();
            store.pop_back();
            size -= 1;
            return temp;
        }

        std::string peekElement() override {
            if (isEmpty()) {
                std::cout << "Stack is empty.\n";
                return "";
            }
            return store.back();
        }

        int getSize() override {
            return size;
        }

        void traverse() override {
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