package main.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.controller.Controller;
import main.model.Inspection;
import main.model.Payment;
import main.model.PaymentDTO;
import main.model.ReportDTO;

public class View {
	
	List<String> resultList = new ArrayList<>();
	Controller controller;
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
		
		System.out.println("\nPAYMENT");
		startPayment();
		
		System.out.println("\nWhat´s the result?");
		handleResult(makeNewReport());
		
		System.out.println();
		
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
	
	private ReportDTO makeNewReport(){
		int listIndex = 0;
		for(int i = inspection.getInspectionList().size() ; i > 0 ; i--){
			resultList.add(inspection.getInspectionList().get(listIndex));
			resultList.add(userInput.nextLine());
			listIndex++;
		}
		System.out.println("Created resultList" + resultList);
		ReportDTO reportDTO = new ReportDTO(resultList);
		return reportDTO;
	}
	
	
	private void startPayment(){
		boolean card = true;
		int amount = 100;
		String cardNumber = "314159265358979323";
		int cvc = 687;
		int expiry = 0707;
		int code = 9435;
		String cardHolder = "Bruce Wayne";
		PaymentDTO paymentInformation = makePaymentDTO(card, amount, cardNumber, cvc, expiry, code, cardHolder);
		Payment payment = controller.payment(paymentInformation);
		if(payment.isPaymentSuccessful() == true)	System.out.println("Payment successful.\n");
		else	System.out.println("Payment unsuccessful.");
	}
	
	private PaymentDTO makePaymentDTO(Boolean card, int amount, String cardNumber, int cvc, int expiry, int code, String cardHolder){
		PaymentDTO currentPayment = new PaymentDTO(card, amount, cardNumber, cvc, expiry, code, cardHolder);
		
		return currentPayment;
	}

}
