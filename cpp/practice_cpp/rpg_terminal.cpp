#include <iostream>

class Character {
    protected:
        std::string name;
        int health;

    public:
        Character(std::string nem_name, int init_health) : name(nem_name), health(init_health) {} // dunnno why but i followed what the compiler said

        std::string getName() {
            return name;
        }

        int getHealth() const { // can you exaplain the const in this?
            return health;
        }

        void takeDamage(int amount) {
            health -= amount;
        }

        virtual void executeAttack(Character &target) = 0;        
        virtual ~Character() = default;
};

class Warrior: public Character {
    public: 
        Warrior(std::string new_name, int init_health) : Character(new_name, init_health) {} // i dunno why either
        void executeAttack(Character &target) override {
            std::cout << "Warrior " << name << " swings a heavy sword!\n";
            target.takeDamage(15);
            std::cout << name << " dealt 15 damage.\n"; 
        }
};

class Mage: public Character {
    public:
        Mage(std::string new_name, int init_health) : Character(new_name, init_health) {} // same thing here
        void executeAttack(Character &target) override {
            std::cout << "Mage " << name << " casts a chaotic fireball!\n";
            target.takeDamage(25);
            std::cout << name << " dealt 25 damage but takes 5 damage as recoil\n";
            health -= 5;
        }
};

int main() {
    Warrior player1("Player 1", 100);
    Mage player2("Player 2", 60);

    Character *players[] = {&player1, &player2};
    char input = 'y';

    while(input == 'y') {
        std::cout << players[0]->getName() << " attacks " << players[1]->getName() << "\n";
        players[0]->executeAttack(*players[1]);

        std::cout << players[1]->getName() << " attacks " << players[0]->getName() << "\n";
        players[1]->executeAttack(*players[0]);

        std::cout << "Round Results\n";
        std::cout << players[0]->getName() << "'s Health: " << players[0]->getHealth() << "\n";
        std::cout << players[1]->getName() << "'s Health: " << players[1]->getHealth() << "\n";
        std::cout << "\nContinue? (y or n): ";
        std::cin >> input;
    }
    return 0;
}