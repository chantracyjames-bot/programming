fn main() {
    println!("The price for a 20 y.o. is: {}", get_ticket_price(20));
}

fn get_ticket_price(age: i32) -> i32 {
    if age < 18{
        10
    } else if age >= 65 {
        15
    } else {
        25
    }
}