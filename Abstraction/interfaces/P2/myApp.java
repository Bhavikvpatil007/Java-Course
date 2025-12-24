package Abstraction.interfaces.P2;

public class myApp {

	public static void main(String[] args) {
		
		UPI u;
		u = new Gpay();
		u.makePayment();
		System.out.println("-----------------------");
		u = new Phonepe();
		u.makePayment();
		
		u = new Paytm();
		u.makePayment();
		
	}
}
