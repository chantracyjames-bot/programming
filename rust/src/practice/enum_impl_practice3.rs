enum Lumbago {
    Yes(u64),
    No(u32),
    Maybe,
}

impl Lumbago {
    fn will_you_marry_me(count: u64) -> Self {
        Lumbago::Yes(count)
    }

    fn why(&self) {
        match self {
            Lumbago::Yes(yes) => println!("idkman, seems a bit <insert risk here>"),
            Lumbago::No(no) => println!("idkman, seems a bit <insert risk here>"),
            Lumbago::Maybe => println!("idkman, seems a bit bad"),
        }
    }
}

fn main() {
    let probs = Lumbago::will_you_marry_me(100);
    probs.why();
    let yippee = Lumbago::No(10);
    yippee.why();
    let lel = Lumbago::Maybe;
    lel.why();
}