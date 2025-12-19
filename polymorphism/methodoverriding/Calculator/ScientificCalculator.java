package polymorphism.methodoverriding.Calculator;

public class ScientificCalculator extends Calculator{
	
	public int multiply(int a, int b) {
		return a % b;
	}
	

	public static void main(String[] args) {

		ScientificCalculator sc = new ScientificCalculator();
		
		System.out.println(sc.multiply(4, 5));
	}

}
