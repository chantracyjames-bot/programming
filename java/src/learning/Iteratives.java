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

    - Iterators
        - are objects that can be used to toop through collections
            - mainly Collection type objects like ArryaLists, HashSets, etc.
        - the term comes from "iterating" which is a technical from of looping

        - declaration and initialization
            - before an Iterator object is declared, it must first be imported
                - it is imported from the java.util package
                - syntax:
                    import java.util.Iterator;
            - after being imported an iterator object must be tied to a colletion
                - calling that collection's iterator method
                - syntax:
                    Iterator<object> <iteratorObject> = <colletionObject>.iterator();
                - example:
                    Iterator<String> myIterator = myArrayList.iterator();
                - it is possible to declare an Iterator variable using the var keyword
                    - syntax:
                        var <mapObject> = <collectionObject>.iterator();
                    - example:
                        var myIterator = myArrayList.iterator();

        - access and iteration
            - an iterator can be "advanced" using a few methods
                - the .hasNext() method returns a boolean if the object being iterated has a succeeding value
                    - indicating whether or not the object's elements are exhausted or not
                    - syntax:
                        <iteratorObject>.hasNext();
                    - example:
                        myIterator.hasNext();
                - advacning the iterator is done through the .next() method
                    - syntax:
                        <iteratorObject>.next();
                    - example:
                        myIterator.next();
                    - note that an Excepttion will be thrown if the iterator goes out of bounds
                        - similar to the Index Out Of Bounds Exception

            - an Iterator can remove elements form a collection
                - it is done through the .remove() method
                    - typically done while inside a loop
                - syntax:
                    <iteratorObject>.remove();
                - example:
                    myIterator.remove();
                - sidenote:
                    - it is recommended to remove items using a while loop with the .next() method
                    - removing items when in a for loop or a for-each loop will not work correctly
                        - due to the size of the collection changing when removing items
        
*/

public class Iteratives {
    public static void main(String[] args) {
        char idk[] = { 'H', 'e', 'l', 'l', 'o'};
        for(char man : idk) {
            System.out.print(man);
        }
    }
}
