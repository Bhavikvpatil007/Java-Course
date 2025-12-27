package POJO.P5;

public abstract class LibraryActions {

    public final double LATE_FEE = 10.0;

    public abstract void issueBook(Book book);
    public abstract void returnBook(Book book, int daysLate);
}

