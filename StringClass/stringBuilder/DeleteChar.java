package StringClass.stringBuilder;

public class DeleteChar {

	void dltChar() {
		String str = "I love java Programming";
		StringBuilder sb = new StringBuilder(str);
		
		sb.delete(2, 5);
		System.out.println("Before: "+str);
		System.out.println("After: "+sb);
	}
	public static void main(String[] args) {
		DeleteChar dc = new DeleteChar();
		dc.dltChar();
	}
}
