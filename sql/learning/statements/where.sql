/* where
    - used to filter records from a database
    - extracts entries that fulfill a certain condition
        - commonly used in SELECT, UPDATE, DELETE, etc
    - syntax:
        WHERE <condition>;
        -- used in a SELECT statament
        SELECT <column>
        FROM <table_name>
        WHERE <condition>;
    - example:
        SELECT languages
        FROM programming
        WHERE langugaes = 'sql';
    - conditions
        - it is possible to either have a number or text as a conditions
            - example:
                WHERE languages = 'idkman';
                // or
                WHERE some_number = 1;
        - it is possible to have other conditions
            - conditions:
                symbol      description
                  =         Equal to
                  >         Greater than
                  <         Less than
                  >=        Greater than or equal to
                  <=        Less than or equal to
                  <>        Not equal
                  !=        Not equal, some versions allows this
                BETWEEN     between a certain range
                 LIKE       searches for a pattern
                  IN        specify multiple possible values for a column

            - syntax:
                -- Equals to
                WHERE <column> = <value>;

                -- Greater than
                WHERE <column> > <value>;

                -- Less than
                WHERE <column> < <value>;

                -- Greater than or equal to
                WHERE <column> >= <value>;

                -- Less than or equal to
                WHERE <column> <= <value>;

                -- Not equal to 
                WHERE <column> <> <value>;

                -- between
                WHERE <column> BETWEEN <lower_bound> AND <upper_bound>;

                -- like
                WHERE <column> LIKE <expression>;

                -- in
                WHERE <column> IN (<values>);
                
            - example:
                -- Equals to
                WHERE languages = 'sql';

                -- Greater than
                WHERE some_number > 9;

                -- Less than
                WHERE some_number < 10;

                -- Greater than or equal to
                WHERE some_number >= 9;

                -- Less than or equal to
                WHERE some_number <= 10;

                -- Not equal to 
                WHERE some_number <> 21;

                -- between
                WHERE some_number BETWEEN 9 AND 10;

                -- like
                WHERE language LIKE 'python'; -- exact match
                WHERE language LIKE %p%;      -- % is any number of char
                WHERE language LIKE py%;      -- starts with
                WHERE language LIKE %on;      -- ends with
                WHERE language LIKE %th%;     -- contains
                WHERE language LIKE pytho_;   -- _ is one char

                -- in
                WHERE language IN ('python', 'sql');

*/