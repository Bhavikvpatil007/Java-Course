package inheritance.inheritanceWithConstructor.Ex4;

public class UniApp {
	public static void main(String[] args) {

        System.out.println("University Application Started...");

        System.out.println("");
        ComputerScience cs = new ComputerScience();
        cs.showDetails();
        cs.extraInfo();

        System.out.println("");
        Mechanical m = new Mechanical();
        m.showDetails();
        m.extraInfo();

        System.out.println("");
        Civil c = new Civil();
        c.showDetails();
        c.extraInfo();
    }
}
