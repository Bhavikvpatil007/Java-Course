package inheritance.inheritanceWithConstructor.Ex1;

public class Car extends Vehicle {
	Car(){
		super("BMW", 13);
		
	}
	void carOffers() {
		System.out.println("Offer : Upto Rs. 50000 Discounts");
	}
	
}
