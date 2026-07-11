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
                        System.out.print("no"); // runs since condition is true
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
                        System.out.print("no");  // does not run since condition is false
                    }
                    else if (9 > 2) {
                        System.out.print("yes"); // runs since condition is true
                    }
            - else statement
                - runs if all of the conditions return false
                - syntax:
                    else {
                        <statements>
                    }
                - example:
                    if (1 > 9) {
                        System.out.print("no");    // does not run since condition is false
                    }
                    else {
                        System.out.print("maybe"); // runs since all condition are false  
                    }
            - if-else statements
            '   - combination of the if and else statements
                - example:
                    if (90 == 12) {
                        System.out.print("no");
                    }
                    else {
                        System.out.print("maybe");    
                    }
            - if-else if-else statements
                - combination of the if, else if and else statements
                - example:
                    if (90 == 12) {
                        System.out.print("no");
                    }
                    else if (75 != 89) {
                        System.out.print("yes");
                    }
                    else {
                        System.out.print("maybe");    
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
                            System.out.print("no");
                            break;
                        case num >= 11:
                            System.out.print("yes");
                            break;
                        default:
                            System.out.print("maybe");
                    }
                - the case condition is similar to the if and else if statements
                    - being a conditional statement
                    - it runs the code block if is true
                - the break statement is required to end the case statements
                    - it not present, it will run other case conditions instead of stopping when reaching the first true condition
                - the default condition is similar to the else statement
                    - it runs if all case conditions are false
        - it is possible to nest condition statements inside of each other
            - example:
                if (100 = 1) {
                    if (32 < 1) {
                        System.out.println("idkman");
                    }
                }
        - short-hand if-else statements
            - a ternary operator is like an on the fly version of an if-else statment
            - mainly used to determine the value of a varible without declaring an if-else statemnt
            - syntax:
                <condition> ? <expressionIfTrue> : <expressionIfFalse>;
            - example:
                boolean idkman = (1 == 1) ? true : false;
        - short hand nested if-else statamens
            - a nested ternary operator that acts like a if-else if-else statement
            - syntax:
                <condition> ? <expressionIfTrue> : <condition> ? <expressionIfTrue> : <expressionIfFalse>;
            - example:
                double lumbago = (1 < 2) ? 2.13 : (3 < 2) ? 2.43 : 3.14;
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
public class Conditionals {
    public static void main(String[] args) {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        String currentDay = "idkman";
        switch (day) { 
            case SUNDAY:
                currentDay = "Today is Sunday";
                break;
            case MONDAY:
                currentDay = "Today is Monday";
                break;
            case TUESDAY:
                currentDay = "Today is Tuesday";
                break;
            case WEDNESDAY:
                currentDay = "Today is Wednesday";
                break;
            case THURSDAY:
                currentDay = "Today is Thusday";
                break;
            case FRIDAY:
                currentDay = "Today is Friday";
                break;
            case SATURDAY:
                currentDay = "Today is Saturday";
                break;
        }
        System.out.println(currentDay);
   }
}
