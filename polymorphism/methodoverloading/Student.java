package polymorphism.methodoverloading;

public class Student {
	
	int id;
	String name;
	
	public Student() {
		id = 0;
		name = "Unknown";
		
	}
	public Student(int id) {
		this.id = id;
		this.name = "Unknown";
		
	}
	public Student(int id, String name) {
		this.id = id;
		this.name= name;
		
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student(101);
		Student s3 = new Student(101, "Bhavik");
		System.out.println("ID: " + s1.id + ", Name: " + s1.name);
		System.out.println("ID: " + s2.id + ", Name: " + s2.name);
		System.out.println("ID: " + s3.id + ", Name: " + s3.name);

	}

}
