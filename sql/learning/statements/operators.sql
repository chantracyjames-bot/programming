/* and
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
*/

/* or
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
*/

/* not
    - will negate any condition to the opposite expression
        - if the condition is true, NOT will make it false
    - the WHERE clause can contain one or more NOT operators
        - and can be used in combination with other opeerators
        - NOT equals
            - syntax:
                WHERE NOT <column> = <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT language = 'sql'; -- returns anything but 'sql' related
        - NOT greater than or NOT greater than or equal to
            - syntax:
                WHERE NOT <column> > <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number > 4; -- returns anything but numbers greater than 4
        - NOT less than or NOT less than or equal to
            - syntax:
                WHERE NOT <column> < <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number < 5; -- returns anything but numbers less than 5
        - NOT LIKE
            - syntax:
                WHERE <column> NOT LIKE <expression>;
            - example:
                SELECT * FROM programming
                WHERE languages NOT LIKE '%on%'; -- returns anything but entries with 'on' inbetween
        - NOT BETWEEN
            - syntax:
                WHERE <column> NOT BETWEEN <value1> AND <value2>;
            - example:
                SELECT * FROM programming
                WHERE some_number NOT BETWEEN 9 AND 10;
        - NOT IN
            - syntax:
                WHERE <column> NOT IN (<values>);
            - example:
                SELECT * FROM programming
                WHERE languages NOT IN ('c', 'c++') -- returns anything but entries that are 'c' or c++
        - IS NOT NULL
        - NOT EXISTS
*/

/* and & or
    - can be used for advanced filtering
        - like in complex expressions
    - example:
        SELECT * FROM programming
        WHERE languages = 'java' AND (some_number = 1 OR some_number = 2);
*/

/* and, or, and not
    - can be used for more advanced filtering
        - for more complex expressions
    - example:
        SELECT * FROM programming
        WHERE NOT langauges = 'rust' AND (NOT some_number = 9 OR NOR some_number = 10);
*/