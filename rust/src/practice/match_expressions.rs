fn main() {
    for n in 1..=20 {
        fixx_buzz_lookaline(n);
    }
}

fn fixx_buzz_lookaline(i: i32) {
    match (i % 3, i % 5) {
        (0, 0) => println!("FizzBuzz"),
        (0, _) => println!("Fizz"),
        (_, 0) => println!("Buzz"),
        _ => println!("idkman"),
    }
}