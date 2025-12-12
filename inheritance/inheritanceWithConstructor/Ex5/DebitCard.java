package inheritance.inheritanceWithConstructor.Ex5;

public class DebitCard extends PaymentMethod {

    public DebitCard() {
        super("Debit Card", 0.8);
    }

    void offer() {
        System.out.println("Offer : Upto Rs.100 CashBack on purchases above Rs.5000");
    }
}