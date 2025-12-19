package polymorphism.methodoverloading;

public class Calculator {
	
	public void add(int a , int b) {
		System.out.println("Addtion : "+  (a +  b));
	}
	public void add(int a , int b, int c) {
		System.out.println("Addtion : "+  (a +  b + c));
		
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(4,5);
		c.add(4, 5 ,6);
		

	}

}
