package MultiThreading;


//class MyTask implements Runnable {
//    
//}

public class P2Runnable {
    public static void main(String[] args) 
    {
    	Runnable r = new Runnable() { // Used anonymous class here
    		public void run() {
    	        System.out.println("Name : "+Thread.currentThread().getName());
    	        System.out.println("Task is running");
    	    }
    	};
    	
    	Thread t = new Thread(r);
    	
    	t.setName("xThred");
//    	t.run();
    	t.start();
    }
}