package inheritance.inheritanceWithConstructor.Ex2;

public class Restaurant {
	String name;
	double rating;
	
	public Restaurant(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}
	void viewDetails() {
		System.out.println("Restaurant name : "+name);
		System.out.println("Rating : " + rating + " Stars");
	}
}
	
