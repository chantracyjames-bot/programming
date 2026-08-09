/* aggregate functions 
    - are functions that performs calculations on a set of values
        - returns a single value
    - often used with the GROUP BY clause and SELECT statement
        - GROUP BY splites the result-set into groups of values
        - and the aggregate function can be used to return a single value for each group
    - common SQL aggregate functions are
        - MIN()
            - returns the smallest value of a column
        - MAX()
            - returns the largest value of a column
        - COUNT()
            - returns the number of rows in a set
        - SUM()
            - returns the sum of a numerical column
        - AVG()
            - returns the average value of a numerical solumn
    - note that the COUNT(*) function does not ignore null values
        - unlike the other aggregate functions with ignore null values
*/

USE test;
SELECT * FROM test_view;

/* MIN() function */

-- SELECT MIN(<column>)
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the smallest value of the selected column
    -- works with numeric, string, and date data types
SELECT MIN(yes)
FROM yippie;

-- SELECT MIN(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the smallest value of the selected column
    -- works with numeric, string, and date data types
    -- <name> gives the returned value a name
SELECT MIN(yes) AS minVal
FROM yippie;

/* MAX() function */

-- SELECT MAX(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the largest value of the selected column
    -- works with numeric, string, and date data types
SELECT MAX(yes)
FROM yippie;

-- SELECT MAX(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the smallest value of the selected column
    -- works with numeric, string, and date data types
    -- <name> gives the returned value a name
SELECT MAX(yes) AS maxVal
FROM yippie;

/* COUNT() function */

-- SELECT COUNT(*)
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- counts the total rows in a table, including null values 
SELECT COUNT(*)
FROM yippie;

-- SELECT COUNT(*) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- counts the total rows in a table, including null values 
    -- <name> gives the returned value a name
SELECT COUNT(*) AS totalRows
FROM yippie;

-- SELECT COUNT(<column>)
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- counts all non-null values in the column
SELECT COUNT(yes)
FROM yippie;

-- SELECT COUNT(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- counts all non-null values in the column
    -- <name> gives the returned value a name
SELECT COUNT(yes) AS yesCount
FROM yippie;

-- SELECT COUNT(DISTINCT <column>)
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- countes only the unique, non-null values in the column
SELECT COUNT(DISTINCT yes)
FROM yippie;

-- SELECT COUNT(DISTINCT <column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- returns the number of rows that matches a specified criterion
    -- countes only the unique, non-null values in the column
    -- <name> gives the returned value a name
SELECT COUNT(DISTINCT yes) AS yesCountDistinct
FROM yippie;

/* SUM() */

-- SELECT SUM(<column>)
-- FROM <table_name>
-- WHERE <condition>;
    -- calculates the total sum of values within a numeric column
    -- ignores NULL values in the cooumn
SELECT SUM(yes)
FROM yippie;

-- SELECT SUM(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- calculates the total sum of values within a numeric column
    -- ignores NULL values in the cooumn
    -- <name> gives the returned value a name
SELECT SUM(yes) AS yesSum
FROM yippie;

/* AVG() */

-- SELECT AVG(<column>)
-- FROM <table_name>
-- WHERE <condition>;
    -- calculates the average value of values within a numeric column
    -- ignores NULL values in the cooumn
SELECT AVG(yes)
FROM yippie;

-- SELECT AVG(<column>) AS <name>
-- FROM <table_name>
-- WHERE <condition>;
    -- calculates the average valye of values within a numeric column
    -- ignores NULL values in the cooumn
    -- <name> gives the returned value a name
SELECT AVG(yes) AS yesAvg
FROM yippie;

-- example with WHERE condition
SELECT * FROM yippie
WHERE yes >= (SELECT AVG(yes) FROM yippie);