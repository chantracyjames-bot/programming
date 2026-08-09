/* IN operator
    - used to check if a specified column's value matches any value in a provided list
        - commonly used in a WHERE clause
    - functions as a shorhard for mulitple OR conditions
        - making queries shorter and more readable
    - can be combined with the NOT operator
*/

USE test;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> IN (<values>);
    -- IN syntax
SELECT * FROM yippie
WHERE no IN ('idkman', 'yes');

-- OR equivalent
SELECT * FROM yippie
WHERE no = 'idkman' OR no = 'yes';

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> NOT IN (<values>);
    -- NOT IN syntax
SELECT * FROM yippie
WHERE no NOT IN ('idkman', 'yes');