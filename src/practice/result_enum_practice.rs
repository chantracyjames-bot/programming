fn check_pressure(pressure: i32) -> Result<String, String> {
    if pressure < 300 {
        Err("Low pressure. pump more.".to_string())
    } else if pressure > 800 {
        Err("High pressure. pump less.".to_string())
    } else {
        Ok("Good pressure. pump ok".to_string())
    }
}

fn main() {
    match check_pressure(550) {
        Ok(yes) => println!("{}", yes),
        Err(no) => println!("{}", no),
    }

    match check_pressure(950) {
        Ok(yes) => println!("{}", yes),
        Err(no) => println!("{}", no),
    }
}