package POJO.P2;

public class Main {
	public static void main(String[] args) {
		
		Person p = new Person("Bhavik", 23);
		Employee e = new Employee(2500, p);
		
		System.out.println(e);
	}
}
