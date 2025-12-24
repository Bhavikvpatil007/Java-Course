package Abstraction.interfaces.P7;

public class PaymentApp {

	public static void main(String[] args) {
		PaymentGateway gpay = new GPay();
		PaymentService service1 = new PaymentService(gpay);
		service1.processPayment(500);
		service1.processRefund(200);
		
		PaymentGateway phonePe = new PhonePe();
		PaymentService service2 = new PaymentService(phonePe);
		service2.processPayment(500);
		service2.processRefund(200);
		
	}
}
