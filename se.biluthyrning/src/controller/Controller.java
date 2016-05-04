package controller;

import dbHandler.RegistryCreator;
import model.Inspection;
import model.InspectionResult;
import integration.*;
import model.ReportDTO;
import model.PaymentDTO;

public class Controller {
	RegistryCreator registryCreator;
	Printer printer;
	Garage garage;
	
	
	
	public Controller(RegistryCreator registryCreator, Printer printer, Garage garage){
		this.registryCreator = registryCreator;
		this.printer = printer;
		this.garage = garage;
		
	}
	
	public void handleResult(ReportDTO reportDTO){
		InspectionResult inspectionResult = new InspectionResult(reportDTO);
		printer.print(inspectionResult);
	}
	
	public void payment(PaymentDTO paymentDTO){
		
	}
	
	/**
	 * <code>newInspection</code> will initiate a new inspection.
	 * @param regnr is the registration number of the car.
	 */
	public void newInspection(String regnr){
		Inspection inspection = new Inspection(regnr);
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
