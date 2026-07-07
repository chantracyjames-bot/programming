/* iterative statements
    - commonly called as loops
        - not to be confused the keyword called "loop"
    - runs a code block until a certain condition is met
        - may it be until the loop counter reaches a certain number, the condition becomes false, etc.
    - uses a boolean value to dictate if the loop runs or stops
        - using loop counter values other than whole numbers will cause errors
    - loop keywords
        - break
            - the break keyword is used to stop loops
            - breaking a loop means ending it prematurely
        - continue 
            - the continue keyword is used to skip the current iteration
            - using it will end the current iteration and move on to the next
    - types of loops:
    - types of loops
        - loop
            - the simplest type of loop in Rust
            - this type of loop lasts indefinitely
                - it will only stop unless a stop signal or break statemnt is given
            - uses the loop keyword
            - syntax:
                loop {
                    <statements>
                }
            - example:
                loop {
                    print!("idkman");
                }
            - it is possible to use loop as an expression
                - example:
                    let mute my_num: i32 = 0;
                    let result = loop {
                        my_num += 1;
                        if my_num == 10 {     // returns 10 when the loop stops
                            break;
                        }
                    };

        - while loop
            - runs a loop while the condition is true
                - if the initial condition is false, the loop never runs
            - uses the while keyword
            - syntax:
                while <condition> {
                    <statements>
                }
            - example:
                while 10 > 11 {
                    print!("lumbago"); // this loop doesn't run
                }
        - for loops
            - an extensive type of loop
            - it is similar to Python's for loops
                - repeating a code block a fixed number of times
            - unlike other programming languages
                - Rust handles the loop counter automatically
                - it is not required to increment or decrement variables manually
            - uses the for keyword
            - syntax:
                for <counter> in <range> {
                    <statements>
                }
            - example:
                for i in 1..5 {
                    print!("{}", i);
                }
            - ..
                - it is the range of the loop
                - note that the target value is exclusive
                - example:
                    2..10 // 2 until 9
            - ..=
                - it is another type of range for the loop
                - note that unlike .., this type is inclusive
                - example:
                    1..=5 // 1 until 5
            - to reverse the order, the .rev() method is used
                - example:
                    for i in 1..10.rev() {
                        print!("{i}");     // starts from 9
                    }
*/