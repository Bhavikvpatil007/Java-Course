package inheritance.inheritanceWithConstructor.Ex3;

public class Mobile extends Product {

    public Mobile() {
        super("Apple Iphone 15 Pro", 109000);
    }

    void feature() {
        System.out.println("Features : M17 Bionic Chip and 120hz Display");
    }
}
