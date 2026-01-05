package StringClass.strings;

import java.util.Scanner;

public class EqualString {

	void checkEqual() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter a Second string: ");
		String s2 = sc.nextLine();

		if (s1.equals(s2)) {
		    System.out.println("Strings are equal");
		} else {
		    System.out.println("Strings are not equal");
		}
		sc.close();

	}
	public static void main(String[] args) {
		EqualString eq = new EqualString();
		eq.checkEqual();
	}
}
