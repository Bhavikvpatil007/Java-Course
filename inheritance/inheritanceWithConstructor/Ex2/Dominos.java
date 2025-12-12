package inheritance.inheritanceWithConstructor.Ex2;

public class Dominos extends Restaurant{
	Dominos(){
		super("Dominos",4.3);
		
	}
	void DominosOffers() {
		System.out.println("Offer : Free 30 Minutes Delivery");
	}
	
}
