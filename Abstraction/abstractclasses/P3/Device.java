package Abstraction.abstractclasses.P3;


public abstract class Device {

    public Device() {
        System.out.println("Device powered on");
    }

    public final void boot() {
        System.out.println("Boot sequence started");
    }

    abstract void start();
}
