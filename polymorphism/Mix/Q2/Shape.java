package polymorphism.Mix.Q2;

public class Shape {
	public void area(int side) {
		System.out.println("Side : "+side);
	}
	public void area(int length, int breadth) {
		System.out.println("Length : " + length + " Breadth : "+breadth);
	}

}
