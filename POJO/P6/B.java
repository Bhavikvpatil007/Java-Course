package POJO.P6;

public class B  extends A{
	public B() {
		super(2);
		System.out.println("No args constructor of Class B");
	}
	public B(int b) {
		this();
		System.out.println("args constructor go class B "+b);
		
	}
}
