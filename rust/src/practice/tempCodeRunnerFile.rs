d(self) {
        match &self {
            StuffThatPlaysAudio::NotPlaying => {}
            StuffThatPlaysAudio::ItsPlaying(idkman) => { println!("y'know what? that shi is bad, turn it off.");
                                                         println!("{} is such as flop man.", idkman) }
        }
    }
}