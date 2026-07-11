fn main() {
    let mut grades = vec![65, 90, 68, 85, 72, 55];
    let top_grade = apply_curve(&mut grades);
    
    println!("Highest grade: {}", top_grade);
    println!("Curved grades: {:?}", grades); 
}


fn apply_curve(yes :&mut Vec<i32>) -> i32 {
    let mut temp = 0;
    for i in 0..yes.len() { // you said find the highest grade but you didn't mention that i return it 
        if temp < yes[i] { temp = yes[i]; } // i'll modify your question so that it it doesn't waste a variable
        if yes[i] < 70 { yes[i] += 5; }
    };
    temp // it now returns and prints the top grade
}