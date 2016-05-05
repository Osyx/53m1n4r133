/**
 * 
 */
package test.dbHandler;

import static org.junit.Assert.*;

import org.junit.Test;

import main.dbHandler.RegistryCreator;

/**
 * @author Oscar
 *
 */
public class RegistryCreatorTest {

	/**
	 * Test method for {@link dbHandler.RegistryCreator#RegistryCreator()}.
	 */
	@Test
	public void testRegistryCreator() {
		RegistryCreator registryCreator = new RegistryCreator();
		assertNotEquals("No registryCreator available", registryCreator, null);
	}

	/**
	 * Test method for {@link dbHandler.RegistryCreator#getPaymentRegistry()}.
	 */
	@Test
	public void testGetPaymentRegistry() {
		RegistryCreator registryCreator = new RegistryCreator();
		assertNotEquals("Payment registry is nonexistent", registryCreator.getPaymentRegistry(), null);
	}

	/**
	 * Test method for {@link dbHandler.RegistryCreator#getInspectionRegistry()}.
	 */
	@Test
	public void testGetInspectionRegistry() {
		RegistryCreator registryCreator = new RegistryCreator();
		assertNotEquals("Inspection registry is nonexistent", registryCreator.getInspectionRegistry() , null);
	}

}
