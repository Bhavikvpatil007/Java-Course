package polymorphism.Mix.Q4;

public class Child extends Parent {
	
	public void start() {
		super.start("AUTO");
		System.out.println("Hello from child method");
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.start();

	}

}
