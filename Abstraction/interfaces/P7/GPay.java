package Abstraction.interfaces.P7;

public class GPay implements PaymentGateway{
	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs." + amount + " using GPay");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunded" + amount + " to GPay");
		
	}
}
