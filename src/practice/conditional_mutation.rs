fn main() {
    let mut my_user: String = String::from("root");
    enforce_security(&mut my_user);
}

fn enforce_security(string: &mut String) {
    if string == "root" {
        string.clear();
        string.push_str("SUPERUSER");
        println!("Welcome SUPERUSER");
    } else {
        println!("Not enough privileges!");
    }
}