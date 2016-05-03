package model;

public class Payment {
	private PaymentDTO paymentDetails;
	private int change = 0;
	private boolean paymentSuccessful;
	
	public Payment(PaymentDTO payment) {
		this.paymentDetails = payment;
		this.change = 0;
		this.paymentSuccessful = false;
		
		if (paymentDetails.getCard() == true) {
		CardPayment.authorizePayment
				
		}
	}
}

