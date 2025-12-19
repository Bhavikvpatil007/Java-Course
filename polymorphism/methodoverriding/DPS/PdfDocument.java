package polymorphism.methodoverriding.DPS;

public class PdfDocument extends Document {
	public PdfDocument generateCopy() {
		return new PdfDocument();
		
	}

}
