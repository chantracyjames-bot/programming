/* creating tables */

-- USE <database_name>
    -- uses a specific database
USE test;

-- CREATE TABLE <table_name> (
    -- <column_name> <data_type> <constraint>, 
    -- ... 
-- );
    -- creates a table with a specific name
CREATE TABLE idkman (
    yes int PRIMARY KEY,
    no varchar(255) NOT NULL,
    maybe int
);

-- CREATE TABLE <table_name> AS
-- SELECT <column/s>
-- FROM <table_name>
-- WHERE <condition>;
    -- creates a new table while copying content from a pre-existing one
CREATE TABLE lumbago AS
SELECT * FROM idkman;

-- CREATE TABLE IF NOT EXISTS <table_name> (...)
    -- creates a new table if the table does not exists
CREATE TABLE IF NOT EXISTS idkman (
    yes int PRIMARY KEY,
    no varchar(255) NOT NULL,
    maybe int
);

/* deleting tables */

-- TRUNCATE TABLE <table_name>
    -- deletes all records in a table
    -- keeps the table structure, conlumns and constraints
TRUNCATE TABLE lumbago;

-- DROP TABLE <table_name>
    -- deletes a table and all data inside said table
DROP TABLE lumbago;

-- DROP TABLE IF EXISTS <table_name>
    -- deletes a table if it exists
DROP TABLE IF EXISTS lumbago;