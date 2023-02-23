package simplestartup;

public class SimpleStartUpTestDrive {
	
	public static void main(String[] args) {
	
		// Instantiate a SimpleStartup object
		SimpleStartup dot = new SimpleStartup();
		
		// Make an int array for the startup boat location
		int[] locations = {2, 3, 4};
		// Invoke the setter method
		dot.setLocationCells(locations);
		
		// Make a fake user guess
		int userGuess = 2;
		// Invoke the checkYourself() method on the StartUp object and pass it the fake guess
		String result = dot.checkYourself(userGuess);
		
		
		// ===================================================================
		
		// Number of locations test
		String locTestResult = "failed";
		if (locations.length == 3) {
			locTestResult = "passed";
		}
		
		// Locations in range check
		String rangeLocTestResult = "passed";
		for (int loc : locations) {
			if (loc < 0 || loc > 7) {
				rangeLocTestResult = "failed";
			}
		}
		
		// Hit test
		String hitTestResult = "failed";
		if (result.equals("hit")) {
			hitTestResult = "passed";
		}
		
		// Kill test
		String killTestResult = "failed";
		if (result.equals("kill")) {
			killTestResult = "passed";
		}

		System.out.println("num of locations test: " + locTestResult);
		System.out.println("locations in range check: " + rangeLocTestResult);
		System.out.println("hit test: " + hitTestResult);
		System.out.println("kill test: " + killTestResult);
		
	}

}
