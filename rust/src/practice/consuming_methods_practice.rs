struct Document {
    name: String,
    content: String,
}

impl Document {
    fn create(name: &str, content: &str) -> Self {
        Self {
            name: name.to_string(),
            content: content.to_string(),
        }
    }

    fn destroy(self) {
        println!("byebye {}", self.name);
    }
}

fn main() {
    let idkman: Document = Document::create("Secret", "Stuff");
    idkman.destroy();
}