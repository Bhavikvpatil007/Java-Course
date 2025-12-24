package finalKeyword.P2;

public class LibraryService {

	public final void issueBook(String bookName) {
		System.out.println("Book issued : "+bookName);
	}
	public void log(String message) {
		System.out.println("LOG : "+message);
	}
}
