fn main() {
    let report: String = String::from("advanced systems analysis");
    println!("The system analyzed: {} a's", analyze_repetition(&report));
}

fn analyze_repetition(string: &String) -> usize {
    let mut count: usize = 0;
    for i in string.chars() {
        if i == 'a' {
            count += 1;
        }
    }
    count
}