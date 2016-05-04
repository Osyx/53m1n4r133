package model;

public class CardPayment {
	boolean approval;
	
	public CardPayment() {
		
	}
	public CardPayment (PaymentDTO paymentDetails) {
		this.approval = approvePayment(paymentDetails);
	}
	
	public boolean getApproval() {
		return this.approval;
	}
	
	private boolean approvePayment(PaymentDTO paymentDetails) {
		return externalSystems.ExternalPaymentAuthorization.authorizePayment(paymentDetails);
		
	}

}
	
