/* creating databases */

-- CREATE DATABASE <database_name>;
    -- creates a new database with a specific name
CREATE DATABASE test;

-- CREATE DATABASE IF NOT EXISTS <database_name>;
    -- creates a new database if the name does not exists
CREATE DATABASE IF NOT EXISTS test;

-- SHOW DATABASES;
    -- shows all current databases
SHOW DATABASES;

/* deleting databases */

-- DROP DATABASE <database_name>;
    -- deletes a specific database and all of its contents
    -- deletes its ables, views, stored prcedures, and data
DROP DATABASE test;

-- DROP DATABASE IF EXISTS <database_name>;
    -- deletes a specific database if it exists
DROP DATABASE IF EXISTS test;

-- SHOW DATABASES;
    -- shows all current databases
SHOW DATABASES;