fn main() {
    let source: String = String::from("telemetry");
    let archive: String = compress_and_move(source);
    println!("{}", archive);
}

fn compress_and_move(mut raw_data: String) -> String {
    raw_data.push_str("-compressed");
    raw_data
}