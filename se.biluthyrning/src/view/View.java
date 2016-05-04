package view;
import java.util.Scanner;

import controller.Controller;

public class View {
	
	Controller controller;
	Scanner userInput = new Scanner(System.in);
	
	public View(Controller controller) {
		this.controller = controller;
	}	
	
	public void doSomething(){
		userInput.nextLine();
		nextQueueNumber();
		userInput.nextLine();
		closeDoor();
	}
	
	public void nextQueueNumber(){
		controller.nextQueueNumber();
	}
	
	public void closeDoor(){
		controller.closeDoor();
	}
}
