package inheritance.inheritanceWithConstructor.Ex1;

public class VehicleApp {

	public static void main(String[] args) {
		System.out.println("App is started..");
		System.out.println("");
		Car c = new Car();
		c.viewDetails();
		c.carOffers();
		System.out.println("");
		Bike b = new Bike();
		b.viewDetails();
		b.bikeOffers();
		System.out.println("");
		Truck t = new Truck();
		t.viewDetails();
		t.truckOffers();

	}

}
