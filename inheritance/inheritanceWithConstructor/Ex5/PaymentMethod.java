package inheritance.inheritanceWithConstructor.Ex5;

public class PaymentMethod {

    String name;
    double transactionCharges;

    public PaymentMethod(String name, double transactionCharges) {
        this.name = name;
        this.transactionCharges = transactionCharges;
    }

    void showDetails() {
        System.out.println("Payment Method = " + name);
        System.out.println("Transaction Charges = " + transactionCharges + "%");
    }
}