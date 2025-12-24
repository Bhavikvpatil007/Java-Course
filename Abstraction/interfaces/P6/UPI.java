package Abstraction.interfaces.P6;

public class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}