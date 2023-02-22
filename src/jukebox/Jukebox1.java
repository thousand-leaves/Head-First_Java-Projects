package jukebox;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {

	public static void main(String[] args) {

		new Jukebox1().go();
	}
	
	public void go() {
		List<String> songList = MockSongs1.getSongStrings();
		System.out.println("original songList: " + songList); 
		Collections.sort(songList);
		System.out.println("sorted songList: " + songList);
	}

}
