package polymorphism.DMD.Q2;

public class EmailNotification extends Notification {
	@Override
	public void send() {
		System.out.println("Mail Sent");
	}
	@Override
	public void status() {
		System.out.println("Mail Recieved");
	}

}
