package polymorphism.DMD.Q1;

public class Paytm extends Payment{
	@Override
	public void reward() {
		System.out.println("Get cashback from Payment using Paytm");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Checked balance using Paytm");
		
	}

}
