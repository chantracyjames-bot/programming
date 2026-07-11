fn main() {
    let mut packet = String::from("ERR_AUTH_FAILED: drop connection immediately");

    let header = &packet; 
    println!("Historical log check: {}", header);
    
    if header.contains("ERR_AUTH") {
        println!("Alert triggered by header: {}", header);
        packet.clear(); 
        packet.push_str("CLEANED");
    }

    println!("Final packet state: {}", packet);
}
