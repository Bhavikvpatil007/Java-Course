package polymorphism.methodoverloading;

public class Calculator2 {
	
	public void multi(int a , int b) {
		System.out.println("Multiplication : "+  (a * b));
	}
	public void multi(float a , float b) {
		System.out.println("Multiplication : "+  (a * b));
		
	}

	public static void main(String[] args) {
		
		Calculator2 c2 = new Calculator2();
		c2.multi(4,5);
		c2.multi(4.4f,6.6f);
		

	}

}
