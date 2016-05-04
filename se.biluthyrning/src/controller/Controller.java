package controller;

import dbHandler.RegistryCreator;
import model.Inspection;
import model.InspectionResult;
import integration.*;
import model.ReportDTO;
import model.PaymentDTO;
import model.Receipt;
import model.Payment;

public class Controller {
	RegistryCreator registryCreator;
	Printer printer;
	Garage garage;
	
	
	/**
	 * <code>Controller</code> is the constructor for <code>Controller</code>.
	 * @param registryCreator is the creator of the databases.
	 * @param printer is the instance of the printer.
	 * @param garage is the instance of the garage.
	 */
	public Controller(RegistryCreator registryCreator, Printer printer, Garage garage){
		this.registryCreator = registryCreator;
		this.printer = printer;
		this.garage = garage;
		
	}
	
	/**
	 * <code>handleResult</code> will create a new instance of InspectionResult using reportDTO. 
	 * @param reportDTO contains the results of the inspection.
	 */
	public void handleResult(ReportDTO reportDTO){
		InspectionResult inspectionResult = new InspectionResult(reportDTO);
		printer.print(inspectionResult);
	}
	
	public void payment(PaymentDTO paymentDetails) {
		
		Payment payment = new Payment(paymentDetails); 
		Receipt receipt = new Receipt(payment);
		printer.print(receipt);
	}
	
	/**
	 * <code>newInspection</code> will initiate a new inspection.
	 * @param regnr is the registration number of the car.
	 * @return 
	 */
	public Inspection newInspection(String regnr){
		Inspection inspection = new Inspection(regnr);
		return inspection;
	}
	
	/**
	 * <code>nextQueueNumber</code> will make a call to garage to prepare for a new customer.
	 */
	public void nextQueueNumber(){
		garage.nextCustomer();
	}
	
	/**
	 * <code>closeDoor</code> will contact <code>garage</code> and tell it to close the garage door.
	 */
	public void closeDoor(){
		garage.closeDoor();
	}

}
