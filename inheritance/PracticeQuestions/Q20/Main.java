package inheritance.PracticeQuestions.Q20;

public class Main {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		Laptop l = new Laptop();
		
		m.myDevice();
		m.myMobile();
		
		l.myDevice();
		l.myLaptop();
	}

}
