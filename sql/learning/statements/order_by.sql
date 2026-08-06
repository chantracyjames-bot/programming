/* order by
    - used to result the result-set
        - either in ascending or descending order
        - it sorts entries by ascending by default
    - syntax:
        ORDER BY <column> <ASC | DESC>;
        -- used in a SELECT statement
        SELECT <column> FROM <table_name>
        ORDER BY <column>;
    - example:
        SELECT languages FROM programming
        ORDER BY langugaes DESC;          -- descending order
    - several columns
        - it is possible to order several columns
        - the column that is first in line gets priority
            - while the succeeding is sorted after the first
            - i.e. if the first column is sorted while the next is not
        - each column is separated by commas ,
        - syntax:
            ORDER BY <column1>, <column2>, ... <ASC | DESC>;
        - example:
            ORDER BY languages, some_number; -- sorts languages first in ascending order
                                             -- then sorts some_number in ascending order
        - it is possible to sort each column separate from the rest
            - done by separating each ascension order with commas ,
            - syntax:
                ORDER BY <column1> <ASC | DESC>, <column2> <ASC | DESC>, ...;
            - example:
                ORDER BY languages ASC, some_number DESC; -- sorts languages first in ascending order
                                                          -- then sorts some_number in descending order
*/