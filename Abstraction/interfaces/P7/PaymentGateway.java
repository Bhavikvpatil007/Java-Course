package Abstraction.interfaces.P7;

public interface PaymentGateway {
	void pay(double amount);
    void refund(double amount);
}
