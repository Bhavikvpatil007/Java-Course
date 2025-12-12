package inheritance.inheritanceWithConstructor.Ex3;

public class EComApp {

	public static void main(String[] args) {

        System.out.println("E-Commerce Application Started...");

        System.out.println("");
        Mobile m = new Mobile();
        m.showDetails();
        m.feature();

        System.out.println("");
        Laptop l = new Laptop();
        l.showDetails();
        l.feature();

        System.out.println("");
        TV t = new TV();
        t.showDetails();
        t.feature();
    }

}
