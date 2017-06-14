package lab3;

public enum PaymentType {
	CREDITCARD,
	DEBITCARD(0.25, 5),
	PAYPAL(0.1, 7);
	
	private double discount;
	private int deliveryDay;
	
	public double getDiscount() {
		return this.discount;
	}
	
	private PaymentType(double dis, int del) {
		this.discount = dis;
		this.deliveryDay = del;
	}
	
	
	// Default constructor
	private PaymentType() {
		this.discount = 0;
		this.deliveryDay = 20;
	}
}
