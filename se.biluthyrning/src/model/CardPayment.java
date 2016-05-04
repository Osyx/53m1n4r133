package model;
/*
 * This class serves the purpose of handling cardpayments, as well
 * as the interaction with the ExternalPaymentAuthorization.
 */
public class CardPayment {
	boolean approval;
	

	public CardPayment (PaymentDTO paymentDetails) {
		this.approval = approvePayment(paymentDetails);
	}
	
	public boolean getApproval() {
		return this.approval;
	}
	/*
	 * This method serves as the interaction method with the ExternPaymentAuthorization
	 * and checks whether or not it is approves the card details the customer has
	 * provided.
	 * @return true for a payment that has been approved, otherwise false.
	 */
	private boolean approvePayment(PaymentDTO paymentDetails) {
		return externalSystems.ExternalPaymentAuthorization.authorizePayment(paymentDetails);
		
	}

}
	
