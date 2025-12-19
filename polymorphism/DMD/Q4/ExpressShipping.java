package polymorphism.DMD.Q4;

public class ExpressShipping extends Shipping {
	@Override
	void calculateCost() {
		System.out.println("Express Shipping cost is 100Rs.");
	}
}
