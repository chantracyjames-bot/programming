/* LIKE operator
    - used to search for a speciied pattern within a column's text data
        - commonly used in the WHERE caluse
    - has two wildcards
        - %
            - percent sign
            - represents zero, one, or multiple characters
        - _
            - underscore sign
            - represents a single character
    - wildcards are able to be used together
    - can be combined with the NOT operator
*/

USE test;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> LIKE <pattern>;
    -- LIKE syntax

-- values starting with
SELECT * FROM yippie
WHERE probs LIKE 'a%';

-- values ending with
SELECT * FROM yippie
WHERE probs LIKE '%a';

-- values with a value in between
SELECT * FROM yippie
WHERE probs LIKE '%a%';

-- values with atleast a character amunt in lenght
SELECT * FROM yippie
WHERE no LIKE '_%'; -- single character

-- values with a value in the second position
SELECT * FROM yippie
WHERE no LIKE '_a%';

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> NOT LIKE <pattern>;
    -- NOT LIKE syntax
SELECT * FROM yippie
WHERE no NOT LIKE '%a%'; -- no 'a' in between