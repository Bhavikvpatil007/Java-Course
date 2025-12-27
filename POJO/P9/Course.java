package POJO.P9;

public abstract class Course {

    protected String courseName;
    protected int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public abstract double fees();

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}
