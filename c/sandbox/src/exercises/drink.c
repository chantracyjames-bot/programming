#include "question_mark.h"

int main() {
    Cola_t *cola = Cola_Create("Coca-Cola", "Original");
    Pep_t *pep = Pep_Create("Pepsi", "Zero Sugar Lime");

    Drink_Drink((Drink_s*)cola);
    Drink_Drink((Drink_s*)pep);
}