package Abstraction.interfaces.P7;

public class PaymentService {
	
	private PaymentGateway gateway;
	
	public PaymentService(PaymentGateway gateway) {
		this.gateway = gateway;
	}
	public void processPayment(double amount) {
		gateway.pay(amount);
	}
	public void processRefund(double amount) {
		gateway.refund(amount);
	}

}
