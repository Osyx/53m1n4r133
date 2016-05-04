package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.ReportDTO;

public class View {
	
	List<String> resultList = new ArrayList<>();
	Controller controller;
	ReportDTO reportDTO = new ReportDTO(resultList);
	Scanner userInput = new Scanner(System.in);
	
	public View(Controller controller) {
		this.controller = controller;
	}	
	
	public void doSomething(){
		System.out.println("INITIATING CAR INSPECTION");
		System.out.println("\nTime for a new customer?");
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
	
	public void handleResult(ReportDTO reportDTO){
		controller.handleResult(reportDTO);
	}
	

}
