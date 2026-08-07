/* views
    - is a virtual table based on the the result-set of an SQL statement
        - containing rows and columns, like a real table
        - showing real-time data due to the database engine only storing the view's definition
            - or the SELECT statement and not a copy of the data
    - the fields in the view are fields from one or more real tables
        - that is from the tables in the database
    - it is possible to add SQL statements and functions to a view
        - and present the data as if it were coming from one single table
*/

USE test;

-- CREATE VIEW <view_name> AS
-- SELECT <column/s>
-- FROM <table_name>;
    -- creates a new view with a specific name
CREATE VIEW test_view AS
SELECT yes FROM yippie;

-- SELECT <column/s>
-- FROM <view_name>;
    -- queries a specific view
SELECT * FROM test_view;

-- CREATE OR REPLACE VIEW <view_name>
-- SELECT <column/s>
-- FROM <table_name>;
    -- creates a new view with a specific name
    -- or replaces the view if it already exists
CREATE OR REPLACE VIEW test_view AS
SELECT * FROM yippie;

-- DROP VIEW <view_name>;
    -- deletes a specific view
DROP VIEW test_view;