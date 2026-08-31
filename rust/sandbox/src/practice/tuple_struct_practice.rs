fn main() {
    let mut location = GPSCoordinates(14.5995, 120.9842, 15.0);
    println!("Current coordinates: {}, {}, {}", location.0, location.1, location.2);
    println!("Change of altitude detected.");
    location.2 += 10.5;
    println!("Current coordinates: {}, {}, {}", location.0, location.1, location.2);
}

struct GPSCoordinates(f64, f64, f64);