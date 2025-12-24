package finalKeyword.P1;

public class FilePaymentService extends PaymentService{
	@Override
	public void log(String message) {
		System.out.println("FILE LOG : "+message);
	}

}