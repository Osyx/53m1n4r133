package integration;

public class Printer {
	/**
	 * Constructor for <code>Printer</code>.
	 */
	public Printer(){
		
	}
	/**
	 * Sends the argument to the printer.
	 * @param obj the object we want to print.
	 */
	public void Print(String obj){
		System.out.println("Debug: Printing " + obj);
	}
}
