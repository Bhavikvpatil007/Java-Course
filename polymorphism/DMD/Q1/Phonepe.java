package polymorphism.DMD.Q1;

public class Phonepe extends Payment{
	@Override
	public void reward() {
		System.out.println("Get cashback from Payment using PhonePe");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Checked balance using PhonePe");
		
	}

}
