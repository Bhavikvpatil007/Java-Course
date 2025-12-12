package inheritance.inheritanceWithConstructor.Ex1;

public class Truck extends Vehicle {
	Truck(){
		super("Tata", 10);
		
	}
	void truckOffers() {
		System.out.println("Offer : Upto Rs. 40000 Discounts");
	}
	
}
