package StringClass.strings;

import java.util.Scanner;

public class PrintCh {	
	void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		sc.close();
	}
	public static void main(String[] args) {
		PrintCh pc = new PrintCh();
		pc.print();
	}
	
}
