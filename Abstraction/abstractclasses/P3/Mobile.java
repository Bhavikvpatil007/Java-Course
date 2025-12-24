package Abstraction.abstractclasses.P3;

public class Mobile extends Device {

    public Mobile() {
        System.out.println("Mobile ready");
    }

    @Override
    public void start() {
        System.out.println("Mobile started");
    }
}
