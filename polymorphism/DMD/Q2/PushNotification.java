package polymorphism.DMD.Q2;

public class PushNotification extends Notification {
	@Override
	public void send() {
		System.out.println("Push Noitification Sent");
	}
	@Override
	public void status() {
		System.out.println("Push Notification Recieved");
	}

}