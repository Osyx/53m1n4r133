package main.model;

public class Receipt {
	boolean receiptCreated = false;
	/**
	 * 
	 */
	public Receipt() {
		
	}
	
	public Receipt(Payment payment){
		System.out.println("Please wait, creating reciept for cash payment...");
		receiptCreated = true;
	}
	
	public Receipt(CardPayment payment){
		System.out.println("Please wait, creating reciept for card payment...");
		receiptCreated = true;
	}
	/**
	 * 
	 */
	public void createReceipt(PaymentDTO paymentDTO){
		System.out.println("Please wait, creating reciept...");
		receiptCreated = true;
	}
	
	public boolean isReceiptCreated() {
		return receiptCreated;
	}

}
