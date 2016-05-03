package model;

public class CardPayment {
	public CardPayment() {
		
	}
	public CardPayment (Payment paymentDetails) {
		}
	
		public 	boolean checkPayment (PaymentDTO payment) {
			boolean checked = externalSystems.ExternalPaymentAuthorization.authorizePayment(payment);
		return checked;
	}
}
