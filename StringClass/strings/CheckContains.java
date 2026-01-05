package StringClass.strings;

import java.util.Scanner;

public class CheckContains {

	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter a word to check if string contains that word: ");
		String s2 = sc.nextLine();
		
		if(s1.contains(s2)){
			System.out.println(s1 + " contains "+s2);
		}
		else {
			System.out.println(s1 + " does not contains "+s2);
		}
		
		sc.close();
	}
	public static void main(String[] args) {
		CheckContains cc = new CheckContains();
		cc.check();
	}
}
