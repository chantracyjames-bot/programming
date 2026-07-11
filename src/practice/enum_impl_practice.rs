enum Temp {
    World(i32),
    US(i32),
}

impl Temp {
    fn is_cold(&self) -> bool {
        match self {
            Temp::World(temp) => *temp <= 0,
            Temp::US(temp) => *temp <= 32,
        }
    }
}

fn main() {
    let superior: Temp = Temp::World(-10);
    let inferior: Temp = Temp::US(40);
    println!("cold?: {}", superior.is_cold());
    println!("cold?: {}", inferior.is_cold());
}