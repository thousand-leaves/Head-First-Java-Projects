package sinkastartup;

import java.util.ArrayList;

public class StartupBustTestDrive {

	public static void main(String[] args) {
		
		// Instantiate a new StartupBust object
		StartupBust letsGo = new StartupBust();
		
		// create a Startups ArrayList
		ArrayList<Startup> startups = new ArrayList<Startup>();
		
		// create numOfGuesses variable
		int numOfGuesses = 0;
		
		// Test the setupGame() method 
		Startup startup1 = new Startup();
		startup1.setName("zipzap");
		startups.add(startup1);

		System.out.println(startups.size());
		
		// Test the startPlaying() method
		// Test the checkUserGuess() method
		// Test the finishGame() method
		
	}
	
}
