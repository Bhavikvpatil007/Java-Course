package inheritance.inheritanceWithConstructor.Ex4;

public class Civil extends Department {

    public Civil() {
        super("Civil", 5); 
    }

    void extraInfo() {
        System.out.println("Special Facility: special practical lab");
    }
}
