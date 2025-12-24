package Abstraction.interfaces.P8;

public class NotificationService {
	
	private Notification notification;
	
	public NotificationService(Notification notification) {
		this.notification = notification;
	}
	public void notifyUser(String msg) {
		notification.send(msg);
		
	}
}
