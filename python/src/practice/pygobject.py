import gi
gi.require_version("Gtk", "4.0")
gi.require_version("Adw", "1")
from gi.repository import GLib, Gtk, Adw


class vani_tty1(Adw.Application):
    def __init__(self):
        super().__init__(application_id="com.example.VaniIsGoated")
        GLib.set_application_name("Vani's Goated Application")
        self.counter = 0

    def do_activate(self):
        self.btn = Gtk.Button(label="I'm a counter", vexpand=True,
                               halign=Gtk.Align.CENTER, valign=Gtk.Align.CENTER)
        self.btn.add_css_class("suggested-action")
        self.btn.add_css_class("pill")

        box = Gtk.Box(orientation=Gtk.Orientation.VERTICAL)
        box.append(Adw.HeaderBar())
        box.append(self.btn)

        window = Adw.ApplicationWindow(application=self, title="Hello World", content=box)
        window.present()

        GLib.timeout_add_seconds(1, self.tick)

    def tick(self):
        self.counter += 1
        self.btn.set_label(f"I'm a counter ({self.counter}s)")
        return True
        
app = vani_tty1()
app.run()

# YO Tracy chan, this a libadwaita app using PyGObject, a binding for the C GObject
# , only requiring a few init lines.
# just run `python3 pygobject.py` and voila, make sure you have libadwaita, gtk
# and python-pygobject packages installed
