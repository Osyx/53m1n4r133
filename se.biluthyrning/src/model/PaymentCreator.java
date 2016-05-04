package model;

public class PaymentCreator {
	private model.CardPayment cardPayment = new model.CardPayment();
	
	public PaymentCreator(){
		
	}

	public model.CardPayment getCardPayment() {
		return cardPayment;
	}
}
