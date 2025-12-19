package polymorphism.methodoverriding.MultiLevel;

public class Parent extends GrandParent{
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Method from Parent Class");
	}

}
