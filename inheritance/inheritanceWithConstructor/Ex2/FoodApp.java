package inheritance.inheritanceWithConstructor.Ex2;

public class FoodApp {

	public static void main(String[] args) {
		System.out.println("App is started...");
		
		System.out.println("");
		
		KFC k = new KFC();
		k.viewDetails();
		k.KFCOffers();
		
		System.out.println("");
		
		Dominos d = new Dominos();
		d.viewDetails();
		d.DominosOffers();
		
		System.out.println("");
		
		McDonald m = new McDonald();
		m.viewDetails();
		m.McDonaldOffers();
	}

}
