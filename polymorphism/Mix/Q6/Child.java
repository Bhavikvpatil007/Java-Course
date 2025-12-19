package polymorphism.Mix.Q6;

public class Child  extends Parent{
	@Override
	public void show() {
		super.show();
		System.out.println("Bhavik Patil");
		
	}
	
	void display(String name) {
		super.display();
		System.out.println("Hi "+name);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		c.display("Bhavik");
	}
}
