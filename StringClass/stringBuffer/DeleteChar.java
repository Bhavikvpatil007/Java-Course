package StringClass.stringBuffer;

public class DeleteChar {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("JavaProgramming");

		sb.delete(sb.length() - 3, sb.length());

		System.out.println(sb);

	}

}
