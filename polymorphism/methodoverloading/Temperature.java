package polymorphism.methodoverloading;

public class Temperature {
	public static double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
	public static double convert(int farhrenheit) {
        return (farhrenheit - 32) * 5/9;
        
        
    }
	public static void main(String[] args) {
		double f = convert(24);
		double c = convert(79);
	
		System.out.println("24°C in Fahrenheit: " + f);
	    System.out.println("79°F in Celsius: " + c);
	}
}
