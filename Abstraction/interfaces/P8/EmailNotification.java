package Abstraction.interfaces.P8;

public class EmailNotification implements Notification{
	
	public void send(String msg) {
		System.out.println("Email sent "+msg);
	}
	

}
