package finalKeyword.P1;

public class PaymentRules {
	
	private final double MIN_AMOUNT = 100;
	private final double MAX_LIMIT = 50000;
	
	public final boolean validateAmount(double amount) {
		return amount >= MIN_AMOUNT && amount <= MAX_LIMIT;
		
	}
	public final void printRules() {
        System.out.println("Minimum Amount : " + MIN_AMOUNT);
        System.out.println("Maximum Limit  : " + MAX_LIMIT);
    }

}
