package MultiThreading;

class PriorityTask implements Runnable {

    @Override
    public void run() {
        System.out.println(
            "Priority seen by thread = " +
            Thread.currentThread().getPriority()
        );
    }
}

public class P7_Priority {

    public static void main(String[] args) {

        Thread t1 = new Thread(new PriorityTask());
        Thread t2 = new Thread(new PriorityTask());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
