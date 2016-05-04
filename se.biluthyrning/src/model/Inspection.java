package model;
import externalSystems.ExternalInspectionDatabase;
import java.util.*;

public class Inspection {
	private int cost = 0;
	private String regnr;
	/**
	 * 
	 * @param regnr
	 * Constructor for inspection object
	 */
	public Inspection (String regnr) {
		this.regnr = regnr;
		List <String> inspectionList = getInspectionInstructions(regnr);
		this.cost = calculateCost(inspectionList);
}
	/**
	 * 
	 * @param inspectionList
	 * @return
	 * Calculates the cost of inspection
	 */
	private int calculateCost(List <String> inspectionList) {
		int costOfInspection = 0;
		for (int i =0; i < inspectionList.size(); i++) {
			costOfInspection++;
			}
		return costOfInspection;
		
	}


}

