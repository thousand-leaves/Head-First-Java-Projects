package jukebox;

import java.util.Collections;
import java.util.List;

public class Jukebox2 {
	
	public static void main(String[] args) {

		new Jukebox2().go();
	}
	
	public void go() {
		List<SongV2> songList = MockSongs2.getSongsV2();
		System.out.println("original songList: " + songList); 
		Collections.sort(songList);
		System.out.println("sorted songList: " + songList);
	}

}