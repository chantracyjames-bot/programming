/* constraints 
    - are rules for data in a table
    - used to prevent insertion of invalid data in a table
        - ensuring the accuracy and reliabilty of data in the table
    - if any action results in a violation of the constraint and the data
        - the action is aborted
    - constraints are able to be specified to a table in two ways
        - when creating a table using the CREATE TABLE statament
        - when altering a table using the ALTER TABLE statement
    - column-level vs table-level
        - column-level constraints only apply to a certain column
        - while table-level constraints apply to all columns in that table

    - there are common constraints in MySQL
        - NOT NULL
            - ensures that a column cannot have a NULL value
            - NULL values are allowed by default
        - UNIQUE
            - ensures that a column only has unqie values
            - duplicate values are allowed by default
        - PRIMARY KEY
            - uniquely identifies each row in a table
                - a combination of a NOT NULL and UNIQUE constraints
            - only one PRIMARY KEY is allowed per table
            - tables with a PRIMARY KEY is called the parent table
        - FOREIGN KEY
            - establishes a link between data in two tables
                - prevents any action that destroys the link between them
                - refera to the PRIMARY KEY of another table
            - prevents invalid data from being inserted into the foreign key column
                - because the value has to exist in the parent table
            - prevents the child table from deleting data in the parent table
                - if related rows still exists in the child table
            - tables with a FOREIGN KEY is called the child table
        - CHECK
            - ensures that each value in a column satisfy a specific condition
        - DEFAULT
            - sets a default value to a column if no value is speficied
        - CREATE INDEX
            - creates indexes on columns
                - user cant see indexes
            - used to retrive data from the database faster
            - note that tables with indexes are more time consuming
                - due to the indexing also being updated
                - unlike tables that contains no indexing
*/

USE test;

/* NOT NULL constraints */

-- creating a NOT NULL colum
CREATE TABLE IF NOT EMPTY constraints (
    EntryName varchar(255) NOT NULL
);

-- adding a NOT NULL column
ALTER TABLE constraints
MODIFY EntryName varchar(255) NOT NULL;

-- removing a NOT NULL column
ALTER TABLE constraints
MODIFY EntryName varchar(255) NULL;

/* UNIQUE constraints */

-- creating a Unique column
CREATE TABLE IF NOT EMPTY constraints (
    Nickname varchar(255),
    UNIQUE (Nickname)
);

-- creating a named UNIQUE column
CREATE TABLE IF NOT EMPTY constraints (
    Nickname varchar(255),
    UNIQUE (Nickname)
);

-- adding a UNIQUE column
ALTER TABLE constraints
ADD UNIQUE (Nickname);

-- adding a named UNIQUE column
ALTER TABLE constraints
ADD CONSTRAINT UC_Nickname UNIQUE (Nickname);

-- removing a UNIQUE column
ALTER TABLE constraints
DROP INDEX UC_Nickname;

/* PRIMARY KEY constraints */

-- creating a PRIMARY KEY column
CREATE TABLE IF NOT EMPTY constraints (
    ID int,
    PRIMARY KEY (ID)
);

-- creating a named PRIMARY KEY column
CREATE TABLE IF NOT EMPTY constraints (
    ID int,
    CONSTRAINT PK_ID PRIMARY KEY (ID)
);

-- adding a PRIMARY KEY column
ALTER TABLE constraints
ADD PRIMARY KEY (ID);

-- adding a named PRIMARY KEY column
ALTER TABLE constraints
ADD CONSTRAINT PK_ID PRIMARY KEY (ID);

-- removing a PRIMARY KEY column
ALTER TABLE constraints
DROP PRIMARY KEY;

/* FOREIGN KEY constraints */

-- creating a named FOREIGN KEY column
CREATE TABLE IF NOT EXISTS other (
    ID int,
    CONSTRAINT FK_constraints 
    FOREIGN KEY (ID) 
    REFERENCES constraints(ID)
);

-- adding a named FOREIGN KEY column
ALTER TABLE other
ADD CONSTRAINT FK_constraints
FOREIGN KEY (ID)
REFERENCES constraints(ID);

-- removing a FOREIGN KEY column
ALTER TABLE constraints
DROP FOREIGN KEY FK_ID;

/* CHECK constraints */

-- creating a CHECK column
CREATE TABLE IF NOT EXISTS constraints (
    Age int CHECK (Age >= 18)
);

-- creating a named CHECK column
CREATE TABLE IF NOT EXISTS constraints (
    Age int,
    CONSTRAINT CHK_Age CHECK (Age >= 18)
);

-- adding a CHECK column
ALTER TABLE constraints
ADD CHECK (Age >= 18);

-- adding a named CHECK column
ALTER TABLE constrants
ADD CONSTRAINTS CHK_Age CHECK (Age >= 18);

-- deleting a CHECK column
ALTER TABLE constrants
DROP CHECK CHK_Age;

/* DEFAULT constrants*/

-- creating a DEFAULT value
CREATE TABLE IF NOT EXISTS constraints (
    PermAddress varchar(255) DEFAULT 'Earth'
);

-- creating a DEFAULT value using system functions
CREATE TABLE IF NOT EXISTS constraints (
    DateRegistered date DEFAULT CURRENT_DATE()
);

-- modifying a column with a DEFAULT value
ALTER TABLE constraints
ALTER PermAddress SET DEFAULT 'Earth';

-- removing a DEFAULT alue
ALTER TABLE constraints
ALTER PermAddress DROP DEFAULT;

/* CREATE INDEX constraints */

-- creating an INDEX
CREATE INDEX IDX_entry_nick
ON constraints (EntryName, Nickname);

-- creating a UNIQUE INDEX
CREATE UNIQUE INDEX IDX_const_id
ON constraints (ID);

-- DROP INDEX
ALTER TABLE constraints
DROP INDEX idx_entry_nick;