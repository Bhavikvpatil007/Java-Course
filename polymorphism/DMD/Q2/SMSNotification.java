package polymorphism.DMD.Q2;

public class SMSNotification extends Notification {
	@Override
	public void send() {
		System.out.println("SMS Sent");
	}
	@Override
	public void status() {
		System.out.println("SMS Recieved");
	}

}