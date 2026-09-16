#include <stdio.h>
#include <stdbool.h>

void signed_integers() {
    printf("\n%s\n%s%hd\n%s%i\n%s%ld%s\n%s%lld%s\n",
        "Signed Integers",
        "short int: ", 32767,
        "int:       ", 2147483648,
        "long:      ", 9223372036854775807L, "L",
        "long long: ", 9223372036854775807LL, "LL"
    );
}

void unsigned_integers() {
    printf("\n%s\n%s%u\n%s%lu%s\n%s%llu%s\n",
        "Unsigned Integers",
        "unsigned int      :  ", 4294967295,
        "unsigned long     : ", 18446744073709551615UL, "UL",
        "unsigned long long: ", 18446744073709551615ULL, "ULL"

    );
}

void floating_points() {
    printf("\n%s\n%s%f%s\n%s%f\n%s%Lf%s\n",
        "Floating Points",
        "float      : ", 3.14, "F",
        "double     : ", 3.141592,
        "long double: ", 3.14159265358979323846L, "L"

    );
}

void text_types() {
    printf("\n%s\n%s%c\n%s%s\n",
        "Text Types",
        "char:   ", 'Y',
        "char[]: ", "idkman"
    );
}

void booleans() {
    printf("\n%s\n%s%s\n",
        "Booleans",
        "bool: ", "true"
    );
}

int main() {
    signed_integers();
    unsigned_integers();
    floating_points();
    text_types();
    booleans();
}