package dbHandler;

import model.InspectionResult;

class InspectionRegistry {
	/**
	 * Constructor for <code>inspectionRegistry</code>.
	 */
	InspectionRegistry(){
		
	}
	/**
	 * Searches for information about the requested car. 
	 * @param regNumber The car we want info from.
	 * @return Information about the requested car from the database.
	 */
	
	void getInspectionResult(String regNumber){
		System.out.println("Debug: Returning info about car " + regNumber + " :\n\"Some info\"");
		
	}
	/**
	 * Stores the inspection result in the database.
	 * @param inspectionResult
	 */
	 void registerResult(InspectionResult inspectionResult) {
		System.out.println("Debug: Result" + inspectionResult + " registered");
	}
}
