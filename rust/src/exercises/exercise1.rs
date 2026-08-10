use std::io::{self, Write};

fn authorize_transaction(balance: f64, amount: f64) -> (String, bool) {
    let mut output: String = String::new();
    let result: bool;

    if amount <= 0.0 {
        output = "Error: Invalid Transaction Amount.".to_string();
        result = false;
    } else if (amount > balance) || (balance < 100.0) {
        output = "Transaction Declined: Insufficient Funds or Low Balance Fee.".to_string();
        result = false;
    } else {
        output = "Transaction Approved.".to_string();
        result = true;
    } (output, result)
}

fn main() {
    let mut input: String = String::new();

    print!("Enter Balance: ");
    io::stdout().flush().unwrap(); 
    io::stdin().read_line(&mut input).expect("number plez");

    let bal: f64 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("nan {:?}", input);
            return;
        }
    };

    input.clear();
    print!("Enter Amount: ");
    io::stdout().flush().unwrap(); 
    io::stdin().read_line(&mut input).expect("number plez");

    let amo: f64 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("nan {:?}", input);
            return;
        }
    };

    let result: (String, bool) = authorize_transaction(bal, amo);
    println!("{}", result.0);
}