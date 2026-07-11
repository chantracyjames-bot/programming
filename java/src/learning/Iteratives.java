/* iteratives
    - commonly called as loops
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
        - while loop
            - runs a loop while the condition is true
                - if the initial condition is false, the loop never runs
            - syntax:
                while (<condition>) {
                    <statements>
                }
            - example:
                while (10 > 11) {
                    System.out.print("lumbago");
                }
        - do-while loops
            - a variant of the while loop
            - unlike while loop, this loop runs the block of code first before checking the condition
                - it always runs the statements once
            - stops when the condition becomes false
            - syntax:
                do {
                    <statements>
                } while (<condition>)
            - example:
                do {
                    System.out.print("idkman");
                } while (29 < 1);
        - for loops
            - an extensive type of loop
            - runs a loop while the condition is true
                - if the initial condition is false, the loop never runs
            - takes in three statements:
                - statement 1:
                    - executed before the code block
                    - usually is reserved for initializing the loop counter (or variable)
                - statement 2:
                    - represents the condition of the loop
                    - usually is reserve for conditional operations
                - statement 3:
                    - executed after the code block
                    - usually is reserved to increment or decrement the loop counter (or variable)
            - syntaxx:
                for(<statement1>; <statement2>; <ststement3>) {
                    <statement>
                }
            - example:
                for(int i = 0; i < 10; i++) {
                    System.out.print("yes");
                }
        - for each loop
            - a variant of the for loop
            - used to loop through iterables
                - like arrays
            - syntax:
                for(<dataType> <loopVariableName> : <iterable>) {
                    <statement>
                }
            - example:
                float myFloat[] = {3.13, 4.19, 5.15, 6.18};
                for(float myNum : myFloat) {
                    System.out.print("no");
                }
            - sidenote:
                - the loop variable type must match the iterable type
*/

public class Iteratives {
    public static void main(String[] args) {
        char idk[] = { 'H', 'e', 'l', 'l', 'o'};
        for(char man : idk) {
            System.out.print(man);
        }
    }
}
