/* conditional statements
    - conditional statments control the flow of the program
        - uses boolean as the logic with conditional operations controlling the value or said boolean
        - all conditional operators must return a boolean value
        - types of conditionl statements
            - if statements
                - only runs the code block if the condition is true
                - syntax:
                    if <condition> {
                        <statements> 
                    }
                - example:
                    if 10 > 29 {
                        print!("no"); // runs since condition is true
                    }
            - else if statement
                - offers another condition apart from the if statement
                - similar syntax as the if statement
                - syntax:
                    else if <condition> {
                        <statements>
                    } 
                - example:
                    if 7 < 2 {
                        print!("no)";  // does not run since condition is false
                    }
                    else if 9 > 2 {
                        print!("yes"); // runs since condition is true
                    }
            - else statement
                - runs if all of the conditions return false
                - syntax:
                    else {
                        <statements>
                    }
                - example:
                    if 1 > 9 {
                        print!("no");    // does not run since condition is false
                    }
                    else {
                        print!("maybe"); // runs since all condition are false  
                    }
            - if-else statements
            '   - combination of the if and else statements
                - example:
                    if 90 == 12 {
                        print!("no");
                    }
                    else {
                        print!("maybe");    
                    }
            - if-else if-else statements
                - combination of the if, else if and else statements
                - example:
                    if 90 == 12 {
                        print!("no");
                    }
                    else if 75 != 89 {
                        print!("yes");
                    }
                    else {
                        print!("maybe");    
                    }
            - match
       - match statement
            - an alternative approach to the if-elif-else stataments
                - offers a clean and organized approach
            - similar to the switch-case statement in Java or C++, or match-case in Python
            - uses the match keyword
            - syntax:
                match <expression> {
                    <condition> => <statemnent>,
                    <condition> => <statemnent>,
                    <condition> => <statemnent>,
                    _ => <statement>,
                }
            - the => syntax refers to the code to run if the condition matches the expression
            - note that the underscore is similar to the else statment
                - running only when all other conditions are false
                - similar to the default statement in switch-case statements
            - multiple matches
                - it is possible to match multiple values at once using the OR | operator
                - syntax:
                    match <expression> {
                        <condition> | <condition> => <statemnent>,
                        <condition> | <condition> | <condition> => <statemnent>,
                    }

        - if as an expression
            - an if else statement in Rust can also be used as an expresion
            - it is similar to the ternary operations of ? : in C or Java
            - syntax:
                let <variable_name> = if <condition> {
                    <statement>
                } else {
                    <statement>
                };
            - example:
                let idkman = if 10 == 11 {
                    "maybe"
                } else {
                    "lumbago" 
                };
            - note that the values must match
                - i.e. the if the condition results in a string, 
                    - the else condition must also be a string

        - match as an expression
            - similar to the if statemnt as an expression
                - it is possible to use match as an expression
            - syntax:
                let <variable_name> = match <expression> {
                    <condition> => <statemnent>,
                    <condition> => <statemnent>,
                    _ => <statement>,
                };
            - the same restrictions with if else as an expression applies
                - the return values must be the same data type all throughout
*/