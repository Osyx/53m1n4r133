import java.util.*;
public class Inspection {
private int cost = 0;
private int regnr = 0;
/**
 * 
 * @param regnr
 * Constructor for inspection object
 */
	public inspection (String regnr) {
		this.regnr = regnr;
		List <String> inspectionList = getInspectionInstructions(String regnr);
		this.cost = calculateCost(inspectionList);
}
	
	private int calculateCost(List <String> inspectionList) {
		int costOfInspection = 0;
		for (int i =0; i < inspectionList.size(); i++) {
			costOfInspection++
			}
		return costOfInspection;
		
	}


}

