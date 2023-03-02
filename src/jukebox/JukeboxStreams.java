package jukebox;

import java.util.List;
import java.util.Optional;
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
		
		// Check if something exists
		boolean checkExists = songs.stream()
							  .anyMatch(s -> s.getGenre().equals("R&B"));
		if (checkExists) System.out.println("True");

		// Find a specific thing
		Optional<Song> specificResult = songs.stream()
									 .filter(s -> s.getYear() == 1995)
									 .findFirst();
		System.out.println("Song from 1995: " + specificResult);
		
		// Count the items
		long uniqueArtists = songs.stream()
								  .map(Song::getArtist)
								  .distinct()
								  .count();
		System.out.println("Unique artists: " + uniqueArtists);
								   
		
	}

}
