package StringClass.strings;
import java.util.Scanner;

public class LowerCase {
	void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
		System.out.println(s1);
		sc.close();
	}
	public static void main(String[] args) {
		LowerCase up = new LowerCase();
		up.print();
	}
	
} 
