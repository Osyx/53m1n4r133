package integration;

class Display {
	/**
	 * <code>currentNumber</code> contains the value shown on the display.
	 */
	private int currentNumber = 0;
	
	/**
	 * Constructor for <code>Display</code>.
	 */
	Display(){
		  
	}
	
	/**
	 * Displays the next number on the display.
	 */
	void displayNextNumber(){
		if (++currentNumber > 999)
			currentNumber = 1;
		System.out.println("Current number: " + currentNumber);
	}
} 