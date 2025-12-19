package polymorphism.methodoverriding.Salary;

public class Manager extends Employee {

	double bonus = 5000;
	
	public double calculateSalary() {
		return super.calculateSalary() + bonus;
	}
}
