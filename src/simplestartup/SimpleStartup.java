package simplestartup;

public class SimpleStartup {

	public static void main(String[] args) {

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleStartup theStartUp = new SimpleStartup();
		int randomNumber = (int) (Math.random() * 5);
		int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
		theStartUp.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive == true) {
			int guess = helper.getUserInput("enter a number");
			String result = theStartUp.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
		
	}
	
	int[] locationCells;
	int numberOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(int guess) {
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numberOfHits++;
				break;
			}
		}
		
		if (numberOfHits == locationCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
	
}
