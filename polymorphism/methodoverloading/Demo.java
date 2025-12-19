package polymorphism.methodoverloading;

public class Demo {

	
	public void show(int rollNo, String name) {
		System.out.println(rollNo + " " + name);
		
	}
	public void show(String name,int rollNo) {
		System.out.println(name + " " + rollNo);
	}
	public static void main(String[] args) {

		Demo d = new Demo();
		d.show(1, "Bhavik");
		d.show("Bhavik", 1);
	}
}
