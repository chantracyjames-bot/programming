fn main() {
    let my_vector: Vec<i32> = vec![12, 15, 7, 22, 18, 13];

    let (a, b): (i32, i32) = analyze_window(&my_vector[1..4]);
    println!("The min value is: {a}\nThe max value is: {b}");
}

fn analyze_window(vector: &[i32]) -> (i32, i32) {
    let mut min: i32 = vector[0];
    let mut max: i32 = vector[0];
    for i in 1..vector.len() {
        min = if min > vector[i] { vector[i] } else { min };
        max = if max < vector[i] { vector[i] } else { max };
    }
    (min, max)
}
