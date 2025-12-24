package Abstraction.interfaces.P6;

class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Card");
    }
}