package POJO.P2;

public class Employee{
	double salary;
	Person p;
	
	public Employee() {
		
	}
	public Employee(double salary,Person p) {
			super();
			this.salary = salary;
			this.p = p;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", p=" + p + "]";
	}

	

}
