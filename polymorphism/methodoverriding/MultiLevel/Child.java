package polymorphism.methodoverriding.MultiLevel;

public class Child extends Parent {

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Method from Child Class");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.displayInfo();
	}

}
