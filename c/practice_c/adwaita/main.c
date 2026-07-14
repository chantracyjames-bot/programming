// this is the same application that is present in pygobject.py
// but written entirely in C.
//
// you can compile this using:
// gcc $(pkg-config --cflags libadwaita-1) -o myapp main.c adwaita.c $(pkg-config --libs libadwaita-1)
//
// or if you prefer clang:
// clang $(pkg-config --cflags libadwaita-1) -o myapp main.c adwaita.c $(pkg-config --libs libadwaita-1)

#include "adwaita.h"

int main(int argc, char *argv[]) {
    AppData data = {0};
    AdwApplication *app = adw_application_new("com.example.AdwaitaApplication", G_APPLICATION_DEFAULT_FLAGS);
    g_signal_connect(app, "activate", G_CALLBACK(activate), &data);

    int status = g_application_run(G_APPLICATION(app), argc, argv);
    g_object_unref(app);
    return status;
}
