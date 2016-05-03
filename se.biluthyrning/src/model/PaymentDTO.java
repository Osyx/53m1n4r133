package model;

public class PaymentDTO {
	private boolean card;
	private int ammount;
	private int cardNumber;
	private int cvc;
	private int expiry;
	private int code;
	private String cardHolder;
	
	public void paymentDTO(Boolean card, int ammount, int cardNumber, int cvc, int expiry, int code, String cardHolder){
		this.card = card;
		this.ammount = ammount;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.expiry = expiry;
		this.code = code;
		this.cardHolder = cardHolder;
	}
	
	public boolean getCard(){
		return this.card;
	}
	
	public int getammount(){
		return this.ammount;
	}
	
	public int getCardNumber(){
		return this.cardNumber;
	}
	
	public int getCVC(){
		return this.cvc;
	}

	public int getExpiry(){
		return this.expiry;
	}
	
	public int getCode(){
		return this.code;
	}
	
	public String getCardHolder(){
		return this.cardHolder;
	}
}
