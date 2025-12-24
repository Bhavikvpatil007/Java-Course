package Abstraction.interfaces.P1;

public class Child implements Father,Mother{

	@Override
	public void cooking() {
		System.out.println("KHICHADI");
		
	}

	@Override
	public void surName() {
		System.out.println("My surname is PATIL");
	}
}
