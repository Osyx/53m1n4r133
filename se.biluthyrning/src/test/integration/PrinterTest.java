/**
 * 
 */
package test.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import main.integration.Printer;
import main.model.InspectionResult;
import main.model.Receipt;

/**
 * @author Oscar
 *
 */
public class PrinterTest {

	/**
	 * Test method for {@link integration.Printer#Printer()}.
	 */
	@Test
	public void testPrinter() {
		Printer printer = new Printer();
		assertNotEquals("Printer not created", printer, null);
	}

	/**
	 * Test method for {@link integration.Printer#print(model.InspectionResult)}.
	 */
	@Test
	public void testPrintInspectionResult() {
		Printer printer = new Printer();
		InspectionResult inspectionResult = new InspectionResult(null);
		printer.print(inspectionResult);
		assertEquals("Inspection result didn't get printed", printer.isPrinted() , true);
	}

	/**
	 * Test method for {@link integration.Printer#print(model.Receipt)}.
	 */
	@Test
	public void testPrintReceipt() {
		Printer printer = new Printer();
		Receipt receipt = new Receipt();
		printer.print(receipt);
		assertEquals("Receipt didn't get printed", printer.isPrinted() , true);
	}

}
