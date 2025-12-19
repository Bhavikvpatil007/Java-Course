package polymorphism.methodoverriding.Salary;

public class Developer extends Manager {
	double projectAllownce = 3000;
	
	public double calculateSalary() {
		return super.calculateSalary() + projectAllownce;
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m = new Manager();
		Developer d = new Developer();
		
		System.out.println("Name of Employee : "+e.name);
		System.out.println("Basic Salary : "+e.calculateSalary());
		System.out.println("Salary after Bonus : "+m.calculateSalary());
		System.out.println("Salary after Bonus and Allowance: "+d.calculateSalary());
		
		
	}
}
