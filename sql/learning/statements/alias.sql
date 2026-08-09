/* AS alias */

USE test;

-- SELECT <column> AS <alias_name>
-- FROM <table_name>;
    -- used to create alias names for a column
        -- making reading result-sets more readable
SELECT yes AS yesAlias
FROM yippie;

-- SELECT <column> AS <"alias_name">
-- FROM <table_name>;
    -- used to create alias names for a column
        -- making reading result-sets more readable
    -- double quotes makes it possible for aliases with more than one word
SELECT yes AS "yes Alias yes"
FROM yippie;

-- SELECT <column/s> AS <alias_name>
-- FROM <table_name>;
    -- used to create alias names for columns
        -- making reading result-sets more readable
SELECT yes AS yesAlias, no AS "no Alias no"
FROM yippie;

-- SELECT <column/s> 
-- FROM <table_name> AS <alias_name>;
    -- used to create alias names for tables
        -- making reading result-sets more readable
SELECT *
FROM yippie AS yippieAlias;

-- SELECT <column/s>, CONCAT_WS(<separator>, <column/s>) AS <alias_name>
-- FROM <table_name>;
    -- used to create an alias for the CONCAT_WS function
        -- combines multiple columns with a separator
SELECT CONCAT_WS(', ', yes, no, probs) AS "yippie stuff"
FROM yippie;