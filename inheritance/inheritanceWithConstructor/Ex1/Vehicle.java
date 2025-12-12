package inheritance.inheritanceWithConstructor.Ex1;

public class Vehicle {
	String company;
	double mileage;
	
	public Vehicle(String company, double mileage) {
		this.company = company;
		this.mileage = mileage;
	}
	void viewDetails() {
		System.out.println("Company name : "+company);
		System.out.println("Mileage : " + mileage + " KM/L");
	}
}
