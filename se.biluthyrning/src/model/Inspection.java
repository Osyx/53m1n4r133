package model;
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
		this.setRegnr(regnr);
		List <String> inspectionList = externalSystems.ExternalInspectionDatabase.getInspectionInstructions(regnr);
		this.setCost(calculateCost(inspectionList));
	}
	/**
	 *  Calculates the cost of inspection based on the things we need to inspect.
	 *  
	 * @param inspectionList 	List of the things we need to inspect on the car
	 * @return					The total cost of the inspection
	 *
	 */
	private int calculateCost(List <String> inspectionList) {
		int costOfInspection = 0;
		for (int i =0; i < inspectionList.size(); i++) {
			costOfInspection++;
			}
		return costOfInspection;
		
	}
	/**
	 * @return	The total cost of the inspection
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * @param cost 		Cost to set
	 */
	private void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return	the regnr of the car inspected
	 */
	public String getRegnr() {
		return regnr;
	}
	
	/**
	 * 
	 * @param regnr Sets the regnr for the that is inspected.
	 */
	private void setRegnr(String regnr) {
		this.regnr = regnr;
	}


}

