package model;
/**
 * 
 * @author Silver
 * The purpose of this class is to delegate responsibility for cash-
 * and cardpayments to their respective classes.
 */
public class Payment {
	
	private int change = 0;
	private boolean paymentSuccessful;
	
	
	/**
	 * 
	 * Takes @param payment and creates a new object that includes change
	 * and whether or not the the payment was approved or not.
	 */
	/*public Payment(PaymentDTO payment) {
		this.paymentDetails = payment;
		this.setChange(0);
		this.paymentSuccessful = false;
		
		if (paymentDetails.getCard() == true) {
			
			setPaymentSuccessful(payment);
			Receipt receipt = new Receipt(this);
				
		}
	}*/
	public Receipt initializePayment(PaymentDTO payment) {
		if (payment.getCard() == true) {
			CardPayment cardPayment = new CardPayment(payment);
			Receipt cardReceipt = new Receipt(cardPayment);
			return cardReceipt;
		}
		else {
			Receipt cashReceipt = new Receipt();
			return (cashReceipt);
			}
	}
/**
 *  
 * @return The status of the payment
 */
	public boolean isPaymentSuccessful() {
		return paymentSuccessful;
	}

	/**This method creates a new instance of <code>CardPayment</code> and
	 * checks whether or not it was approved. It then sets this as the value
	 * of <code>paymentSuccessful</code>
	 * 
	 * @param paymentDetails which includes the cardholder details
	 */
	/*private void setPaymentSuccessful(PaymentDTO paymentDetails) {
		CardPayment cardPayment = new CardPayment(paymentDetails);
		this.paymentSuccessful = cardPayment.getApproval();
	}*/
	/**
	 * 
	 * @return the change of the particuar instance of payment.
	 */
	public int getChange() {
		return change;
	}

	/**
 * 
 * @param change  Set the <code>change</code>
 */
	/*
	private void setChange(int change) {
		this.change = change;
	}
	*/
}

