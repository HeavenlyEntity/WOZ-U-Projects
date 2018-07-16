/*Write a query that finds all playlists with tracks that have a trackId less than 5 and Bytes less than 6,000,000.*/

select TrackId,Bytes from tracks, playlists
where tracks.Bytes < 6000000