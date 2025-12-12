package inheritance.inheritanceWithConstructor.Ex1;

public class Bike extends Vehicle {
	Bike(){
		super("Royal Enfiled", 35);
		
	}
	void bikeOffers() {
		System.out.println("Offer : Upto Rs. 10000 Discounts");
	}
	
}
