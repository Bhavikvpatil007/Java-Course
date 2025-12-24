package ThisAndSuper.P2;

public class UPI extends Payment {

    String upiId;

    UPI(double balance, String upiId) {
        super(balance);           
        this.upiId = upiId;       
    }

    @Override
    void pay() {
        super.pay();              
        System.out.println("UPI payment using " + upiId);
    }

    public static void main(String[] args) {

        UPI upi = new UPI(5000, "bhavik@upi");
        upi.pay();
    }
}
