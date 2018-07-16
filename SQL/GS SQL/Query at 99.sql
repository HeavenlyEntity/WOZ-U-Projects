/*Query the Name, Composer, Bytes and UnitPrice of tracks that are .99 cents, less than 8,000,000 Bytes and begin with a or c.*/

SELECT Name, Composer, Bytes, UnitPrice FROM tracks
WHERE Name LIKE "a%" OR Name LIKE "c%"
AND UnitPrice = 0.99 AND Bytes < 8000000 ;