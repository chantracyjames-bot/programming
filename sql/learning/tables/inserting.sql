/* insert into */

USE test;

-- INSERT INTO <table_name> (<column/s>)
-- VALUES (value/s);
    -- specifies the columns and the values to be inserted
    -- note that the values must be in order
INSERT INTO yippie (yes, no, probs)
VALUES (1, 'yes', 'maybe');

-- inserting values to specific columns
INSERT INTO yippie (probs)
VALUES ('yippie');
-- forgot to add DEFAULT values but meh

-- inserting multiple values
INSERT INTO yippie
VALUES (3, 'lumbago', 'idkman'),
       (4, 'hello', 'world');

-- INSERT INTO <table_name>
-- VALUES (<value/s>)
    -- inserts values to all of the columns
    -- note that the values must be in order must satisfy all columns
INSERT INTO yippie (yes, no, probs)
VALUES (2, 'no', 'probs');

SELECT * FROM test_view;