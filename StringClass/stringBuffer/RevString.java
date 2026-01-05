package StringClass.stringBuffer;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s).reverse();
//		sb.reverse();
		System.out.println(sb);
		
		sc.close();
	}
}
