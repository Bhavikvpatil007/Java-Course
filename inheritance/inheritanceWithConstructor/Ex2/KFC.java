package inheritance.inheritanceWithConstructor.Ex2;

public class KFC extends Restaurant{
	KFC(){
		super("KFC",4.4);
		
	}
	void KFCOffers() {
		System.out.println("Offer : Upto 20% Discount on each Friday.");
	}
	
}
