package polymorphism.DMD.Q4;

public class Main {
	public static void main(String[] args) {
		Shipping s;
		
		s = new StandardShipping();
		s.calculateCost();
		
		s = new ExpressShipping();
		s.calculateCost();
	}

}
