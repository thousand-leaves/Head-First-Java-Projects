package jukebox;

import java.util.*;

public class Jukebox1 {

	public static void main(String[] args) {

		new Jukebox1().go();
	}
	
	public void go() {
		List<String> songList = MockSongs.getSongStrings();
		System.out.println(songList); 
	}

}
