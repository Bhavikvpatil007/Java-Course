package Scanner;
import java.util.Scanner;

public class AreaOfCicle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of Circle : ");
		int r = sc.nextInt();
		
		double area = 3.14*r*r;
		
		System.out.println("Area of Circle is "+ area);

		sc.close();	
	}
	
}
