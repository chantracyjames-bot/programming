/* EXISTS operator
    - used to check whether a subquery returns any rows
        - commonly used in a WHERE clause
    - evaluates to TRUE if the subquery returns at least one row
        - returns FALSE otherwise
    - can be used with the NOT operator
*/

USE test;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE EXISTS (<subquery>);
    -- EXISTS syntax
SELECT * FROM yippie
WHERE EXISTS (SELECT yes from yippie);

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE NOT EXISTS (<subquery>);
    -- NOT EXISTS syntax
SELECT * FROM yippie
WHERE NOT EXISTS (SELECT yes from yippie);