package polymorphism.DMD.Q4;

public class StandardShipping extends Shipping {
	@Override
	void calculateCost() {
		System.out.println("Standard Shipping cost is 50Rs.");
	}
}
