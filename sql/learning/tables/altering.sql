/* altering tables */

-- USE <database_name>
    -- uses a specific database
USE test;

-- ALTER TABLE has a few common operations:
    -- adding columns
    -- dropping columns
    -- renaming columns
    -- modifying columns
    -- adding constraints
    -- renaming a table

-- ALTER TABLE <table_name>
-- ADD <column_name> <data_type>;
    -- adds a new column with a datatype to an existing table
ALTER TABLE idkman
ADD probs varchar(255);

-- ALTER TABLE <table_name>
-- DROP COLUMN <solumn_name>;
    -- deletes a column from a table
ALTER TABLE idkman
DROP COLUMN probs;

-- ALTER TABLE <table_name>
-- RENAME COLUMN <old_column_name> TO <new_column_name>;
    -- renames a column from a table
ALTER TABLE idkman
RENAME COLUMN maybe TO probs;

-- ALTER TABLE <table_name>
-- MODIFY <column_name> <new_datatype> <constraint>;
    -- modifies the datatype and contraint of an existing column from a table
ALTER TABLE idkman
MODIFY probs varchar(100) NOT NULL;

-- ALTER TABLE <table_name>
-- ADD CONSTRAINT <constraint_name> <constraint_definition>;
    -- adds a constraint to an existingtable
ALTER TABLE idkman
ADD CONSTRAINT CHK_yes CHECK (yes <= 10);
    -- allows yes entries less than or equal to 10

-- ALTER TABLE <table_name>
-- RENAME TO <new_table_name>;
    -- renames a table to a new name
ALTER TABLE idkman
RENAME TO yippie;

-- SHOW TABLES;
    -- shows all current tables in a database
SHOW TABLES;