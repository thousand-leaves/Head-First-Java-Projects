package sinkastartup;

import java.util.ArrayList;

public class StartupBust {

	private GameHelper helper = new GameHelper();
	private ArrayList<Startup> startups = new ArrayList<Startup>();
	private int numOfGuesses = 0;
	
	public void setupGame() {
		Startup startup1 = new Startup();
		Startup startup2 = new Startup();
		Startup startup3 = new Startup();
		
		startup1.setName("zipzap");
		startup2.setName("integra");
		startup3.setName("cashVape");
		
		startups.add(startup1);
		startups.add(startup2);
		startups.add(startup3);
		
		System.out.println("Your goal is to sink three Startups!");
		System.out.println("zipzap - an electic car share app shocking the market!");
		System.out.println("integra - an oil and sports betting company putting integrity first");
		System.out.println("and finally cashVape - a market leading ape based cryptocurrency that encourages you to exchange your vaping products for nfts");
		System.out.println("Try to sink all these suckers in the fewest number of turns");
		
		for (Startup startup : startups) {
			ArrayList<String> newLocation = helper.placeStartup(3);
			startup.setLocationCells(newLocation);
		}	
	}
	
	public void startPlaying() {
		while (!startups.isEmpty()) {
			String userGuess = helper.getUserInput("Go on... have a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	public void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		for (Startup startupToTest : startups) {
			result = startupToTest.checkYourself(userGuess);
			
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				startups.remove(startupToTest);
				break;
			}
		}
		
		System.out.println("result: " + result);
	}
	
	public void finishGame() {
		System.out.println("GAME OVER - pointless Startups have been obliterated");
		
		if (numOfGuesses < 20 ) {
			System.out.println("It only took you " + numOfGuesses + " attempts");
		} else {
			System.out.println("Better luck next time. It took you " + numOfGuesses + " attempts to sink all the Startups");
		}
	}
	
	public static void main(String[] args) {
		StartupBust game = new StartupBust();
		game.setupGame();
		game.startPlaying();
	}
}
