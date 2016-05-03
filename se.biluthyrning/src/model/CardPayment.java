package model;

public class CardPayment {
	public CardPayment() {
		
	}
	public CardPayment (Payment paymentDetails) {
		Payment checked = paymentAuthorization.authorizePayment(paymentDetails);
		
	}
}
