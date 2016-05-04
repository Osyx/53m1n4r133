package integration;

public class Garage {
	integration.Garagedoor garageDoor = new integration.Garagedoor();
	integration.Display display = new integration.Display();
	
	public Garage(){
		
	}
	
	public void closeDoor(){
		garageDoor.closeDoor();
	}
	
	public void nextQueueNumber(){
		garageDoor.openGarageDoor();
		display.displayNextNumber();
	}
}