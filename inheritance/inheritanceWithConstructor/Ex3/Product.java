package inheritance.inheritanceWithConstructor.Ex3;

public class Product {
	String name;
    double price;

    public Product(String name, double price) {
        this.name =name;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Product Name : " + name);
        System.out.println("Price : " + price);
    }
}
