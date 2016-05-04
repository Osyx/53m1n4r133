package model;

public class InspectionResult {
	
	InspectionResult inspectionResult;
	
	public InspectionResult(ReportDTO reportDTO){
		System.out.println("Creating the nice pdf report.");
		setInspectionResult(null);		
	}
	
	public InspectionResult getInspectionResult() {
		return inspectionResult;
	}

	private void setInspectionResult(InspectionResult inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

}

