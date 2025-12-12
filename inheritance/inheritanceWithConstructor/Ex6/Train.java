package inheritance.inheritanceWithConstructor.Ex6;

public class Train extends Transport {

    public Train() {
        super("Train", 90);
    }

    void specialFeature() {
        System.out.println("Special Feature: Sleeper with Food");
    }
}
