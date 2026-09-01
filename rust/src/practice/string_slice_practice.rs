fn main() {
    let log1 = "[ERROR] Connection reset by peer";
    let log2 = "[INFO] System initialized";

    let msg1 = extract_message(log1);
    let msg2 = extract_message(log2);

    println!("Msg 1: '{}'", msg1);
    println!("Msg 2: '{}'", msg2);
}


fn extract_message(s: &str) -> &str {
    let temp = s.find(']');
    if temp == None {
        return s;
    } 
    let index = temp.unwrap() + 2; // added two since it includes "] "
    &s[index..s.len()]
} 