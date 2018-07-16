/*Write a query that lists out all information of every track along with the Name of the Genre for each track, even if a genre doesn't exist for that track.*/

SELECT TrackId, tracks.Name as Album, GenreId, Composer, genres.Name as Genre from tracks 
JOIN genres USING (GenreId);
 