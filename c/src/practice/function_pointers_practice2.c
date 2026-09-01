#include <stdio.h>

void volumeUp(int *v) {
    printf("%d\n", *v);
    *v = *v + 1;
}

void volumeDown(int *v) {
    *v = *v - 1;
}

void volumeMute(int *v) {
    *v = 0;
}



int main() {
    void (*volumeArray[3])(int *) = {volumeUp, volumeDown, volumeMute};
    printf("Which action should be taken?\n0. Volume Up\n1. Volume Down\n2. Mute Volume\nChoice: ");
    int choice;
    scanf("%d", &choice);

    int volume = 10;

    if((choice < 3) && (choice >= 0)) {
        volumeArray[choice](&volume);
    } else {
        printf("Invalid Input!\n");
    }

    printf("New Volume: %d\n", volume);
    return 0;
}