package model;
import java.util.*;
 
public class ReportDTO{
	List<String> reportList = new ArrayList<>();
 	
 	public ReportDTO(List<String> resultList){
 		
 	}
 	
 	public void createNewReport(List<String> resultList){
 		reportList = resultList;
 	}
 	
 	public List<String> getReportList(){
 		return this.reportList;
 	}
 
 }