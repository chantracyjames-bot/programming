SHOW DATABASES;
CREATE DATABASE IF NOT EXISTS learning;

USE learning;
SHOW TABLES;

CREATE TABLE IF NOT EXISTS programming (
    EntryNumber int AUTO_INCREMENT PRIMARY KEY,
    LanguageName varchar(255) NOT NULL,
    UNIQUE (LanguageName)
);

INSERT INTO programming (LanguageName)
VALUES ('test');

CREATE OR REPLACE VIEW programming_view AS
SELECT * FROM programming;

SELECT * FROM programming_view;

TRUNCATE TABLE programming;