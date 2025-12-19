package polymorphism.Mix.Q7;

public class Child extends Parent {
	static void greet() {
		System.out.println("Static method of child");

	}
	void sayHello() {
		System.out.println("Instance method of child");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.greet();
		p.sayHello();
		
		Child c = new Child();
		c.greet();
		c.sayHello();
	}

}

