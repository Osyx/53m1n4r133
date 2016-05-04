package integration;

import model.InspectionResult;
import model.Receipt;

public class Printer {
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
		System.out.println("Printing result");
	}
	/**
	 * Sends the argument to the printer.
	 * @param obj the object of the type <code>Receipt</code> we want to print.
	 */
	public void print(Receipt obj){
		System.out.println("Printing receipt");
	}
}
