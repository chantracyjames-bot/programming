/* select
    - used to select data from a database
    - the data returned is stored in a result table
        - called a result-set
    - to select a specific column in a database
        - the SELECT keyword is used to select a column
        - while the FROM keyword is used to denote where the data is from
        - syntax:
            SELECT <column>
            FROM <table_name>;
        - example:
            SELECT languages
            FROM programming;
    - to select specific columns
        - the same syntax is used but with the comma , separator
        - syntax:
            SELECT <column1>, <column2>, ...
            FROM <table_name>;
        - example:
        SELECT languages, some_numbers
        FROM programming;
    - to select all columns without specifying any column name
        - both the SELECT and FROM keyword is combined
        - syntax:
            SELECT * FROM <table_name>;
        - example:
            SELECT * FROM programming;
*/

/* select distinct
    - similar to the SELECT keyword
        - but only returns distinct or unique values
    - i.e. disregards any duplicate entries
    - to select specific columns in a database
        - the SELECT DISTINCT keyword is used to select columns
        - while the FROM keyword is used to denote where the data is from
        - syntax:
            SELECT DISTINCT <column1>, <column2>, ...
            FROM <table_name>;
        - example:
            SELECT DISTINCT languages
            FROM programming;
    - using the COUNT() function
        - it is possible to query the number of unique entries from a column
        - syntax:
            SELECT COUNT(DISTINCT <column>) FROM <table_name>;
        - example:
            SELECT COUNT(DISTINCT languages) FROM programming;
*/
