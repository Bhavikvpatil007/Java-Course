package Abstraction.interfaces.P7;

public class PhonePe implements PaymentGateway{
	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs." + amount + " using PhonePe");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunded" + amount + " to PhonePe");
		
	}
}

