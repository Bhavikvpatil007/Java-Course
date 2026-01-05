package StringClass.stringBuffer;

public class ReplaceMeth {

	public static void main(String[] args) {
		String str = "I love India";
		StringBuilder sb = new StringBuilder(str);
		
		int index = sb.indexOf("India");
		sb.replace(index,index+5, "Bharat");
		System.out.println("Before: "+str);
		System.out.println("After: "+sb);
	}
}
