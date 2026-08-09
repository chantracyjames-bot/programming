/* BETWEEN operator 
    - used to select values within a specified range, the range is inclusive
        - the beginning and the end values of the range is included
        - commonly used in a WHERE clause
    - the values can be numbers, text, or dates
    - functions as a shorhard for mulitple AND conditions
        - making queries shorter and more readable
    - can be used with the NOT operator
*/

USE test;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> BETWEEN <value1> AND <value2>;
    -- BETWEEN syntax
SELECT * FROM yippie
WHERE yes BETWEEN 1 AND 2;

-- AND equivalent
SELECT * FROM yippie
WHERE yes >= 1 AND yes <= 2;

-- text values
SELECT * FROM yippie
WHERE no BETWEEN 'idkman' AND 'yes';

-- AND equivalent
SELECT * FROM yippie
WHERE no >= 'idkman' AND no <= 'yes';

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <column> NOT BETWEEN <value1> AND <value2>;
    -- NOT BETWEEN syntax
SELECT * FROM yippie
WHERE no NOT BETWEEN 'idkman' AND 'lumbago'