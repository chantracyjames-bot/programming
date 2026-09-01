#ifndef QUESTION_MARK_H
#define QUESTION_MARK_H

typedef struct {
    char name[10];
} Drink_s;

Drink_s *Drink_Create(const char *name);
void Drink_Drink(Drink_s *drink);

typedef struct {
    Drink_s super;
    char flavor[15];
} Cola_t;

Cola_t * Cola_Create(const char* name, const char *flavor);

typedef struct {
    Drink_s super;
    char flavor[15];
} Pep_t;

Pep_t * Pep_Create(const char* name, const char *flavor);

#endif