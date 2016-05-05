package test.model;

import static org.junit.Assert.*;

import org.junit.Test;

import main.model.Inspection;

public class InspectionTest {

	@Test
	public void testInspection() {
		int lowestValue = 0;
		for(int i = 9999; i > -1; i--) {
			Inspection inspection = new Inspection("ABC 123");
			assertNotEquals("No inspection created", inspection, null);
			if(inspection.getCost() < lowestValue)
				lowestValue = inspection.getCost();
			if(lowestValue < 0) {
				lowestValue = -1;
				break;
			}
		}
		
		assertNotEquals("Cost wrongly calculated", lowestValue, -1);
	}

	@Test
	public void testFetchInspectionList() {
		for(int i = 9999; i > -1; i--){
			Inspection inspection = new Inspection("ABC 123");
			assertEquals("Inspection result contains nothing", inspection.getInspectionList().isEmpty(), false);
		}
	}

}
