package finalKeyword.P1;

public final class PaymentEngine {
	
	private final double transactionFee;
	
	public PaymentEngine(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	public final void processPayment(double amount) {
		double feeAmount = amount * transactionFee/100;
		double finalAmount = amount + feeAmount;
		
		System.out.println("Amount       : " + amount);
        System.out.println("Fee (%)      : " + transactionFee);
        System.out.println("Fee Amount   : " + feeAmount);
        System.out.println("Final Amount : " + finalAmount);
			
	}
}

