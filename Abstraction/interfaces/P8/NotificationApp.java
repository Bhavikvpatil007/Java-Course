package Abstraction.interfaces.P8;

public class NotificationApp {
	
	public static void main(String[] args) {
		
		Notification email = new EmailNotification();
		NotificationService service1 = new NotificationService(email);
		service1.notifyUser("Welcome");
		
		Notification sms = new SMSNotification();
		NotificationService service2 = new NotificationService(sms);
		service2.notifyUser("OTP sent");
		
	}

}
