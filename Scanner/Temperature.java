package Scanner;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Celsius : ");
		
		int celsius = sc.nextInt();
		
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("Temp in Celsius to Farenheit : "+ fahrenheit);
		
		sc.close();			
	}

}
