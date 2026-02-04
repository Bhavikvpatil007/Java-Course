package MockQuestion;

import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] fruit = new String [5];
		
		for(int i = 0;i<fruit.length;i++) {
			System.out.println("Enter a fruit : ");
			fruit[i] = sc.nextLine();
		}
		
		System.out.println("-----------------------------------");
		
		
		for(int i = 0;i<fruit.length;i++) {
			String temp = fruit[i];
			System.out.println("Fruit " + fruit[i] +" : ");
			int vowels = 0;
			int consonants = 0;
			for(int j = 0;j<temp.length();j++) {
				char c = temp.charAt(j);
				
				
				
				if(c == 'A' || c == 'I'||c == 'E' || c == 'O'||c == 'U' || c == 'a'||c == 'i' || c == 'e'||c == 'o' || c == 'u') {
					vowels++;
				}
				else {
					consonants++;
				}
				
				
			}
			System.out.println("Vowels are : " + vowels );
			System.out.println("Consonants are : " + consonants );
			System.out.println("-----------------------------------");
		}
		
	}
}
