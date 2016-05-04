package model;
/*
 * This class serves the purpose of handling cardpayments, as well
 * as the interaction with the ExternalPaymentAuthorization.
 */
public class CardPayment {
	boolean approval;
	
/**
 * Creates an instance of CardPayment containing the information on whether 
 * or not it was approved
 * @param paymentDetails	Contains the details relating to the transaction
 */
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
	 * @return <code>true</code> for a payment that has been approved.
	 * 		   <code>false</code> if the payment request is denied.
	 */
	private boolean approvePayment(PaymentDTO paymentDetails) {
		return externalSystems.ExternalPaymentAuthorization.authorizePayment(paymentDetails);
		
	}

}
	
