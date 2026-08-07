/* general
    - syntaxes
        - case-sensitive
            - select and SELECT are the same statement
        - semicolons
            - some database systems require a semicolon at the end of each SQL statement
            - it is the standard way to separate each SQL statement in database systems
                - allowing for more than one SQL statement to be executed 
                - all while in the same call to the server
        - text vs numbers
            - like in most programming languages
                - text or strings are enclosed in single quotes ''
                - some databases allow double quotes " "
                - example:
                    'idkman'
            - while dealing with numbers
                - it does not require any quotations
                - example:
                    23
        - comments
            - single-line comments
                - can be a double dash --
                    -- this is a comment
                - or can be a double frontslash //
                    - similar to C-style languages
                    // this is a comment
            - multi-line comments
                - through the C-style multi-line comment
                /*
                    don't mind the space
                    removing that will break the
                    structure of the multi-line stuff
                * /
    
    - important SQL commands
        - SELECT
            - extracts data from a database
        - UPDATE
            - updates data in a database
        - DELETE
            - deletes data from a database
        - INSERT INTO
            - inserts new data into a database
        - CREATE DATABASE
            - creates a new database
        - ALTER DATABASE
            - alters or mofidies a database
        - CREATE TABLE
            - creates a new table
        - ALTER TABLE
            - alters of modifies a table
            - operations are: adding, dropping, renaming, modifying columns, adding constraints, and renaming the table
        - DROP TABLE
            - delets a table
        - CREATE INDEX
            - creates an index or a seach key
        - DROP INDEX
            - deletes an index
*/

CREATE DATABASE IF NOT EXISTS learning;

USE learning;

SHOW DATABASES;
SHOW TABLES

SELECT * FROM programming