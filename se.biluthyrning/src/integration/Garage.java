package integration;

public class Garage {
	integration.Garagedoor garageDoor = new integration.Garagedoor();
	integration.Display display = new integration.Display();
	
	public Garage(){
		
	}
	
	public void closeDoor(){
		garageDoor.closeDoor();
	}
	
	public void nextCustomer(){
		garageDoor.openGarageDoor();
		display.displayNextNumber();
	}
}