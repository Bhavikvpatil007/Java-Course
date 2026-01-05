package StringClass.stringBuilder;

public class InsertMeth {
	void insertMeth() {
		String str = "I love programming.";
		StringBuilder sb = new StringBuilder(str);

		sb.insert(7, "Java ");

		System.out.println(sb);
	}

	public static void main(String[] args) {
		InsertMeth im = new InsertMeth();
		im.insertMeth();
	}
}
