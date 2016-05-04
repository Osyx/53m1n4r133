package controller;
import model.PaymentCreator;
import dbHandler.RegistryCreator;
import integration.*;
import model.ReportDTO;
import model.PaymentDTO;


public class Controller {
	PaymentCreator paymentCreator;
	RegistryCreator registryCreator;
	Printer printer;
	Garage garage;
	
	
	
	/**
	 * 
	 */
	public Controller(PaymentCreator paymentCreator, RegistryCreator registryCreator, Printer printer, Garage garage){
		this.paymentCreator = paymentCreator;
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
	public PaymentDTO payment(PaymentDTO paymentDTO){
		
		return paymentDTO;
	}
	
	/**
	 * 
	 */
	public Inspection newInspection(String regNumber){
		
		return inspection;
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
