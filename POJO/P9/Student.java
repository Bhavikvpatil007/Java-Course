package POJO.P9;

public class Student {

    private int id;
    private String name;
    private Course course; 

    public final double REGISTRATION_FEE = 1000;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public double calculateTotalFee() {
        return course.fees() + REGISTRATION_FEE;
    }

    public void displayDetails() {
        System.out.println("--- Student Summary ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Duration: " + course.getDuration() + " months");
        System.out.println("Course Fee: " + course.fees());
        System.out.println("Registration Fee: " + REGISTRATION_FEE);
        System.out.println("Total Fee: " + calculateTotalFee());
    }
}
