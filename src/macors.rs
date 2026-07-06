/*
    - Rust-provided macros
        - print!()
            - used to print text to the terminal
            - syntax:
                print!(<string>);
            - example:
                print!("maybe");
            - it is able to have placeholders
                - using curly braces {}
                - syntax:
                    print!("{}", <placeholder>);
                - example:
                    print!("{} is to {}", 10, "lumbago");
        - println!()
            - used to print text to the terminal
            - unlike print!()
                - println!() adds a new line "\n" to the end of the string
            - syntax:
                print!(<string>);
            - example:
                printlmn!("maybe");
            - it is able to have placeholders
                - using curly braces {}
                - syntax:
                    println!("{}", <placeholder>);
                - example:
                    println!("{} is to {}", 10, "lumbago");
        - format!()
            - used to combine different variables
            - concatenates strings
            - syntax:
                format!("{}", <string>);
            - example:
                format!("{} {}", "Hello", World);
            
*/