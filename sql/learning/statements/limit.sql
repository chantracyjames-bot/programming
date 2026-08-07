/* limit 
    - used to limit the number of records to return
    - useful when dealing with large databases
        - as returning a large number of records can significantly impact performance
*/

USE test;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <condition>
-- LIMIT <number>;
    -- limits returned entries by <number>
SELECT * FROM yippie
LIMIT 2;

-- SELECT <column/s>
-- FROM <table_name>
-- ORDER BY <column/s>
-- LIMIT <number>;
    -- limits returned entries by <number>
    -- sorts then returns the limitted entries
SELECT * FROM yippie
ORDER BY no
LIMIT 2;

-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <condition>
-- LIMIT <number> OFFSET <offset>;
    -- limits returned entries by <number>
    -- returns entries based on the offset
        -- LIMIT 2 OFFSET 1 returns entries 2 to 3
SELECT * FROM yippie
LIMIT 2 OFFSET 1;

SELECT * FROM yippie;