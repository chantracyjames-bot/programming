/* conditionals
    - conditional statments control the flow of the program
        - uses boolean as the logic with conditional operations controlling the value or said boolean
        - all conditional operators must return a boolean value
        - types of conditionl statements
            - if statements
                - only runs the code block if the condition is true
                - syntax:
                    if (<condition>) {
                        <statements> 
                    }
                - example:
                    if (10 > 29) {
                        printf("no"); // runs since condition is true
                    }
            - else if statement
                - offers another condition apart from the if statement
                - similar syntax as the if statement
                - syntax:
                    else if (<condition>) {
                        <statements>
                    } 
                - example:
                    if (7 < 2) {
                        printf("no");  // does not run since condition is false
                    }
                    else if (9 > 2) {
                        printf("yes"); // runs since condition is true
                    }
            - else statement
                - runs if all of the conditions return false
                - syntax:
                    else {
                        <statements>
                    }
                - example:
                    if (1 > 9) {
                        printf("no");    // does not run since condition is false
                    }
                    else {
                        printf("maybe"); // runs since all condition are false  
                    }
            - if-else statements
            '   - combination of the if and else statements
                - example:
                    if (90 == 12) {
                        printf("no");
                    }
                    else {
                        printf("maybe");    
                    }
            - if-else if-else statements
                - combination of the if, else if and else statements
                - example:
                    if (90 == 12) {
                        printf("no");
                    }
                    else if (75 != 89) {
                        printf("yes");
                    }
                    else {
                        printf("maybe");    
                    }
            - switch-case statements
                - an alternative approach to if-else if-else statements
                    - offering a clean and organized approach
                - syntax:
                    switch (<expression>) {
                        case <condition>:
                            <statements>
                            break;
                        case <condition>:
                            <statements>
                            break;
                        default:
                            <statements>
                    }
                - example:
                    int num = 10;
                    switch (num) {
                        case num <= 9:
                            printf("no");
                            break;
                        case num >= 11:
                            printf("yes");
                            break;
                        default:
                            printf("maybe");
                    }
                - the case condition is similar to the if and else if statements
                    - being a conditional statement
                    - it runs the code block if is true
                - the break statement is required to end the case statements
                    - it not present, it will run other case conditions instead of stopping when reaching the first true condition
                - the default condition is similar to the else statement
                    - it runs if all case conditions are false
*/