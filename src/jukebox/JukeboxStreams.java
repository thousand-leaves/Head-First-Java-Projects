package jukebox;

import java.util.List;
import java.util.stream.Collectors;

public class JukeboxStreams {

	public static void main(String[] args) {

		List<Song> songs = new Songs().getSongs();
		
		// Find Rock songs
		List<Song> rockSongs = songs.stream()
									.filter(song -> song.getGenre().equals("Rock"))
									.collect(Collectors.toList());
		System.out.println("Rock songs: " + rockSongs);
		
		// Find Rock-ish songs 
		List<Song> rockySongs = songs.stream()
									 .filter(song -> song.getGenre().contains("Rock"))
									 .collect(Collectors.toList());
		System.out.println("Rock-y songs: " + rockySongs);
		
		// List all genres
		List<String> genres = songs.stream()
								   .map(song -> song.getGenre())
								   .distinct()
								   .collect(Collectors.toList());
		System.out.println("Genres: " + genres);
		
		// Songs with the same title / cover versions
		String songTitle = "With a Little Help from My Friends";
		List<String> result = songs.stream()
								   .filter(song -> song.getTitle().equals(songTitle))
								   .map(song -> song.getArtist())
								   .filter(artist -> !artist.equals("The Beatles"))
								   .collect(Collectors.toList());
		System.out.println("Versions of With a Little Help from My Friends: " + result);
								   
		
	}

}
