fn get_price(name: &str) -> Option<f64> {
    if name == "Popping-Cola" { return Some(1.99) }
    else if name == "Slow-Noodles" { return Some(0.59) }
    else { None }
}

fn main() {
    let mut money: f64 = 5.0;
    if let Some(price) = get_price("Popping-Cola") {
        if money > price {
            money -= price;
            println!("Purchase Success.");
        } else {
            println!("Not enough money");
        }
    }
    if let Some(price) = get_price("idkman") {
        if money > price {
            money -= price;
            println!("Purchase Success.");
        } else {
            println!("Not enough money");
        }
    } else {
        println!("Not found.");
    }
}