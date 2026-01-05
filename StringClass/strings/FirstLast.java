package StringClass.strings;

import java.util.Scanner;

public class FirstLast {

	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		char firstChar = s.charAt(0);
		char lastChar  = s.charAt(s.length() - 1);

		System.out.println("First character: " + firstChar);
		System.out.println("Last character: " + lastChar);
		
//		System.out.println("First word is "+s.charAt(0)+" and Last word is "+s.charAt(s.length()-1));
		
		sc.close();
	}
	public static void main(String[] args) {
		FirstLast fl = new FirstLast();
		fl.check();
	}
}
