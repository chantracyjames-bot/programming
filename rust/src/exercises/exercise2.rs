use std::io::{self, Write};

fn check_triangle_type(a: i32, b: i32, c: i32) -> String {
    let mut output: String = String::new();
    if ((a + b) > c) || ((a + c) > b) || (b + c) > a {
        if (a == b) && (b == c) && (c == a) {
            output = "Equilateral".to_string();
        } else if (a == b) || (b == c) || (c == a) {
            output = "Isosceles".to_string();
        } else {
            output = "Scalene".to_string();
        }
    } else {
        output = "Invalid".to_string();
    } return output;
}

fn main() {
    let mut input: String = String::new();

    print!("Enter x: ");
    io::stdout().flush().unwrap(); 
    io::stdin().read_line(&mut input).expect("number plez");

    let x: i32 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("nan {:?}", input);
            return;
        }
    };

    input.clear();
    print!("Enter y: ");
    io::stdout().flush().unwrap(); 
    io::stdin().read_line(&mut input).expect("number plez");

    let y: i32 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("nan {:?}", input);
            return;
        }
    };

    input.clear();
    print!("Enter z: ");
    io::stdout().flush().unwrap(); 
    io::stdin().read_line(&mut input).expect("number plez");

    let z: i32 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("nan {:?}", input);
            return;
        }
    };

    let result: String = check_triangle_type(x, y, z);
    println!("{}", result);
}