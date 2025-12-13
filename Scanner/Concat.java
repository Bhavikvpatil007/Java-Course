package Scanner;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st String : ");
		String first = sc.nextLine();
		
		System.out.print("Enter 2nd String : ");
		String second = sc.nextLine();
		
		String result = first + " " +second;
		
		System.out.println("Concatenation of String : "+result);
		
		sc.close();
	}

}
