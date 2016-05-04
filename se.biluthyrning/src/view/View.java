package view;
import java.util.Scanner;
import controller.Controller;
import model.Inspection;

public class View {
	
	Controller controller;
	Scanner userInput = new Scanner(System.in);
	
	public View(Controller controller) {
		this.controller = controller;
	}	
	
	public void doSomething(){
		System.out.println("INITIATING CAR INSPECTION");
		System.out.println("Time for a new customer?");
		userInput.nextLine();
		nextQueueNumber();
		
		System.out.println("\nClose garagedoor?");
		userInput.nextLine();
		closeDoor();
		
		System.out.println("\nRegistration Number?");
		controller.newInspection(userInput.nextLine());
		
		
		
	}
	
	public void nextQueueNumber(){
		controller.nextQueueNumber();
	}
	
	public void closeDoor(){
		controller.closeDoor();
	}
}
