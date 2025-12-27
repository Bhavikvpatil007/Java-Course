package POJO.P5;

public class StudentUser extends User {

    private String course;

    public StudentUser(int userId, String name, String course) {
        super(userId, name);  
        this.course = course;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}
