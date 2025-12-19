package polymorphism.DMD.Q2;

public class Main {

	public static void main(String[] args) {

		Notification n;
		
		n = new EmailNotification();
		n.send();
		n.status();
		
		n = new SMSNotification();
		n.send();
		n.status();
		
		n = new PushNotification();
		n.send();
		n.status();
		
		
	}

}
