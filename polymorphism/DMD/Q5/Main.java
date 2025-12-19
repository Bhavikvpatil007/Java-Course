package polymorphism.DMD.Q5;

public class Main {

	public static void main(String[] args) {
		Employee e;
		e = new Employee();
		
		e = new FullTIme();
		e.calculateSalary();
		
		e = new PartTime();
		e.calculateSalary();
	}
}
