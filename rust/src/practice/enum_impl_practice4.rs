enum YouOkay {
    Yes(u32),
    No,
}

struct OkayYou {
    hmm: String,
    okay_check: YouOkay,
}

impl OkayYou {
    fn put_the_fries_in_the_bag(&mut self, sure: u32) {
        self.okay_check = match self.okay_check {
            YouOkay::Yes(num) => YouOkay::Yes(num + sure),
            YouOkay::No => YouOkay::Yes(sure),
        }
    }

    fn ice_cream_machine_broken_status(&self) -> Option<u32> {
        match self.okay_check {
            YouOkay::Yes(no) => Some(no),
            YouOkay::No => None,
        }
    }
}

fn main() {
    let mut maybe = OkayYou { hmm: "smth".to_string(), okay_check: YouOkay::Yes(100) };
    maybe.put_the_fries_in_the_bag(10);
    if let Some(lumbago) = maybe.ice_cream_machine_broken_status() { println!("{}", lumbago) }

    let probs = OkayYou { hmm: "idkman".to_string(), okay_check: YouOkay::No };
    probs.ice_cream_machine_broken_status();
    if let Some(lumbago) = probs.ice_cream_machine_broken_status() { println!("{}", lumbago) }    
}