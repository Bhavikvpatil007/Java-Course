package finalKeyword.P1;

public class PaymentService {
	public final void pay(double amount) {
		System.out.println("Processing payment of "+amount);
		
	}
	public void log(String message) {
		System.out.println("LOG :"+message);
	}

}
