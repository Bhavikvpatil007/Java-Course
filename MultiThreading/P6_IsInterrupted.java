package MultiThreading;

class RunningTask implements Runnable {

    @Override
    public void run() {
        while (true) {

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupt detected, stopping thread");
                break;
            }
            System.out.println("Thread working...");
        }
    }
}

public class P6_IsInterrupted {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new RunningTask());

        t.start();
        Thread.sleep(1000);

        t.interrupt();
    }
}
