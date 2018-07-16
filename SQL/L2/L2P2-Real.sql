/*
You have just been hired as a Data Analyst for a company that sells music to customers. They would like a list of playlists and the tracks that live inside each playlist. 
They want to see the Name of the playlist, Name of the tracks in the playlist, 
the Composer for each track and the UnitPrice. They also want to see all data, even if it is Null.
They would like to see it in reverse alphebetical order of the Composers.
*/

Select TrackId, playlist_track.PlaylistId, tracks.Name, AlbumId, Composer, Milliseconds, genres.Name  as Genres,  Bytes, UnitPrice, playlists.Name as Playlist
from tracks
join genres USING (GenreId) join playlist_track USING (TrackId) join playlists USING (PlaylistId) 
Order By Composer DESC;