package polymorphism.methodoverriding.AreaOfCircle;

public class Circle extends Shape {
	int radius = 5;
	
	@Override
	public double area() {
		return Math.PI*radius*radius;	
	}
	public static void main(String[] args) {
		
		Circle cr = new Circle();
		System.out.println(cr.area());
	}

}

