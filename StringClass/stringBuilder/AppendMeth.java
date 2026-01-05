package StringClass.stringBuilder;

public class AppendMeth {

	void appEnd() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb);
	}
	public static void main(String[] args) {
		AppendMeth am = new AppendMeth();
		am.appEnd();
	}
}
