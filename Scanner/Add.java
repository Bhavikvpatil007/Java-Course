package Scanner;
import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		int c = a + b ;
		
		System.out.println("Addition of "+ a + " and " + b + " is : " + c);
		
		sc.close();
		
	}
}
