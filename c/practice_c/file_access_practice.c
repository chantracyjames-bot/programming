#include <stdio.h>

int main() {
    FILE *idkman;
    idkman = fopen("../../main.txt", "r");
    char test[6];
    fgets(test, 6, idkman);
    fclose(idkman);
    printf("%s", test);
    return 0;
}