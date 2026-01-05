package StringClass.stringBuilder;

public class Count {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
	
		int count = 0;
	
		for (char c : sb.toString().toCharArray()) {
		    count++;
		}
	
		System.out.println(count);
		
	}
	

}
