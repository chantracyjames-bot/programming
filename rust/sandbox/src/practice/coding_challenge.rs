use std::collections::HashMap;

#[derive(Debug)]
struct GridPos(i32, i32);

#[derive(Debug)]
struct Drone {
    name: String,
    battery: u8,
}

fn main() {
    let mut hive_squad: HashMap<String, Drone> = HashMap::new();
    hive_squad.insert("Alpha".to_string(), Drone { name: "Alpha-1".to_string(), pos: GridPos(0, 0), battery: 100});
    hive_squad.insert("Beta".to_string(), Drone { name: "Beta-2".to_string(), pos: GridPos(0, 5), battery: 40 });

    if let Some(scout) = hive_squad.get_mut("Beta") {
        scout.pos = GridPos(12, 18);
        scout.battery -= 15;
    }

    let (mut pos1, mut pos2) = (0, 0);          
    if let Some(drone) = hive_squad.get("Alpha") {
        pos1 = drone.pos.0;
        pos2 = drone.pos.1;
    }

    hive_squad.insert("Gamma".to_string(), Drone { name: "Gamma-3".to_string(), pos: GridPos(pos1, pos2), ..hive_squad["Alpha"]});

    hive_squad.retain(|_yes, no| no.battery > 30);

    println!("{:?}", hive_squad);
}