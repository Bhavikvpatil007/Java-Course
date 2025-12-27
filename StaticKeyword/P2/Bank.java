package StaticKeyword.P2;

class Bank {

    static double rateOfInterest = 6.5;

    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    static void changeROI(double newRate) {
        rateOfInterest = newRate;
    }

    void displayAccountDetails() {
        System.out.println("Account Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("-----------------------------");
    }

   
    public static void main(String[] args) {

        Bank acc1 = new Bank(50000);
        Bank acc2 = new Bank(100000);

       
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        Bank.changeROI(7.5);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
