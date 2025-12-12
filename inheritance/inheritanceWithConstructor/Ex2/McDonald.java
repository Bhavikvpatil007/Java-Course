package inheritance.inheritanceWithConstructor.Ex2;

public class McDonald extends Restaurant{
	McDonald(){
		super("McDonald",4.7);
		
	}
	void McDonaldOffers() {
		System.out.println("Offer : Flat Rs. 100 off for new user.");
	}
	
}
