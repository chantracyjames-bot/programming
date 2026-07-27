int main() {
    printf("Choose your number from 1-10.");
    int choice;
    scanf("%d", &choice);
    processNumber(loudPrinter, choice);
    processNumber(quietPrinter, choice);
    return 0;
}