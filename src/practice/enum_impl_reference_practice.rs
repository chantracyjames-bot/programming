enum StuffThatPlaysAudio {
    NotPlaying,
    ItsPlaying(String),
}

impl StuffThatPlaysAudio {
    fn launch() -> Self {
        StuffThatPlaysAudio::NotPlaying
    }

    fn play_stuff(&mut self, track: String) {
        *self = StuffThatPlaysAudio::ItsPlaying(track);
    }

    fn that_shi_gas(&self) -> String {
        match self {
            StuffThatPlaysAudio::NotPlaying => String::from("nothing is playing, jit trippin"),
            StuffThatPlaysAudio::ItsPlaying(gas) => gas.clone(), 
        }
    }

    fn that_shi_bad(self) {
        match &self {
            StuffThatPlaysAudio::NotPlaying => {}
            StuffThatPlaysAudio::ItsPlaying(idkman) => { println!("y'know what? that shi is bad, turn it off.");
                                                         println!("{} is such as flop man.", idkman) }
        }
    }
}

fn main() {
    let mut track1 = StuffThatPlaysAudio::launch();
    println!("{}", track1.that_shi_gas());
    track1.play_stuff("The Bottom 2".to_string());
    println!("{}", track1.that_shi_gas());
    let mut track2 = StuffThatPlaysAudio::launch();
    track2.play_stuff("CGI is good".to_string());
    track2.that_shi_bad();
}