package finalKeyword.P1;

public class Application {

	public static void main(String[] args) {
		
		PaymentEngine engine = new PaymentEngine(3.5);
		engine.processPayment(1000);
		
		System.out.println("--------------------");
		
		PaymentRules rules = new PaymentRules();
		rules.printRules();
		System.out.println("Valid amount : "+rules.validateAmount(2000));
		
		System.out.println("--------------------");
		
		PaymentConfig config = new PaymentConfig("Rs.", "INDIA", "Razorpay");
		
		System.out.println("Currency : "+config.getCurrency());
		System.out.println("Country : "+config.getCountry());
		System.out.println("Gateway : "+config.getGateway());
		
		
		System.out.println("--------------------");
		

		PaymentService service = new FilePaymentService();
		service.pay(4000);
		service.log("Payed");
	}

}
