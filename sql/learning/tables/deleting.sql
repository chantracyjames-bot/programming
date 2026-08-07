/* deleting */

USE test;

-- DELETE FROM <table_name>
-- WHERE <condition>;
    -- deletes existing records in a table
DELETE FROM yippie
WHERE yes = 4;

-- DELETE FROM <table_name>;
    -- does the same action as TRUNCATE
    -- deletes all records except the columns and structure of the table
