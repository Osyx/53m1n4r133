package main.integration;

import main.model.InspectionResult;
import main.model.Receipt;

public class Printer {
	boolean printed = false;
	/**
	 * Constructor for <code>Printer</code>.
	 */
	public Printer(){
		
	}
	/**
	 * Sends the argument to the printer.
	 * @param obj the object of type <code>InspectionResult</code> we want to print.
	 */
	public void print(InspectionResult obj){
		printed = false;
		System.out.println("Printing result");
		printed = true;
	}
	/**
	 * Sends the argument to the printer.
	 * @param obj the object of the type <code>Receipt</code> we want to print.
	 */
	public void print(Receipt obj){
		printed = false;
		System.out.println("Printing receipt");
		printed = true;
	}
	
	public boolean isPrinted() {
		return printed;
	}
}