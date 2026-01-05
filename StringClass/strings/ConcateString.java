package StringClass.strings;

import java.util.Scanner;

public class ConcateString {

	void concateString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter a Second string: ");
		String s2 = sc.nextLine();
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		sc.close();
	}
	public static void main(String[] args) {
		ConcateString cs = new ConcateString();
		cs.concateString();
	}
}
