package main.integration;

public class Garage {
	/**
	 * Creates instance of the <code>GarageDoor</code> and the <code>Display</code>.
	 */
	main.integration.Garagedoor garageDoor = new main.integration.Garagedoor();
	main.integration.Display display = new main.integration.Display();
	
	/**
	 * Constructor for the <code>Garage</code>.
	 */
	public Garage(){
		
	}
	/**
	 * Closes the door by calling <code>garageDoor</code>'s function <code>closeDoor()</code>.
	 */
	public void closeDoor(){
		garageDoor.closeDoor();
	}
	/**
	 * Prepares for the next customer by opening the door and showing the queue number. 
	 * Does this by calling on <code>garageDoor</code> with <code>openGarageDoor()</code> 
	 * and calling <code>display</code> with the function <code>displayNextNumber</code>.
	 */
	public void nextCustomer(){
		garageDoor.openGarageDoor();
		display.displayNextNumber();
	}
	
	public boolean getCurrentState(){
		return garageDoor.getCurrentState();
	}
	
	public int getCurrentNumber(){
		return display.getCurrentNumber();
	}
}
