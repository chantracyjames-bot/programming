USE test;

-- LIKE
-- values starting with
SELECT * FROM yippie
WHERE probs LIKE 'a%';

-- values ending with
SELECT * FROM yippie
WHERE probs LIKE '%a';

-- values with a value in between
SELECT * FROM yippie
WHERE probs LIKE '%a%';

-- values with atleast a character amunt in lenght
SELECT * FROM yippie
WHERE no LIKE '_%'; -- single character

-- values with a value in the second position
SELECT * FROM yippie
WHERE no LIKE '_a%';

-- NOT LIKE
SELECT * FROM yippie
WHERE no NOT LIKE '%a%'; -- no 'a' in between