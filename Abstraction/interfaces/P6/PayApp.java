package Abstraction.interfaces.P6;

public class PayApp{

    public static void main(String[]a) {
    	Payment p;
    	p = new UPI();
    	p.pay();
    	
    	p = new Card();
    	p.pay();
    }
}
