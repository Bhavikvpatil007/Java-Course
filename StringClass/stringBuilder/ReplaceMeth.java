package StringClass.stringBuilder;

public class ReplaceMeth {
	void replaceString() {
		
		String str = "I love java Programming";
		StringBuilder sb = new StringBuilder(str);
		
		int index = sb.indexOf("java");
		sb.replace(index,index+4, "Python");
		System.out.println("Before: "+str);
		System.out.println("After: "+sb);
		
		
	}

	public static void main(String[] args) {
		ReplaceMeth rm = new ReplaceMeth();
		rm.replaceString();
	}
}
