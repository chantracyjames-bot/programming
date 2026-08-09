/* and & or 
    - and
        - will run if all conditions are true
            - if not, it does not run at all
        - the WHERE clause can contain one or more AND operators
            - the and operator is used to filter records
            - based on more than one condition
            - syntax:
                SELECT <column> FROM <table_name>
                WHERE <condition1> AND <condition2>;
            - example:
                SELECT * FROM programming
                WHERE language = 'sql' AND some_number = 1; -- runs if noth are true
    - or
        - will run if one of the conditions is true
            - if none are true, it does not run at all
        - the WHERE clause can contain one ore more OR operators
            - the or operator is used to filter records
            - based on more than one codition
            - syntax:
                SELECT <column> FROM <table_name>
                WHERE <condition1> OR <condition2>;
            - example:
                SELECT * FROM programming
                WHERE language = 'sql' OR some_number = 1; -- runs if either are true
    - and & or
        - can be used for advanced filtering
            - like in complex expressions
        - example:
            SELECT * FROM programming
            WHERE languages = 'java' AND (some_number = 1 OR some_number = 2);
*/

USE test;

-- AND
SELECT * FROM yippie
WHERE yes = 1 AND no = 'yes';

-- OR
SELECT * FROM yippie
WHERE probs = 'idkman' OR probs = 'maybe';

-- NOT AND
SELECT * FROM yippie
WHERE NOT yes = 1 AND NOT no = 'yes';

-- NOT OR
SELECT * FROM yippie
WHERE NOT probs = 'idkman' OR NOT probs = 'maybe';