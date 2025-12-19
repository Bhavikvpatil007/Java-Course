package polymorphism.Mix.Q3;

public class Manager extends Employee{
	public Manager(int id, int bonus) {
		super(5);
		System.out.println("Manager constructor");
	}
	public void calculateSalary() {
		super.calculateSalary(); 
		System.out.println("Manager method");
	}

	public static void main(String[] args) {
		Manager mg = new Manager(5,5);
		
		mg.calculateSalary();
			

	}

}
