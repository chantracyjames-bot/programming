enum IsBroGood {
    BroAteAnApple{ bro_level: u32, bro: String },
    BroIsAnIdiot{ bro_level: u32, bro: String, idiot_level: u32 },
    BroIsNoLongerAnIdiot,
}

impl IsBroGood {
    fn bro_maker(bro: String) -> Self {
        IsBroGood::BroAteAnApple{ bro_level: 100, bro: bro }
    }

    fn bro_state(&self) {
        match self {
            IsBroGood::BroAteAnApple{bro_level, bro} => println!("{} - {} (no afflictions).", bro, bro_level),
            IsBroGood::BroIsAnIdiot{bro_level, bro, idiot_level} => println!("{} - {} (idiot {}).", bro, bro_level, idiot_level),
            IsBroGood::BroIsNoLongerAnIdiot => println!("bro died, an idiot no longer.")
        }
    }

    fn bro_became_an_idiot(&mut self, new_idiot_level: u32) {
        *self = match self {
            IsBroGood::BroAteAnApple { bro, bro_level } => {
                IsBroGood::BroIsAnIdiot { 
                    bro_level: *bro_level, 
                    bro: bro.clone(), 
                    idiot_level: new_idiot_level 
                }
            },
            IsBroGood::BroIsAnIdiot { bro, bro_level, idiot_level } => {
                IsBroGood::BroIsAnIdiot { 
                    bro_level: *bro_level, 
                    bro: bro.clone(), 
                    idiot_level: *idiot_level + new_idiot_level 
                }
            },
            IsBroGood::BroIsNoLongerAnIdiot => {
                println!("bro is dead, how can bro become an idiot?");
                IsBroGood::BroIsNoLongerAnIdiot
            },
        }
    }

    fn bro_became_a_zombie(self) -> Self {
        match self {
            IsBroGood::BroIsNoLongerAnIdiot => IsBroGood::BroAteAnApple{bro_level: 50, bro: String::from("bro is god")},
            IsBroGood::BroAteAnApple{bro, bro_level} => IsBroGood::BroAteAnApple{ bro_level: bro_level, bro: bro},
            IsBroGood::BroIsAnIdiot{bro, bro_level, idiot_level} => IsBroGood::BroIsAnIdiot{ bro_level: bro_level, bro: bro, idiot_level: idiot_level },
        }
    }
}

fn main() {
    let mut bro1 = IsBroGood::bro_maker(String::from("bro #1"));
    bro1.bro_state();
    bro1.bro_became_an_idiot(25);
    bro1.bro_state();
    let mut bro2 = IsBroGood::BroIsNoLongerAnIdiot;
    bro2.bro_state();
    bro2 = bro2.bro_became_a_zombie();
    bro2.bro_state();
    bro1 = bro1.bro_became_a_zombie();
    bro1.bro_state();
}