fn idkman(level: u32, id: u32) -> Result<Option<String>, String> {
    if level < 5 {
        Err("go away".to_string())
    } else {
        if id == 777 {
            Ok(Some("good, get it".to_string()))
        } else {
            Ok(None)
        }
    }
}

fn main() {
    let array = vec![idkman(3, 777), idkman(7, 999), idkman(9, 777)];
    for i in 0..array.len() {
        match &array[i] {
            Ok(yes) => match yes {
                Some(maybe) => println!("{}", maybe),
                None => println!("idkman"),
            }
            Err(no) => println!("{}", no),
        }
    }

}