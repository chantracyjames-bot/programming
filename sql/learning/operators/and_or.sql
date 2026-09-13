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