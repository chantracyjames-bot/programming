#include "adwaita.h"

static gboolean tick(gpointer user_data) {
    AppData *data = user_data;
    data->counter++;

    char text[64];
    g_snprintf(text, sizeof(text), "Hello, World! (%ds)", data->counter);
    gtk_button_set_label(GTK_BUTTON(data->btn), text);

    return G_SOURCE_CONTINUE;
}

static void on_clicked(GtkButton *btn, gpointer user_data) {
    AppData *data = user_data;
    gtk_window_close(GTK_WINDOW(data->win));
}

void activate(GtkApplication *app, gpointer user_data) {
    AppData *data = user_data;

    data->btn = gtk_button_new_with_label("Hello, World!");
    gtk_widget_set_vexpand(data->btn, TRUE);
    gtk_widget_set_halign(data->btn, GTK_ALIGN_CENTER);
    gtk_widget_set_valign(data->btn, GTK_ALIGN_CENTER);
    gtk_widget_add_css_class(data->btn, "suggested-action");
    gtk_widget_add_css_class(data->btn, "pill");
    g_signal_connect(data->btn, "clicked", G_CALLBACK(on_clicked), data);

    GtkWidget *box = gtk_box_new(GTK_ORIENTATION_VERTICAL, 0);
    gtk_box_append(GTK_BOX(box), adw_header_bar_new());
    gtk_box_append(GTK_BOX(box), data->btn);

    data->win = adw_application_window_new(GTK_APPLICATION(app));
    gtk_window_set_default_size(GTK_WINDOW(data->win), 300, 200);
    adw_application_window_set_content(ADW_APPLICATION_WINDOW(data->win), box);
    gtk_window_present(GTK_WINDOW(data->win));

    g_timeout_add_seconds(1, tick, data);
}
