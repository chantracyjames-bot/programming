use std::io::{self, Write};
use std::collections::HashMap;
use std::sync::LazyLock;

// hashmaps for pattern matching
static FOOD_MAP: LazyLock<HashMap<String, &str>> = LazyLock::new(|| {
    let mut temp: HashMap<String, &str> = HashMap::new();
    temp.insert("1".to_string(), "Burger");
    temp.insert("2".to_string(), "Pizza");
    temp.insert("3".to_string(), "Fried Chicken");
    temp.insert("4".to_string(), "French Fries");
    temp.insert("5".to_string(), "Soft Drink");
    temp
});

static PRICE_MAP: LazyLock<HashMap<&str, f64>> = LazyLock::new(|| {
    let mut temp: HashMap<&str, f64> = HashMap::new();
    temp.insert("Burger", 50.00);
    temp.insert("Pizza", 120.00);
    temp.insert("Fried Chicken", 90.00);
    temp.insert("French Fries", 60.00);
    temp.insert("Soft Drink", 40.00);
    temp
});

// prints the main menu
fn display_price_menu() {
    println!("\n{}\n{:^32}\n{}\n{}\n{}\n{}\n{}\n{}\n{}\n", 
        "================================",
        "FOOD ORDERING MENU",
        "================================",
        "1. Burger          PHP 50.00",
        "2. Pizza           PHP 120.00",
        "3. Fried Chicken   PHP 90.00",
        "4. French Fries    PHP 60.00",
        "5. Soft Drink      PHP 40.00",
        "================================"
    );
}

// prints the summary header
fn display_summary_header() {
    println!("\n{}\n{:^32}\n{}", 
        "================================",
        "ORDER SUMMARY",
        "================================",
    );
}

// prints the summary footer
fn display_summary_footer() {
    println!("{}\n{:^32}\n{}", 
        "================================",
        "THANK YOU FOR ORDERING!",
        "================================",
    );
}

// retrives the produce through a loop
fn get_product() -> String {
    // initializes local variable
    let mut inp: String = String::new();
    let opt: String;

    // loops until a certain condition is met
    'pro: loop {
        // calls the main menu function
        display_price_menu();

        // gathers user input
        inp.clear();
        print!("Enter product number: ");
        io::stdout().flush().unwrap(); 
        io::stdin().read_line(&mut inp).expect("huh?");
        inp = inp.trim().to_string();

        // breaks the loop if the input matches the options
        if let Some(food) = FOOD_MAP.get(&inp) { 
            opt = food.to_string();
            break 'pro
        } else { 
            // if the input was invalid
            println!("Invalid input. Try again.");        
        };
    }
    // prints the selected option and returns
    println!("You selected: {}\n", opt);
    opt
}

// retrives the quantity of the product to purchase
fn get_quantity() -> i32 {
    // initializes local variables
    let mut inp: String = String::new();
    let qua: i32;

    'number: loop {
        // gathers user input
        inp.clear();
        print!("Enter quantity: ");
        io::stdout().flush().unwrap(); 
        io::stdin().read_line(&mut inp).expect("huh?");

        // trims the pattern matches the input
        match inp.trim().parse::<i32>() {
            // if the parsing was successful
            Ok(num) => {
                // compares of the input is valid
                if num < 1 {
                    println!("Invalid input! Quantity must be a positive integer.\n")   
                } else {
                    // runs if the value is valid, an integer greater than 1
                    qua = num;
                    break 'number
                }
            }
            // if the parsing is unsuccessfui, or the input was not an integer
            Err(_) => { println!("Invalid input! Quantity must be a positive integer.\n"); },
        }
    }
    // returns the quantity
    qua
}

// retrieves the price of the product
fn get_current_price(opt: &str, qua: i32) -> f64 {
    // checks if the option is inside the hashmap
    if let Some(price) = PRICE_MAP.get(opt) { 
        price * qua as f64 
    } 
    else { 
        // runs if there is an error
        println!("Error! Something went wrong");
        -999.00 
    }
    // returns the corresponding values
}

// retrives if the program still loops in the main menu
fn repeat_yes_no() -> String {
    // initializes a local variable
    let mut inp: String = String::new();
    // loops through until a certain condition is met
    'choice: loop {
        // gathers user input
        inp.clear();
        print!("Do you want to order again? (Y/N): ");
        io::stdout().flush().unwrap(); 
        io::stdin().read_line(&mut inp).expect("huh?");
        inp = inp.trim().to_string();

        // pattern matches the user input
        match inp.to_uppercase().as_str() {
            "Y" => break 'choice String::new(),
            "N" => return "y".to_string(),
            _ => println!("Invalid input! Try again.")
        }
    }
    // returns the corresponding values
}

// retrieves the anount to be payed
fn get_payment(tot: f64) -> f64 {
    // initializes local variables
    let mut inp: String = String::new();
    let pay: f64;
    // loops through until a certain condition is met
    'payment: loop {
        // gathers user input
        inp.clear();
        print!("Enter payment: PHP ");
        io::stdout().flush().unwrap(); 
        io::stdin().read_line(&mut inp).expect("huh?");
        
        // trims the input of any whitespace and pattern matches the parsed value
        match inp.trim().parse::<f64>() {
            // if the parsing was successfull
            Ok(num) => {
                // an error message if the input is less than 0
                if num < 0 as f64 {
                    println!("Invalid Input! Enter a floating point greater than 0.\n");
                    continue
                } else if num < tot {
                    // if the total is grater than the payment
                    println!("Insufficient payment! Please enter PHP {} or higher.\n", tot);
                } else {
                    // breaks the loop if the condition is met
                    pay = num;
                    break 'payment
                }
            },
            // if the parsing is unsuccessful, or the input is not a floating point
            Err(_) => println!("Invalid input! Must be an floating point.\n"),
        }
    }
    // returns the corresponding values
    pay
}

fn print_summary(tot: f64) -> () {
    // initializes a local variable
    let pay: f64;
        
    // prints the summary screen
    display_summary_header();
    println!("TOTAL AMOUNT: {:.2}\n", tot);

    pay = get_payment(tot);

    println!("\nPayment: {:.2}", pay);
    println!("Change: {:.2}", pay - tot);

    display_summary_footer();
}

fn main() {
    // initializes variables
    let mut option: String;
    let mut quantity: i32;
    let mut total: f64 = 0.00;
    
    // loops the main meny
    'program: loop {
        option = get_product();
        quantity = get_quantity();

        total += get_current_price(&option, quantity);
        println!("\nSubtotal: PHP {:.2}", get_current_price(&option, quantity));
        println!("Current Total: PHP {:.2}\n", total);
        
        if repeat_yes_no() == "y" { break 'program }
    }

    // prints the summary
    print_summary(total);
}