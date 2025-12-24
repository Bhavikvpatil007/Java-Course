package finalKeyword.P2;

public class Rules {

	private final int MAX_BOOKS = 2;
	private final double finePerDay = 20;
	
	public final void printRules() {
        System.out.println("Maximum Books Limit  : " + MAX_BOOKS);
        System.out.println("Fine per Day : " + finePerDay);
	}
	public final boolean canIssueBook(int alreadyIssuedBooks) {
		return alreadyIssuedBooks < MAX_BOOKS;
		
	}
}
