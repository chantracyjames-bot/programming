#include <stdio.h>

void main_screen(void);
void user_choice(int input);
void add_product(void);

int main() {
    int user_input;
    main_screen();
    printf("Enter your choice (1-6): ");
    scanf("%d", &user_input);
    user_choice(user_input);
} 

void main_screen() {
    printf("Inventory Management System\n"); 
    printf("1. Add Product\n");
    printf("2. Update Product\n");
    printf("3. Remove Product\n");
    printf("4. Display Product\n");
    printf("5. Display All\n");
    printf("6. Exit\n");
}

void user_choice(int input) {
    if(input == 1) { add_product(); }
}

void add_product() {
    FILE *inv = fopen("inventory_in_c.txt", "r");
    
    int tempID;
    printf("Enter Product ID: ");
    scanf("%d", &tempID);
    
    printf("test lang");

    fclose(inv);
}

