package model;

/**
 * 
 * This class encapsulates the payment details provided by the customer, which will then
 * serve as a vessel as it travels across the system.
 *
 */
public class PaymentDTO {
	private boolean card;
	private int amount;
	private int cardNumber;
	private int cvc;
	private int expiry;
	private int code;
	private String cardHolder;
	/**
	 * Construtor for the DTO
	 * @param card 			Specifies whether or not the customer is paying with a Credit Card.
	 * @param amount 		The amount that the customer has to pay 
	 * @param cardNumber 	The Card Number of the customer's card
	 * @param cvc 			The CVC code belonging to the card
	 * @param expiry 		The expiry date of the card
	 * @param code 			The code that the customer entered
	 * @param cardHolder	The name of the cardholder
	 */
	public void paymentDTO(Boolean card, int amount, int cardNumber, int cvc, int expiry, int code, String cardHolder){
		this.card = card;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.expiry = expiry;
		this.code = code;
		this.cardHolder = cardHolder;
	}
	
	public boolean getCard(){
		return this.card;
	}
	
	public int getamount(){
		return this.amount;
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
