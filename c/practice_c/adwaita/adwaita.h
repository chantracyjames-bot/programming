#ifndef ADWAITA_H
#define ADWAITA_H

#include <adwaita.h>

typedef struct {
    GtkWidget *btn;
    GtkWidget *win;
    int counter;
} AppData;

void activate(GtkApplication *app, gpointer user_data);

#endif
// wassup again, this is a header file. you can use this to store
// declarations of functions, macros, data types, and constants.
