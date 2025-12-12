package inheritance.inheritanceWithConstructor.Ex3;

public class Laptop extends Product {

    public Laptop() {
        super("ASUS", 57000);
    }

    void feature() {
        System.out.println("Features : intel i5 11th Gen and 4GB Nvidia Graphics Card");
    }
}
