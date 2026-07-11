use std::collections::HashMap;

fn main() {
    let mut guild: HashMap<String, i32> = HashMap::new();
    guild.insert(String::from("Gimli"), 150);
    guild.insert(String::from("Legolas"), 300);
    guild.insert(String::from("Frodo"), 50);

    *guild.entry("Aragorn".to_string()).or_insert(100) += 50;

    if let Some(maybe) = guild.get_mut("Legolas") {
        *maybe -= 50;
    }

        if let Some(maybe) = guild.get_mut("Sauron") {
        *maybe += 50;
    }

    if let Some(frodo_gold) = guild.remove("Frodo") {
        println!("Frodo has been slain. {} gold has been lost", {frodo_gold});
    }
    
    guild.retain(|_yes, no| *no >= 100);
    
    println!("{:?}", guild);
}