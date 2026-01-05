package StringClass.strings;

import java.util.Scanner;

public class LengthOfString {
	void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		int len = s.length();
		System.out.println(len);
		sc.close();
	}
	public static void main(String[] args) {
		LengthOfString ls = new LengthOfString();
		ls.print();
	}

}
