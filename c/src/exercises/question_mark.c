#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "question_mark.h"

Drink_s *Drink_Create(const char *name) {
    Drink_s *new = (Drink_s*) malloc(sizeof(Drink_s));
    strncpy(new->name, name, sizeof(new->name));
    return new;
}

void Drink_Drink(Drink_s *drink) {
    printf("Drinking %s", drink->name);
}

Cola_t * Cola_Create(const char* name, const char *flavor) {
    Cola_t *new = (Cola_t*) malloc(sizeof(Cola_t));
    strncpy(new->super.name, name, sizeof(new->super.name));
    strncpy(new->flavor, flavor, sizeof(new->flavor));
    return new;
}
Pep_t * Pep_Create(const char* name, const char *flavor) {
    Pep_t *new = (Pep_t*) malloc(sizeof(Pep_t));
    strncpy(new->super.name, name, sizeof(new->super.name));
    strncpy(new->flavor, flavor, sizeof(new->flavor));
    return new;
}
