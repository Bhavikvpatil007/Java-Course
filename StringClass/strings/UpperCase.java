package StringClass.strings;
import java.util.Scanner;

public class UpperCase {
	void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String s1 = s.toUpperCase();
		System.out.println(s1);
		sc.close();
	}
	public static void main(String[] args) {
		UpperCase up = new UpperCase();
		up.print();
	}
	
}
