package polymorphism.methodoverriding.Parent;

public class Child extends Parent{
	
	@Override
	public void showMessage() {
		super.showMessage();
		System.out.println("Message from Child");
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.showMessage();

	}

}
