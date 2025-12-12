package inheritance.inheritanceWithConstructor.Ex6;

public class Transport {

    String mode;
    double speed;

    public Transport(String mode, double speed) {
        this.mode = mode;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Mode of Transport = " + mode);
        System.out.println("Average Speed = " + speed + " km/h");
    }
}
