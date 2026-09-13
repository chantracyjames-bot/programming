
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