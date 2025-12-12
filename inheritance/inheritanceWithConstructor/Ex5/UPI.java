package inheritance.inheritanceWithConstructor.Ex5;

public class UPI extends PaymentMethod {

    public UPI() {
        super("UPI", 0);
    }

    void offer() {
        System.out.println("Offer: Cashback up to Rs.100");
    }
}