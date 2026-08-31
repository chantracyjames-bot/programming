fn goat_debate<'legoat>(LBJ: &'legoat str, MJ: &'legoat str) -> &'legoat str {
    LBJ
}

fn main() {
    let anonymous_person1 = String::from("LeBron James");
    let goat;

    {
        let not_anonymous_person = String::from("Michael Jordan");
        goat = goat_debate(&anonymous_person1, &not_anonymous_person);
        println!("{}", goat);
    }

    println!("{}", anonymous_person1);
}