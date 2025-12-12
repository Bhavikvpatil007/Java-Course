package inheritance.inheritanceWithConstructor.Ex4;

public class Mechanical extends Department {

    public Mechanical() {
        super("Mechanical", 6);
    }

    void extraInfo() {
        System.out.println("Special Facility: Special Workshop");
    }
}