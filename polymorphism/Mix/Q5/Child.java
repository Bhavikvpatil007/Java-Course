package polymorphism.Mix.Q5;

public class Child extends Parent {
	@Override
	public Child copy() {
		System.out.println("Child class");
		return new Child();
	}
	public Child copy(int a) {
		return new Child();
		
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.copy();
	}

}
