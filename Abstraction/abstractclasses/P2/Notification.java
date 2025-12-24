package Abstraction.abstractclasses.P2;

public abstract class Notification {

    public Notification() {
        System.out.println("Notification system started");
    }

    abstract void send();
}
