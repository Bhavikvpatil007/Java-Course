package inheritance.inheritanceWithConstructor.Ex6;

public class Bus extends Transport {

    public Bus() {
        super("Bus", 60);
    }

    void specialFeature() {
        System.out.println("Special Feature: AC Bus with WiFi");
    }
}
