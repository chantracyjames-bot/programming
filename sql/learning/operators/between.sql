USE test;

-- BETWEEN syntax
SELECT * FROM yippie
WHERE yes BETWEEN 1 AND 2;

-- AND equivalent
SELECT * FROM yippie
WHERE yes >= 1 AND yes <= 2;

-- text values
SELECT * FROM yippie
WHERE no BETWEEN 'idkman' AND 'yes';

-- AND equivalent
SELECT * FROM yippie
WHERE no >= 'idkman' AND no <= 'yes';

-- NOT BETWEEN 
SELECT * FROM yippie
WHERE no NOT BETWEEN 'idkman' AND 'lumbago'