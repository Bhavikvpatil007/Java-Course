package polymorphism.DMD.Q1;

public class Gpay extends Payment {
	@Override
	public void reward() {
		System.out.println("Get cashback from Payment using Gpay");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Checked balance using Gpay");
		
	}
	
}
