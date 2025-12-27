package POJO.P9;

public class DegreeCourse extends Course {

    public DegreeCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public double fees() {
        return 50000;
    }
}
