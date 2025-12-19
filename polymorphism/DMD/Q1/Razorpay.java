package polymorphism.DMD.Q1;

public class Razorpay extends Payment{
	@Override
	public void reward() {
		System.out.println("Get cashback from Payment using Razorpay");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Checked balance using RazorPay");
		
	}

}
