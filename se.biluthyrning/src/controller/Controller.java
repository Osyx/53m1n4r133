package controller;

import dbHandler.RegistryCreator;
import model.Inspection;
import integration.*;
import model.ReportDTO;
import model.PaymentDTO;

public class Controller {
	RegistryCreator registryCreator;
	Printer printer;
	Garage garage;
	
	
	
	/**
	 * 
	 */
	public Controller(RegistryCreator registryCreator, Printer printer, Garage garage){
		this.registryCreator = registryCreator;
		this.printer = printer;
		this.garage = garage;
		
	}
	
	/**
	 * 
	 */
	public void handleResults(ReportDTO reportDTO){
		
	}
	
	/**
	 * 
	 */
	public void payment(PaymentDTO paymentDTO){
		
	}
	
	/**
	 * 
	 */
	public void newInspection(String regnr){
		Inspection inspection = new Inspection(regnr);
	}
	
	/**
	 * 
	 */
	public void nextQueueNumber(){
		garage.nextCustomer();
	}
	
	/**
	 * 
	 */
	public void closeDoor(){
		garage.closeDoor();
	}

}
