package inheritance.inheritanceWithConstructor.Ex3;

public class TV extends Product {

    public TV() {
        super("Samsung", 85000);
    }

    void feature() {
        System.out.println("Features : 55 inch 8k Display");
    }
}
