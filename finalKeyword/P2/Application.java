package finalKeyword.P2;

public class Application {

	public static void main(String[] args) {
		
		LibInfo lib = new LibInfo("A1 Library");
		System.out.println("Library : "+lib.getLibName());
		
		System.out.println("----------------");
		 
		Rules rules = new Rules();
		rules.printRules();
		System.out.println("Can issue Book : "+rules.canIssueBook(1));
	
		System.out.println("----------------");
		
		LibraryService ls = new FileLibraryService();
		ls.issueBook("Bhagvad Geeta");
		ls.log("Book is issued");
	
	}
}
