package jukebox;

import java.util.*;

public class Jukebox5 {

	public static void main(String[] args) {

		new Jukebox5().go();
	}
	
	public void go() {
		List<SongV3> songList = MockSongs3.getSongsV3();
		System.out.println("original songList: " + songList); 
		
		// Sort by title
		songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
		System.out.println("sorted by title: " + songList);
		
		// Sort by artist
		songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
		System.out.println("sorted by artist: " + songList);
	
		// Sort by BPM
		songList.sort((one, two) -> one.getBpm() - two.getBpm());
		System.out.println("sorted by bpm: " + songList);		
		
		// Sort by title descending order
		songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
		System.out.println("sorted by title (desc): " + songList);
		
		// Remove duplicates by turning into a set
		Set<SongV3> songSet = new TreeSet<>(songList);
		System.out.println("duplicates removed: " + songSet);
		
	}
	
}