package POJO.P5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID:");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title:");
        String title = sc.nextLine();

        System.out.print("Enter Book Author:");
        String author = sc.nextLine();

        Book book = new Book(bookId, title, author);

        System.out.print("Enter Student User ID:");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name:");
        String name = sc.nextLine();

        System.out.print("Enter Course:");
        String course = sc.nextLine();

     
        User user = new StudentUser(userId, name, course);

        user.showDetails();
        user.issueBook(book);

        System.out.print("Enter days late:");
        int daysLate = sc.nextInt();

        user.returnBook(book, daysLate);

        sc.close();
    }
}
