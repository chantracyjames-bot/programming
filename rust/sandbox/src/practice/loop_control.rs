fn main() {
    let mut counter: u32 = 1;
    let result: u32 = 'loop_stuff: loop {
        counter *= 3;
        if counter > 1000 {
            break 'loop_stuff counter
        }
    };
    println!("Result: {}", result);
}