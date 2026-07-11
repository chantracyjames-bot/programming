

fn main() {
    let mut my_string: String = String::from("Idle");
    println!("{my_string}");
    activate_system(&mut my_string);
    println!("{my_string}");

}

fn activate_system(string: &mut String) {
    string.clear();
    string.push_str("Active");
}