fn main() {
    let book1 = Book { title: "The Hobbit".to_string(), year_published: 1937 };
    let book2 = Book { title: "idkman".to_string(), ..book1 };
    println!("{}", book1.title);
}

struct Book {
    title: String,
    year_published: u32,
}