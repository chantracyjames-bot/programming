struct Hero {
    name: String,
    level: u32,
    xp: u32,
}

impl Hero {
    fn new(name: &str) -> Self {
        Self {
            name: name.to_string(),
            level: 1,
            xp: 0,
        }
    }

    fn gain_xp(&mut self, amount: u32) {
        self.xp += amount;
        if self.xp >= 100 {
            self.level += 1;
            self.xp -= 100;
            println!("{} has leveled up to level {}!", self.name, self.level);
        }
    }

    fn print_stats(&self) {
        println!("Hero: {}\nLevel: {} at {}/100 xp", self.name, self.level, self.xp);
    }
}

fn main() {
    let mut hero = Hero::new("Arthur");
    hero.print_stats();
    hero.gain_xp(40);
    Hero::gain_xp(&mut hero, 75);
    hero.print_stats();
}
