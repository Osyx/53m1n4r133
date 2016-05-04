package model;

public class Payment {
	private PaymentDTO paymentDetails;
	private int change = 0;
	private boolean paymentSuccessful;
	CardPayment cardPayment = new CardPayment();
	
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
 * @return whether or not the payment is succesful or not
 */
	public boolean isPaymentSuccessful() {
		return paymentSuccessful;
	}

	private void setPaymentSuccessful(PaymentDTO paymentDetails) {
		this.paymentSuccessful = cardPayment.checkPayment(paymentDetails);
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
}

