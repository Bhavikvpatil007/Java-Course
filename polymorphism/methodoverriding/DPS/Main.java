package polymorphism.methodoverriding.DPS;

public class Main {

	public static void main(String[] args) {
		PdfDocument pd = new PdfDocument();
		Document copy = pd.generateCopy();
		System.out.println("Copy is type of : "+copy.getClass().getSimpleName()	);
	}

}
