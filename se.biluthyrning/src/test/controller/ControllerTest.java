/**
 * 
 */
package test.controller;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import main.controller.Controller;
import main.dbHandler.RegistryCreator;
import main.integration.Garage;
import main.integration.Printer;
import main.model.InspectionResult;
import main.model.Payment;
import main.model.PaymentDTO;
import main.model.ReportDTO;

public class ControllerTest {

	/**
	 * Test method for controller constructor. Will give an error if the controller is not being created.
	 */
	@Test
	public void testController() {
		RegistryCreator registryCreator = new RegistryCreator();
		Printer printer = new Printer();
		Garage garage = new Garage();
		Controller controller = new Controller(registryCreator, printer, garage);
		assertNotEquals("Controller not created", controller, null);
	}

	/**
	 * Test method for handleResult.
	 */
	@Test
	public void testHandleResult() {
		List<String> list = new ArrayList<>();
		RegistryCreator registryCreator = new RegistryCreator();
		Printer printer = new Printer();
		Garage garage = new Garage();
		Controller controller = new Controller(registryCreator, printer, garage);
		ReportDTO reportDTO = new ReportDTO(list);
		assertEquals("Couldn't handle results", controller.handleResult(reportDTO), true);
	}

	/**
	 * Test method for payment.
	 */
	@Test
	public void testPayment() {
		
		
		boolean card = true;
		int amount = 100;
		String cardNumber = "314159265358979323";
		int cvc = 687;
		int expiry = 0707;
		int code = 9435;
		String cardHolder = "Bruce Wayne";
		
		PaymentDTO paymentTest = new PaymentDTO(card, amount, cardNumber, cvc, expiry, code, cardHolder);	

		Payment payment = payment(paymentTest);
		
		
	}

	
	
	/**
	 * Test method for {@link main.controller.Controller#newInspection(java.lang.String)}.
	 */
	@Test
	public void testNewInspection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.controller.Controller#nextQueueNumber()}.
	 */
	@Test
	public void testNextQueueNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.controller.Controller#closeDoor()}.
	 */
	@Test
	public void testCloseDoor() {
		fail("Not yet implemented");
	}

}
