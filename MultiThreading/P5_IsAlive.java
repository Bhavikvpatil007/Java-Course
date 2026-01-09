package MultiThreading;

class AliveTask implements Runnable {

    @Override
    public void run() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

public class P5_IsAlive {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new AliveTask());

        System.out.println("Before start : " + t.isAlive());

        t.start();

        System.out.println("After start : " + t.isAlive());

        t.join();

        System.out.println("After join :" + t.isAlive());
    }
}
