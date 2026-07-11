/* Arrays
    - arrays are used to store multiple values in a single variable
        - instead of declaring multiple variables to store multiple values, arrays makes the process easier

        - declaration
            - arrays are declared using a data type and square brackets []
            - two ways to create arrays
                - explicit declaration
                    - it is possible to create arrays by directly assigning values into it
                    - values are stored using curly braces { }
                        - multiple values are declared using a comma-separated list
                    - syntax:
                        <dataType> <arrayName>[] = {<value1>, <value2>, <value3>};
                        // or
                        <dataType> <arrayName>[] = new <dataType>[] {<value1>, <value2>, <value3>};
                    - example:
                        char myArray[] = {'i', 'd', 'k', 'm', 'a', 'n'};
                        // or
                        char myArray[]  new char[] {'i', 'd', 'k', 'm', 'a', 'n'};
                - implicit declaration
                    - an empty array is automatically created when only the size is specified
                    - syntax:
                        <dataType> <arrayName> = new <dataType>[5];
                    - example:
                        float myArray = new float[]; // an array with a size of 5 is created

        - access
            - the elements inside an array is accessed through the use of indices
            - in most languages, the index number usually starts at 0
                - i.e. the first element has an index of 0
            - trying to access an index that is greater than the size of the array will result in an error
            - syntax:
                <arrayName>[<index>];
            - example:
                boolean myArray[] = {true, false};
                myArray[1];                      // false
            - the size of an array is obtained through the use of the .length property
                - syntax:
                    <arrayName>.length;
                - example:
                    myArray.length;     // return an integer

        - modification
            - values of an array are able to be changed 
                - through accessing them via their index and using the = assignment operator
            - syntax:
                <arrayName>[<index>] = <newValue>;
            - example:
                myArray[1] = false;

        - multidimensional arrays
            - also called "nested arrays"
            - it is possible to insert array inside arrays
            - the elements inside a nested array can either be:
                - mixed arrays
                    - containing both array elements and normal values
                    - example:
                        { {1, 2, 3}, 4, 5, 6, {7, 8} }
                - or purely arrays
                    - conatains only array elements
                    - example:
                        {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'q'}}
            - accessing a nested array is done through using the index of the parent array and then the child array
                - syntax:
                    <arrayName>[<parentIndex>][<childIndex>];
                - example:
                    myArray[1][2];
                - note that the leftmost index is the parent array and every succeeding index is the child array
                - the size of an array inside another array can also be queried using the .length property
                    - syntax:
                        <arrayName>[<parentIndex>].length;
                    - example:
                        myArray[1].length; // return the size of the array with that bears the same index
            - modifying the values if done through the same process as normal arrays
                - only adding another index to represent the leaf values
                - syntax:
                    <arrayName>[<parentIndex>][<childIndex>] = <newValue>;
                - example:
                    myArray[1][3] = "lumbago";
*/

public class Arrays {
    public static void main(String[] args) {
        Object mixedArray[] = { "idkman", new String[]{ "hello", "world" }, "lumbago", new String[]{ "yes", "no" } };
        System.out.println(mixedArray);
    }
}