package StaticKeyword.P1;

public class Student {

	static String collegeName = "ACEM";
	int id;
	String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Student ID : "+id);
		System.out.println("Student name : "+name);
		System.out.println("College name : "+collegeName);
		
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Bhavik");
		s1.display();
		Student s2 = new Student(2,"Ajay");
		s2.display();
		Student s3 = new Student(3,"Vijay");
		s3.display();
	}
	
}
