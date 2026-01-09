package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
	static AtomicInteger count = new AtomicInteger(0); // Used atomic number

	static void increment() {
	    count.incrementAndGet();
	}

//	static int count;
//	static synchronized public void increment() // used synchronized 
//	{
//		
//		count++;
//	}
	
}

class X implements Runnable
{
	public void run()
	{
		for(int i = 1;i<=1000;i++)
		{
			Counter.increment();
		}
	}
}

class Y implements Runnable
{
	
	public void run()
	{
		for(int i = 1;i<=1000;i++)
		{
			Counter.increment();
		}
	}
}


public class P4RaceCondition
{

	public static void main(String[] args) throws InterruptedException 
	{	
		
		Runnable obj1 = new X();
		Runnable obj2 = new Y();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(Counter.count);
		
	}
}
