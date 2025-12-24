package Abstraction.abstractclasses.P2;

public class EmailNotification extends Notification {

    public EmailNotification() {
        System.out.println("Email service");
    }

    @Override
    public void send() {
        System.out.println("Sending email");
    }
}
