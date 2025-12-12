package inheritance.inheritanceWithConstructor.Ex5;

public class CreditCard extends PaymentMethod {

    public CreditCard() {
        super("Credit Card", 1.2);
    }

    void offer() {
        System.out.println("Offer: Upto 5% CashBack");
    }
}