package finalKeyword.P1;

public final class PaymentConfig {

	private final String currency;
	private final String country;
	private final String gateway;
	
	public PaymentConfig(String currency, String country, String gateway) {
		this.currency = currency;
		this.country = country;
		this.gateway = gateway;
	}
	public String getCurrency() {
		return currency;
	}
	public String getCountry() {
		return country;
		
	}
	public String getGateway() {
		return gateway;
		
	}
	
}
