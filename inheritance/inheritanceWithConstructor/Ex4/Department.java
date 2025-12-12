package inheritance.inheritanceWithConstructor.Ex4;

public class Department {

    String deptName;
    int noOfCourses;

    public Department(String deptName, int noOfCourses) {
        this.deptName = deptName;
        this.noOfCourses = noOfCourses;
    }

    void showDetails() {
        System.out.println("Department Name = " + deptName);
        System.out.println("Number of Courses = " + noOfCourses);
    }
}
