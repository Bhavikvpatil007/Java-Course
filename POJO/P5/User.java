package POJO.P5;

public class User extends LibraryActions implements Display {

    protected int userId;
    protected String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public void issueBook(Book book) {
        System.out.println(name + " issued book: " + book.getTitle());
    }

    @Override
    public void returnBook(Book book, int daysLate) {
        double fine = daysLate * LATE_FEE;
        System.out.println(name + " returned book: " + book.getTitle());
        System.out.println("Late fee: ₹" + fine);
    }

    @Override
    public void showDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
}
