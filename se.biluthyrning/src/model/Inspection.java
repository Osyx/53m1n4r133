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
	public int getCost() {
		return cost;
	}
	
	private void setCost(int cost) {
		this.cost = cost;
	}
	public String getRegnr() {
		return regnr;
	}
	private void setRegnr(String regnr) {
		this.regnr = regnr;
	}


}

