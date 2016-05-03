package model;

public class Payment {
	private PaymentDTO paymentDetails;
	private int change = 0;
	private boolean paymentSuccessful;
	CardPayment cardPayment = new CardPayment();
	
	public Payment(PaymentDTO payment) {
		this.paymentDetails = payment;
		this.setChange(0);
		this.setPaymentSuccessful(false);
		
		if (paymentDetails.getCard() == true) {
		setPaymentSuccessful(cardPayment.checkPayment(payment)); 
				
		}
	}

	public boolean isPaymentSuccessful() {
		return paymentSuccessful;
	}

	private void setPaymentSuccessful(boolean paymentSuccessful) {
		this.paymentSuccessful = paymentSuccessful;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
}

