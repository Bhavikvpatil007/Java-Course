package MultiThreading;

class SleepTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000); // TIMED_WAITING
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}

		System.out.println("Thread finished: " + Thread.currentThread().getName());
	}
}
public class P3SleepAndState {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = new SleepTask();

		
		Thread t = new Thread(r);

		t.setName("New 1 Thread");
		
		System.out.println("State Before start : " + t.getState());

		t.start();

		Thread.sleep(500);
		System.out.println("State during sleep : " + t.getState());
		
		t.join();
		System.out.println("State after completion : " + t.getState());


	}
}
