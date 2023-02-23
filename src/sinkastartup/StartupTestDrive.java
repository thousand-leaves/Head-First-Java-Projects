package sinkastartup;

import java.util.ArrayList;

public class StartupTestDrive {
	
	public static void main(String[] args) {
		
		// Instantiate a startup object
		Startup blooty = new Startup();
		
		// Make an ArrayList to hold the location cells
		ArrayList<String> locationCells = new ArrayList<String>();
		locationCells.add("A1");
		locationCells.add("A2");
		locationCells.add("A3");
		locationCells.add("B4");
		locationCells.add("B5");
		locationCells.add("B6");
		locationCells.add("C5");
		locationCells.add("C6");
		locationCells.add("C7");
		
		// Invoke the setter method
		blooty.setLocationCells(locationCells);
		
		// Set a startup name
		blooty.setName("boatyMcBoatFace");
		
		// Make a fake user guess
		String userInput = "A3";
		// Invoke the checkYourself() method and pass it the userInput
		String result = blooty.checkYourself(userInput);

		// ==================================================================
		
		
		// Hit test
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println("hit test: " + testResult);
		
		
	}

}
