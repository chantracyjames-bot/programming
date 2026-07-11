#include <ctime>
#include <iostream>

class Borrowable {
    protected:
        std::string title;
    public:
        virtual ~Borrowable() = default;
        virtual void borrowItem() = 0;
        virtual double calculateOverdueFee(int daysLate) = 0;

        static std::string currTime() {
            time_t time_now = 0;
            std::time(&time_now);
            return std::ctime(&time_now);
        }
};

class Books: public Borrowable {
    public:
        Books(std::string new_entry) {
            title = new_entry;
        }

    void borrowItem() override {
        std::cout << "Success! Book titled \"" << title << "\" has been checked out on: " << currTime();
    }

    double calculateOverdueFee(int daysLate) override {
        return daysLate * 0.5;
    }
};

class DVD: public Borrowable {
    public:
        DVD(std::string new_entry) {
            title = new_entry;
        }

    void borrowItem() override {
        std::cout << "Success! DVD titled \"" << title << "\" has been checked out on: " << currTime();
    }

    double calculateOverdueFee(int daysLate) override {
        return daysLate * 2.0;
    }
};

int main() {
    int key = 1;

    Books bookObj("One More Chance?");
    DVD dvdObj("If My Heart Had Wings: Flight Diary");

    Borrowable* items[] = { &bookObj, &dvdObj };

    while(key == 1) {
        int temp = 0;
        int count = 0;
        std::cout << "--- Welcome to the Library Portal --- \n1. Borrow an Item\n2. Return an Item\nChoose an option: ";
        std::cin >> temp;

        switch (temp) {
            case 1:
                std::cout << "What would you like to borrow? (1 for Book or 2 for DVD)\nInput: ";
                std::cin >> temp;
                items[temp - 1]->borrowItem();
                break;
            case 2:
                std::cout << "Which item are you returning? (1 for Book or 2 for DVD): " << "\n";
                std::cin >> temp;
                std::cout << "How many days late is it?: " << "\n";
                std::cin >> count;
                std::cout << "The overdue fee for the Book is: $" << items[temp - 1]->calculateOverdueFee(count) << "\n";
                break;
            case 3:
                key = 0;
                break;
            default:
                std::cout << "Invalic Option" << "\n";
        }
        std::cout << "-----------------------------------------\n";
    }
    return 0;
}