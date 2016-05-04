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
		userInput.nextLine();
		nextQueueNumber();
		
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
