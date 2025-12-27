package POJO.P9;

public class DiplomaCourse extends Course {

    public DiplomaCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public double fees() {
        return 30000;
    }
}
