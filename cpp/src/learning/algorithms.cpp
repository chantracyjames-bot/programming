/* algorithms
    - Algorithms
        - are used to solve problems related to sorting, searching, or manipulating data strutures
            - Searching Algorithms
                - these types of algorithms are used to find certain elements inside a collection
                - a well-known searching algorithm is called "Binary Search"
            - Sorting Algoriths
                - these types of algorithms are uses to sort collections
                    - depending on what order the resulting collection becomes
                - a common order type is natural order
            - Iteration
                - iteration is also another type of algorithm
                    - used to loop through elements
                - refer to Iteratives.java for more info

    - C++ Algorithms
        - has various functions for searching or sorting data structures in C++
            - imported through the <algorithms> header library
            - syntax:
                #include <algorithms>
        - Sorting
            - std::sort()
                - sorts elements in a data structure
                    - sorting via lexicographical order (ASCII-based)
                - takes two arguments
                    - <start_iterator> is the starting point of a data structure
                    - <end_iterator> is the end point of a data structure
                - syntax:
                    std::sort(<start_iterator>, <end_iterator>);
                - example:
                    std::sort(myVector.begin(), myVector.end());
                - to reverse the order, the .rbegin() and .rend() methods are used
                    - example:
                        std::sort(myVector.rbegin(), myVector.rend());
        - Searching
            - std::find()
                - searches for specific elements in a data structure
                - takes three arguments:
                    - <start_iterator> is the starting point in a data structure
                    - <end_iterator> is the end point in a data structure
                    - <value> is the search item
                - syntax:
                    std::find(<start_iterator>, <end_iterator>, <value>);
                - example:
                    std::find(myDeque.begin(), myDeque.end(), 2);
            - std::upper_bound()
                - searches for the first element that is greater than the specified value
                    - returns the index of the first element that is greater than it
                - typically used in a sorted data structure
                - takes three arguments
                    - <start_iterator> is the starting point in a data structure
                    - <end_iterator> is the end point in a data structure
                    - <value> is the search item
                - syntax:
                    std::upper_bound(<start_iterator>, <end_iterator>, <value>);
                - examle:
                    std::upper_bound(myList.begin(), myList.end(), 1);
            - std::lower_bound()
                - searches for the first element that is greater than or equal to the specified value
                    - returns the index of the first element that is greater than or equal to it
                - typically used in a sorted data structure
                - takes three arguments
                    - <start_iterator> is the starting point in a data structure
                    - <end_iterator> is the end point in a data structure
                    - <value> is the search item
                - syntax:
                    std::lower_bound(<start_iterator>, <end_iterator>, <value>);
                - examle:
                    std::lower_bound(myList.begin(), myList.end(), 1);
            - std::min_element()
                - searches for the smallest element in a data structure
                - takes two arguments
                    - <start_iterator> is the starting point of a data structure
                    - <end_iterator> is the end point of a data structure
                - syntax:
                    std::min_element(<start_iterator>, <end_iterator>);
                - example:
                    std::min_element(myVector.begin(), myVector.end());
            - std::max_element()
                - searches for the largest element in a data structure
                - takes two arguments
                    - <start_iterator> is the starting point of a data structure
                    - <end_iterator> is the end point of a data structure
                - syntax:
                    std::max_element(<start_iterator>, <end_iterator>);
                - example:
                    std::max_element(myVector.begin(), myVector.end());
        - Modifying
            - std::copy()
                - copies elements from one data structure to the other
                - takes three arguments
                    - <source_start_iterator> is the starting point of the source data structure
                    - <soruce_end_iterator> is the end point of the source data structure
                    - <destination_start_iterator> is the starting point of the destination data structuer
                - syntax:
                    std::sort(<source_start_iterator>, <source_end_iterator>, <destination_start_iterator>);
                - example:
                    // if the destination is empty
                    std::copy(std::begin(myVector), std::end(myVector), std::begin(copyVector));

                    // if the destination is not empty or already has elements inside it
                    std::copy(std::begin(myVector), std::end(myVector), srd::back_inserter(copyVector)); // redirects new elements to .push_back()
            - std::fill()
                - fills a data structure with a specified value
                - takes three arguments
                    - <start_iterator> is the starting point of a data structure
                    - <end_iterator> is the end point of a data structure
                    - <value> is the fill value
                - syntax:
                    std::fill(<start_iterator>, <end_iterator>, <value>);
                - example:
                    std::fill(myVector.begin(), myVector.end(), 12);
*/