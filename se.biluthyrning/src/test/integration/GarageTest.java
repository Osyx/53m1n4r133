/**
 * 
 */
package test.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import main.integration.Garage;

/**
 * @author Oscar
 *
 */
public class GarageTest {

	/**
	 * Test method for {@link integration.Garage#Garage()}.
	 */
	@Test
	public void testGarage() {
		Garage garage = new Garage();
		assertNotEquals("Garage not created", garage, null);
	}

	/**
	 * Test method for {@link integration.Garage#closeDoor()}.
	 */
	@Test
	public void testCloseDoor() {
		Garage garage = new Garage();
		garage.closeDoor();
		assertEquals("Wrong state of door.", garage.getCurrentState(), false);
	}

	/**
	 * Test method for {@link integration.Garage#nextCustomer()}.
	 */
	@Test
	public void testNextCustomer() {
		Garage garage = new Garage();
		for(int i = 0; i < 1000; i++)	garage.nextCustomer();
		
		assertEquals("Wrong state of door.", garage.getCurrentState(), true);
		assertEquals("Wrong number conversion",garage.getCurrentNumber(), 1);
	}

}
