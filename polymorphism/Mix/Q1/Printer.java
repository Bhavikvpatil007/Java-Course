package polymorphism.Mix.Q1;

public class Printer {
	
	public void print(String msg){
		System.out.println(msg);
		
	}	
	public void print(String msg, int copies) {
		System.out.println(msg + " " + copies);
	}

}
