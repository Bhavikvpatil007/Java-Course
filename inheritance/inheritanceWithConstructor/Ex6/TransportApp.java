package inheritance.inheritanceWithConstructor.Ex6;

public class TransportApp {
    public static void main(String[] args) {

        System.out.println("Transportation Application Started...");

        System.out.println("");
        Bus b = new Bus();
        b.showDetails();
        b.specialFeature();

        System.out.println("");
        Train t = new Train();
        t.showDetails();
        t.specialFeature();

        System.out.println("");
        Flight f = new Flight();
        f.showDetails();
        f.specialFeature();
    }
}
