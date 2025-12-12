package inheritance.inheritanceWithConstructor.Ex6;

public class Flight extends Transport {

    public Flight() {
        super("Flight", 700);
    }

    void specialFeature() {
        System.out.println("Special Feature: Free Food");
    }
}
