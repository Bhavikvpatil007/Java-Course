package polymorphism.Mix.Q2;

public class Square extends Shape {
	public void area(int side) {
		System.out.println("Side : "+side);
	}

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.area(5,6);

	}

}
