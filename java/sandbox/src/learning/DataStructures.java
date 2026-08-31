/* data structures
    - are ways to store and organize data
        - resulting in various levels of efficiency depending on use
    - one example of data structures are arrays
        - which allows multiple elements to be stored in a single variable
        - a basic structure compared to the other data structures in Java
        - refer to Arrays.java for more info
    - other data structures in java are stored inside the java.util package
        - structures such as ArrayList, HashSet, HashMap, etc.
        - collectively, they make up the Java Collections Framework
        - core interfaces
            - Lists
                - are ordered collections that allow duplicate elements
                - used when a collection needs order, duplicates and element access via index
                - examples are ArrayLists and LinkedLists

                - ArrayLists
                    - are resizable arrays that maintains order and allow duplicate entries
                - LinkedLists
                    - are lists containing fast insert and remove operations
            - Sets
                - are a collection of unique elements
                - used when a collection only stores unique values
                - examples are HashSets, TreeSets, and LinkedHashSets

                - HashSets
                    - are unordered collections of unique items
                - TreeSets
                    - are sorted set of unique elements with natural order
                - LinkedHashSets
                    - are collections that maintain order in which elements were inserted
            - Maps
                - are a collection of key-value pairs with unique keys
                - used when a collection stores a key-value pair
                - examples are HahsMaps, TreeMaps, and LinkedHashMaps

                - HashMaps
                    - are collections that stores key-valye pairs with no specific order
                - TreeMaps
                    - are sorted map of elements with natural order of keys
                - LinkedHashMaps
                    - are collections that maintain order in which keys were inserted

    - Java Lists
        - the List Interface
            - part of the Java Collections Framwork
                - representing an ordered collection of elements
            - accessible through their index, allows duplicate entries and maintain insertion order
            - note that List is an interface (abstract class) and cannot be accessed directly
                - only accessible through class implementations such as ArrayList and LinkedList
            - common List methods:
                - .add()
                    - adds (or append) an element at the end of the list
                - .get()
                    - returns an element at a specified position (index)
                - .set()
                    - replaces an element at a specified position (index)
                - .remove()
                    - removes an element at a specified position (index)
                - .size()
                    - returns the number of elements in a list
            - Lists vs Arrays
                - arrays have fixed size, unlike lists with dynamix sizing
                - arrays are usually faster when dealing with raw data
                    - while lists are more flexible and feature-rich
                - unlike arrays which are not part of the Java Collections Framework
                    - Lists have far better control for elements inside its containers
            - it is possible to create a variable which has the List interface type
                - mainly used for flexibility with changing types later when needed
                - example:
                    List<String> myList = new ArrayList<String>();

        - ArrayList
            - implements the List interface
                - inheriting the attributes of Lists
                - importantly the resizabilty of its containers
            - unlike normal arrays
                - ArrayLists doesn't have the limitations of arrays
                - such as in size, as ArrayLists are abnle to be resized on demand
                - adding and removing elements unlike arrays with its fixed size
            
            - declaration and initialization
                - using the ArrayList class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.ArrayList;
                - after importing the class, it is declared similar to creating an object from a class
                    - syntax:
                        ArrayList<(object)> <listObject> = new ArrayList<(object)>();
                    - example:
                        ArrayList<String> myArrayList = new ArrayList<String>();
                - note that the data type that an ArrayList can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        ArrayList<Integer> myInt = new ArrayList<Integer>();
                - it is possible to declare an ArrayList variable using the var keyword
                    - syntax:
                        var <listObject> = new ArrayList<(object)>();
                    - example:
                        var myArrayList = new ArrayList<String>();

            - access and modification
                - elements are able to be added using the .add() method
                    - elements added are automatically appended to the end of the list
                        - syntax:
                            <listObject>.add(<value>);
                        - example:
                            myArrayList.add("idkman");
                    - elements are also able to be inserted using indexes
                        - the elements are shifted to the right when a new elemnt is added
                            - elements that were in the specified inside are shifted
                        - syntax:
                            <listObject>.add(<index>, <value>);
                        - example:
                            myArrayList.add(0, "lumbago"); // inserts the value to index 0
                                                           // shifting the elements starting from 0 to the right

                - elements inside an ArrayList are accessed through their index number
                    - the order in which they are added into the collection
                    - accessed using the .get() method
                    - syntax:
                        <listObject>.get(<index>);
                    - example:
                        myArrayList.get(0);

                - elements are able to be modified using the .set() method
                    - it requires the index to the value to be modified
                    - syntax:
                        <listObject>.set(<index>, <neValue>);
                    - example:
                        myArrayList.set(0, "Hello World"); // modifies the value in index 0

                - elements are able to be removed using the .remove() method
                    - removing a single element requires the index to that element
                        - note that elements after the removed index are shifted to the left
                            - reoccupying that index with the value from the right
                        - syntax:
                            <listObject>.remove(<index>);
                        - example:
                            myArrayList.remove(0); // removes the element from index 1
                                                   // shifting the elements to the left
                                                   // element from index 1 now becomes index 0
                    - it is possible to clear the whole list using the .clear() method
                        - removing every single element from the list
                        - syntax:
                            <listObject>.clear();
                        - example:
                            myArrayList.clear();

                - the size of an ArrayList is able to be queried using the .size() method
                    - it returns an integer value
                    - syntax:
                        <listObject>.length();
                    - example:
                        myArrayList.length();

                - sorting an ArrayList
                    - sorting a collection of an ArrayList is done through the Collections class
                        - imported from te java.util package
                        - syntax:
                            import java.util.Collections;
                    - after importing the Collections class, sorting is done through the .sort() static method
                        - syntax:
                            Collections.sort(<listObject>);
                        - example:
                            Collections.sort(myArrayList); // returns a sorted list, through normal order
                    - it is also possible to reverse the order of a list
                        - through the Collections.reverseOrder() method
                        - syntax:
                            Collections.sort(<listobject>, Collections.reverseOrder());
                        - example:
                            Collections.sort(myArrayList, Collections.reverseOrder())

        - LinkedLists
            - implements the List interface
                - inheriting the attributes of Lists
                - importantly the resizabilty of its containers
            - LinkedLists vs ArrayLists
                - in terms of purpose, the LinkedList class is almost identical to the ArrayList class
                    - but they both have different ways in how they were built
                - both have the same methods since they are both implementations of the List interface
                    - meaning, it is possiblt to add, change, remove or clear elements in a Linked List like in ArrayLists
                - the ArrayList class has a regular array inside of it 
                    - when the an element is added, it is places onto that array
                    - when the array is not big enough, a new, larger array is created and replaces the old array
                        - the old array is removed which the new one replaces it
                - however, in LinkedLists, elements are stores inside "containers"
                    - a LinkedList object has a link (memory address) to the first element of said list
                        - and that first element has a link to the next elemeent (or container), and so on
                    - when adding a new element to a LinkedList object, the element is placed inside a new container
                        - and that container is linked to the other containers on that list
                - ArrayLists are mainly used for storing and accessing data
                    - mainly being more efficient when accessing random elements in a collection
                - LinkedLists are used to manipilate data
                    - has several methods that can operate more efficiently
            - LinkedLists methods:
                - .addFirst()
                    - adds an element to the beginning in the list
                    - that element will have be linked to the "former" first element of the list
                        - and the object holding those elements will have the linked to the new first element
                    - syntax:
                        <listObject>.addFirst()
                    - example:
                        myLinkedList.addFirst()
                - .addLast
                    - adds an element to the end in the list
                    - the former last element of the list will have the link to the new last element
                    - syntax:
                        <listObject>.addLast()
                    - example:
                        myLinkedList.addLast()
                - .removeFirst()
                    - removes the first element in the list
                    - the former first element, the one being removed, will return its link to the next element in the list
                        - the list object will now be linking to the new first element, the former second element
                        - after which, the first element can now be removed
                    - syntax:
                        <listObject>.removeFirst()
                    - example:
                        myLinkedList.removeFirst()
                - .removeLast()
                    - removes the last element in the list
                    - the new last element, former second last, removes its link to the last element, the element being removed
                        - after which, the last element can now be removed
                    - syntax:
                        <listObject>.removeLast()
                    - example:
                        myLinkedList.removeLast()
                - .getFirst()
                    - returns the first element in the list
                    - taking O(1) time to return the element
                    - syntax:
                        <listObject>.getFirst()
                    - example:
                        myLinkedList.getFirst()
                - .getLast()
                    - returns the last element in the list
                    - taking O(1) time to return the element
                        - Java has a pointer to the last element
                    - syntax:
                        <listObject>.getLast()
                    - example:
                        myLinkedList.getLast()

            - declaration and initialization
                - using the LinkedList class, it must first me imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.LinkedList;
                - after importing the class, it is declared similar to creating an object from a class
                    - syntax:
                        LinkedList<(object)> <listObject> = new LinkedList<(object)>();
                    - example:
                        LinkedList<String> myLinkedList = new LinkedList<String>();
                - note that the data type that an LinkedList can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        LinkedList<Integer> myInt = new LinkedList<Integer>();
                - it is possible to declare an LinkedList variable using the var keyword
                    - syntax:
                        var <listObject> = new LinkedList<(object)>();
                    - example:
                        var myLinkedyList = new LinkedList<String>();

            - access and modification
                - elements are able to be added using the .add() method
                    - elements added are automatically appended to the end of the list
                        - syntax:
                            <listObject>.add(<value>);
                        - example:
                            myLinkedList.add("idkman");
                    - elements are also able to be inserted using indexes
                        - the elements are shifted to the right when a new elemnt is added
                            - elements that were in the specified inside are shifted
                        - syntax:
                            <listObject>.add(<index>, <value>);
                        - example:
                            myLinkedList.add(0, "lumbago"); // inserts the value to index 0
                                                            // shifting the elements starting from 0 to the right
                    - elements are also able to be added to the beginning or to the end of the list
                        - it is done through the .addFirst() and .addLast() methods, respectively
                        - syntax:
                            <listObject>.addFirst()
                            // or
                            <listObject>.addLast()
                        - example:
                            myLinkedList.addFirst()
                            // or 
                            myLinkedList.addLast()

                - elements inside an LinkedList are accessed through their index number
                    - the order in which they are added into the collection
                        - accessed using the .get() method
                        - syntax:
                            <listObject>.get(<index>);
                        - example:
                            myLinkedList.get(0);
                    - elements from the first index or last index are able to be assessed in other ways
                        - it is done through the .getFirst() and .getLast() methods, respectively
                        - syntax:
                            <listObject>.getFirst()
                            // or
                            <listObject>.getLast()
                        - example:
                            myLinkedList.getFirst()
                            // or
                            myLinkedList.getLast()

                - elements are able to be modified using the .set() method
                    - it requires the index to the value to be modified
                    - syntax:
                        <listObject>.set(<index>, <neValue>);
                    - example:
                        myLinkedList.set(0, "Hello World"); // modifies the value in index 0

                - elements are able to be removed using the .remove() method
                    - removing a single element requires the index to that element
                        - note that elements after the removed index are shifted to the left
                            - reoccupying that index with the value from the right
                        - syntax:
                            <listObject>.remove(<index>);
                        - example:
                            myLinkedList.remove(0); // removes the element from index 1
                                                    // shifting the elements to the left
                                                    // element from index 1 now becomes index 0
                    - elements in the first index and last index are able to be removed in other ways
                        - it is done through the .removeFirst() and removeLast() methods, respectively
                        - syntax:
                            <listObject>.removeFirst()
                            // or
                            <listObject>.removeLast()
                        - example:
                            myLinkedList.removeFirst()
                            // or
                            myLinkedList.removeLast()
                    - it is also possible to clear the whole list using the .clear() method
                        - removing every single element from the list
                        - syntax:
                            <listObject>.clear();
                        - example:
                            myLinkedList.clear();

                - the size of an LinkedList is able to be queried using the .size() method
                    - it returns an integer value
                    - syntax:
                        <listObject>.length();
                    - example:
                        myLinkedList.length();

                - sorting an LinkedList
                    - sorting a collection of an LinkedList is done through the Collections class
                        - imported from te java.util package
                        - syntax:
                            import java.util.Collections;
                    - after importing the Collections class, sorting is done through the .sort() static method
                        - syntax:
                            Collections.sort(<listObject>);
                        - example:
                            Collections.sort(myLinkedList); // returns a sorted list, through normal order
                    - it is also possible to reverse the order of a list
                        - through the Collections.reverseOrder() method
                        - syntax:
                            Collections.sort(<listobject>, Collections.reverseOrder());
                        - example:
                            Collections.sort(myLinkedList, Collections.reverseOrder());

    - Java Sets
        - the Set Interface
            - part of the Java Collections Framwork
                - representing a collectection of unique items
            - unlike a list, a set does not allow duplicates
                - and in HashSets, it does not preserve the older of elements
            - note that Set is an interface (abstract class) and cannot be accessed directly
                - only accessible through class implementations such as HashSets
            - common Set methods
                - .add()
                    - adds an element if not already present in the set
                        - discard is it is already in in
                - .remove()
                    - removes an element from the set
                    - returns true if the element was present and removed
                        - returns false if not
                - .contains()
                    - queries the set if the element exists in the set
                - .size()
                    - returns the number of elements in the set
                - .clear()
                    - removes all the elements inside the set
            - Sets vs Lists
                - Sets do not allow duplicates entried
                - unlike Lists, Sets does not guarantee order
                - Sets do now have index-based element access
            - it is possible to create a variable which has the List interface type
                - mainly used for flexibility with changing types later when needed
                - example:
                    Set<String> mySet = new HashSet<String>();

        - HashSet
            - implements the Set interface
                - inheriting the methods of Sets

            - declaration and initialization
                - using the HashSet class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.HashSet;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        HashSet<(object)> <setObject> = new HashSet<(object)>();
                    - example:
                        HashSet<String> myHashSet = new HashSet<String>();
                - note that the data type that an HashSet can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        HashSet<Integer> myInt = new HashSet<Integer>();
                - it is possible to declare an HashSet variable using the var keyword
                    - syntax:
                        var <setObject> = new HashSet<(object)>();
                    - example:
                        var myHashSet = new HashSet<String>();

            - access and modification
                - elements are able to be added through the .add() method
                    - note that duplicate entries are automatically discarded
                    - syntax:
                        <setObject>.add(<value>);
                    - example:
                        myHashSet.add("idkman");

                - elememts are able to be removed through varioues methods
                    - individual elements are removed through the .remove() method
                        - syntax:
                            <setObject>.remove(<value>);
                        - example:
                            myHastSet.remove("idkman");
                    - the entire set is able to be cleared through the .clear() method
                        - syntax:
                            <setObject>.clear();
                        - example:
                            myHashSet.clear();
                        
                - elements are able to be queried if the element is present in the set
                    - it is done through the .contains() method
                        - syntax:
                            <setObject>.contains(<value>);
                        - example:
                            myHashSet.contains("idkman");

                - the size of a set if able to be queried through the .size() method
                    - syntax:
                        <setObject>.size();
                    - example:
                        myHashSet.size();

        - TreeSet
            - implements the Set interface
                - inheriting the methods of Sets
            - TreeSets vs HashSets
                - unlike HashSets, which contains no order
                    - TreeSets are able to keep its elements sorted automatically
                    - using natural order
                - TreeSets are slower than HashSets
                    - due to TreeSets sorting its elements

            - declaration and initialization
                - using the TreeSet class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.TreeSet;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        TreeSet<(object)> <setObject> = new TreeSet<(object)>();
                    - example:
                        TreeSet<String> myTreeSet = new TreeSet<String>();
                - note that the data type that an TreeSet can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        TreeSet<Integer> myInt = new TreeSet<Integer>();
                - it is possible to declare an TreeSet variable using the var keyword
                    - syntax:
                        var <setObject> = new TreeSet<(object)>();
                    - example:
                        var myTreeSet = new TreeSet<String>();

            - access and modification
                - elements are able to be added through the .add() method
                    - note that duplicate entries are automatically discarded
                    - syntax:
                        <setObject>.add(<value>);
                    - example:
                        myTreeSet.add("idkman");

                - elememts are able to be removed through varioues methods
                    - individual elements are removed through the .remove() method
                        - syntax:
                            <setObject>.remove(<value>);
                        - example:
                            myHastSet.remove("idkman");
                    - the entire set is able to be cleared through the .clear() method
                        - syntax:
                            <setObject>.clear();
                        - example:
                            myTreeSet.clear();
                        
                - elements are able to be queried if the element is present in the set
                    - it is done through the .contains() method
                        - syntax:
                            <setObject>.contains(<value>);
                        - example:
                            myTreeSet.contains("idkman");

                - the size of a set if able to be queried through the .size() method
                    - syntax:
                        <setObject>.size();
                    - example:
                        myTreeSet.size();

        - LinkedHashSet
            - implements the Set interface
                - inheriting the methods of Sets
            - these are sets that retains the original insertion order
                - i.e. the elements are ordered by the order they were added
            - LinkedHashSets vs HashSets
                - unlike HashSets, which contains no order
                    - LinkedHashSets are able to preserve insertion order
                - LinkedHashSets are slightly slower than HashSets
                    - due to LinkedHashSets keeping track of insertion order

            - declaration and initialization
                - using the LinkedHashSets class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.LinkedHashSets;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        LinkedHashSets<(object)> <setObject> = new LinkedHashSets<(object)>();
                    - example:
                        LinkedHashSets<String> myLinkedHashSets = new LinkedHashSets<String>();
                - note that the data type that an LinkedHashSets can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        LinkedHashSets<Integer> myInt = new LinkedHashSets<Integer>();
                - it is possible to declare an LinkedHashSets variable using the var keyword
                    - syntax:
                        var <setObject> = new LinkedHashSets<(object)>();
                    - example:
                        var myLinkedHashSets = new LinkedHashSets<String>();

            - access and modification
                - elements are able to be added through the .add() method
                    - note that duplicate entries are automatically discarded
                    - syntax:
                        <setObject>.add(<value>);
                    - example:
                        myLinkedHashSets.add("idkman");

                - elememts are able to be removed through varioues methods
                    - individual elements are removed through the .remove() method
                        - syntax:
                            <setObject>.remove(<value>);
                        - example:
                            myHastSet.remove("idkman");
                    - the entire set is able to be cleared through the .clear() method
                        - syntax:
                            <setObject>.clear();
                        - example:
                            myLinkedHashSets.clear();
                        
                - elements are able to be queried if the element is present in the set
                    - it is done through the .contains() method
                        - syntax:
                            <setObject>.contains(<value>);
                        - example:
                            myLinkedHashSets.contains("idkman");

                - the size of a set if able to be queried through the .size() method
                    - syntax:
                        <setObject>.size();
                    - example:
                        myLinkedHashSets.size();

    - Java Maps
        - the Map Interface
            - part of the Java Collections Framwork
                - representing a collectection of key-value pairs
                - with no duplicate key entries
            - like a set, maps do not allow duplicate keys
            - like a list, maps allow duplicate value entries
            - note that Map is an interface (abstract class) and cannot be accessed directly
                - only accessible through class implementations such as HashSets
            - common Map methods
                - .put()
                    - adds a key-value pair
                    - updates the value of a key if already present
                - .get()
                    - returns the value of a given key
                - .remove()
                    - removes a key and its respective value
                - .containsKey()
                    - checks if a map contains a given key
                - .keySet()
                    - returns a set of all keys of a map
                - .values
                    - returns a Collection of all values of a map
            - Maps vs other Collection types
                - Maps are able to contain both duplicate and non-duplicate entried
                    - non-duplicate for keys and duplicate for values
                - Map keys must have a value associated with them
                - for HashMaps, it does not maintain order unlike Lists 
            - it is possible to create a variable which has the List interface type
                - mainly used for flexibility with changing types later when needed
                - example:
                    Map<String> myMap = new HashMap<String>();

        - HashMap
            - implements the Map interface
                - implementing the Map methods

            - declaration and initilaization
                - using the HashMaps class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.HashMaps;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        HashMaps<(object)> <mapObject> = new HashMaps<(object)>();
                    - example:
                        HashMaps<String> myHashMaps = new HashMaps<String>();
                - note that the data type that an HashMaps can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        HashMaps<Integer> myInt = new HashMaps<Integer>();
                - it is possible to declare an HashMaps variable using the var keyword
                    - syntax:
                        var <mapObject> = new HashMaps<(object)>();
                    - example:
                        var myHashMaps = new HashMaps<String>();
            
            - access and modification
                - elements are able to be added through the .put() method
                    - note that a key-value pair is required with no duplicate keys
                    - syntax:
                        <mapObject>.put(<key>, <value>);
                    - example:
                        myHashMap.put("idkman", "lumbago");
                    
                - elements are able to be removed through various methods
                    - individual elements are able to be removed using the .remove() method
                        - note that this method takes in a single argument, that being a key
                        - removing a key on a HashSet will also removes the value it holds
                        - syntax:
                            <mapObject>.remove(<key>);
                        - example:
                            myHashMap.remove("idkman");
                    - the entire HasnMap can be cleared using the .clear() method
                        - syntax:
                            <mapObject>.clear();
                        - example:
                            myHashMap.clear();

                - values are able to be queried using a key
                    - if the key matches a known key inside a HashMap, then it returns the value it holds
                    - syntax:
                        <mapObject>.get(<key>);
                    - example:
                        myHashMap.get("idkman");

                - the size of a HashMap is able to be queried
                    - through the .size() method
                    - syntax:
                        <mapObject>.size();
                    - example:
                        myHashMap.size();

        - TreeMap
            - implements the Map interface
                - implementing the Map methods
            - TreeMaps vs HashMaps
                - unlike HashMaps, which contains no order
                    - TreeMaps are able to keep its keys sorted automatically
                    - using natural order
                - TreeMaps are slower than HashMaps
                    - due to TreeMaps sorting its elements
                - TreeMaps does not allow null keys
                    - unlike HashMaps which does

            - declaration and initilaization
                - using the TreeMap class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.TreeMap;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        TreeMap<(object)> <mapObject> = new TreeMap<(object)>();
                    - example:
                        TreeMap<String> myTreeMap = new TreeMap<String>();
                - note that the data type that an TreeMap can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        TreeMap<Integer> myInt = new TreeMap<Integer>();
                - it is possible to declare an TreeMap variable using the var keyword
                    - syntax:
                        var <mapObject> = new TreeMap<(object)>();
                    - example:
                        var myTreeMap = new TreeMap<String>();
            
            - access and modification
                - elements are able to be added through the .put() method
                    - note that a key-value pair is required with no duplicate keys
                    - syntax:
                        <mapObject>.put(<key>, <value>);
                    - example:
                        myHashMap.put("idkman", "lumbago");
                    
                - elements are able to be removed through various methods
                    - individual elements are able to be removed using the .remove() method
                        - note that this method takes in a single argument, that being a key
                        - removing a key on a HashSet will also removes the value it holds
                        - syntax:
                            <mapObject>.remove(<key>);
                        - example:
                            myHashMap.remove("idkman");
                    - the entire HasnMap can be cleared using the .clear() method
                        - syntax:
                            <mapObject>.clear();
                        - example:
                            myHashMap.clear();

                - values are able to be queried using a key
                    - if the key matches a known key inside a HashMap, then it returns the value it holds
                    - syntax:
                        <mapObject>.get(<key>);
                    - example:
                        myHashMap.get("idkman");

                - the size of a HashMap is able to be queried
                    - through the .size() method
                    - syntax:
                        <mapObject>.size();
                    - example:
                        myHashMap.size();

        - LinkedHashMap
            - implements the Map interface
                - implementing the Map methods
            - Linke vs HashSets
                - unlike HashSets, which contains no order
                    - Linke are able to preserve insertion order
                - Linke are slightly slower than HashSets
                    - due to Linke keeping track of insertion order

            - declaration and initilaization
                - using the LinkedHashMap class, it must first be imported
                    - imported from the java.util package
                    - syntax:
                        import java.util.LinkedHashMap;
                - after importing, it is declared similar to as creating an object of a class
                    - syntax:
                        LinkedHashMap<(object)> <mapObject> = new LinkedHashMap<(object)>();
                    - example:
                        LinkedHashMap<String> myLinkedHashMap = new LinkedHashMap<String>();
                - note that the data type that an LinkedHashMap can hold must be an object
                    - meaning, declaring a collection of values must match the wrapper class of that data type
                    - refer to Variables.java on Wrapper Classes
                    - example:
                        LinkedHashMap<Integer> myInt = new LinkedHashMap<Integer>();
                - it is possible to declare an LinkedHashMap variable using the var keyword
                    - syntax:
                        var <mapObject> = new LinkedHashMap<(object)>();
                    - example:
                        var myLinkedHashMap = new LinkedHashMap<String>();
            
            - access and modification
                - elements are able to be added through the .put() method
                    - note that a key-value pair is required with no duplicate keys
                    - syntax:
                        <mapObject>.put(<key>, <value>);
                    - example:
                        myHashMap.put("idkman", "lumbago");
                    
                - elements are able to be removed through various methods
                    - individual elements are able to be removed using the .remove() method
                        - note that this method takes in a single argument, that being a key
                        - removing a key on a HashSet will also removes the value it holds
                        - syntax:
                            <mapObject>.remove(<key>);
                        - example:
                            myHashMap.remove("idkman");
                    - the entire HasnMap can be cleared using the .clear() method
                        - syntax:
                            <mapObject>.clear();
                        - example:
                            myHashMap.clear();

                - values are able to be queried using a key
                    - if the key matches a known key inside a HashMap, then it returns the value it holds
                    - syntax:
                        <mapObject>.get(<key>);
                    - example:
                        myHashMap.get("idkman");

                - the size of a HashMap is able to be queried
                    - through the .size() method
                    - syntax:
                        <mapObject>.size();
                    - example:
                        myHashMap.size();
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class DataStructures {
    static void listObjects() {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("idkman");
        myArrayList.add("lumbago");
        myArrayList.remove(0);
        myArrayList.set(0, "idkman");
        System.out.println(myArrayList.get(0));

        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.addFirst("lumbago");
        myLinkedList.addLast("idkman");
        myLinkedList.removeLast();
        myLinkedList.set(0, "lumbago");
        System.out.println(myLinkedList.getFirst());
    }

    public static void main(String[] args) {
        listObjects();
    }
}