package controller;

import dbHandler.RegistryCreator;
import integration.*;
import model.ReportDTO;
import model.PaymentDTO;
import model.Inspection;

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
	public void newInspection(String regNumber){
		
	}
	
	/**
	 * 
	 */
	public void nextQueueNumber(){
		
	}
	
	/**
	 * 
	 */
	public void closeDoor(){
		
	}

}
