trait Electricity {
    fn get_power(&self) -> u32;

    fn print_warning(&self) {
        if self.get_power() < 100 {
            println!("Low power.");
        } else {
            println!("Good, yes.");
        }
    }

    fn default_voltage() -> u32;
}

struct PowerPlant {
    current_energy: u32,
}

impl Electricity for PowerPlant {
    fn get_power(&self) -> u32{
        self.current_energy
    }

    fn default_voltage() -> u32 {
        240
    }
}

fn main() {
    println!("Default voltage is: {}", PowerPlant::default_voltage());

    let plant_1 = PowerPlant{ current_energy: 75 };
    plant_1.print_warning();
}