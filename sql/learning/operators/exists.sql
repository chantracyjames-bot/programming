USE test;

-- EXISTS
SELECT * FROM yippie
WHERE EXISTS (SELECT yes from yippie);

-- NOT EXISTS
SELECT * FROM yippie
WHERE NOT EXISTS (SELECT yes from yippie);