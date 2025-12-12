package inheritance.inheritanceWithConstructor.Ex5;

public class PaymentApp {
    public static void main(String[] args) {

        System.out.println("Payment Application Started...");

        System.out.println("");
        UPI u = new UPI();
        u.showDetails();
        u.offer();

        System.out.println("");
        CreditCard c = new CreditCard();
        c.showDetails();
        c.offer();

        System.out.println("");
        DebitCard d = new DebitCard();
        d.showDetails();
        d.offer();
    }
}
