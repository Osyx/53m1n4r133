package externalSystems;
import java.util.*;

public class ExternalInspectionDatabase {
	static List<String> inspectionObjects = new ArrayList<>();
	
	/**
	 * This is just a pseudo-database. It will NOT return any results based on the actual registration number of the car. The return list will be the same for all parameters.
	 *
	 * @param regnr is the registration number of the vehicle, but it will not be used in this test.
	 * @return inspectionObjects will contain the objects for the inspector to inspect.
	 */
	public static List<String> getInspectionInstructions(String regnr){
		addInspectionItemsToList(regnr);
		System.out.println("Debug:" + inspectionObjects);
		return inspectionObjects;
	}
	
	/**
	 * <code>addInspectionItemsToList</code> will add a random ammount of inspection objects to the returned list.
	 * @param regnr is the registration number of the vehicle, but it will not be used in this test.
	 * 
	 */
	public static void addInspectionItemsToList(String regnr){
		inspectionObjects.add("Ignition: Does the car even start?");
		if(randomToAdd() == 1)	inspectionObjects.add("Seat belts: Inspect for proper operation and anchorage.");
		if(randomToAdd() == 1)	inspectionObjects.add("Brakes: Remove one of the front wheels and check the condition of the disc brake pads.");
		if(randomToAdd() == 1)	inspectionObjects.add("Steering: Check the condition of the front end assembly.");
		if(randomToAdd() == 1)	inspectionObjects.add("Tires: Check the tread depth, tire condition and tire pressure.");
		if(randomToAdd() == 1)	inspectionObjects.add("Lights: Make sure that all the lights are working correctly.");
		if(randomToAdd() == 1)	inspectionObjects.add("Windshield: Inspect for cracks. Shouldn�t be longer than 11 inches.");
		if(randomToAdd() == 1)	inspectionObjects.add("Horn: Check mounting and operation.");
		if(randomToAdd() == 1)	inspectionObjects.add("Mirrors: Check mirror locations for proper mounting, cracks, breaks, and/or discoloration.");
		if(randomToAdd() == 1)	inspectionObjects.add("Fuel Leaks: Make sure that there is no fuel leak.");
	}
	
	/**
	 * <code>randomToAdd</code> will return a value from 0 to 1.
	 * @return answer will be randomly 0 or 1
	 */
	public static int randomToAdd(){
		Random rn = new Random();
		int answer = rn.nextInt(1);
		return answer;
	}
}

