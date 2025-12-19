package polymorphism.DMD.Q1;

public class Application {

	public static void main(String[] args) {

		Payment p;
		
		p = new Gpay();
        p.reward();
        p.checkBalance();

        p = new Phonepe();
        p.reward();
        p.checkBalance();

        p = new Razorpay();
        p.reward();
        p.checkBalance();

        p = new Paytm();
        p.reward();
        p.checkBalance();

        
	}

}
