package model;

public class Payment {
	private PaymentDTO paymentDetails;
	private int change = 0;
	private boolean paymentSuccessful;
	
	
	/**
	 * 
	 * Takes @param payment and creates a new object that includes change
	 * and whether or not the the payment was approved or not.
	 */
	public Payment(PaymentDTO payment) {
		this.paymentDetails = payment;
		this.setChange(0);
		this.paymentSuccessful = false;
		
		if (paymentDetails.getCard() == true) {
			
			setPaymentSuccessful(payment); 
				
		}
	}
/**
 * 
 * @return whether or not the payment is successful or not
 */
	public boolean isPaymentSuccessful() {
		return paymentSuccessful;
	}

	/**
	 * 
	 * @param paymentDetails
	 */
	private void setPaymentSuccessful(PaymentDTO paymentDetails) {
		CardPayment cardPayment = new CardPayment();
		this.paymentSuccessful = cardPayment.checkPayment(paymentDetails);
	}

	public int getChange() {
		return change;
	}

	private void setChange(int change) {
		this.change = change;
	}
}

