/* not
    - will negate any condition to the opposite expression
        - if the condition is true, NOT will make it false
    - the WHERE clause can contain one or more NOT operators
        - and can be used in combination with other opeerators
        - NOT equals
            - rejects values that are equal to the condition
            - syntax:
                WHERE NOT <column> = <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT language = 'sql'; -- returns anything but 'sql' related
        - NOT greater than
            - rejects values that are greater than the value
            - syntax:
                WHERE NOT <column> > <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number > 4; -- returns anything but numbers greater than 4
        - NOT greater than or equal to
            - rejects values that are greater than or equal to the value
            - syntax:
                WHERE NOT <column> >= <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number >= 4; -- returns anything but numbers greater than or equal to 4
        - NOT less than
            - rejects values that are less than the value
            - syntax:
                WHERE NOT <column> < <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number < 5; -- returns anything but numbers less than 5
        - NOT less than or equal to
            - rejects values that are less than or equal to the value
            - syntax:
                WHERE NOT <column> <= <value>;
            - example:
                SELECT * FROM programming
                WHERE NOT some_number <= 5; -- returns anything but numbers less than or equal to 5
        - NOT LIKE
            - rejects values that matches the LIKE operator
            - syntax:
                WHERE <column> NOT LIKE <pattern>;
            - example:
                SELECT * FROM programming
                WHERE languages NOT LIKE '%on%'; -- returns anything but entries with 'on' inbetween
        - NOT OR
            - rejects values that are included in the OR operator
            - syntax:
                WHERE NOT <condition1> OR NOT <condition2>;
            - examle:
                SELECT * FROM programming
                WHERE some_number >= 9 OR some_number <= 10;
        - NOT BETWEEN
            - rejects values that are between the BETWEEN operator
            - syntax:
                WHERE <column> NOT BETWEEN <value1> AND <value2>;
            - example:
                SELECT * FROM programming
                WHERE some_number NOT BETWEEN 9 AND 10;
        - NOT AND
            - rejects values that are included in the AND operator
            - syntax:
                WHERE NOT <condition1> AND NOT <condition2>;
            - example:
                SELECT * FROM programming
                WHERE NOT languages = 'c' AND languages = 'c++';
        - NOT IN
            - rejects values that are inside the IN operator
            - syntax:
                WHERE <column> NOT IN (<values>);
            - example:
                SELECT * FROM programming
                WHERE languages NOT IN ('c', 'c++') -- returns anything but entries that are 'c' or c++
        - IS NOT NULL
            - rejects the absence of value in a field
            - syntax:
                WHERE <column> IS NOT NULL:
            - example:
                SELECT * FROM programming
                WHERE languages IS NOT NULL;
        - NOT EXISTS
            - flips the resulting boolean value returned by the EXISTS operator
            - syntax:
                WHERE NOT EXISTS (<subquery>);
            - example:
                SELECT * FROM programming
                WHERE NOT EXISTS (SELECT some_number FROM programming);
*/

USE test;

-- NOT equals
SELECT * FROM yippie
WHERE NOT yes = 2;

-- NOT greater than
SELECT * FROM yippie
WHERE NOT yes > 2;

-- NOT greater than or equal to
SELECT * FROM yippie
WHERE NOT yes >= 2;

-- NOT less than
SELECT * FROM yippie
WHERE NOT yes < 2;

-- NOT less than or equal to
SELECT * FROM yippie
WHERE NOT yes <= 2;

-- NOT LIKE
SELECT * FROM yippie
WHERE no NOT LIKE "%i%";

-- NOT OR
SELECT * FROM yippie
WHERE NOT yes >= 2 OR NOT yes <= 3;

-- NOT BETWEEN
SELECT * FROM yippie
WHERE yes NOT BETWEEN 2 AND 3;

-- NOT AND
SELECT * FROM yippie
WHERE NOT probs = 'idkman' AND NOT probs = 'maybe';

-- NOT IN
SELECT * FROM yippie
WHERE probs NOT IN ('idkman', 'maybe');

-- IS NOT NULL
SELECT * FROM yippie
WHERE probs IS NOT NULL;

-- NOT EXISTS
SELECT * FROM yippie
WHERE NOT EXISTS (SELECT yes FROM yippie);