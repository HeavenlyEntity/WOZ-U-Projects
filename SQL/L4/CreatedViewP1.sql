CREATE VIEW [ArtistsAlbums]
AS
SELECT Name, Title, ArtistId, AlbumId from tracks
INNER JOIN albums USING (AlbumId); 