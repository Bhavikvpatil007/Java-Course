package StringClass.stringBuilder;

import java.util.Scanner;

public class Reversed {
	void revString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s).reverse();
//		sb.reverse();
		System.out.println(sb);
		
		sc.close();
	}
	public static void main(String[] args) {
		Reversed r = new Reversed();
		r.revString();
	}
}
