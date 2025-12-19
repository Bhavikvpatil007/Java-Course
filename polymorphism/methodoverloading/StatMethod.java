package polymorphism.methodoverloading;

public class StatMethod {
	
	public static int print(int a) {
		return a;
	}
	public static int print(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {

		System.out.println(print(5));
	    System.out.println(print(5, 10));
	}
}
