package dbHandler;

public class RegistryCreator {
	PaymentRegistry paymentRegistry = new PaymentRegistry();
	InspectionRegistry inspectionRegistry = new InspectionRegistry();
	
	RegistryCreator(){
		this.paymentRegistry = new PaymentRegistry();
		this.inspectionRegistry = new InspectionRegistry();
	}
	
	PaymentRegistry getPaymentRegistry(){ 
		return paymentRegistry;
	}
	
	InspectionRegistry getInspectionRegistry(){ 
		return inspectionRegistry;
	}
}
