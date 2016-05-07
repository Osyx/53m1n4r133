package main.model;

/**
 * Creates the inspection result from an ReportDTO.
 */
public class InspectionResult {
	
	InspectionResult inspectionResult;
	boolean reportDone = false;
	
	public InspectionResult(ReportDTO reportDTO){
		System.out.println("Creating the nice pdf report.");
		setInspectionResult(null);
		reportDone = true;
		if(reportDone == true) System.out.println("Report creation done.");
	}
	
	public InspectionResult getInspectionResult() {
		return inspectionResult;
	}

	private void setInspectionResult(InspectionResult inspectionResult) {
		this.inspectionResult = inspectionResult;
	}
	
	public boolean getReportDone(){
		return reportDone;
	}

}

