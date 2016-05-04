package model;

public class CardPayment {
	boolean approval;
	
	public CardPayment() {
		
	}
	public CardPayment (PaymentDTO paymentDetails) {
		this.approval = externalSystems.ExternalPaymentAuthorization.authorizePayment(paymentDetails);
	}
	
	public boolean getApproval() {
		return this.approval;
	}
}
	
