enum State {
    Off,
    On(u8),
}

impl State {
    fn create() -> Self {
        State::Off
    }

    fn turn_on(&mut self, n: u8) {
        *self = State::On(n)
    }

    fn print_status(&self) {
        match self {
            State::Off => println!("is the light on?"),
            State::On(n) => println!("i think the light is at {} brightness.", n),
        }
    }

    fn dim_light(&mut self) {
        *self = match self {
            State::Off => State::Off,
            State::On(n) => if *n > 20 { State::On(*n - 20) } else { State::Off },
        }
    }
}

fn main() {
    let mut light1 = State::create();
    light1.print_status();
    light1.turn_on(20);
    light1.print_status();
    let mut light2 = State::create();
    light2.turn_on(21);
    light2.print_status();
    light2.dim_light();
    light2.print_status();
}