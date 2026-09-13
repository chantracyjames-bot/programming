USE test;

    -- IN syntax
SELECT * FROM yippie
WHERE no IN ('idkman', 'yes');

-- OR equivalent
SELECT * FROM yippie
WHERE no = 'idkman' OR no = 'yes';

    -- NOT IN syntax
SELECT * FROM yippie
WHERE no NOT IN ('idkman', 'yes');