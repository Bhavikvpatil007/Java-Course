package polymorphism.DMD.Q3;

public class Main {

	public static void main(String[] args) {

		Bank b;
		b = new Bank();
		b.getInterestRate();
		
		b = new SBI();
		b.getInterestRate();

		b = new HDFC();
		b.getInterestRate();

		b = new ICICI();
		b.getInterestRate();

	}

}
