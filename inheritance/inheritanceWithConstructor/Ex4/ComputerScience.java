package inheritance.inheritanceWithConstructor.Ex4;

public class ComputerScience extends Department {

    public ComputerScience() {
        super("Computer Science", 8); 
    }

    void extraInfo() {
        System.out.println("Special Facility: AI Research Lab");
    }
}
