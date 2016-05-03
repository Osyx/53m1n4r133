package dbHandler;

public class RegistryCreator {
	private PaymentRegistry paymentRegistry = new PaymentRegistry();
	private InspectionRegistry inspectionRegistry = new InspectionRegistry();
	
	public RegistryCreator(){
		this.paymentRegistry = new PaymentRegistry();
		this.inspectionRegistry = new InspectionRegistry();
	}
	
	public PaymentRegistry getPaymentRegistry(){ 
		return paymentRegistry;
	}
	
	public InspectionRegistry getInspectionRegistry(){ 
		return inspectionRegistry;
	}
}
