fn main() {
    let telemetry = vec![
        (101, 45),
        (102, -999),
        (103, 12),
        (104, -999),
    ];

    let bad_sensors = filter_corrupted(&telemetry);
    
    // Should print: [102, 104]
    println!("Malfunctioning sensors: {:?}", bad_sensors);
}


fn filter_corrupted(vect: &[(i32, i32)]) -> Vec<i32> {
    let mut temp: Vec<i32> = vec![];
    for i in 0..vect.len() {
        match vect[i] {
            (_, -999) => temp.push(vect[i].0),
            _ => continue
        };
    }
    temp
}