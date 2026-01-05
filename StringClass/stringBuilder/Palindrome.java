package StringClass.stringBuilder;

public class Palindrome {

	static void checkPalindrome() {
		String str = "madam";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}
	public static void main(String[] args) {
//		Palindrome p = new Palindrome();
		checkPalindrome();
		
	}
}
