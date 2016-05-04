package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.Inspection;
import model.ReportDTO;

public class View {
	
	List<String> resultList = new ArrayList<>();
	Controller controller;
	ReportDTO reportDTO;
	Inspection inspection;
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
		inspection = controller.newInspection(userInput.nextLine());
		
		makeNewReport();
		
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
	
	private void makeNewReport(){
		int listIndex = 0;
		for(int i = inspection.getInspectionList().size() ; i > 0 ; i++){
			resultList.add(inspection.getInspectionList().get(listIndex));
			resultList.add(userInput.nextLine());
		}
		reportDTO.createNewReport(resultList);
	}

}
