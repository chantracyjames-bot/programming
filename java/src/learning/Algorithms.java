/* algorithms
    - Algorithms
        - are used to solve problems related to sorting, searching, or manipulating data strutures
            - Searching Algorithms
                - these types of algorithms are used to find certain elements inside a collection
                - a well-known searching algorithm is called "Binary Search"
            - Sorting Algoriths
                - these types of alrighthms are uses to sort collections
                    - depening on what order the resulting collection becomes
                - a common order type is natural order
            - Iteraion
                - iteration is also another type of algorithm
                    - used to loop through elements
                - refer to Iteratives.java for more info

    - Java Algorithms
        - Seaching
            - Java has various built-in helper methods for searching through collections
            - Binary Search
                - a commonly used searching algorithm
                - can be used through the .binarySearch() method inside the Collections class
                    - returns the index of the element if found
                - note that the collectrion must be sorted first
                - syntax:
                    Collections.binarySearch(<collection.Object>, <element>) 
            - Maximum and Minimum Search
                - used to find the maximum and minimum values of a collection
                    - through the .max() and .min() methods of the Collections class, respectively
                - syntax:
                    Collections.max(<collectionObject>);
                    // or
                    Collections.min(<collectionObject>);
            - Frequency Search
                - used to query a collection about the number of times an element appears
                    - through the .frequency() method of the Collections class
                - syntax:
                    Collections.frequency(<collectionObject>, <element>);
            - Disjoint Search
                - compares two collections is they have no elements in common
                - results into a boolean value
                    - returns true if there are no common elements between the two collections
                    - returns a false is there is
                - syntax:
                    Collections.disjoint(<collectionObject1>, <collectionObject2>);    

        - Sorting
            - Java has a built-in sorting method for sorting methods
            - Natural Order
                - a common type of sorting algorithm
                - sorts items alphanumerically
                    - 0-9, then
                    - A-Z, and
                    - a-z
                - can be used through the .sort() method inside the Collections class
                    - sorts the items through natural order
                - syntax:
                    Collections.sort(<collectionObject>);
            - Reverse Order
                - reverses the current order of a collection
                - used through the .reverse() method inside the Collections class
                - syntax:
                    Collections.reverse(<collectionObject>);
                - another method, reverseOrder() can be used inside the .sort() method
                    - syntax:
                        Collections.sort(<collectionObject>, reverseOrder());
            - Random Order
                - randomly shuffles the elements around in a collection
                    - used through the .shuffly() method from the Collections class
                - syntax:
                    Collections.shuffle(<collectionObject>);
            - Swap Order
                - swaps two elements inside a collection
                    - used through the .swap() method from the Collections class
                - syntax:
                    Collections.swap(<collectionObject>, <index1>, <index2>);
*/

import java.util.Collections;
import java.util.ArrayList;

public class Algorithms {
    static int fibonacciRecursion(int a) {
        if(a == 1 || a == 0) {
            return 1;
        }
        return fibonacciRecursion(a - 1) + fibonacciRecursion(a - 2);
    }
    
    public static void main(String[] args) {

    }
}
