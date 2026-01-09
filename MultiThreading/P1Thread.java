package MultiThreading;

public class P1Thread extends Thread {

	public void run() {
		System.out.println("New thread name: " + Thread.currentThread().getName());
		System.out.println("New thread ID: " + Thread.currentThread().getId());
	}

	public static void main(String[] args) {

		System.out.println("Current Thread name : " + Thread.currentThread().getName());

		P1Thread t = new P1Thread();
		t.start();
	}
}