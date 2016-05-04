package externalSystems;
import java.util.*;

public class ExternalInspectionDatabase {
	static List<String> inspectionObjects = new ArrayList<>();
	
	public static List<String> getInspectionInstructions(String regnr){
		
		addInspectionItemsToList(regnr);
		return inspectionObjects;
	}
	
	/**
	 * This is just a pseudo-database. It will NOT return any results 
	 * @param regnr will not be used in this test
	 */
	public static void addInspectionItemsToList(String regnr){
		inspectionObjects.add("Seat belts: Inspect for proper operation and anchorage.");
		inspectionObjects.add("Brakes: Remove one of the front wheels and check the condition of the disc brake pads.");
		inspectionObjects.add("Steering: Check the condition of the front end assembly.");
		inspectionObjects.add("Tires: Check the tread depth, tire condition and tire pressure.");
		inspectionObjects.add("Lights: Make sure that all the lights are working correctly.");
		inspectionObjects.add("Windshield: Inspect for cracks. Shouldn´t be longer than 11 inches.");
		inspectionObjects.add("Horn: Check mounting and operation.");
		inspectionObjects.add("Mirrors: Check mirror locations for proper mounting, cracks, breaks, and/or discoloration.");
		inspectionObjects.add("Fuel Leaks: Make sure that there is no fuel leak.");
	}
	
}